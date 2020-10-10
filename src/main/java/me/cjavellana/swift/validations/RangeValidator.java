package me.cjavellana.swift.validations;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RangeValidator implements FieldComponentValidator {

    private final String swiftFormat;
    private final boolean isOptional;
    private final int minLength;
    private final int maxLength;
    private final String charSet;
    private final String subFieldSeparator;
    private Pattern pattern;

    public RangeValidator(String swiftFormat, boolean isOptional, int minLength, int maxLength, String charSet, String subFieldSeparator) {
        this.swiftFormat = swiftFormat;
        this.isOptional = isOptional;
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.charSet = charSet;
        this.subFieldSeparator = subFieldSeparator;
    }

    private void init() {
        StringBuilder sb = new StringBuilder("^");

        if (StringUtils.isNotEmpty(subFieldSeparator)) sb.append(subFieldSeparator);

        sb.append(this.charSet);
        sb.append(String.format("{%s,%s}", this.minLength, this.maxLength));
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

    public static RangeValidator of(ValidatorSettings settings) {
        RangeValidator validator = new RangeValidator(
                settings.getSwiftFormat(),
                settings.isOptional(),
                settings.getMinLength(),
                settings.getMaxLength(),
                settings.getCharSet(),
                settings.getSubFieldSeparator()
        );
        validator.init();
        return validator;
    }
}
