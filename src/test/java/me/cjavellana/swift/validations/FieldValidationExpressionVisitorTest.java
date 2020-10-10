package me.cjavellana.swift.validations;

import me.cjavellana.swift.SWIFTFieldValidationLexer;
import me.cjavellana.swift.SWIFTFieldValidationParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.Test;

class FieldValidationExpressionVisitorTest {

    @Test
    public void itShouldParseAMultilineFieldValidation(){
        FieldValidationExpressionVisitor visitor = new FieldValidationExpressionVisitor();
        FieldValidator fcv = visitor.visit(getFieldValidationContext("[/1!a][/34x]\r\n4!a2!a2!c[3c]"));
        System.out.println(fcv);
    }

    @Test
    public void itShouldParseACombinationOfRequiredAndOptionalComponents() {
        FieldValidationExpressionVisitor visitor = new FieldValidationExpressionVisitor();
        visitor.visit(getFieldValidationContext("6a[/8!n][//4!n]"));
    }

    private SWIFTFieldValidationParser.FieldContext getFieldValidationContext(String validationExpr) {
        ANTLRInputStream inputStream = new ANTLRInputStream(validationExpr);
        SWIFTFieldValidationLexer lexer = new SWIFTFieldValidationLexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        SWIFTFieldValidationParser parser = new SWIFTFieldValidationParser(commonTokenStream);
        return parser.field();
    }
}