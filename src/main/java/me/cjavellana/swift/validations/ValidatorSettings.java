package me.cjavellana.swift.validations;

import lombok.Data;

@Data
public class ValidatorSettings {
    private String swiftFormat;
    private boolean isOptional = false;
    private int maxRows;
    private int maxLength;
    private int fixedLength;
    private int minLength;
    private String charSet;
    private String subFieldSeparator;
}
