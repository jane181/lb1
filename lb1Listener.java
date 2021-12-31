// Generated from C:/Users/ongjane181/IdeaProjects/lb1/src\lb1.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link lb1Parser}.
 */
public interface lb1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link lb1Parser#compUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompUnit(lb1Parser.CompUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link lb1Parser#compUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompUnit(lb1Parser.CompUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link lb1Parser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(lb1Parser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link lb1Parser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(lb1Parser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link lb1Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(lb1Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link lb1Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(lb1Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link lb1Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(lb1Parser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link lb1Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(lb1Parser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link lb1Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(lb1Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link lb1Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(lb1Parser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link lb1Parser#decimalconst}.
	 * @param ctx the parse tree
	 */
	void enterDecimalconst(lb1Parser.DecimalconstContext ctx);
	/**
	 * Exit a parse tree produced by {@link lb1Parser#decimalconst}.
	 * @param ctx the parse tree
	 */
	void exitDecimalconst(lb1Parser.DecimalconstContext ctx);
	/**
	 * Enter a parse tree produced by {@link lb1Parser#octalconst}.
	 * @param ctx the parse tree
	 */
	void enterOctalconst(lb1Parser.OctalconstContext ctx);
	/**
	 * Exit a parse tree produced by {@link lb1Parser#octalconst}.
	 * @param ctx the parse tree
	 */
	void exitOctalconst(lb1Parser.OctalconstContext ctx);
	/**
	 * Enter a parse tree produced by {@link lb1Parser#hexadecimalconst}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalconst(lb1Parser.HexadecimalconstContext ctx);
	/**
	 * Exit a parse tree produced by {@link lb1Parser#hexadecimalconst}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalconst(lb1Parser.HexadecimalconstContext ctx);
	/**
	 * Enter a parse tree produced by {@link lb1Parser#hexadecimalprefix}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalprefix(lb1Parser.HexadecimalprefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link lb1Parser#hexadecimalprefix}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalprefix(lb1Parser.HexadecimalprefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link lb1Parser#nonzerodigit}.
	 * @param ctx the parse tree
	 */
	void enterNonzerodigit(lb1Parser.NonzerodigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link lb1Parser#nonzerodigit}.
	 * @param ctx the parse tree
	 */
	void exitNonzerodigit(lb1Parser.NonzerodigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link lb1Parser#octaldigit}.
	 * @param ctx the parse tree
	 */
	void enterOctaldigit(lb1Parser.OctaldigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link lb1Parser#octaldigit}.
	 * @param ctx the parse tree
	 */
	void exitOctaldigit(lb1Parser.OctaldigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link lb1Parser#digit}.
	 * @param ctx the parse tree
	 */
	void enterDigit(lb1Parser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link lb1Parser#digit}.
	 * @param ctx the parse tree
	 */
	void exitDigit(lb1Parser.DigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link lb1Parser#hexadecimaldigit}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimaldigit(lb1Parser.HexadecimaldigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link lb1Parser#hexadecimaldigit}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimaldigit(lb1Parser.HexadecimaldigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link lb1Parser#funcType}.
	 * @param ctx the parse tree
	 */
	void enterFuncType(lb1Parser.FuncTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link lb1Parser#funcType}.
	 * @param ctx the parse tree
	 */
	void exitFuncType(lb1Parser.FuncTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link lb1Parser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(lb1Parser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link lb1Parser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(lb1Parser.IdentContext ctx);
}