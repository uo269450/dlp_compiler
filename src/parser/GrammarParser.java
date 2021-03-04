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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, COLON=28, SEMICOLON=29, REAL=30, INT=31, 
		CHAR=32, RETURN=33, READ=34, PRINT=35, LITENT=36, LITFLOAT=37, LITCHAR=38, 
		IDENT=39, COMMENT_BLOCK=40, COMMENT_LINE=41, WHITESPACE=42;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_sentencia = 2, RULE_function_block = 3, 
		RULE_if_block = 4, RULE_else_block = 5, RULE_while_block = 6, RULE_struct = 7, 
		RULE_tipo_all = 8, RULE_tipo_primitivo = 9, RULE_var_def = 10, RULE_struckt_def = 11, 
		RULE_param_def = 12, RULE_return_exp = 13, RULE_function_call = 14, RULE_expresion = 15, 
		RULE_cast = 16, RULE_ref = 17, RULE_boolexpr = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "program", "sentencia", "function_block", "if_block", "else_block", 
			"while_block", "struct", "tipo_all", "tipo_primitivo", "var_def", "struckt_def", 
			"param_def", "return_exp", "function_call", "expresion", "cast", "ref", 
			"boolexpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "','", "')'", "'{'", "'}'", "'if'", "'else'", "'while'", 
			"'struct'", "'['", "']'", "'var'", "'+'", "'-'", "'*'", "'/'", "'<'", 
			"'>'", "'.'", "'!='", "'=='", "'<='", "'>='", "'&&'", "'||'", "'!'", 
			"':'", "';'", "'float'", "'int'", "'char'", "'return'", "'read'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "COLON", "SEMICOLON", "REAL", "INT", "CHAR", 
			"RETURN", "READ", "PRINT", "LITENT", "LITFLOAT", "LITCHAR", "IDENT", 
			"COMMENT_BLOCK", "COMMENT_LINE", "WHITESPACE"
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
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
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
			setState(38);
			program();
			setState(39);
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

	public static class ProgramContext extends ParserRuleContext {
		public List<Var_defContext> var_def() {
			return getRuleContexts(Var_defContext.class);
		}
		public Var_defContext var_def(int i) {
			return getRuleContext(Var_defContext.class,i);
		}
		public List<StructContext> struct() {
			return getRuleContexts(StructContext.class);
		}
		public StructContext struct(int i) {
			return getRuleContext(StructContext.class,i);
		}
		public List<Function_blockContext> function_block() {
			return getRuleContexts(Function_blockContext.class);
		}
		public Function_blockContext function_block(int i) {
			return getRuleContext(Function_blockContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__12) | (1L << IDENT))) != 0)) {
				{
				setState(56);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(42); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(41);
							var_def();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(44); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				case T__9:
					{
					setState(47); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(46);
							struct();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(49); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				case IDENT:
					{
					setState(52); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(51);
							function_block();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(54); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(60);
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

	public static class SentenciaContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public TerminalNode PRINT() { return getToken(GrammarParser.PRINT, 0); }
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
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentencia);
		int _la;
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				expresion(0);
				setState(62);
				match(T__0);
				setState(63);
				expresion(0);
				setState(64);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(PRINT);
				setState(67);
				expresion(0);
				setState(68);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				match(READ);
				setState(71);
				expresion(0);
				setState(72);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				if_block();
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(75);
					else_block();
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				while_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(79);
				function_call();
				setState(80);
				match(SEMICOLON);
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

	public static class Function_blockContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public Tipo_primitivoContext tipo_primitivo() {
			return getRuleContext(Tipo_primitivoContext.class,0);
		}
		public List<Var_defContext> var_def() {
			return getRuleContexts(Var_defContext.class);
		}
		public Var_defContext var_def(int i) {
			return getRuleContext(Var_defContext.class,i);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public Return_expContext return_exp() {
			return getRuleContext(Return_expContext.class,0);
		}
		public List<Param_defContext> param_def() {
			return getRuleContexts(Param_defContext.class);
		}
		public Param_defContext param_def(int i) {
			return getRuleContext(Param_defContext.class,i);
		}
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public Function_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_block; }
	}

	public final Function_blockContext function_block() throws RecognitionException {
		Function_blockContext _localctx = new Function_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(IDENT);
			setState(85);
			match(T__1);
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				{
				setState(86);
				param_def();
				}
				}
				break;
			case 2:
				{
				{
				setState(87);
				param_def();
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(88);
					match(T__2);
					setState(89);
					param_def();
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			}
			setState(97);
			match(T__3);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				{
				setState(98);
				match(COLON);
				}
				setState(99);
				tipo_primitivo();
				}
			}

			setState(102);
			match(T__4);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(103);
				var_def();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << T__8) | (1L << T__17) | (1L << READ) | (1L << PRINT) | (1L << LITENT) | (1L << LITFLOAT) | (1L << LITCHAR) | (1L << IDENT))) != 0)) {
				{
				{
				setState(109);
				sentencia();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(115);
				return_exp();
				}
			}

			setState(118);
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

	public static class If_blockContext extends ParserRuleContext {
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public Return_expContext return_exp() {
			return getRuleContext(Return_expContext.class,0);
		}
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_if_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__6);
			setState(121);
			match(T__1);
			setState(122);
			boolexpr(0);
			setState(123);
			match(T__3);
			setState(124);
			match(T__4);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << T__8) | (1L << T__17) | (1L << READ) | (1L << PRINT) | (1L << LITENT) | (1L << LITFLOAT) | (1L << LITCHAR) | (1L << IDENT))) != 0)) {
				{
				{
				setState(125);
				sentencia();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(131);
				return_exp();
				}
			}

			setState(134);
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
		enterRule(_localctx, 10, RULE_else_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__7);
			setState(137);
			match(T__4);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << T__8) | (1L << T__17) | (1L << READ) | (1L << PRINT) | (1L << LITENT) | (1L << LITFLOAT) | (1L << LITCHAR) | (1L << IDENT))) != 0)) {
				{
				{
				setState(138);
				sentencia();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
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

	public static class While_blockContext extends ParserRuleContext {
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
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
		enterRule(_localctx, 12, RULE_while_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__8);
			setState(147);
			match(T__1);
			setState(148);
			boolexpr(0);
			setState(149);
			match(T__3);
			setState(150);
			match(T__4);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << T__8) | (1L << T__17) | (1L << READ) | (1L << PRINT) | (1L << LITENT) | (1L << LITFLOAT) | (1L << LITCHAR) | (1L << IDENT))) != 0)) {
				{
				{
				setState(151);
				sentencia();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
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

	public static class StructContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public List<Struckt_defContext> struckt_def() {
			return getRuleContexts(Struckt_defContext.class);
		}
		public Struckt_defContext struckt_def(int i) {
			return getRuleContext(Struckt_defContext.class,i);
		}
		public StructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct; }
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_struct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__9);
			setState(160);
			match(IDENT);
			setState(161);
			match(T__4);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(162);
				struckt_def();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			match(T__5);
			setState(169);
			match(SEMICOLON);
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

	public static class Tipo_allContext extends ParserRuleContext {
		public Tipo_allContext tipo_all() {
			return getRuleContext(Tipo_allContext.class,0);
		}
		public List<TerminalNode> LITENT() { return getTokens(GrammarParser.LITENT); }
		public TerminalNode LITENT(int i) {
			return getToken(GrammarParser.LITENT, i);
		}
		public Tipo_primitivoContext tipo_primitivo() {
			return getRuleContext(Tipo_primitivoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public Tipo_allContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_all; }
	}

	public final Tipo_allContext tipo_all() throws RecognitionException {
		Tipo_allContext _localctx = new Tipo_allContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tipo_all);
		try {
			int _alt;
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(174); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(171);
						match(T__10);
						setState(172);
						match(LITENT);
						setState(173);
						match(T__11);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(176); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(178);
				tipo_all();
				}
				break;
			case REAL:
			case INT:
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				tipo_primitivo();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				match(IDENT);
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

	public static class Tipo_primitivoContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(GrammarParser.REAL, 0); }
		public TerminalNode INT() { return getToken(GrammarParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(GrammarParser.CHAR, 0); }
		public Tipo_primitivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_primitivo; }
	}

	public final Tipo_primitivoContext tipo_primitivo() throws RecognitionException {
		Tipo_primitivoContext _localctx = new Tipo_primitivoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tipo_primitivo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REAL) | (1L << INT) | (1L << CHAR))) != 0)) ) {
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

	public static class Var_defContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public Tipo_allContext tipo_all() {
			return getRuleContext(Tipo_allContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public Var_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_def; }
	}

	public final Var_defContext var_def() throws RecognitionException {
		Var_defContext _localctx = new Var_defContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__12);
			setState(186);
			match(IDENT);
			setState(187);
			match(COLON);
			setState(188);
			tipo_all();
			setState(189);
			match(SEMICOLON);
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

	public static class Struckt_defContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public Tipo_allContext tipo_all() {
			return getRuleContext(Tipo_allContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public List<TerminalNode> LITENT() { return getTokens(GrammarParser.LITENT); }
		public TerminalNode LITENT(int i) {
			return getToken(GrammarParser.LITENT, i);
		}
		public Struckt_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struckt_def; }
	}

	public final Struckt_defContext struckt_def() throws RecognitionException {
		Struckt_defContext _localctx = new Struckt_defContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_struckt_def);
		try {
			int _alt;
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(IDENT);
				setState(192);
				match(COLON);
				setState(193);
				tipo_all();
				setState(194);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(IDENT);
				setState(197);
				match(COLON);
				setState(201); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(198);
						match(T__10);
						setState(199);
						match(LITENT);
						setState(200);
						match(T__11);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(203); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(205);
				tipo_all();
				setState(206);
				match(SEMICOLON);
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

	public static class Param_defContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public Tipo_primitivoContext tipo_primitivo() {
			return getRuleContext(Tipo_primitivoContext.class,0);
		}
		public Param_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_def; }
	}

	public final Param_defContext param_def() throws RecognitionException {
		Param_defContext _localctx = new Param_defContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_param_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(IDENT);
			setState(211);
			match(COLON);
			setState(212);
			tipo_primitivo();
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

	public static class Return_expContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(GrammarParser.RETURN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public Return_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_exp; }
	}

	public final Return_expContext return_exp() throws RecognitionException {
		Return_expContext _localctx = new Return_expContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_return_exp);
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(RETURN);
				setState(215);
				expresion(0);
				setState(216);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(RETURN);
				setState(219);
				match(SEMICOLON);
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(IDENT);
			setState(223);
			match(T__1);
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				{
				setState(224);
				expresion(0);
				}
				}
				break;
			case 2:
				{
				{
				setState(225);
				expresion(0);
				setState(228); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(226);
					match(T__2);
					setState(227);
					expresion(0);
					}
					}
					setState(230); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				}
				}
				break;
			}
			setState(234);
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

	public static class ExpresionContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public CastContext cast() {
			return getRuleContext(CastContext.class,0);
		}
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public TerminalNode LITENT() { return getToken(GrammarParser.LITENT, 0); }
		public TerminalNode LITFLOAT() { return getToken(GrammarParser.LITFLOAT, 0); }
		public TerminalNode LITCHAR() { return getToken(GrammarParser.LITCHAR, 0); }
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(237);
				function_call();
				}
				break;
			case 2:
				{
				setState(238);
				match(T__1);
				setState(239);
				expresion(0);
				setState(240);
				match(T__3);
				}
				break;
			case 3:
				{
				setState(242);
				cast();
				}
				break;
			case 4:
				{
				setState(243);
				ref(0);
				}
				break;
			case 5:
				{
				setState(244);
				match(LITENT);
				}
				break;
			case 6:
				{
				setState(245);
				match(LITFLOAT);
				}
				break;
			case 7:
				{
				setState(246);
				match(LITCHAR);
				}
				break;
			case 8:
				{
				setState(247);
				match(IDENT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(258);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(256);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(250);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(251);
						_la = _input.LA(1);
						if ( !(_la==T__13 || _la==T__14) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(252);
						expresion(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(253);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(254);
						_la = _input.LA(1);
						if ( !(_la==T__15 || _la==T__16) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(255);
						expresion(7);
						}
						break;
					}
					} 
				}
				setState(260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	public static class CastContext extends ParserRuleContext {
		public Tipo_primitivoContext tipo_primitivo() {
			return getRuleContext(Tipo_primitivoContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public CastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast; }
	}

	public final CastContext cast() throws RecognitionException {
		CastContext _localctx = new CastContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(T__17);
			setState(262);
			tipo_primitivo();
			setState(263);
			match(T__18);
			setState(264);
			match(T__1);
			setState(265);
			expresion(0);
			setState(266);
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

	public static class RefContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(GrammarParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(GrammarParser.IDENT, i);
		}
		public List<TerminalNode> LITENT() { return getTokens(GrammarParser.LITENT); }
		public TerminalNode LITENT(int i) {
			return getToken(GrammarParser.LITENT, i);
		}
		public List<RefContext> ref() {
			return getRuleContexts(RefContext.class);
		}
		public RefContext ref(int i) {
			return getRuleContext(RefContext.class,i);
		}
		public RefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref; }
	}

	public final RefContext ref() throws RecognitionException {
		return ref(0);
	}

	private RefContext ref(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RefContext _localctx = new RefContext(_ctx, _parentState);
		RefContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_ref, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(269);
			match(IDENT);
			setState(275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(270);
					match(T__10);
					setState(271);
					_la = _input.LA(1);
					if ( !(_la==LITENT || _la==IDENT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(272);
					match(T__11);
					}
					} 
				}
				setState(277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RefContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ref);
					setState(278);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(279);
					match(T__19);
					setState(280);
					ref(2);
					}
					} 
				}
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class BoolexprContext extends ParserRuleContext {
		public List<BoolexprContext> boolexpr() {
			return getRuleContexts(BoolexprContext.class);
		}
		public BoolexprContext boolexpr(int i) {
			return getRuleContext(BoolexprContext.class,i);
		}
		public TerminalNode LITENT() { return getToken(GrammarParser.LITENT, 0); }
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TerminalNode LITFLOAT() { return getToken(GrammarParser.LITFLOAT, 0); }
		public BoolexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr; }
	}

	public final BoolexprContext boolexpr() throws RecognitionException {
		return boolexpr(0);
	}

	private BoolexprContext boolexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolexprContext _localctx = new BoolexprContext(_ctx, _parentState);
		BoolexprContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_boolexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(287);
				match(T__1);
				setState(288);
				boolexpr(0);
				setState(289);
				match(T__3);
				}
				break;
			case LITENT:
				{
				setState(291);
				match(LITENT);
				}
				break;
			case IDENT:
				{
				setState(292);
				match(IDENT);
				}
				break;
			case LITFLOAT:
				{
				setState(293);
				match(LITFLOAT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(302);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new BoolexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_boolexpr);
						setState(296);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(297);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(298);
						boolexpr(7);
						}
						break;
					case 2:
						{
						_localctx = new BoolexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_boolexpr);
						setState(299);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(300);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(301);
						boolexpr(6);
						}
						break;
					}
					} 
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		case 15:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		case 17:
			return ref_sempred((RefContext)_localctx, predIndex);
		case 18:
			return boolexpr_sempred((BoolexprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean ref_sempred(RefContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean boolexpr_sempred(BoolexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0136\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\3\6\3-\n\3\r\3\16\3.\3\3\6\3\62\n\3"+
		"\r\3\16\3\63\3\3\6\3\67\n\3\r\3\16\38\7\3;\n\3\f\3\16\3>\13\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4O\n\4\3\4\3\4"+
		"\3\4\3\4\5\4U\n\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5]\n\5\f\5\16\5`\13\5\5\5"+
		"b\n\5\3\5\3\5\3\5\5\5g\n\5\3\5\3\5\7\5k\n\5\f\5\16\5n\13\5\3\5\7\5q\n"+
		"\5\f\5\16\5t\13\5\3\5\5\5w\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0081"+
		"\n\6\f\6\16\6\u0084\13\6\3\6\5\6\u0087\n\6\3\6\3\6\3\7\3\7\3\7\7\7\u008e"+
		"\n\7\f\7\16\7\u0091\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u009b\n\b"+
		"\f\b\16\b\u009e\13\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t\u00a6\n\t\f\t\16\t\u00a9"+
		"\13\t\3\t\3\t\3\t\3\n\3\n\3\n\6\n\u00b1\n\n\r\n\16\n\u00b2\3\n\3\n\3\n"+
		"\5\n\u00b8\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\6\r\u00cc\n\r\r\r\16\r\u00cd\3\r\3\r\3\r\5\r\u00d3"+
		"\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00df\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\6\20\u00e7\n\20\r\20\16\20\u00e8\5\20\u00eb"+
		"\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00fb\n\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0103\n\21\f"+
		"\21\16\21\u0106\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\7\23\u0114\n\23\f\23\16\23\u0117\13\23\3\23\3\23\3\23\7\23"+
		"\u011c\n\23\f\23\16\23\u011f\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u0129\n\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0131\n\24\f"+
		"\24\16\24\u0134\13\24\3\24\2\5 $&\25\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&\2\b\3\2 \"\3\2\20\21\3\2\22\23\4\2&&))\4\2\24\25\27\32\3\2"+
		"\33\35\2\u0153\2(\3\2\2\2\4<\3\2\2\2\6T\3\2\2\2\bV\3\2\2\2\nz\3\2\2\2"+
		"\f\u008a\3\2\2\2\16\u0094\3\2\2\2\20\u00a1\3\2\2\2\22\u00b7\3\2\2\2\24"+
		"\u00b9\3\2\2\2\26\u00bb\3\2\2\2\30\u00d2\3\2\2\2\32\u00d4\3\2\2\2\34\u00de"+
		"\3\2\2\2\36\u00e0\3\2\2\2 \u00fa\3\2\2\2\"\u0107\3\2\2\2$\u010e\3\2\2"+
		"\2&\u0128\3\2\2\2()\5\4\3\2)*\7\2\2\3*\3\3\2\2\2+-\5\26\f\2,+\3\2\2\2"+
		"-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/;\3\2\2\2\60\62\5\20\t\2\61\60\3\2\2\2"+
		"\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64;\3\2\2\2\65\67\5\b\5\2\66"+
		"\65\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:,\3\2\2\2:\61"+
		"\3\2\2\2:\66\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\5\3\2\2\2><\3\2\2"+
		"\2?@\5 \21\2@A\7\3\2\2AB\5 \21\2BC\7\37\2\2CU\3\2\2\2DE\7%\2\2EF\5 \21"+
		"\2FG\7\37\2\2GU\3\2\2\2HI\7$\2\2IJ\5 \21\2JK\7\37\2\2KU\3\2\2\2LN\5\n"+
		"\6\2MO\5\f\7\2NM\3\2\2\2NO\3\2\2\2OU\3\2\2\2PU\5\16\b\2QR\5\36\20\2RS"+
		"\7\37\2\2SU\3\2\2\2T?\3\2\2\2TD\3\2\2\2TH\3\2\2\2TL\3\2\2\2TP\3\2\2\2"+
		"TQ\3\2\2\2U\7\3\2\2\2VW\7)\2\2Wa\7\4\2\2Xb\5\32\16\2Y^\5\32\16\2Z[\7\5"+
		"\2\2[]\5\32\16\2\\Z\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_b\3\2\2\2`"+
		"^\3\2\2\2aX\3\2\2\2aY\3\2\2\2ab\3\2\2\2bc\3\2\2\2cf\7\6\2\2de\7\36\2\2"+
		"eg\5\24\13\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hl\7\7\2\2ik\5\26\f\2ji\3\2"+
		"\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mr\3\2\2\2nl\3\2\2\2oq\5\6\4\2po\3\2"+
		"\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2sv\3\2\2\2tr\3\2\2\2uw\5\34\17\2vu\3"+
		"\2\2\2vw\3\2\2\2wx\3\2\2\2xy\7\b\2\2y\t\3\2\2\2z{\7\t\2\2{|\7\4\2\2|}"+
		"\5&\24\2}~\7\6\2\2~\u0082\7\7\2\2\177\u0081\5\6\4\2\u0080\177\3\2\2\2"+
		"\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0086"+
		"\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0087\5\34\17\2\u0086\u0085\3\2\2\2"+
		"\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\7\b\2\2\u0089\13"+
		"\3\2\2\2\u008a\u008b\7\n\2\2\u008b\u008f\7\7\2\2\u008c\u008e\5\6\4\2\u008d"+
		"\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7\b\2\2\u0093"+
		"\r\3\2\2\2\u0094\u0095\7\13\2\2\u0095\u0096\7\4\2\2\u0096\u0097\5&\24"+
		"\2\u0097\u0098\7\6\2\2\u0098\u009c\7\7\2\2\u0099\u009b\5\6\4\2\u009a\u0099"+
		"\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\b\2\2\u00a0\17\3\2\2"+
		"\2\u00a1\u00a2\7\f\2\2\u00a2\u00a3\7)\2\2\u00a3\u00a7\7\7\2\2\u00a4\u00a6"+
		"\5\30\r\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2"+
		"\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab"+
		"\7\b\2\2\u00ab\u00ac\7\37\2\2\u00ac\21\3\2\2\2\u00ad\u00ae\7\r\2\2\u00ae"+
		"\u00af\7&\2\2\u00af\u00b1\7\16\2\2\u00b0\u00ad\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b8\5\22\n\2\u00b5\u00b8\5\24\13\2\u00b6\u00b8\7)\2\2\u00b7\u00b0\3"+
		"\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\23\3\2\2\2\u00b9"+
		"\u00ba\t\2\2\2\u00ba\25\3\2\2\2\u00bb\u00bc\7\17\2\2\u00bc\u00bd\7)\2"+
		"\2\u00bd\u00be\7\36\2\2\u00be\u00bf\5\22\n\2\u00bf\u00c0\7\37\2\2\u00c0"+
		"\27\3\2\2\2\u00c1\u00c2\7)\2\2\u00c2\u00c3\7\36\2\2\u00c3\u00c4\5\22\n"+
		"\2\u00c4\u00c5\7\37\2\2\u00c5\u00d3\3\2\2\2\u00c6\u00c7\7)\2\2\u00c7\u00cb"+
		"\7\36\2\2\u00c8\u00c9\7\r\2\2\u00c9\u00ca\7&\2\2\u00ca\u00cc\7\16\2\2"+
		"\u00cb\u00c8\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\5\22\n\2\u00d0\u00d1\7\37\2\2"+
		"\u00d1\u00d3\3\2\2\2\u00d2\u00c1\3\2\2\2\u00d2\u00c6\3\2\2\2\u00d3\31"+
		"\3\2\2\2\u00d4\u00d5\7)\2\2\u00d5\u00d6\7\36\2\2\u00d6\u00d7\5\24\13\2"+
		"\u00d7\33\3\2\2\2\u00d8\u00d9\7#\2\2\u00d9\u00da\5 \21\2\u00da\u00db\7"+
		"\37\2\2\u00db\u00df\3\2\2\2\u00dc\u00dd\7#\2\2\u00dd\u00df\7\37\2\2\u00de"+
		"\u00d8\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\35\3\2\2\2\u00e0\u00e1\7)\2\2"+
		"\u00e1\u00ea\7\4\2\2\u00e2\u00eb\5 \21\2\u00e3\u00e6\5 \21\2\u00e4\u00e5"+
		"\7\5\2\2\u00e5\u00e7\5 \21\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e2\3\2"+
		"\2\2\u00ea\u00e3\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ed\7\6\2\2\u00ed\37\3\2\2\2\u00ee\u00ef\b\21\1\2\u00ef\u00fb\5\36"+
		"\20\2\u00f0\u00f1\7\4\2\2\u00f1\u00f2\5 \21\2\u00f2\u00f3\7\6\2\2\u00f3"+
		"\u00fb\3\2\2\2\u00f4\u00fb\5\"\22\2\u00f5\u00fb\5$\23\2\u00f6\u00fb\7"+
		"&\2\2\u00f7\u00fb\7\'\2\2\u00f8\u00fb\7(\2\2\u00f9\u00fb\7)\2\2\u00fa"+
		"\u00ee\3\2\2\2\u00fa\u00f0\3\2\2\2\u00fa\u00f4\3\2\2\2\u00fa\u00f5\3\2"+
		"\2\2\u00fa\u00f6\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa"+
		"\u00f9\3\2\2\2\u00fb\u0104\3\2\2\2\u00fc\u00fd\f\t\2\2\u00fd\u00fe\t\3"+
		"\2\2\u00fe\u0103\5 \21\n\u00ff\u0100\f\b\2\2\u0100\u0101\t\4\2\2\u0101"+
		"\u0103\5 \21\t\u0102\u00fc\3\2\2\2\u0102\u00ff\3\2\2\2\u0103\u0106\3\2"+
		"\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105!\3\2\2\2\u0106\u0104"+
		"\3\2\2\2\u0107\u0108\7\24\2\2\u0108\u0109\5\24\13\2\u0109\u010a\7\25\2"+
		"\2\u010a\u010b\7\4\2\2\u010b\u010c\5 \21\2\u010c\u010d\7\6\2\2\u010d#"+
		"\3\2\2\2\u010e\u010f\b\23\1\2\u010f\u0115\7)\2\2\u0110\u0111\7\r\2\2\u0111"+
		"\u0112\t\5\2\2\u0112\u0114\7\16\2\2\u0113\u0110\3\2\2\2\u0114\u0117\3"+
		"\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u011d\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0118\u0119\f\3\2\2\u0119\u011a\7\26\2\2\u011a\u011c\5"+
		"$\23\4\u011b\u0118\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e%\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\b\24\1\2"+
		"\u0121\u0122\7\4\2\2\u0122\u0123\5&\24\2\u0123\u0124\7\6\2\2\u0124\u0129"+
		"\3\2\2\2\u0125\u0129\7&\2\2\u0126\u0129\7)\2\2\u0127\u0129\7\'\2\2\u0128"+
		"\u0120\3\2\2\2\u0128\u0125\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0127\3\2"+
		"\2\2\u0129\u0132\3\2\2\2\u012a\u012b\f\b\2\2\u012b\u012c\t\6\2\2\u012c"+
		"\u0131\5&\24\t\u012d\u012e\f\7\2\2\u012e\u012f\t\7\2\2\u012f\u0131\5&"+
		"\24\b\u0130\u012a\3\2\2\2\u0130\u012d\3\2\2\2\u0131\u0134\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\'\3\2\2\2\u0134\u0132\3\2\2\2"+
		"#.\638:<NT^aflrv\u0082\u0086\u008f\u009c\u00a7\u00b2\u00b7\u00cd\u00d2"+
		"\u00de\u00e8\u00ea\u00fa\u0102\u0104\u0115\u011d\u0128\u0130\u0132";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}