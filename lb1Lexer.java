// Generated from C:/Users/ongjane181/IdeaProjects/lb1/src\lb1.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lb1Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, WS=33, LINE_COMMENT=34, COMMENT=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "WS", 
			"LINE_COMMENT", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'return'", "';'", "'0'", "'0x'", "'0X'", 
			"'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "'a'", 
			"'b'", "'c'", "'d'", "'e'", "'f'", "'A'", "'B'", "'C'", "'D'", "'E'", 
			"'F'", "'int'", "'main'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "WS", "LINE_COMMENT", 
			"COMMENT"
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


	public lb1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "lb1.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u00ba\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3!\3!\3"+
		"!\3!\3!\3\"\6\"\u0097\n\"\r\"\16\"\u0098\3\"\3\"\3#\3#\3#\3#\7#\u00a1"+
		"\n#\f#\16#\u00a4\13#\3#\5#\u00a7\n#\3#\3#\3#\3#\3$\3$\3$\3$\7$\u00b1\n"+
		"$\f$\16$\u00b4\13$\3$\3$\3$\3$\3$\4\u00a2\u00b2\2%\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%\3\2\3"+
		"\7\2\13\f\17\17\"\"))~~\2\u00bd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5K\3\2\2\2\7M\3\2\2\2\tO"+
		"\3\2\2\2\13Q\3\2\2\2\rX\3\2\2\2\17Z\3\2\2\2\21\\\3\2\2\2\23_\3\2\2\2\25"+
		"b\3\2\2\2\27d\3\2\2\2\31f\3\2\2\2\33h\3\2\2\2\35j\3\2\2\2\37l\3\2\2\2"+
		"!n\3\2\2\2#p\3\2\2\2%r\3\2\2\2\'t\3\2\2\2)v\3\2\2\2+x\3\2\2\2-z\3\2\2"+
		"\2/|\3\2\2\2\61~\3\2\2\2\63\u0080\3\2\2\2\65\u0082\3\2\2\2\67\u0084\3"+
		"\2\2\29\u0086\3\2\2\2;\u0088\3\2\2\2=\u008a\3\2\2\2?\u008c\3\2\2\2A\u0090"+
		"\3\2\2\2C\u0096\3\2\2\2E\u009c\3\2\2\2G\u00ac\3\2\2\2IJ\7*\2\2J\4\3\2"+
		"\2\2KL\7+\2\2L\6\3\2\2\2MN\7}\2\2N\b\3\2\2\2OP\7\177\2\2P\n\3\2\2\2QR"+
		"\7t\2\2RS\7g\2\2ST\7v\2\2TU\7w\2\2UV\7t\2\2VW\7p\2\2W\f\3\2\2\2XY\7=\2"+
		"\2Y\16\3\2\2\2Z[\7\62\2\2[\20\3\2\2\2\\]\7\62\2\2]^\7z\2\2^\22\3\2\2\2"+
		"_`\7\62\2\2`a\7Z\2\2a\24\3\2\2\2bc\7\63\2\2c\26\3\2\2\2de\7\64\2\2e\30"+
		"\3\2\2\2fg\7\65\2\2g\32\3\2\2\2hi\7\66\2\2i\34\3\2\2\2jk\7\67\2\2k\36"+
		"\3\2\2\2lm\78\2\2m \3\2\2\2no\79\2\2o\"\3\2\2\2pq\7:\2\2q$\3\2\2\2rs\7"+
		";\2\2s&\3\2\2\2tu\7c\2\2u(\3\2\2\2vw\7d\2\2w*\3\2\2\2xy\7e\2\2y,\3\2\2"+
		"\2z{\7f\2\2{.\3\2\2\2|}\7g\2\2}\60\3\2\2\2~\177\7h\2\2\177\62\3\2\2\2"+
		"\u0080\u0081\7C\2\2\u0081\64\3\2\2\2\u0082\u0083\7D\2\2\u0083\66\3\2\2"+
		"\2\u0084\u0085\7E\2\2\u00858\3\2\2\2\u0086\u0087\7F\2\2\u0087:\3\2\2\2"+
		"\u0088\u0089\7G\2\2\u0089<\3\2\2\2\u008a\u008b\7H\2\2\u008b>\3\2\2\2\u008c"+
		"\u008d\7k\2\2\u008d\u008e\7p\2\2\u008e\u008f\7v\2\2\u008f@\3\2\2\2\u0090"+
		"\u0091\7o\2\2\u0091\u0092\7c\2\2\u0092\u0093\7k\2\2\u0093\u0094\7p\2\2"+
		"\u0094B\3\2\2\2\u0095\u0097\t\2\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3"+
		"\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009b\b\"\2\2\u009bD\3\2\2\2\u009c\u009d\7\61\2\2\u009d\u009e\7\61\2"+
		"\2\u009e\u00a2\3\2\2\2\u009f\u00a1\13\2\2\2\u00a0\u009f\3\2\2\2\u00a1"+
		"\u00a4\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\3\2"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a7\7\17\2\2\u00a6\u00a5\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\7\f\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00ab\b#\2\2\u00abF\3\2\2\2\u00ac\u00ad\7\61\2\2\u00ad\u00ae"+
		"\7,\2\2\u00ae\u00b2\3\2\2\2\u00af\u00b1\13\2\2\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\u00b4\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b5\3\2"+
		"\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7,\2\2\u00b6\u00b7\7\61\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00b9\b$\2\2\u00b9H\3\2\2\2\7\2\u0098\u00a2\u00a6"+
		"\u00b2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}