// Generated from c:\Users\LENOVO\Desktop\3\DLP\Sesion3\inicio.vsc\src\parser\Grammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, COMMENT=16, 
		REAL=17, INT=18, READ=19, LITENT=20, LITREAL=21, PRINT=22, IDENT=23, WHITESPACE=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "COMMENT", "REAL", 
			"INT", "READ", "LITENT", "LITREAL", "PRINT", "IDENT", "WHITESPACE"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u009f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\7\21f\n\21\f\21\16\21i\13\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\6\25\177\n\25\r\25\16\25\u0080\3\26\6\26\u0084\n\26\r\26\16\26"+
		"\u0085\3\26\3\26\6\26\u008a\n\26\r\26\16\26\u008b\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\6\30\u0095\n\30\r\30\16\30\u0096\3\31\6\31\u009a\n\31"+
		"\r\31\16\31\u009b\3\31\3\31\3g\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\3\2\5\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\2\u00a4\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\3\63\3\2\2\2\58\3\2\2\2\7:\3\2\2\2\t?\3\2\2\2\13A\3\2\2\2\rC\3\2"+
		"\2\2\17E\3\2\2\2\21H\3\2\2\2\23J\3\2\2\2\25L\3\2\2\2\27O\3\2\2\2\31Q\3"+
		"\2\2\2\33S\3\2\2\2\35X\3\2\2\2\37^\3\2\2\2!a\3\2\2\2#o\3\2\2\2%t\3\2\2"+
		"\2\'x\3\2\2\2)~\3\2\2\2+\u0083\3\2\2\2-\u008d\3\2\2\2/\u0094\3\2\2\2\61"+
		"\u0099\3\2\2\2\63\64\7F\2\2\64\65\7C\2\2\65\66\7V\2\2\66\67\7C\2\2\67"+
		"\4\3\2\2\289\7=\2\29\6\3\2\2\2:;\7E\2\2;<\7Q\2\2<=\7F\2\2=>\7G\2\2>\b"+
		"\3\2\2\2?@\7?\2\2@\n\3\2\2\2AB\7-\2\2B\f\3\2\2\2CD\7>\2\2D\16\3\2\2\2"+
		"EF\7@\2\2FG\7*\2\2G\20\3\2\2\2HI\7+\2\2I\22\3\2\2\2JK\7*\2\2K\24\3\2\2"+
		"\2LM\7k\2\2MN\7h\2\2N\26\3\2\2\2OP\7}\2\2P\30\3\2\2\2QR\7\177\2\2R\32"+
		"\3\2\2\2ST\7g\2\2TU\7n\2\2UV\7u\2\2VW\7g\2\2W\34\3\2\2\2XY\7y\2\2YZ\7"+
		"j\2\2Z[\7k\2\2[\\\7n\2\2\\]\7g\2\2]\36\3\2\2\2^_\7#\2\2_`\7?\2\2` \3\2"+
		"\2\2ab\7\61\2\2bc\7,\2\2cg\3\2\2\2df\13\2\2\2ed\3\2\2\2fi\3\2\2\2gh\3"+
		"\2\2\2ge\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7,\2\2kl\7\61\2\2lm\3\2\2\2mn\b"+
		"\21\2\2n\"\3\2\2\2op\7t\2\2pq\7g\2\2qr\7c\2\2rs\7n\2\2s$\3\2\2\2tu\7k"+
		"\2\2uv\7p\2\2vw\7v\2\2w&\3\2\2\2xy\7t\2\2yz\7g\2\2z{\7c\2\2{|\7f\2\2|"+
		"(\3\2\2\2}\177\t\2\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081*\3\2\2\2\u0082\u0084\t\2\2\2\u0083\u0082\3\2\2\2"+
		"\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\u0089\7\60\2\2\u0088\u008a\t\2\2\2\u0089\u0088\3\2\2\2"+
		"\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c,\3"+
		"\2\2\2\u008d\u008e\7r\2\2\u008e\u008f\7t\2\2\u008f\u0090\7k\2\2\u0090"+
		"\u0091\7p\2\2\u0091\u0092\7v\2\2\u0092.\3\2\2\2\u0093\u0095\t\3\2\2\u0094"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\60\3\2\2\2\u0098\u009a\t\4\2\2\u0099\u0098\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009e\b\31\2\2\u009e\62\3\2\2\2\t\2g\u0080\u0085\u008b\u0096\u009b\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}