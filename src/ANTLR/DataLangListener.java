// Generated from C:/Users/Guilherme Nunes/Development/Repositories/DataLangSDK\DataLang.g4 by ANTLR 4.12.0
package ANTLR;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DataLangParser}.
 */
public interface DataLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DataLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DataLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DataLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#rules}.
	 * @param ctx the parse tree
	 */
	void enterRules(DataLangParser.RulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#rules}.
	 * @param ctx the parse tree
	 */
	void exitRules(DataLangParser.RulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#keywords}.
	 * @param ctx the parse tree
	 */
	void enterKeywords(DataLangParser.KeywordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#keywords}.
	 * @param ctx the parse tree
	 */
	void exitKeywords(DataLangParser.KeywordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(DataLangParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(DataLangParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(DataLangParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(DataLangParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterFunctions(DataLangParser.FunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitFunctions(DataLangParser.FunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#parentheses}.
	 * @param ctx the parse tree
	 */
	void enterParentheses(DataLangParser.ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#parentheses}.
	 * @param ctx the parse tree
	 */
	void exitParentheses(DataLangParser.ParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#square_brackets}.
	 * @param ctx the parse tree
	 */
	void enterSquare_brackets(DataLangParser.Square_bracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#square_brackets}.
	 * @param ctx the parse tree
	 */
	void exitSquare_brackets(DataLangParser.Square_bracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#braces}.
	 * @param ctx the parse tree
	 */
	void enterBraces(DataLangParser.BracesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#braces}.
	 * @param ctx the parse tree
	 */
	void exitBraces(DataLangParser.BracesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#token}.
	 * @param ctx the parse tree
	 */
	void enterToken(DataLangParser.TokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#token}.
	 * @param ctx the parse tree
	 */
	void exitToken(DataLangParser.TokenContext ctx);
}