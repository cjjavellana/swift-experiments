package me.cjavellana.swift.validations;

import me.cjavellana.swift.SWIFTFieldValidationBaseVisitor;
import me.cjavellana.swift.SWIFTFieldValidationParser;
import me.cjavellana.swift.chartypes.CharTypes;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;
import java.util.stream.Collectors;

public class FieldValidationExpressionVisitor extends SWIFTFieldValidationBaseVisitor<FieldValidator> {

    private int lineValidatorsVisited = 1;
    private final FieldValidator fieldValidator = new FieldValidator();

    @Override
    public FieldValidator visit(ParseTree tree) {
        super.visit(tree);
        return fieldValidator;
    }

    /**
     * Callback method called when the parser encounters a `LineEntry` context. At the very least, a field with validation
     * requirement has 1 `LineEntry` validator which can be comprised of 1 or more Component Validators.
     *
     * This callback method is called multiple times if field validators span multiple lines. e.g. 82A
     * <p>
     * Examples:
     * <p>
     * Line Entry With two optional validators
     * <pre>
     *                                      Line Entry
     *                               -------------------------
     *                               |                      |
     *                           Optional                Optional
     *                          ---------               ---------
     *                              |                       |
     *                          Validator                Validator
     * </pre>
     * <p>
     * Line Entry with one mandatory and one optional
     * <pre>
     *                                      Line Entry
     *                               -------------------------
     *                               |                      |
     *                           Mandatory                Optional
     *                          ---------               ---------
     *                              |                       |
     *                          Validator               Validator
     * </pre>
     * <p>
     * <p>
     * Sometimes a field spans multiple lines. In this case, the validator parse tree will look like:
     * <pre>
     *                                           Field
     *                                            |
     *                          ----------------------------------------
     *                          |                                      |
     *                     Line Entry                              Line Entry
     *              -------------------------              -------------------------
     *              |                      |               |                      |
     *          Optional                Optional      Mandatory                Mandatory
     *         ---------               ---------      ---------                ---------
     *             |                       |              |                       |
     *         Validator               Validator       Validator               Validator
     * </pre>
     * Where: Validator is any of the following: Max Length, Fixed Length, Row by Length, etc
     *
     * @param ctx
     * @return
     */
    @Override
    public FieldValidator visitLineEntry(SWIFTFieldValidationParser.LineEntryContext ctx) {
        List<FieldComponentValidator> lineValidators = ctx.children.stream()
                .filter(s -> !(s instanceof TerminalNode))
                .map(this::toFieldComponentValidator)
                .collect(Collectors.toList());

        fieldValidator.addLineEntryValidator(
                lineValidatorsVisited, new LineEntryValidator(lineValidatorsVisited, lineValidators));

        // next line validator
        lineValidatorsVisited++;
        return fieldValidator;
    }

    public FieldComponentValidator toFieldComponentValidator(ParseTree p) {
        SWIFTFieldValidationParser.ComponentValidatorsContext validatorContext;
        boolean isOptional = false;

        // This gives us access to the componentValidator. Open & Close brackets are only available
        // to OptionalComponentValidator
        //
        //              optional or mandatory component
        //              -------------------------------
        //              /                |             \
        //         OpenBracket?  ComponentValidator  CloseBracket?
        //                               |
        //                    ValidatorComponentWeNeed
        //
        if (p instanceof SWIFTFieldValidationParser.OptionalComponentValidatorContext) {
            SWIFTFieldValidationParser.OptionalComponentValidatorContext optionalCtx =
                    (SWIFTFieldValidationParser.OptionalComponentValidatorContext) p;
            isOptional = true;
            validatorContext = optionalCtx.validator;
        } else {
            SWIFTFieldValidationParser.MandatoryComponentValidatorContext mandatoryCtx =
                    (SWIFTFieldValidationParser.MandatoryComponentValidatorContext) p;
            validatorContext = mandatoryCtx.validator;
        }

        ParseTree componentValidator = validatorContext.children.get(0);

        if (componentValidator instanceof SWIFTFieldValidationParser.MaxLengthContext) {
            return maxLengthValidator(componentValidator, isOptional);
        } else if (componentValidator instanceof SWIFTFieldValidationParser.FixedLengthContext) {
            return fixedLengthValidator(componentValidator, isOptional);
        } else if (componentValidator instanceof SWIFTFieldValidationParser.RangeContext) {
            return rangeValidator(componentValidator, isOptional);
        }

        return null;
    }

    private FixedLengthValidator fixedLengthValidator(ParseTree componentValidator, boolean isOptional) {
        SWIFTFieldValidationParser.FixedLengthContext fl =
                (SWIFTFieldValidationParser.FixedLengthContext) componentValidator;

        String subFieldSeparator = (fl.SUBFIELD() != null) ? fl.SUBFIELD().getText() : null;
        int fixedLength = Integer.parseInt(fl.length.getText());
        String charSet = CharTypes.patternFor(fl.allowed_chars.getText());

        ValidatorSettings validatorSettings = new ValidatorSettings();
        validatorSettings.setSwiftFormat(fl.getText());
        validatorSettings.setCharSet(charSet);
        validatorSettings.setFixedLength(fixedLength);
        validatorSettings.setOptional(isOptional);
        validatorSettings.setSubFieldSeparator(subFieldSeparator);

        return FixedLengthValidator.of(validatorSettings);
    }

    private MaxLengthValidator maxLengthValidator(ParseTree componentValidator, boolean isOptional) {
        SWIFTFieldValidationParser.MaxLengthContext ml =
                (SWIFTFieldValidationParser.MaxLengthContext) componentValidator;

        String subFieldSeparator = (ml.SUBFIELD() != null) ? ml.SUBFIELD().getText() : null;
        int maxLength = Integer.parseInt(ml.length.getText());
        String charSet = CharTypes.patternFor(ml.allowed_chars.getText());

        ValidatorSettings validatorSettings = new ValidatorSettings();
        validatorSettings.setSwiftFormat(ml.getText());
        validatorSettings.setCharSet(charSet);
        validatorSettings.setMaxLength(maxLength);
        validatorSettings.setOptional(isOptional);
        validatorSettings.setSubFieldSeparator(subFieldSeparator);

        return MaxLengthValidator.of(validatorSettings);
    }

    private RangeValidator rangeValidator(ParseTree componentValidator, boolean isOptional) {
        SWIFTFieldValidationParser.RangeContext ml =
                (SWIFTFieldValidationParser.RangeContext) componentValidator;

        String subFieldSeparator = (ml.SUBFIELD() != null) ? ml.SUBFIELD().getText() : null;
        int minLength = Integer.parseInt(ml.min.getText());
        int maxLength = Integer.parseInt(ml.max.getText());
        String charSet = CharTypes.patternFor(ml.allowed_chars.getText());

        ValidatorSettings validatorSettings = new ValidatorSettings();
        validatorSettings.setSwiftFormat(ml.getText());
        validatorSettings.setCharSet(charSet);
        validatorSettings.setMinLength(minLength);
        validatorSettings.setMaxLength(maxLength);
        validatorSettings.setOptional(isOptional);
        validatorSettings.setSubFieldSeparator(subFieldSeparator);

        return RangeValidator.of(validatorSettings);
    }
}
