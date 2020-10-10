// Generated from me/cjavellana/swift/SWIFTFieldValidation.g4 by ANTLR 4.8
package me.cjavellana.swift;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SWIFTFieldValidationParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SWIFTFieldValidationVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SWIFTFieldValidationParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(SWIFTFieldValidationParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link SWIFTFieldValidationParser#lineEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineEntry(SWIFTFieldValidationParser.LineEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SWIFTFieldValidationParser#optionalComponentValidator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalComponentValidator(SWIFTFieldValidationParser.OptionalComponentValidatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SWIFTFieldValidationParser#mandatoryComponentValidator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMandatoryComponentValidator(SWIFTFieldValidationParser.MandatoryComponentValidatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SWIFTFieldValidationParser#componentValidators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentValidators(SWIFTFieldValidationParser.ComponentValidatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SWIFTFieldValidationParser#rowByLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowByLength(SWIFTFieldValidationParser.RowByLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link SWIFTFieldValidationParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(SWIFTFieldValidationParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SWIFTFieldValidationParser#maxLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxLength(SWIFTFieldValidationParser.MaxLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link SWIFTFieldValidationParser#fixedLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixedLength(SWIFTFieldValidationParser.FixedLengthContext ctx);
}