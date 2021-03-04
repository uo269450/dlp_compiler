// Generated from c:\Users\LENOVO\Desktop\3\DLP\Sesion4\inicio.vsc\src\parser\Lexicon.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Lexicon extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COLON=1, SEMICOLON=2, REAL=3, INT=4, CHAR=5, RETURN=6, READ=7, PRINT=8, 
		LITENT=9, LITFLOAT=10, LITCHAR=11, IDENT=12, COMMENT_BLOCK=13, COMMENT_LINE=14, 
		WHITESPACE=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COLON", "SEMICOLON", "REAL", "INT", "CHAR", "RETURN", "READ", "PRINT", 
			"LITENT", "LITFLOAT", "LITCHAR", "IDENT", "COMMENT_BLOCK", "COMMENT_LINE", 
			"WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "';'", "'float'", "'int'", "'char'", "'return'", "'read'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COLON", "SEMICOLON", "REAL", "INT", "CHAR", "RETURN", "READ", 
			"PRINT", "LITENT", "LITFLOAT", "LITCHAR", "IDENT", "COMMENT_BLOCK", "COMMENT_LINE", 
			"WHITESPACE"
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


	public Lexicon(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lexicon.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u0098\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tT\n\t\3\n\6\nW\n\n\r\n"+
		"\16\nX\3\13\6\13\\\n\13\r\13\16\13]\3\13\3\13\6\13b\n\13\r\13\16\13c\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fm\n\f\3\r\6\rp\n\r\r\r\16\rq\3\r\5\ru\n"+
		"\r\3\16\3\16\3\16\3\16\7\16{\n\16\f\16\16\16~\13\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\7\17\u0089\n\17\f\17\16\17\u008c\13\17\3\17"+
		"\3\17\3\17\3\17\3\20\6\20\u0093\n\20\r\20\16\20\u0094\3\20\3\20\4|\u008a"+
		"\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21\3\2\7\3\2\62;\4\2\f\f\17\17\4\2C\\c|\3\2\f\f\5\2\13\f\17\17"+
		"\"\"\2\u00a2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2"+
		"\2\2\5#\3\2\2\2\7%\3\2\2\2\t+\3\2\2\2\13/\3\2\2\2\r\64\3\2\2\2\17;\3\2"+
		"\2\2\21S\3\2\2\2\23V\3\2\2\2\25[\3\2\2\2\27l\3\2\2\2\31o\3\2\2\2\33v\3"+
		"\2\2\2\35\u0084\3\2\2\2\37\u0092\3\2\2\2!\"\7<\2\2\"\4\3\2\2\2#$\7=\2"+
		"\2$\6\3\2\2\2%&\7h\2\2&\'\7n\2\2\'(\7q\2\2()\7c\2\2)*\7v\2\2*\b\3\2\2"+
		"\2+,\7k\2\2,-\7p\2\2-.\7v\2\2.\n\3\2\2\2/\60\7e\2\2\60\61\7j\2\2\61\62"+
		"\7c\2\2\62\63\7t\2\2\63\f\3\2\2\2\64\65\7t\2\2\65\66\7g\2\2\66\67\7v\2"+
		"\2\678\7w\2\289\7t\2\29:\7p\2\2:\16\3\2\2\2;<\7t\2\2<=\7g\2\2=>\7c\2\2"+
		">?\7f\2\2?\20\3\2\2\2@A\7r\2\2AB\7t\2\2BC\7k\2\2CD\7p\2\2DE\7v\2\2EF\7"+
		"u\2\2FT\7r\2\2GH\7r\2\2HI\7t\2\2IJ\7k\2\2JK\7p\2\2KT\7v\2\2LM\7r\2\2M"+
		"N\7t\2\2NO\7k\2\2OP\7p\2\2PQ\7v\2\2QR\7n\2\2RT\7p\2\2S@\3\2\2\2SG\3\2"+
		"\2\2SL\3\2\2\2T\22\3\2\2\2UW\t\2\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3"+
		"\2\2\2Y\24\3\2\2\2Z\\\t\2\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2"+
		"^_\3\2\2\2_a\7\60\2\2`b\t\2\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2"+
		"\2d\26\3\2\2\2ef\7)\2\2fg\n\3\2\2gm\7)\2\2hi\7)\2\2ij\7^\2\2jk\7p\2\2"+
		"km\7)\2\2le\3\2\2\2lh\3\2\2\2m\30\3\2\2\2np\t\4\2\2on\3\2\2\2pq\3\2\2"+
		"\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2su\5\23\n\2ts\3\2\2\2tu\3\2\2\2u\32\3"+
		"\2\2\2vw\7\61\2\2wx\7,\2\2x|\3\2\2\2y{\13\2\2\2zy\3\2\2\2{~\3\2\2\2|}"+
		"\3\2\2\2|z\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7,\2\2\u0080\u0081"+
		"\7\61\2\2\u0081\u0082\3\2\2\2\u0082\u0083\b\16\2\2\u0083\34\3\2\2\2\u0084"+
		"\u0085\7\61\2\2\u0085\u0086\7\61\2\2\u0086\u008a\3\2\2\2\u0087\u0089\13"+
		"\2\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u008b\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\t\5"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0090\b\17\2\2\u0090\36\3\2\2\2\u0091\u0093"+
		"\t\6\2\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\b\20\2\2\u0097 \3\2\2\2"+
		"\r\2SX]clqt|\u008a\u0094\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}