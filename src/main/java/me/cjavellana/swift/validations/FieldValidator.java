package me.cjavellana.swift.validations;

import java.util.HashMap;
import java.util.Map;

public class FieldValidator {

    private final Map<Integer, LineEntryValidator> validators = new HashMap<>();

    public void addLineEntryValidator(Integer lineNo, LineEntryValidator validator) {
        this.validators.put(lineNo, validator);
    }

    public LineEntryValidator getLineValidatorFor(Integer lineNo) {
        return this.validators.get(lineNo);
    }
}
