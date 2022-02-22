// Generated from C:/Users/ongjane181/IdeaProjects/lb1/src\lb1.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link lb1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface lb1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link lb1Parser#compUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompUnit(lb1Parser.CompUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link lb1Parser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(lb1Parser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link lb1Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(lb1Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link lb1Parser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(lb1Parser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link lb1Parser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(lb1Parser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link lb1Parser#decimalconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalconst(lb1Parser.DecimalconstContext ctx);
	/**
	 * Visit a parse tree produced by {@link lb1Parser#octalconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctalconst(lb1Parser.OctalconstContext ctx);
	/**
	 * Visit a parse tree produced by {@link lb1Parser#hexadecimalconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexadecimalconst(lb1Parser.HexadecimalconstContext ctx);
	/**
	 * Visit a parse tree produced by {@link lb1Parser#hexadecimalprefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexadecimalprefix(lb1Parser.HexadecimalprefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link lb1Parser#nonzerodigit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonzerodigit(lb1Parser.NonzerodigitContext ctx);
	/**
	 * Visit a parse tree produced by {@link lb1Parser#octaldigit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctaldigit(lb1Parser.OctaldigitContext ctx);
	/**
	 * Visit a parse tree produced by {@link lb1Parser#digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigit(lb1Parser.DigitContext ctx);
	/**
	 * Visit a parse tree produced by {@link lb1Parser#hexadecimaldigit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexadecimaldigit(lb1Parser.HexadecimaldigitContext ctx);
	/**
	 * Visit a parse tree produced by {@link lb1Parser#funcType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncType(lb1Parser.FuncTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link lb1Parser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(lb1Parser.IdentContext ctx);
}