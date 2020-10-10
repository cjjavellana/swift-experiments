package me.cjavellana.swift.validations;

public interface FieldComponentValidator {

    /**
     * Validates the component value against a field component validator
     *
     * @param value
     * @throws ValidationException
     */
    void validate(String value) throws ValidationException;

    /**
     * Returns true if this field component is optional
     *
     * @return
     */
    boolean isOptional();

    /**
     * Returns the swift format to generate this validation expression
     *
     * @return
     */
    String swiftFormat();
}
