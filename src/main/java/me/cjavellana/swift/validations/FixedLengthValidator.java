package me.cjavellana.swift.validations;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FixedLengthValidator implements FieldComponentValidator {

    private final String swiftFormat;
    private final boolean isOptional;
    private final int fixedLength;
    private final String charSet;
    private final String subFieldSeparator;
    private Pattern pattern;

    public FixedLengthValidator(String swiftFormat, boolean isOptional, int fixedLength, String charSet, String subFieldSeparator) {
        this.swiftFormat = swiftFormat;
        this.isOptional = isOptional;
        this.fixedLength = fixedLength;
        this.charSet = charSet;
        this.subFieldSeparator = subFieldSeparator;
    }

    private void init() {
        StringBuilder sb = new StringBuilder("^");

        if (StringUtils.isNotEmpty(subFieldSeparator)) sb.append(subFieldSeparator);

        sb.append(this.charSet);
        sb.append(String.format("{%s}", this.fixedLength));
        sb.append("$");

        this.pattern = Pattern.compile(sb.toString());
    }

    @Override
    public void validate(String value) throws ValidationException {
        final Matcher m = this.pattern.matcher(value);
        if (!m.matches()) {
            String msg = String.format("Value %s does not match pattern pattern %s", value, this.swiftFormat);
            throw new ValidationException(msg);
        }
    }

    @Override
    public boolean isOptional() {
        return this.isOptional;
    }

    @Override
    public String swiftFormat() {
        return this.swiftFormat;
    }

    public static FixedLengthValidator of(ValidatorSettings settings) {
        FixedLengthValidator validator = new FixedLengthValidator(
                settings.getSwiftFormat(),
                settings.isOptional(),
                settings.getFixedLength(),
                settings.getCharSet(),
                settings.getSubFieldSeparator()
        );
        validator.init();
        return validator;
    }
}
