package me.cjavellana.swift.validations;

public class ValidationException extends Exception {

    private String message;

    public ValidationException(String message) {
        super(message);
        this.message = message;
    }
}
