// Generated from C:/Users/Guilherme Nunes/Development/Repositories/DataLangSDK\DataLang.g4 by ANTLR 4.12.0
package ANTLR;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DataLangLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IFSULDEMINAS", "INICIO", "FIM", "COMMENT", "INT", "FLOAT", "NUMBER", 
			"SINGLE_QUOTE", "DOUBLE_QUOTE", "STRING", "BOOLEAN", "NONE", "FUNC", 
			"RETURN", "COND_IF", "COND_ELIF", "COND_ELSE", "LOOP_WHILE", "LOOP_FOR", 
			"OP_REL", "OP_MATH", "OP_ASSING", "OP_LOG", "OPEN_PARENTHESES", "CLOSE_PARENTHESES", 
			"OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", "OPEN_BRACES", "CLOSE_BRACES", 
			"COMMA", "ID", "WS"
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


	public DataLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DataLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u001c\u00ef\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0002\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0004\u0004^\b\u0004\u000b\u0004\f\u0004_\u0001"+
		"\u0005\u0004\u0005c\b\u0005\u000b\u0005\f\u0005d\u0001\u0005\u0001\u0005"+
		"\u0004\u0005i\b\u0005\u000b\u0005\f\u0005j\u0001\u0006\u0001\u0006\u0003"+
		"\u0006o\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0005\tw\b\t\n\t\f\tz\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0080"+
		"\b\t\n\t\f\t\u0083\t\t\u0001\t\u0001\t\u0003\t\u0087\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0092"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00c4\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u00d2\b\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0005\u001e"+
		"\u00e4\b\u001e\n\u001e\f\u001e\u00e7\t\u001e\u0001\u001f\u0004\u001f\u00ea"+
		"\b\u001f\u000b\u001f\f\u001f\u00eb\u0001\u001f\u0001\u001f\u0000\u0000"+
		" \u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0000\u000b\u0000"+
		"\r\u0005\u000f\u0000\u0011\u0000\u0013\u0006\u0015\u0007\u0017\b\u0019"+
		"\t\u001b\n\u001d\u000b\u001f\f!\r#\u000e%\u000f\'\u0010)\u0011+\u0012"+
		"-\u0013/\u00141\u00153\u00165\u00177\u00189\u0019;\u001a=\u001b?\u001c"+
		"\u0001\u0000\b\u0001\u000009\u0002\u0000\"\"\\\\\u0002\u0000\'\'\\\\\u0002"+
		"\u0000<<>>\u0003\u0000*+--//\u0002\u0000AZaz\u0003\u000009AZaz\u0003\u0000"+
		"\t\n\r\r  \u00fa\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001"+
		"\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000"+
		"\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u0000"+
		"7\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001"+
		"\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000"+
		"\u0000\u0001A\u0001\u0000\u0000\u0000\u0003N\u0001\u0000\u0000\u0000\u0005"+
		"U\u0001\u0000\u0000\u0000\u0007Y\u0001\u0000\u0000\u0000\t]\u0001\u0000"+
		"\u0000\u0000\u000bb\u0001\u0000\u0000\u0000\rn\u0001\u0000\u0000\u0000"+
		"\u000fp\u0001\u0000\u0000\u0000\u0011r\u0001\u0000\u0000\u0000\u0013\u0086"+
		"\u0001\u0000\u0000\u0000\u0015\u0091\u0001\u0000\u0000\u0000\u0017\u0093"+
		"\u0001\u0000\u0000\u0000\u0019\u0098\u0001\u0000\u0000\u0000\u001b\u009c"+
		"\u0001\u0000\u0000\u0000\u001d\u00a3\u0001\u0000\u0000\u0000\u001f\u00a6"+
		"\u0001\u0000\u0000\u0000!\u00ab\u0001\u0000\u0000\u0000#\u00b0\u0001\u0000"+
		"\u0000\u0000%\u00b6\u0001\u0000\u0000\u0000\'\u00c3\u0001\u0000\u0000"+
		"\u0000)\u00c5\u0001\u0000\u0000\u0000+\u00c7\u0001\u0000\u0000\u0000-"+
		"\u00d1\u0001\u0000\u0000\u0000/\u00d3\u0001\u0000\u0000\u00001\u00d5\u0001"+
		"\u0000\u0000\u00003\u00d7\u0001\u0000\u0000\u00005\u00d9\u0001\u0000\u0000"+
		"\u00007\u00db\u0001\u0000\u0000\u00009\u00dd\u0001\u0000\u0000\u0000;"+
		"\u00df\u0001\u0000\u0000\u0000=\u00e1\u0001\u0000\u0000\u0000?\u00e9\u0001"+
		"\u0000\u0000\u0000AB\u0005I\u0000\u0000BC\u0005F\u0000\u0000CD\u0005S"+
		"\u0000\u0000DE\u0005U\u0000\u0000EF\u0005L\u0000\u0000FG\u0005D\u0000"+
		"\u0000GH\u0005E\u0000\u0000HI\u0005M\u0000\u0000IJ\u0005I\u0000\u0000"+
		"JK\u0005N\u0000\u0000KL\u0005A\u0000\u0000LM\u0005S\u0000\u0000M\u0002"+
		"\u0001\u0000\u0000\u0000NO\u0005I\u0000\u0000OP\u0005N\u0000\u0000PQ\u0005"+
		"I\u0000\u0000QR\u0005C\u0000\u0000RS\u0005I\u0000\u0000ST\u0005O\u0000"+
		"\u0000T\u0004\u0001\u0000\u0000\u0000UV\u0005F\u0000\u0000VW\u0005I\u0000"+
		"\u0000WX\u0005M\u0000\u0000X\u0006\u0001\u0000\u0000\u0000YZ\u0005/\u0000"+
		"\u0000Z[\u0005/\u0000\u0000[\b\u0001\u0000\u0000\u0000\\^\u0007\u0000"+
		"\u0000\u0000]\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_]\u0001"+
		"\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`\n\u0001\u0000\u0000\u0000"+
		"ac\u0007\u0000\u0000\u0000ba\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0001\u0000"+
		"\u0000\u0000fh\u0005.\u0000\u0000gi\u0007\u0000\u0000\u0000hg\u0001\u0000"+
		"\u0000\u0000ij\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001"+
		"\u0000\u0000\u0000k\f\u0001\u0000\u0000\u0000lo\u0003\t\u0004\u0000mo"+
		"\u0003\u000b\u0005\u0000nl\u0001\u0000\u0000\u0000nm\u0001\u0000\u0000"+
		"\u0000o\u000e\u0001\u0000\u0000\u0000pq\u0005\'\u0000\u0000q\u0010\u0001"+
		"\u0000\u0000\u0000rs\u0005\"\u0000\u0000s\u0012\u0001\u0000\u0000\u0000"+
		"tx\u0003\u0011\b\u0000uw\b\u0001\u0000\u0000vu\u0001\u0000\u0000\u0000"+
		"wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000"+
		"\u0000y{\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000{|\u0003\u0011"+
		"\b\u0000|\u0087\u0001\u0000\u0000\u0000}\u0081\u0003\u000f\u0007\u0000"+
		"~\u0080\b\u0002\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0083"+
		"\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0001\u0000\u0000\u0000\u0082\u0084\u0001\u0000\u0000\u0000\u0083\u0081"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0003\u000f\u0007\u0000\u0085\u0087"+
		"\u0001\u0000\u0000\u0000\u0086t\u0001\u0000\u0000\u0000\u0086}\u0001\u0000"+
		"\u0000\u0000\u0087\u0014\u0001\u0000\u0000\u0000\u0088\u0089\u0005T\u0000"+
		"\u0000\u0089\u008a\u0005r\u0000\u0000\u008a\u008b\u0005u\u0000\u0000\u008b"+
		"\u0092\u0005e\u0000\u0000\u008c\u008d\u0005F\u0000\u0000\u008d\u008e\u0005"+
		"a\u0000\u0000\u008e\u008f\u0005l\u0000\u0000\u008f\u0090\u0005s\u0000"+
		"\u0000\u0090\u0092\u0005e\u0000\u0000\u0091\u0088\u0001\u0000\u0000\u0000"+
		"\u0091\u008c\u0001\u0000\u0000\u0000\u0092\u0016\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0005N\u0000\u0000\u0094\u0095\u0005o\u0000\u0000\u0095\u0096"+
		"\u0005n\u0000\u0000\u0096\u0097\u0005e\u0000\u0000\u0097\u0018\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0005d\u0000\u0000\u0099\u009a\u0005e\u0000\u0000"+
		"\u009a\u009b\u0005f\u0000\u0000\u009b\u001a\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0005r\u0000\u0000\u009d\u009e\u0005e\u0000\u0000\u009e\u009f\u0005"+
		"t\u0000\u0000\u009f\u00a0\u0005u\u0000\u0000\u00a0\u00a1\u0005r\u0000"+
		"\u0000\u00a1\u00a2\u0005n\u0000\u0000\u00a2\u001c\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u0005i\u0000\u0000\u00a4\u00a5\u0005f\u0000\u0000\u00a5\u001e"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005e\u0000\u0000\u00a7\u00a8\u0005"+
		"l\u0000\u0000\u00a8\u00a9\u0005i\u0000\u0000\u00a9\u00aa\u0005f\u0000"+
		"\u0000\u00aa \u0001\u0000\u0000\u0000\u00ab\u00ac\u0005e\u0000\u0000\u00ac"+
		"\u00ad\u0005l\u0000\u0000\u00ad\u00ae\u0005s\u0000\u0000\u00ae\u00af\u0005"+
		"e\u0000\u0000\u00af\"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005w\u0000"+
		"\u0000\u00b1\u00b2\u0005h\u0000\u0000\u00b2\u00b3\u0005i\u0000\u0000\u00b3"+
		"\u00b4\u0005l\u0000\u0000\u00b4\u00b5\u0005e\u0000\u0000\u00b5$\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0005f\u0000\u0000\u00b7\u00b8\u0005o\u0000"+
		"\u0000\u00b8\u00b9\u0005r\u0000\u0000\u00b9&\u0001\u0000\u0000\u0000\u00ba"+
		"\u00c4\u0007\u0003\u0000\u0000\u00bb\u00bc\u0005>\u0000\u0000\u00bc\u00c4"+
		"\u0005=\u0000\u0000\u00bd\u00be\u0005<\u0000\u0000\u00be\u00c4\u0005="+
		"\u0000\u0000\u00bf\u00c0\u0005=\u0000\u0000\u00c0\u00c4\u0005=\u0000\u0000"+
		"\u00c1\u00c2\u0005!\u0000\u0000\u00c2\u00c4\u0005=\u0000\u0000\u00c3\u00ba"+
		"\u0001\u0000\u0000\u0000\u00c3\u00bb\u0001\u0000\u0000\u0000\u00c3\u00bd"+
		"\u0001\u0000\u0000\u0000\u00c3\u00bf\u0001\u0000\u0000\u0000\u00c3\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c4(\u0001\u0000\u0000\u0000\u00c5\u00c6\u0007"+
		"\u0004\u0000\u0000\u00c6*\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005=\u0000"+
		"\u0000\u00c8,\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005a\u0000\u0000\u00ca"+
		"\u00cb\u0005n\u0000\u0000\u00cb\u00d2\u0005d\u0000\u0000\u00cc\u00cd\u0005"+
		"o\u0000\u0000\u00cd\u00d2\u0005r\u0000\u0000\u00ce\u00cf\u0005n\u0000"+
		"\u0000\u00cf\u00d0\u0005o\u0000\u0000\u00d0\u00d2\u0005t\u0000\u0000\u00d1"+
		"\u00c9\u0001\u0000\u0000\u0000\u00d1\u00cc\u0001\u0000\u0000\u0000\u00d1"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d2.\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\u0005(\u0000\u0000\u00d40\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005)"+
		"\u0000\u0000\u00d62\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005[\u0000\u0000"+
		"\u00d84\u0001\u0000\u0000\u0000\u00d9\u00da\u0005]\u0000\u0000\u00da6"+
		"\u0001\u0000\u0000\u0000\u00db\u00dc\u0005{\u0000\u0000\u00dc8\u0001\u0000"+
		"\u0000\u0000\u00dd\u00de\u0005}\u0000\u0000\u00de:\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u0005,\u0000\u0000\u00e0<\u0001\u0000\u0000\u0000\u00e1\u00e5"+
		"\u0007\u0005\u0000\u0000\u00e2\u00e4\u0007\u0006\u0000\u0000\u00e3\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6>\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00ea\u0007"+
		"\u0007\u0000\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001"+
		"\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ee\u0006"+
		"\u001f\u0000\u0000\u00ee@\u0001\u0000\u0000\u0000\r\u0000_djnx\u0081\u0086"+
		"\u0091\u00c3\u00d1\u00e5\u00eb\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}