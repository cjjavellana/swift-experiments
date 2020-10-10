package me.cjavellana.swift.validations;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RowByLengthValidator implements FieldComponentValidator {

    private final String swiftFormat;
    private final boolean isOptional;
    private final int maxRows;
    private final int maxLength;
    private final String charSet;
    private final String subFieldSeparator;
    private Pattern rowCharsetPattern;

    public RowByLengthValidator(String swiftFormat, boolean isOptional, int maxRows, int maxLength, String charSet, String subFieldSeparator) {
        this.swiftFormat = swiftFormat;
        this.isOptional = isOptional;
        this.maxRows = maxRows;
        this.maxLength = maxLength;
        this.charSet = charSet;
        this.subFieldSeparator = subFieldSeparator;
    }

    private void init() {
        StringBuilder sb = new StringBuilder("^");

        if (StringUtils.isNotEmpty(subFieldSeparator)) sb.append(subFieldSeparator);

        sb.append(this.charSet);
        sb.append(String.format("{1,%s}", this.maxLength));
        sb.append("$");

        this.rowCharsetPattern = Pattern.compile(sb.toString());
    }

    @Override
    public void validate(String value) throws ValidationException {
        String[] rows = value.split("\r\n");

        // check if row length has exceeded number of rows
        if ((rows.length > this.maxRows) || ArrayUtils.isEmpty(rows)) {
            String msg = String.format("Value %s does not match pattern pattern %s", value, this.swiftFormat);
            throw new ValidationException(msg);
        }

        // Row length is valid, check if each row matches the expected charset
        for (String row : rows) {
            Matcher m = this.rowCharsetPattern.matcher(row);
            if (!m.matches()) {
                String msg = String.format("Value %s does not match pattern pattern %s", value, this.swiftFormat);
                throw new ValidationException(msg);
            }
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

    public static RowByLengthValidator of(ValidatorSettings settings) {
        RowByLengthValidator validator = new RowByLengthValidator(
                settings.getSwiftFormat(),
                settings.isOptional(),
                settings.getMaxRows(),
                settings.getMaxLength(),
                settings.getCharSet(),
                settings.getSubFieldSeparator()
        );
        validator.init();
        return validator;
    }
}
