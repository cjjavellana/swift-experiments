package me.cjavellana.swift.validations;

import lombok.Data;

import java.util.List;

/**
 * A SWIFT MT Message field is composed of 1..* lines. Each line can be composed of multiple components.
 *
 * This class encapsulates all the required validations of a single MT Message Field line entry. The `lineNo` parameter
 * indicates for which line this validator is supposed to be applied.
 */
@Data
public class LineEntryValidator {

    private int lineNo;
    private List<FieldComponentValidator> lineValidators;

    public LineEntryValidator(int lineNo, List<FieldComponentValidator> lineValidators) {
        this.lineNo = lineNo;
        this.lineValidators = lineValidators;
    }
}
