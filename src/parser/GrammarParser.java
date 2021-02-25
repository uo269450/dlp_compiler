// Generated from src\parser\Grammar.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, COMMENT=16, 
		REAL=17, INT=18, READ=19, LITENT=20, LITREAL=21, PRINT=22, IDENT=23, WHITESPACE=24;
	public static final int
		RULE_start = 0, RULE_data_block = 1, RULE_definicion = 2, RULE_tipo = 3, 
		RULE_code_block = 4, RULE_sentencia = 5, RULE_expresion = 6, RULE_if_block = 7, 
		RULE_else_block = 8, RULE_while_block = 9, RULE_boolExpres = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "data_block", "definicion", "tipo", "code_block", "sentencia", 
			"expresion", "if_block", "else_block", "while_block", "boolExpres"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'DATA'", "';'", "'CODE'", "'='", "'+'", "'<'", "'>('", "')'", 
			"'('", "'if'", "'{'", "'}'", "'else'", "'while'", "'!='", null, "'real'", 
			"'int'", "'read'", null, null, "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "COMMENT", "REAL", "INT", "READ", "LITENT", "LITREAL", 
			"PRINT", "IDENT", "WHITESPACE"
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
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public Data_blockContext data_block() {
			return getRuleContext(Data_blockContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			data_block();
			setState(23);
			code_block();
			setState(24);
			match(EOF);
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

	public static class Data_blockContext extends ParserRuleContext {
		public List<DefinicionContext> definicion() {
			return getRuleContexts(DefinicionContext.class);
		}
		public DefinicionContext definicion(int i) {
			return getRuleContext(DefinicionContext.class,i);
		}
		public Data_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_block; }
	}

	public final Data_blockContext data_block() throws RecognitionException {
		Data_blockContext _localctx = new Data_blockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_data_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__0);
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(27);
				definicion();
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==REAL || _la==INT );
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

	public static class DefinicionContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public DefinicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion; }
	}

	public final DefinicionContext definicion() throws RecognitionException {
		DefinicionContext _localctx = new DefinicionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			tipo();
			setState(33);
			match(IDENT);
			setState(34);
			match(T__1);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(GrammarParser.REAL, 0); }
		public TerminalNode INT() { return getToken(GrammarParser.INT, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_la = _input.LA(1);
			if ( !(_la==REAL || _la==INT) ) {
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

	public static class Code_blockContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_code_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__2);
			setState(40); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(39);
				sentencia();
				}
				}
				setState(42); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__13) | (1L << READ) | (1L << LITENT) | (1L << LITREAL) | (1L << PRINT) | (1L << IDENT))) != 0) );
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

	public static class SentenciaContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(GrammarParser.PRINT, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode READ() { return getToken(GrammarParser.READ, 0); }
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public While_blockContext while_block() {
			return getRuleContext(While_blockContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sentencia);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				match(PRINT);
				setState(45);
				expresion(0);
				setState(46);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				expresion(0);
				setState(49);
				match(T__3);
				setState(50);
				expresion(0);
				setState(51);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				match(READ);
				setState(54);
				expresion(0);
				setState(55);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				if_block();
				setState(58);
				else_block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
				if_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(61);
				while_block();
				}
				break;
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

	public static class ExpresionContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode LITENT() { return getToken(GrammarParser.LITENT, 0); }
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TerminalNode LITREAL() { return getToken(GrammarParser.LITREAL, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expresion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(65);
				match(T__5);
				setState(66);
				tipo();
				setState(67);
				match(T__6);
				setState(68);
				expresion(0);
				setState(69);
				match(T__7);
				}
				break;
			case T__8:
				{
				setState(71);
				match(T__8);
				setState(72);
				expresion(0);
				setState(73);
				match(T__7);
				}
				break;
			case LITENT:
				{
				setState(75);
				match(LITENT);
				}
				break;
			case IDENT:
				{
				setState(76);
				match(IDENT);
				}
				break;
			case LITREAL:
				{
				setState(77);
				match(LITREAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpresionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expresion);
					setState(80);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(81);
					match(T__4);
					setState(82);
					expresion(7);
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class If_blockContext extends ParserRuleContext {
		public BoolExpresContext boolExpres() {
			return getRuleContext(BoolExpresContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__9);
			setState(89);
			match(T__8);
			setState(90);
			boolExpres(0);
			setState(91);
			match(T__7);
			setState(92);
			match(T__10);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__13) | (1L << READ) | (1L << LITENT) | (1L << LITREAL) | (1L << PRINT) | (1L << IDENT))) != 0)) {
				{
				{
				setState(93);
				sentencia();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(T__11);
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

	public static class Else_blockContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_else_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__12);
			setState(102);
			match(T__10);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__13) | (1L << READ) | (1L << LITENT) | (1L << LITREAL) | (1L << PRINT) | (1L << IDENT))) != 0)) {
				{
				{
				setState(103);
				sentencia();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			match(T__11);
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

	public static class While_blockContext extends ParserRuleContext {
		public BoolExpresContext boolExpres() {
			return getRuleContext(BoolExpresContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public While_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_block; }
	}

	public final While_blockContext while_block() throws RecognitionException {
		While_blockContext _localctx = new While_blockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__13);
			setState(112);
			match(T__8);
			setState(113);
			boolExpres(0);
			setState(114);
			match(T__7);
			setState(115);
			match(T__10);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__13) | (1L << READ) | (1L << LITENT) | (1L << LITREAL) | (1L << PRINT) | (1L << IDENT))) != 0)) {
				{
				{
				setState(116);
				sentencia();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			match(T__11);
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

	public static class BoolExpresContext extends ParserRuleContext {
		public TerminalNode LITENT() { return getToken(GrammarParser.LITENT, 0); }
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TerminalNode REAL() { return getToken(GrammarParser.REAL, 0); }
		public List<BoolExpresContext> boolExpres() {
			return getRuleContexts(BoolExpresContext.class);
		}
		public BoolExpresContext boolExpres(int i) {
			return getRuleContext(BoolExpresContext.class,i);
		}
		public BoolExpresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpres; }
	}

	public final BoolExpresContext boolExpres() throws RecognitionException {
		return boolExpres(0);
	}

	private BoolExpresContext boolExpres(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolExpresContext _localctx = new BoolExpresContext(_ctx, _parentState);
		BoolExpresContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_boolExpres, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITENT:
				{
				setState(125);
				match(LITENT);
				}
				break;
			case IDENT:
				{
				setState(126);
				match(IDENT);
				}
				break;
			case REAL:
				{
				setState(127);
				match(REAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolExpresContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_boolExpres);
					setState(130);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(131);
					match(T__14);
					setState(132);
					boolExpres(5);
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		case 10:
			return boolExpres_sempred((BoolExpresContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean boolExpres_sempred(BoolExpresContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u008d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\2\3\3\3\3\6\3\37\n\3\r\3\16\3 \3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\6\6+\n\6\r\6\16\6,\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7A\n\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bQ\n\b\3\b\3\b\3\b\7\bV\n\b\f"+
		"\b\16\bY\13\b\3\t\3\t\3\t\3\t\3\t\3\t\7\ta\n\t\f\t\16\td\13\t\3\t\3\t"+
		"\3\n\3\n\3\n\7\nk\n\n\f\n\16\nn\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\7\13x\n\13\f\13\16\13{\13\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u0083"+
		"\n\f\3\f\3\f\3\f\7\f\u0088\n\f\f\f\16\f\u008b\13\f\3\f\2\4\16\26\r\2\4"+
		"\6\b\n\f\16\20\22\24\26\2\3\3\2\23\24\2\u0093\2\30\3\2\2\2\4\34\3\2\2"+
		"\2\6\"\3\2\2\2\b&\3\2\2\2\n(\3\2\2\2\f@\3\2\2\2\16P\3\2\2\2\20Z\3\2\2"+
		"\2\22g\3\2\2\2\24q\3\2\2\2\26\u0082\3\2\2\2\30\31\5\4\3\2\31\32\5\n\6"+
		"\2\32\33\7\2\2\3\33\3\3\2\2\2\34\36\7\3\2\2\35\37\5\6\4\2\36\35\3\2\2"+
		"\2\37 \3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\5\3\2\2\2\"#\5\b\5\2#$\7\31\2\2"+
		"$%\7\4\2\2%\7\3\2\2\2&\'\t\2\2\2\'\t\3\2\2\2(*\7\5\2\2)+\5\f\7\2*)\3\2"+
		"\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\13\3\2\2\2./\7\30\2\2/\60\5\16\b\2"+
		"\60\61\7\4\2\2\61A\3\2\2\2\62\63\5\16\b\2\63\64\7\6\2\2\64\65\5\16\b\2"+
		"\65\66\7\4\2\2\66A\3\2\2\2\678\7\25\2\289\5\16\b\29:\7\4\2\2:A\3\2\2\2"+
		";<\5\20\t\2<=\5\22\n\2=A\3\2\2\2>A\5\20\t\2?A\5\24\13\2@.\3\2\2\2@\62"+
		"\3\2\2\2@\67\3\2\2\2@;\3\2\2\2@>\3\2\2\2@?\3\2\2\2A\r\3\2\2\2BC\b\b\1"+
		"\2CD\7\b\2\2DE\5\b\5\2EF\7\t\2\2FG\5\16\b\2GH\7\n\2\2HQ\3\2\2\2IJ\7\13"+
		"\2\2JK\5\16\b\2KL\7\n\2\2LQ\3\2\2\2MQ\7\26\2\2NQ\7\31\2\2OQ\7\27\2\2P"+
		"B\3\2\2\2PI\3\2\2\2PM\3\2\2\2PN\3\2\2\2PO\3\2\2\2QW\3\2\2\2RS\f\b\2\2"+
		"ST\7\7\2\2TV\5\16\b\tUR\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\17\3\2"+
		"\2\2YW\3\2\2\2Z[\7\f\2\2[\\\7\13\2\2\\]\5\26\f\2]^\7\n\2\2^b\7\r\2\2_"+
		"a\5\f\7\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2"+
		"ef\7\16\2\2f\21\3\2\2\2gh\7\17\2\2hl\7\r\2\2ik\5\f\7\2ji\3\2\2\2kn\3\2"+
		"\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7\16\2\2p\23\3\2\2\2qr"+
		"\7\20\2\2rs\7\13\2\2st\5\26\f\2tu\7\n\2\2uy\7\r\2\2vx\5\f\7\2wv\3\2\2"+
		"\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7\16\2\2}\25\3"+
		"\2\2\2~\177\b\f\1\2\177\u0083\7\26\2\2\u0080\u0083\7\31\2\2\u0081\u0083"+
		"\7\23\2\2\u0082~\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083"+
		"\u0089\3\2\2\2\u0084\u0085\f\6\2\2\u0085\u0086\7\21\2\2\u0086\u0088\5"+
		"\26\f\7\u0087\u0084\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\27\3\2\2\2\u008b\u0089\3\2\2\2\f ,@PWbly\u0082\u0089";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}