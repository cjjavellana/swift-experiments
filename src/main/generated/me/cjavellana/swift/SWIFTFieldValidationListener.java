// Generated from me/cjavellana/swift/SWIFTFieldValidation.g4 by ANTLR 4.8
package me.cjavellana.swift;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SWIFTFieldValidationParser}.
 */
public interface SWIFTFieldValidationListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SWIFTFieldValidationParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(SWIFTFieldValidationParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link SWIFTFieldValidationParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(SWIFTFieldValidationParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link SWIFTFieldValidationParser#lineEntry}.
	 * @param ctx the parse tree
	 */
	void enterLineEntry(SWIFTFieldValidationParser.LineEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SWIFTFieldValidationParser#lineEntry}.
	 * @param ctx the parse tree
	 */
	void exitLineEntry(SWIFTFieldValidationParser.LineEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SWIFTFieldValidationParser#optionalComponentValidator}.
	 * @param ctx the parse tree
	 */
	void enterOptionalComponentValidator(SWIFTFieldValidationParser.OptionalComponentValidatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SWIFTFieldValidationParser#optionalComponentValidator}.
	 * @param ctx the parse tree
	 */
	void exitOptionalComponentValidator(SWIFTFieldValidationParser.OptionalComponentValidatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SWIFTFieldValidationParser#mandatoryComponentValidator}.
	 * @param ctx the parse tree
	 */
	void enterMandatoryComponentValidator(SWIFTFieldValidationParser.MandatoryComponentValidatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SWIFTFieldValidationParser#mandatoryComponentValidator}.
	 * @param ctx the parse tree
	 */
	void exitMandatoryComponentValidator(SWIFTFieldValidationParser.MandatoryComponentValidatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SWIFTFieldValidationParser#componentValidators}.
	 * @param ctx the parse tree
	 */
	void enterComponentValidators(SWIFTFieldValidationParser.ComponentValidatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SWIFTFieldValidationParser#componentValidators}.
	 * @param ctx the parse tree
	 */
	void exitComponentValidators(SWIFTFieldValidationParser.ComponentValidatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SWIFTFieldValidationParser#rowByLength}.
	 * @param ctx the parse tree
	 */
	void enterRowByLength(SWIFTFieldValidationParser.RowByLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link SWIFTFieldValidationParser#rowByLength}.
	 * @param ctx the parse tree
	 */
	void exitRowByLength(SWIFTFieldValidationParser.RowByLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link SWIFTFieldValidationParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(SWIFTFieldValidationParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SWIFTFieldValidationParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(SWIFTFieldValidationParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SWIFTFieldValidationParser#maxLength}.
	 * @param ctx the parse tree
	 */
	void enterMaxLength(SWIFTFieldValidationParser.MaxLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link SWIFTFieldValidationParser#maxLength}.
	 * @param ctx the parse tree
	 */
	void exitMaxLength(SWIFTFieldValidationParser.MaxLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link SWIFTFieldValidationParser#fixedLength}.
	 * @param ctx the parse tree
	 */
	void enterFixedLength(SWIFTFieldValidationParser.FixedLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link SWIFTFieldValidationParser#fixedLength}.
	 * @param ctx the parse tree
	 */
	void exitFixedLength(SWIFTFieldValidationParser.FixedLengthContext ctx);
}