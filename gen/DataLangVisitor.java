// Generated from C:/Users/Guilherme Nunes/Development/Repositories/DataLangSDK\DataLang.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DataLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DataLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DataLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DataLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRules(DataLangParser.RulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#keywords}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywords(DataLangParser.KeywordsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(DataLangParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(DataLangParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctions(DataLangParser.FunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#parentheses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses(DataLangParser.ParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#square_brackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSquare_brackets(DataLangParser.Square_bracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#braces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraces(DataLangParser.BracesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken(DataLangParser.TokenContext ctx);
}