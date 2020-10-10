package me.cjavellana.swift.validations;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaxLengthValidator implements FieldComponentValidator {

    private final String swiftFormat;
    private final boolean isOptional;
    private final int maxLength;
    private final String charSet;
    private final String subFieldSeparator;
    private Pattern pattern;

    MaxLengthValidator(
            String swiftFormat,
            int maxLength,
            String charSet,
            boolean isOptional,
            String subFieldSep
    ) {
        this.swiftFormat = swiftFormat;
        this.isOptional = isOptional;
        this.maxLength = maxLength;
        this.charSet = charSet;
        this.subFieldSeparator = subFieldSep;
    }

    private void init() {
        StringBuilder sb = new StringBuilder("^");

        if (StringUtils.isNotEmpty(subFieldSeparator)) sb.append(subFieldSeparator);

        sb.append(this.charSet);
        sb.append(String.format("{1,%s}", this.maxLength));
        sb.append("$");

        this.pattern = Pattern.compile(sb.toString());
    }

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

    public static MaxLengthValidator of(ValidatorSettings settings) {
        MaxLengthValidator validator = new MaxLengthValidator(
                settings.getSwiftFormat(),
                settings.getMaxLength(),
                settings.getCharSet(),
                settings.isOptional(),
                settings.getSubFieldSeparator()
        );
        validator.init();
        return validator;
    }
}
