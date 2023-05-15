// Generated from C:/Users/Guilherme Nunes/Development/Repositories/DataLangSDK\DataLang.g4 by ANTLR 4.12.0
package ANTLR;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DataLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IFSULDEMINAS=1, INICIO=2, FIM=3, COMMENT=4, NUMBER=5, STRING=6, BOOLEAN=7, 
		NONE=8, FUNC=9, RETURN=10, COND_IF=11, COND_ELIF=12, COND_ELSE=13, LOOP_WHILE=14, 
		LOOP_FOR=15, OP_REL=16, OP_MATH=17, OP_ASSING=18, OP_LOG=19, OPEN_PARENTHESES=20, 
		CLOSE_PARENTHESES=21, OPEN_SQUARE_BRACKET=22, CLOSE_SQUARE_BRACKET=23, 
		OPEN_BRACES=24, CLOSE_BRACES=25, COMMA=26, ID=27, WS=28;
	public static final int
		RULE_program = 0, RULE_rules = 1, RULE_keywords = 2, RULE_expressions = 3, 
		RULE_comment = 4, RULE_functions = 5, RULE_parentheses = 6, RULE_square_brackets = 7, 
		RULE_braces = 8, RULE_conditions = 9, RULE_comma = 10, RULE_loops = 11, 
		RULE_token = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "rules", "keywords", "expressions", "comment", "functions", 
			"parentheses", "square_brackets", "braces", "conditions", "comma", "loops", 
			"token"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'IFSULDEMINAS'", "'INICIO'", "'FIM'", "'//'", null, null, null, 
			"'None'", "'def'", "'return'", "'if'", "'elif'", "'else'", "'while'", 
			"'for'", null, null, "'='", null, "'('", "')'", "'['", "']'", "'{'", 
			"'}'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IFSULDEMINAS", "INICIO", "FIM", "COMMENT", "NUMBER", "STRING", 
			"BOOLEAN", "NONE", "FUNC", "RETURN", "COND_IF", "COND_ELIF", "COND_ELSE", 
			"LOOP_WHILE", "LOOP_FOR", "OP_REL", "OP_MATH", "OP_ASSING", "OP_LOG", 
			"OPEN_PARENTHESES", "CLOSE_PARENTHESES", "OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", 
			"OPEN_BRACES", "CLOSE_BRACES", "COMMA", "ID", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DataLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DataLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public RulesContext rules() {
			return getRuleContext(RulesContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DataLangVisitor ) return ((DataLangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			rules();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RulesContext extends ParserRuleContext {
		public List<TokenContext> token() {
			return getRuleContexts(TokenContext.class);
		}
		public TokenContext token(int i) {
			return getRuleContext(TokenContext.class,i);
		}
		public RulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DataLangVisitor ) return ((DataLangVisitor<? extends T>)visitor).visitRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesContext rules() throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				token();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 223412222L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeywordsContext extends ParserRuleContext {
		public TerminalNode IFSULDEMINAS() { return getToken(DataLangParser.IFSULDEMINAS, 0); }
		public TerminalNode INICIO() { return getToken(DataLangParser.INICIO, 0); }
		public TerminalNode FIM() { return getToken(DataLangParser.FIM, 0); }
		public KeywordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywords; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterKeywords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitKeywords(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DataLangVisitor ) return ((DataLangVisitor<? extends T>)visitor).visitKeywords(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordsContext keywords() throws RecognitionException {
		KeywordsContext _localctx = new KeywordsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_keywords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DataLangParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(DataLangParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(DataLangParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(DataLangParser.BOOLEAN, 0); }
		public TerminalNode NONE() { return getToken(DataLangParser.NONE, 0); }
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DataLangVisitor ) return ((DataLangVisitor<? extends T>)visitor).visitExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 134218208L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(DataLangParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DataLangVisitor ) return ((DataLangVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(COMMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionsContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(DataLangParser.FUNC, 0); }
		public TerminalNode RETURN() { return getToken(DataLangParser.RETURN, 0); }
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DataLangVisitor ) return ((DataLangVisitor<? extends T>)visitor).visitFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_la = _input.LA(1);
			if ( !(_la==FUNC || _la==RETURN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesesContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENTHESES() { return getToken(DataLangParser.OPEN_PARENTHESES, 0); }
		public TerminalNode CLOSE_PARENTHESES() { return getToken(DataLangParser.CLOSE_PARENTHESES, 0); }
		public TokenContext token() {
			return getRuleContext(TokenContext.class,0);
		}
		public ParenthesesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parentheses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DataLangVisitor ) return ((DataLangVisitor<? extends T>)visitor).visitParentheses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenthesesContext parentheses() throws RecognitionException {
		ParenthesesContext _localctx = new ParenthesesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parentheses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(OPEN_PARENTHESES);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 223412222L) != 0)) {
				{
				setState(42);
				token();
				}
			}

			setState(45);
			match(CLOSE_PARENTHESES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Square_bracketsContext extends ParserRuleContext {
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(DataLangParser.OPEN_SQUARE_BRACKET, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(DataLangParser.CLOSE_SQUARE_BRACKET, 0); }
		public TokenContext token() {
			return getRuleContext(TokenContext.class,0);
		}
		public Square_bracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_square_brackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterSquare_brackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitSquare_brackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DataLangVisitor ) return ((DataLangVisitor<? extends T>)visitor).visitSquare_brackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Square_bracketsContext square_brackets() throws RecognitionException {
		Square_bracketsContext _localctx = new Square_bracketsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_square_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(OPEN_SQUARE_BRACKET);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 223412222L) != 0)) {
				{
				setState(48);
				token();
				}
			}

			setState(51);
			match(CLOSE_SQUARE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BracesContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACES() { return getToken(DataLangParser.OPEN_BRACES, 0); }
		public TerminalNode CLOSE_BRACES() { return getToken(DataLangParser.CLOSE_BRACES, 0); }
		public TokenContext token() {
			return getRuleContext(TokenContext.class,0);
		}
		public BracesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_braces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterBraces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitBraces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DataLangVisitor ) return ((DataLangVisitor<? extends T>)visitor).visitBraces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracesContext braces() throws RecognitionException {
		BracesContext _localctx = new BracesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_braces);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(OPEN_BRACES);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 223412222L) != 0)) {
				{
				setState(54);
				token();
				}
			}

			setState(57);
			match(CLOSE_BRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionsContext extends ParserRuleContext {
		public TerminalNode COND_IF() { return getToken(DataLangParser.COND_IF, 0); }
		public TerminalNode COND_ELIF() { return getToken(DataLangParser.COND_ELIF, 0); }
		public TerminalNode COND_ELSE() { return getToken(DataLangParser.COND_ELSE, 0); }
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DataLangVisitor ) return ((DataLangVisitor<? extends T>)visitor).visitConditions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_conditions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14336L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommaContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(DataLangParser.COMMA, 0); }
		public CommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DataLangVisitor ) return ((DataLangVisitor<? extends T>)visitor).visitComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommaContext comma() throws RecognitionException {
		CommaContext _localctx = new CommaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoopsContext extends ParserRuleContext {
		public TerminalNode LOOP_FOR() { return getToken(DataLangParser.LOOP_FOR, 0); }
		public TerminalNode LOOP_WHILE() { return getToken(DataLangParser.LOOP_WHILE, 0); }
		public LoopsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterLoops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitLoops(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DataLangVisitor ) return ((DataLangVisitor<? extends T>)visitor).visitLoops(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopsContext loops() throws RecognitionException {
		LoopsContext _localctx = new LoopsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_loops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if ( !(_la==LOOP_WHILE || _la==LOOP_FOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TokenContext extends ParserRuleContext {
		public KeywordsContext keywords() {
			return getRuleContext(KeywordsContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public Square_bracketsContext square_brackets() {
			return getRuleContext(Square_bracketsContext.class,0);
		}
		public BracesContext braces() {
			return getRuleContext(BracesContext.class,0);
		}
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public LoopsContext loops() {
			return getRuleContext(LoopsContext.class,0);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DataLangVisitor ) return ((DataLangVisitor<? extends T>)visitor).visitToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenContext token() throws RecognitionException {
		TokenContext _localctx = new TokenContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_token);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IFSULDEMINAS:
			case INICIO:
			case FIM:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				keywords();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				comment();
				}
				break;
			case FUNC:
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				functions();
				}
				break;
			case OPEN_PARENTHESES:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				parentheses();
				}
				break;
			case OPEN_SQUARE_BRACKET:
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				square_brackets();
				}
				break;
			case OPEN_BRACES:
				enterOuterAlt(_localctx, 6);
				{
				setState(70);
				braces();
				}
				break;
			case COND_IF:
			case COND_ELIF:
			case COND_ELSE:
				enterOuterAlt(_localctx, 7);
				{
				setState(71);
				conditions();
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 8);
				{
				setState(72);
				comma();
				}
				break;
			case LOOP_WHILE:
			case LOOP_FOR:
				enterOuterAlt(_localctx, 9);
				{
				setState(73);
				loops();
				}
				break;
			case NUMBER:
			case STRING:
			case BOOLEAN:
			case NONE:
			case ID:
				enterOuterAlt(_localctx, 10);
				{
				setState(74);
				expressions();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001cN\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001\u001e\b\u0001"+
		"\u000b\u0001\f\u0001\u001f\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0003\u0006,\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0003\u00072\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0003\b"+
		"8\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0003\fL\b\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0005\u0001\u0000"+
		"\u0001\u0003\u0002\u0000\u0005\b\u001b\u001b\u0001\u0000\t\n\u0001\u0000"+
		"\u000b\r\u0001\u0000\u000e\u000fM\u0000\u001a\u0001\u0000\u0000\u0000"+
		"\u0002\u001d\u0001\u0000\u0000\u0000\u0004!\u0001\u0000\u0000\u0000\u0006"+
		"#\u0001\u0000\u0000\u0000\b%\u0001\u0000\u0000\u0000\n\'\u0001\u0000\u0000"+
		"\u0000\f)\u0001\u0000\u0000\u0000\u000e/\u0001\u0000\u0000\u0000\u0010"+
		"5\u0001\u0000\u0000\u0000\u0012;\u0001\u0000\u0000\u0000\u0014=\u0001"+
		"\u0000\u0000\u0000\u0016?\u0001\u0000\u0000\u0000\u0018K\u0001\u0000\u0000"+
		"\u0000\u001a\u001b\u0003\u0002\u0001\u0000\u001b\u0001\u0001\u0000\u0000"+
		"\u0000\u001c\u001e\u0003\u0018\f\u0000\u001d\u001c\u0001\u0000\u0000\u0000"+
		"\u001e\u001f\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000"+
		"\u001f \u0001\u0000\u0000\u0000 \u0003\u0001\u0000\u0000\u0000!\"\u0007"+
		"\u0000\u0000\u0000\"\u0005\u0001\u0000\u0000\u0000#$\u0007\u0001\u0000"+
		"\u0000$\u0007\u0001\u0000\u0000\u0000%&\u0005\u0004\u0000\u0000&\t\u0001"+
		"\u0000\u0000\u0000\'(\u0007\u0002\u0000\u0000(\u000b\u0001\u0000\u0000"+
		"\u0000)+\u0005\u0014\u0000\u0000*,\u0003\u0018\f\u0000+*\u0001\u0000\u0000"+
		"\u0000+,\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0005\u0015"+
		"\u0000\u0000.\r\u0001\u0000\u0000\u0000/1\u0005\u0016\u0000\u000002\u0003"+
		"\u0018\f\u000010\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000023\u0001"+
		"\u0000\u0000\u000034\u0005\u0017\u0000\u00004\u000f\u0001\u0000\u0000"+
		"\u000057\u0005\u0018\u0000\u000068\u0003\u0018\f\u000076\u0001\u0000\u0000"+
		"\u000078\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009:\u0005\u0019"+
		"\u0000\u0000:\u0011\u0001\u0000\u0000\u0000;<\u0007\u0003\u0000\u0000"+
		"<\u0013\u0001\u0000\u0000\u0000=>\u0005\u001a\u0000\u0000>\u0015\u0001"+
		"\u0000\u0000\u0000?@\u0007\u0004\u0000\u0000@\u0017\u0001\u0000\u0000"+
		"\u0000AL\u0003\u0004\u0002\u0000BL\u0003\b\u0004\u0000CL\u0003\n\u0005"+
		"\u0000DL\u0003\f\u0006\u0000EL\u0003\u000e\u0007\u0000FL\u0003\u0010\b"+
		"\u0000GL\u0003\u0012\t\u0000HL\u0003\u0014\n\u0000IL\u0003\u0016\u000b"+
		"\u0000JL\u0003\u0006\u0003\u0000KA\u0001\u0000\u0000\u0000KB\u0001\u0000"+
		"\u0000\u0000KC\u0001\u0000\u0000\u0000KD\u0001\u0000\u0000\u0000KE\u0001"+
		"\u0000\u0000\u0000KF\u0001\u0000\u0000\u0000KG\u0001\u0000\u0000\u0000"+
		"KH\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KJ\u0001\u0000\u0000"+
		"\u0000L\u0019\u0001\u0000\u0000\u0000\u0005\u001f+17K";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}