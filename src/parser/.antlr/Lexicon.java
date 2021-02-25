// Generated from c:\Users\LENOVO\Desktop\3\DLP\Sesion3\inicio.vsc\src\parser\Lexicon.g4 by ANTLR 4.8
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
		COMMENT=1, REAL=2, INT=3, READ=4, LITENT=5, LITREAL=6, PRINT=7, IDENT=8, 
		WHITESPACE=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT", "REAL", "INT", "READ", "LITENT", "LITREAL", "PRINT", "IDENT", 
			"WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'real'", "'int'", "'read'", null, null, "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "REAL", "INT", "READ", "LITENT", "LITREAL", "PRINT", 
			"IDENT", "WHITESPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13S\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\6\6\63\n\6\r\6\16\6\64"+
		"\3\7\6\78\n\7\r\7\16\79\3\7\3\7\6\7>\n\7\r\7\16\7?\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\6\tI\n\t\r\t\16\tJ\3\n\6\nN\n\n\r\n\16\nO\3\n\3\n\3\33\2\13\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\3\2\5\3\2\62;\4\2C\\c|\5\2\13"+
		"\f\17\17\"\"\2X\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\25\3\2\2\2"+
		"\5#\3\2\2\2\7(\3\2\2\2\t,\3\2\2\2\13\62\3\2\2\2\r\67\3\2\2\2\17A\3\2\2"+
		"\2\21H\3\2\2\2\23M\3\2\2\2\25\26\7\61\2\2\26\27\7,\2\2\27\33\3\2\2\2\30"+
		"\32\13\2\2\2\31\30\3\2\2\2\32\35\3\2\2\2\33\34\3\2\2\2\33\31\3\2\2\2\34"+
		"\36\3\2\2\2\35\33\3\2\2\2\36\37\7,\2\2\37 \7\61\2\2 !\3\2\2\2!\"\b\2\2"+
		"\2\"\4\3\2\2\2#$\7t\2\2$%\7g\2\2%&\7c\2\2&\'\7n\2\2\'\6\3\2\2\2()\7k\2"+
		"\2)*\7p\2\2*+\7v\2\2+\b\3\2\2\2,-\7t\2\2-.\7g\2\2./\7c\2\2/\60\7f\2\2"+
		"\60\n\3\2\2\2\61\63\t\2\2\2\62\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2"+
		"\64\65\3\2\2\2\65\f\3\2\2\2\668\t\2\2\2\67\66\3\2\2\289\3\2\2\29\67\3"+
		"\2\2\29:\3\2\2\2:;\3\2\2\2;=\7\60\2\2<>\t\2\2\2=<\3\2\2\2>?\3\2\2\2?="+
		"\3\2\2\2?@\3\2\2\2@\16\3\2\2\2AB\7r\2\2BC\7t\2\2CD\7k\2\2DE\7p\2\2EF\7"+
		"v\2\2F\20\3\2\2\2GI\t\3\2\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\22"+
		"\3\2\2\2LN\t\4\2\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2PQ\3\2\2\2Q"+
		"R\b\n\2\2R\24\3\2\2\2\t\2\33\649?JO\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}