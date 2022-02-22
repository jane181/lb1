// Generated from C:/Users/ongjane181/IdeaProjects/lb1/src\lb1.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lb1Parser extends Parser {
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
	public static final int
		RULE_compUnit = 0, RULE_funcDef = 1, RULE_block = 2, RULE_stmt = 3, RULE_number = 4, 
		RULE_decimalconst = 5, RULE_octalconst = 6, RULE_hexadecimalconst = 7, 
		RULE_hexadecimalprefix = 8, RULE_nonzerodigit = 9, RULE_octaldigit = 10, 
		RULE_digit = 11, RULE_hexadecimaldigit = 12, RULE_funcType = 13, RULE_ident = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"compUnit", "funcDef", "block", "stmt", "number", "decimalconst", "octalconst", 
			"hexadecimalconst", "hexadecimalprefix", "nonzerodigit", "octaldigit", 
			"digit", "hexadecimaldigit", "funcType", "ident"
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

	@Override
	public String getGrammarFileName() { return "lb1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public lb1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompUnitContext extends ParserRuleContext {
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public CompUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lb1Listener ) ((lb1Listener)listener).enterCompUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lb1Listener ) ((lb1Listener)listener).exitCompUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lb1Visitor ) return ((lb1Visitor<? extends T>)visitor).visitCompUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompUnitContext compUnit() throws RecognitionException {
		CompUnitContext _localctx = new CompUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			funcDef();
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

	public static class FuncDefContext extends ParserRuleContext {
		public FuncTypeContext funcType() {
			return getRuleContext(FuncTypeContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lb1Listener ) ((lb1Listener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lb1Listener ) ((lb1Listener)listener).exitFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lb1Visitor ) return ((lb1Visitor<? extends T>)visitor).visitFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			funcType();
			setState(33);
			ident();
			setState(34);
			match(T__0);
			setState(35);
			match(T__1);
			setState(36);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lb1Listener ) ((lb1Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lb1Listener ) ((lb1Listener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lb1Visitor ) return ((lb1Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__2);
			setState(39);
			stmt();
			setState(40);
			match(T__3);
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

	public static class StmtContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lb1Listener ) ((lb1Listener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lb1Listener ) ((lb1Listener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lb1Visitor ) return ((lb1Visitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__4);
			setState(43);
			number();
			setState(44);
			match(T__5);
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

	public static class NumberContext extends ParserRuleContext {
		public DecimalconstContext decimalconst() {
			return getRuleContext(DecimalconstContext.class,0);
		}
		public OctalconstContext octalconst() {
			return getRuleContext(OctalconstContext.class,0);
		}
		public HexadecimalconstContext hexadecimalconst() {
			return getRuleContext(HexadecimalconstContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lb1Listener ) ((lb1Listener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lb1Listener ) ((lb1Listener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lb1Visitor ) return ((lb1Visitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_number);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				decimalconst();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				octalconst();
				}
				break;
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				hexadecimalconst();
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

	public static class DecimalconstContext extends ParserRuleContext {
		public NonzerodigitContext nonzerodigit() {
			return getRuleContext(NonzerodigitContext.class,0);
		}
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public DecimalconstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalconst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lb1Listener ) ((lb1Listener)listener).enterDecimalconst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lb1Listener ) ((lb1Listener)listener).exitDecimalconst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lb1Visitor ) return ((lb1Visitor<? extends T>)visitor).visitDecimalconst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalconstContext decimalconst() throws RecognitionException {
		DecimalconstContext _localctx = new DecimalconstContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_decimalconst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			nonzerodigit();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) {
				{
				{
				setState(52);
				digit();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class OctalconstContext extends ParserRuleContext {
		public List<OctaldigitContext> octaldigit() {
			return getRuleContexts(OctaldigitContext.class);
		}
		public OctaldigitContext octaldigit(int i) {
			return getRuleContext(OctaldigitContext.class,i);
		}
		public OctalconstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octalconst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lb1Listener ) ((lb1Listener)listener).enterOctalconst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lb1Listener ) ((lb1Listener)listener).exitOctalconst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lb1Visitor ) return ((lb1Visitor<? extends T>)visitor).visitOctalconst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OctalconstContext octalconst() throws RecognitionException {
		OctalconstContext _localctx = new OctalconstContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_octalconst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__6);
			{
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) {
				{
				{
				setState(59);
				octaldigit();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class HexadecimalconstContext extends ParserRuleContext {
		public HexadecimalprefixContext hexadecimalprefix() {
			return getRuleContext(HexadecimalprefixContext.class,0);
		}
		public List<HexadecimaldigitContext> hexadecimaldigit() {
			return getRuleContexts(HexadecimaldigitContext.class);
		}
		public HexadecimaldigitContext hexadecimaldigit(int i) {
			return getRuleContext(HexadecimaldigitContext.class,i);
		}
		public HexadecimalconstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexadecimalconst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lb1Listener ) ((lb1Listener)listener).enterHexadecimalconst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lb1Listener ) ((lb1Listener)listener).exitHexadecimalconst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lb1Visitor ) return ((lb1Visitor<? extends T>)visitor).visitHexadecimalconst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexadecimalconstContext hexadecimalconst() throws RecognitionException {
		HexadecimalconstContext _localctx = new HexadecimalconstContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_hexadecimalconst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			hexadecimalprefix();
			setState(66);
			hexadecimaldigit();
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) {
				{
				{
				setState(67);
				hexadecimaldigit();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class HexadecimalprefixContext extends ParserRuleContext {
		public HexadecimalprefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexadecimalprefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lb1Listener ) ((lb1Listener)listener).enterHexadecimalprefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lb1Listener ) ((lb1Listener)listener).exitHexadecimalprefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lb1Visitor ) return ((lb1Visitor<? extends T>)visitor).visitHexadecimalprefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexadecimalprefixContext hexadecimalprefix() throws RecognitionException {
		HexadecimalprefixContext _localctx = new HexadecimalprefixContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_hexadecimalprefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
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

	public static class NonzerodigitContext extends ParserRuleContext {
		public NonzerodigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonzerodigit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lb1Listener ) ((lb1Listener)listener).enterNonzerodigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lb1Listener ) ((lb1Listener)listener).exitNonzerodigit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lb1Visitor ) return ((lb1Visitor<? extends T>)visitor).visitNonzerodigit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonzerodigitContext nonzerodigit() throws RecognitionException {
		NonzerodigitContext _localctx = new NonzerodigitContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nonzerodigit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
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

	public static class OctaldigitContext extends ParserRuleContext {
		public OctaldigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octaldigit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lb1Listener ) ((lb1Listener)listener).enterOctaldigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lb1Listener ) ((lb1Listener)listener).exitOctaldigit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lb1Visitor ) return ((lb1Visitor<? extends T>)visitor).visitOctaldigit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OctaldigitContext octaldigit() throws RecognitionException {
		OctaldigitContext _localctx = new OctaldigitContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_octaldigit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
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

	public static class DigitContext extends ParserRuleContext {
		public NonzerodigitContext nonzerodigit() {
			return getRuleContext(NonzerodigitContext.class,0);
		}
		public DigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lb1Listener ) ((lb1Listener)listener).enterDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lb1Listener ) ((lb1Listener)listener).exitDigit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lb1Visitor ) return ((lb1Visitor<? extends T>)visitor).visitDigit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_digit);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(T__6);
				}
				break;
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				nonzerodigit();
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

	public static class HexadecimaldigitContext extends ParserRuleContext {
		public DigitContext digit() {
			return getRuleContext(DigitContext.class,0);
		}
		public HexadecimaldigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexadecimaldigit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lb1Listener ) ((lb1Listener)listener).enterHexadecimaldigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lb1Listener ) ((lb1Listener)listener).exitHexadecimaldigit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lb1Visitor ) return ((lb1Visitor<? extends T>)visitor).visitHexadecimaldigit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexadecimaldigitContext hexadecimaldigit() throws RecognitionException {
		HexadecimaldigitContext _localctx = new HexadecimaldigitContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_hexadecimaldigit);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				digit();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(T__18);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				match(T__19);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				match(T__20);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				match(T__21);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 6);
				{
				setState(88);
				match(T__22);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 7);
				{
				setState(89);
				match(T__23);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 8);
				{
				setState(90);
				match(T__24);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 9);
				{
				setState(91);
				match(T__25);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 10);
				{
				setState(92);
				match(T__26);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 11);
				{
				setState(93);
				match(T__27);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 12);
				{
				setState(94);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 13);
				{
				setState(95);
				match(T__29);
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

	public static class FuncTypeContext extends ParserRuleContext {
		public FuncTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lb1Listener ) ((lb1Listener)listener).enterFuncType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lb1Listener ) ((lb1Listener)listener).exitFuncType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lb1Visitor ) return ((lb1Visitor<? extends T>)visitor).visitFuncType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncTypeContext funcType() throws RecognitionException {
		FuncTypeContext _localctx = new FuncTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_funcType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__30);
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

	public static class IdentContext extends ParserRuleContext {
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lb1Listener ) ((lb1Listener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lb1Listener ) ((lb1Listener)listener).exitIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lb1Visitor ) return ((lb1Visitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__31);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%i\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6\64\n\6\3\7\3\7\7"+
		"\78\n\7\f\7\16\7;\13\7\3\b\3\b\7\b?\n\b\f\b\16\bB\13\b\3\t\3\t\3\t\7\t"+
		"G\n\t\f\t\16\tJ\13\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\5\rT\n\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16c\n\16"+
		"\3\17\3\17\3\20\3\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		"\2\5\3\2\n\13\3\2\f\24\4\2\t\t\f\22\2k\2 \3\2\2\2\4\"\3\2\2\2\6(\3\2\2"+
		"\2\b,\3\2\2\2\n\63\3\2\2\2\f\65\3\2\2\2\16<\3\2\2\2\20C\3\2\2\2\22K\3"+
		"\2\2\2\24M\3\2\2\2\26O\3\2\2\2\30S\3\2\2\2\32b\3\2\2\2\34d\3\2\2\2\36"+
		"f\3\2\2\2 !\5\4\3\2!\3\3\2\2\2\"#\5\34\17\2#$\5\36\20\2$%\7\3\2\2%&\7"+
		"\4\2\2&\'\5\6\4\2\'\5\3\2\2\2()\7\5\2\2)*\5\b\5\2*+\7\6\2\2+\7\3\2\2\2"+
		",-\7\7\2\2-.\5\n\6\2./\7\b\2\2/\t\3\2\2\2\60\64\5\f\7\2\61\64\5\16\b\2"+
		"\62\64\5\20\t\2\63\60\3\2\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64\13\3\2\2"+
		"\2\659\5\24\13\2\668\5\30\r\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3"+
		"\2\2\2:\r\3\2\2\2;9\3\2\2\2<@\7\t\2\2=?\5\26\f\2>=\3\2\2\2?B\3\2\2\2@"+
		">\3\2\2\2@A\3\2\2\2A\17\3\2\2\2B@\3\2\2\2CD\5\22\n\2DH\5\32\16\2EG\5\32"+
		"\16\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\21\3\2\2\2JH\3\2\2\2KL"+
		"\t\2\2\2L\23\3\2\2\2MN\t\3\2\2N\25\3\2\2\2OP\t\4\2\2P\27\3\2\2\2QT\7\t"+
		"\2\2RT\5\24\13\2SQ\3\2\2\2SR\3\2\2\2T\31\3\2\2\2Uc\5\30\r\2Vc\7\25\2\2"+
		"Wc\7\26\2\2Xc\7\27\2\2Yc\7\30\2\2Zc\7\31\2\2[c\7\32\2\2\\c\7\33\2\2]c"+
		"\7\34\2\2^c\7\35\2\2_c\7\36\2\2`c\7\37\2\2ac\7 \2\2bU\3\2\2\2bV\3\2\2"+
		"\2bW\3\2\2\2bX\3\2\2\2bY\3\2\2\2bZ\3\2\2\2b[\3\2\2\2b\\\3\2\2\2b]\3\2"+
		"\2\2b^\3\2\2\2b_\3\2\2\2b`\3\2\2\2ba\3\2\2\2c\33\3\2\2\2de\7!\2\2e\35"+
		"\3\2\2\2fg\7\"\2\2g\37\3\2\2\2\b\639@HSb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}