// Generated from java-escape by ANTLR 4.11.1
package gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DartLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AA=1, C=2, CB=3, CBC=4, CO=5, CP=6, D=7, EE=8, EQ=9, GT=10, LT=11, LTE=12, 
		GTE=13, MINUS=14, MM=15, NE=16, NOT=17, OB=18, OBC=19, OP=20, PC=21, PL=22, 
		PLPL=23, PP=24, SL=25, ST=26, SC=27, AS_=28, BREAK_=29, CASE_=30, CLASS_=31, 
		CONTINUE_=32, DEFAULT_=33, ELSE_=34, EXTENDS_=35, FALSE_=36, FINAL_=37, 
		FINALLY_=38, FOR_=39, IF_=40, IMPORT_=41, IS_=42, NEW_=43, NULL_=44, RETURN_=45, 
		STATIC_=46, SUPER_=47, SWITCH_=48, THIS_=49, TRUE_=50, VAR_=51, WHILE_=52, 
		CONST_=53, TYPE=54, NUMBER=55, STRING=56, IDENTIFIER=57, WHITESPACE=58, 
		COMMENT=59;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AA", "C", "CB", "CBC", "CO", "CP", "D", "EE", "EQ", "GT", "LT", "LTE", 
			"GTE", "MINUS", "MM", "NE", "NOT", "OB", "OBC", "OP", "PC", "PL", "PLPL", 
			"PP", "SL", "ST", "SC", "AS_", "BREAK_", "CASE_", "CLASS_", "CONTINUE_", 
			"DEFAULT_", "ELSE_", "EXTENDS_", "FALSE_", "FINAL_", "FINALLY_", "FOR_", 
			"IF_", "IMPORT_", "IS_", "NEW_", "NULL_", "RETURN_", "STATIC_", "SUPER_", 
			"SWITCH_", "THIS_", "TRUE_", "VAR_", "WHILE_", "CONST_", "TYPE", "NUMBER", 
			"STRING", "IDENTIFIER", "WHITESPACE", "COMMENT", "StringDQ", "StringContentDQ", 
			"StringSQ", "StringContentSQ", "StringContentTDQ", "StringContentTSQ", 
			"NEWLINE", "IDENTIFIER_START", "IDENTIFIER_PART", "LETTER", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'&&'", "','", "']'", "'}'", "':'", "')'", "'.'", "'=='", "'='", 
			"'>'", "'<'", "'<='", "'>='", "'-'", "'--'", "'!='", "'!'", "'['", "'{'", 
			"'('", "'%'", "'+'", "'++'", "'||'", "'/'", "'*'", "';'", "'as'", "'break'", 
			"'case'", "'class'", "'continue'", "'default'", "'else'", "'extends'", 
			"'false'", "'final'", "'finally'", "'for'", "'if'", "'import'", "'is'", 
			"'new'", "'null'", "'return'", "'static'", "'super'", "'switch'", "'this'", 
			"'true'", "'var'", "'while'", "'const'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AA", "C", "CB", "CBC", "CO", "CP", "D", "EE", "EQ", "GT", "LT", 
			"LTE", "GTE", "MINUS", "MM", "NE", "NOT", "OB", "OBC", "OP", "PC", "PL", 
			"PLPL", "PP", "SL", "ST", "SC", "AS_", "BREAK_", "CASE_", "CLASS_", "CONTINUE_", 
			"DEFAULT_", "ELSE_", "EXTENDS_", "FALSE_", "FINAL_", "FINALLY_", "FOR_", 
			"IF_", "IMPORT_", "IS_", "NEW_", "NULL_", "RETURN_", "STATIC_", "SUPER_", 
			"SWITCH_", "THIS_", "TRUE_", "VAR_", "WHILE_", "CONST_", "TYPE", "NUMBER", 
			"STRING", "IDENTIFIER", "WHITESPACE", "COMMENT"
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


	public DartLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DartLexer.g4"; }

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
		"\u0004\u0000;\u020b\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0002;\u0007;\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007"+
		"?\u0002@\u0007@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007"+
		"D\u0002E\u0007E\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001*\u0001*\u0001"+
		"*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00010\u00010\u00011\u0001"+
		"1\u00011\u00011\u00011\u00012\u00012\u00012\u00012\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00035\u0176\b5\u00016\u00046\u0179\b6\u000b6\f6\u017a\u00016\u0001"+
		"6\u00046\u017f\b6\u000b6\f6\u0180\u00036\u0183\b6\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00057\u018b\b7\n7\f7\u018e\t7\u00017\u00017\u0001"+
		"7\u00017\u00017\u00057\u0195\b7\n7\f7\u0198\t7\u00017\u00037\u019b\b7"+
		"\u00018\u00018\u00058\u019f\b8\n8\f8\u01a2\t8\u00019\u00019\u00049\u01a6"+
		"\b9\u000b9\f9\u01a7\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0005:\u01b0"+
		"\b:\n:\f:\u01b3\t:\u0001:\u0001:\u0001;\u0001;\u0005;\u01b9\b;\n;\f;\u01bc"+
		"\t;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0005<\u01c8\b<\n<\f<\u01cb\t<\u0001<\u0003<\u01ce\b<\u0001=\u0001="+
		"\u0005=\u01d2\b=\n=\f=\u01d5\t=\u0001=\u0001=\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0005>\u01e1\b>\n>\f>\u01e4\t>\u0001>\u0003"+
		">\u01e7\b>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0003?\u01f0"+
		"\b?\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0003@\u01f9\b@\u0001"+
		"A\u0001A\u0001A\u0003A\u01fe\bA\u0001B\u0001B\u0003B\u0202\bB\u0001C\u0001"+
		"C\u0003C\u0206\bC\u0001D\u0001D\u0001E\u0001E\u0004\u01ba\u01c9\u01d3"+
		"\u01e2\u0000F\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f"+
		"? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e3g4i5k6m7o8q9s:u;w\u0000y\u0000"+
		"{\u0000}\u0000\u007f\u0000\u0081\u0000\u0083\u0000\u0085\u0000\u0087\u0000"+
		"\u0089\u0000\u008b\u0000\u0001\u0000\u000b\u0003\u0000\n\n\r\r\'\'\u0003"+
		"\u0000\n\n\r\r\"\"\u0002\u0000\t\t  \u0002\u0000\n\n\r\r\u0005\u0000\n"+
		"\n\r\r\"\"$$\\\\\u0005\u0000\n\n\r\r$$\'\'\\\\\u0002\u0000\"\"\\\\\u0001"+
		"\u0000\"\"\u0001\u0000\'\'\u0002\u0000$$__\u0002\u0000AZaz\u0220\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000="+
		"\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000"+
		"\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000"+
		"\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K"+
		"\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000"+
		"\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000"+
		"\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y"+
		"\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000\u0000\u0000]\u0001\u0000"+
		"\u0000\u0000\u0000_\u0001\u0000\u0000\u0000\u0000a\u0001\u0000\u0000\u0000"+
		"\u0000c\u0001\u0000\u0000\u0000\u0000e\u0001\u0000\u0000\u0000\u0000g"+
		"\u0001\u0000\u0000\u0000\u0000i\u0001\u0000\u0000\u0000\u0000k\u0001\u0000"+
		"\u0000\u0000\u0000m\u0001\u0000\u0000\u0000\u0000o\u0001\u0000\u0000\u0000"+
		"\u0000q\u0001\u0000\u0000\u0000\u0000s\u0001\u0000\u0000\u0000\u0000u"+
		"\u0001\u0000\u0000\u0000\u0001\u008d\u0001\u0000\u0000\u0000\u0003\u0090"+
		"\u0001\u0000\u0000\u0000\u0005\u0092\u0001\u0000\u0000\u0000\u0007\u0094"+
		"\u0001\u0000\u0000\u0000\t\u0096\u0001\u0000\u0000\u0000\u000b\u0098\u0001"+
		"\u0000\u0000\u0000\r\u009a\u0001\u0000\u0000\u0000\u000f\u009c\u0001\u0000"+
		"\u0000\u0000\u0011\u009f\u0001\u0000\u0000\u0000\u0013\u00a1\u0001\u0000"+
		"\u0000\u0000\u0015\u00a3\u0001\u0000\u0000\u0000\u0017\u00a5\u0001\u0000"+
		"\u0000\u0000\u0019\u00a8\u0001\u0000\u0000\u0000\u001b\u00ab\u0001\u0000"+
		"\u0000\u0000\u001d\u00ad\u0001\u0000\u0000\u0000\u001f\u00b0\u0001\u0000"+
		"\u0000\u0000!\u00b3\u0001\u0000\u0000\u0000#\u00b5\u0001\u0000\u0000\u0000"+
		"%\u00b7\u0001\u0000\u0000\u0000\'\u00b9\u0001\u0000\u0000\u0000)\u00bb"+
		"\u0001\u0000\u0000\u0000+\u00bd\u0001\u0000\u0000\u0000-\u00bf\u0001\u0000"+
		"\u0000\u0000/\u00c2\u0001\u0000\u0000\u00001\u00c5\u0001\u0000\u0000\u0000"+
		"3\u00c7\u0001\u0000\u0000\u00005\u00c9\u0001\u0000\u0000\u00007\u00cb"+
		"\u0001\u0000\u0000\u00009\u00ce\u0001\u0000\u0000\u0000;\u00d4\u0001\u0000"+
		"\u0000\u0000=\u00d9\u0001\u0000\u0000\u0000?\u00df\u0001\u0000\u0000\u0000"+
		"A\u00e8\u0001\u0000\u0000\u0000C\u00f0\u0001\u0000\u0000\u0000E\u00f5"+
		"\u0001\u0000\u0000\u0000G\u00fd\u0001\u0000\u0000\u0000I\u0103\u0001\u0000"+
		"\u0000\u0000K\u0109\u0001\u0000\u0000\u0000M\u0111\u0001\u0000\u0000\u0000"+
		"O\u0115\u0001\u0000\u0000\u0000Q\u0118\u0001\u0000\u0000\u0000S\u011f"+
		"\u0001\u0000\u0000\u0000U\u0122\u0001\u0000\u0000\u0000W\u0126\u0001\u0000"+
		"\u0000\u0000Y\u012b\u0001\u0000\u0000\u0000[\u0132\u0001\u0000\u0000\u0000"+
		"]\u0139\u0001\u0000\u0000\u0000_\u013f\u0001\u0000\u0000\u0000a\u0146"+
		"\u0001\u0000\u0000\u0000c\u014b\u0001\u0000\u0000\u0000e\u0150\u0001\u0000"+
		"\u0000\u0000g\u0154\u0001\u0000\u0000\u0000i\u015a\u0001\u0000\u0000\u0000"+
		"k\u0175\u0001\u0000\u0000\u0000m\u0178\u0001\u0000\u0000\u0000o\u019a"+
		"\u0001\u0000\u0000\u0000q\u019c\u0001\u0000\u0000\u0000s\u01a5\u0001\u0000"+
		"\u0000\u0000u\u01ab\u0001\u0000\u0000\u0000w\u01b6\u0001\u0000\u0000\u0000"+
		"y\u01cd\u0001\u0000\u0000\u0000{\u01cf\u0001\u0000\u0000\u0000}\u01e6"+
		"\u0001\u0000\u0000\u0000\u007f\u01ef\u0001\u0000\u0000\u0000\u0081\u01f8"+
		"\u0001\u0000\u0000\u0000\u0083\u01fd\u0001\u0000\u0000\u0000\u0085\u0201"+
		"\u0001\u0000\u0000\u0000\u0087\u0205\u0001\u0000\u0000\u0000\u0089\u0207"+
		"\u0001\u0000\u0000\u0000\u008b\u0209\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0005&\u0000\u0000\u008e\u008f\u0005&\u0000\u0000\u008f\u0002\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0005,\u0000\u0000\u0091\u0004\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0005]\u0000\u0000\u0093\u0006\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0005}\u0000\u0000\u0095\b\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0005:\u0000\u0000\u0097\n\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0005)\u0000\u0000\u0099\f\u0001\u0000\u0000\u0000\u009a\u009b\u0005"+
		".\u0000\u0000\u009b\u000e\u0001\u0000\u0000\u0000\u009c\u009d\u0005=\u0000"+
		"\u0000\u009d\u009e\u0005=\u0000\u0000\u009e\u0010\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0005=\u0000\u0000\u00a0\u0012\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0005>\u0000\u0000\u00a2\u0014\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0005<\u0000\u0000\u00a4\u0016\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005"+
		"<\u0000\u0000\u00a6\u00a7\u0005=\u0000\u0000\u00a7\u0018\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0005>\u0000\u0000\u00a9\u00aa\u0005=\u0000\u0000\u00aa"+
		"\u001a\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005-\u0000\u0000\u00ac\u001c"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005-\u0000\u0000\u00ae\u00af\u0005"+
		"-\u0000\u0000\u00af\u001e\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005!\u0000"+
		"\u0000\u00b1\u00b2\u0005=\u0000\u0000\u00b2 \u0001\u0000\u0000\u0000\u00b3"+
		"\u00b4\u0005!\u0000\u0000\u00b4\"\u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0005[\u0000\u0000\u00b6$\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005{"+
		"\u0000\u0000\u00b8&\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005(\u0000\u0000"+
		"\u00ba(\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005%\u0000\u0000\u00bc*"+
		"\u0001\u0000\u0000\u0000\u00bd\u00be\u0005+\u0000\u0000\u00be,\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0005+\u0000\u0000\u00c0\u00c1\u0005+\u0000\u0000"+
		"\u00c1.\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005|\u0000\u0000\u00c3\u00c4"+
		"\u0005|\u0000\u0000\u00c40\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005/"+
		"\u0000\u0000\u00c62\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005*\u0000\u0000"+
		"\u00c84\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005;\u0000\u0000\u00ca6"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005a\u0000\u0000\u00cc\u00cd\u0005"+
		"s\u0000\u0000\u00cd8\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005b\u0000"+
		"\u0000\u00cf\u00d0\u0005r\u0000\u0000\u00d0\u00d1\u0005e\u0000\u0000\u00d1"+
		"\u00d2\u0005a\u0000\u0000\u00d2\u00d3\u0005k\u0000\u0000\u00d3:\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0005c\u0000\u0000\u00d5\u00d6\u0005a\u0000"+
		"\u0000\u00d6\u00d7\u0005s\u0000\u0000\u00d7\u00d8\u0005e\u0000\u0000\u00d8"+
		"<\u0001\u0000\u0000\u0000\u00d9\u00da\u0005c\u0000\u0000\u00da\u00db\u0005"+
		"l\u0000\u0000\u00db\u00dc\u0005a\u0000\u0000\u00dc\u00dd\u0005s\u0000"+
		"\u0000\u00dd\u00de\u0005s\u0000\u0000\u00de>\u0001\u0000\u0000\u0000\u00df"+
		"\u00e0\u0005c\u0000\u0000\u00e0\u00e1\u0005o\u0000\u0000\u00e1\u00e2\u0005"+
		"n\u0000\u0000\u00e2\u00e3\u0005t\u0000\u0000\u00e3\u00e4\u0005i\u0000"+
		"\u0000\u00e4\u00e5\u0005n\u0000\u0000\u00e5\u00e6\u0005u\u0000\u0000\u00e6"+
		"\u00e7\u0005e\u0000\u0000\u00e7@\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005"+
		"d\u0000\u0000\u00e9\u00ea\u0005e\u0000\u0000\u00ea\u00eb\u0005f\u0000"+
		"\u0000\u00eb\u00ec\u0005a\u0000\u0000\u00ec\u00ed\u0005u\u0000\u0000\u00ed"+
		"\u00ee\u0005l\u0000\u0000\u00ee\u00ef\u0005t\u0000\u0000\u00efB\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u0005e\u0000\u0000\u00f1\u00f2\u0005l\u0000"+
		"\u0000\u00f2\u00f3\u0005s\u0000\u0000\u00f3\u00f4\u0005e\u0000\u0000\u00f4"+
		"D\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005e\u0000\u0000\u00f6\u00f7\u0005"+
		"x\u0000\u0000\u00f7\u00f8\u0005t\u0000\u0000\u00f8\u00f9\u0005e\u0000"+
		"\u0000\u00f9\u00fa\u0005n\u0000\u0000\u00fa\u00fb\u0005d\u0000\u0000\u00fb"+
		"\u00fc\u0005s\u0000\u0000\u00fcF\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005"+
		"f\u0000\u0000\u00fe\u00ff\u0005a\u0000\u0000\u00ff\u0100\u0005l\u0000"+
		"\u0000\u0100\u0101\u0005s\u0000\u0000\u0101\u0102\u0005e\u0000\u0000\u0102"+
		"H\u0001\u0000\u0000\u0000\u0103\u0104\u0005f\u0000\u0000\u0104\u0105\u0005"+
		"i\u0000\u0000\u0105\u0106\u0005n\u0000\u0000\u0106\u0107\u0005a\u0000"+
		"\u0000\u0107\u0108\u0005l\u0000\u0000\u0108J\u0001\u0000\u0000\u0000\u0109"+
		"\u010a\u0005f\u0000\u0000\u010a\u010b\u0005i\u0000\u0000\u010b\u010c\u0005"+
		"n\u0000\u0000\u010c\u010d\u0005a\u0000\u0000\u010d\u010e\u0005l\u0000"+
		"\u0000\u010e\u010f\u0005l\u0000\u0000\u010f\u0110\u0005y\u0000\u0000\u0110"+
		"L\u0001\u0000\u0000\u0000\u0111\u0112\u0005f\u0000\u0000\u0112\u0113\u0005"+
		"o\u0000\u0000\u0113\u0114\u0005r\u0000\u0000\u0114N\u0001\u0000\u0000"+
		"\u0000\u0115\u0116\u0005i\u0000\u0000\u0116\u0117\u0005f\u0000\u0000\u0117"+
		"P\u0001\u0000\u0000\u0000\u0118\u0119\u0005i\u0000\u0000\u0119\u011a\u0005"+
		"m\u0000\u0000\u011a\u011b\u0005p\u0000\u0000\u011b\u011c\u0005o\u0000"+
		"\u0000\u011c\u011d\u0005r\u0000\u0000\u011d\u011e\u0005t\u0000\u0000\u011e"+
		"R\u0001\u0000\u0000\u0000\u011f\u0120\u0005i\u0000\u0000\u0120\u0121\u0005"+
		"s\u0000\u0000\u0121T\u0001\u0000\u0000\u0000\u0122\u0123\u0005n\u0000"+
		"\u0000\u0123\u0124\u0005e\u0000\u0000\u0124\u0125\u0005w\u0000\u0000\u0125"+
		"V\u0001\u0000\u0000\u0000\u0126\u0127\u0005n\u0000\u0000\u0127\u0128\u0005"+
		"u\u0000\u0000\u0128\u0129\u0005l\u0000\u0000\u0129\u012a\u0005l\u0000"+
		"\u0000\u012aX\u0001\u0000\u0000\u0000\u012b\u012c\u0005r\u0000\u0000\u012c"+
		"\u012d\u0005e\u0000\u0000\u012d\u012e\u0005t\u0000\u0000\u012e\u012f\u0005"+
		"u\u0000\u0000\u012f\u0130\u0005r\u0000\u0000\u0130\u0131\u0005n\u0000"+
		"\u0000\u0131Z\u0001\u0000\u0000\u0000\u0132\u0133\u0005s\u0000\u0000\u0133"+
		"\u0134\u0005t\u0000\u0000\u0134\u0135\u0005a\u0000\u0000\u0135\u0136\u0005"+
		"t\u0000\u0000\u0136\u0137\u0005i\u0000\u0000\u0137\u0138\u0005c\u0000"+
		"\u0000\u0138\\\u0001\u0000\u0000\u0000\u0139\u013a\u0005s\u0000\u0000"+
		"\u013a\u013b\u0005u\u0000\u0000\u013b\u013c\u0005p\u0000\u0000\u013c\u013d"+
		"\u0005e\u0000\u0000\u013d\u013e\u0005r\u0000\u0000\u013e^\u0001\u0000"+
		"\u0000\u0000\u013f\u0140\u0005s\u0000\u0000\u0140\u0141\u0005w\u0000\u0000"+
		"\u0141\u0142\u0005i\u0000\u0000\u0142\u0143\u0005t\u0000\u0000\u0143\u0144"+
		"\u0005c\u0000\u0000\u0144\u0145\u0005h\u0000\u0000\u0145`\u0001\u0000"+
		"\u0000\u0000\u0146\u0147\u0005t\u0000\u0000\u0147\u0148\u0005h\u0000\u0000"+
		"\u0148\u0149\u0005i\u0000\u0000\u0149\u014a\u0005s\u0000\u0000\u014ab"+
		"\u0001\u0000\u0000\u0000\u014b\u014c\u0005t\u0000\u0000\u014c\u014d\u0005"+
		"r\u0000\u0000\u014d\u014e\u0005u\u0000\u0000\u014e\u014f\u0005e\u0000"+
		"\u0000\u014fd\u0001\u0000\u0000\u0000\u0150\u0151\u0005v\u0000\u0000\u0151"+
		"\u0152\u0005a\u0000\u0000\u0152\u0153\u0005r\u0000\u0000\u0153f\u0001"+
		"\u0000\u0000\u0000\u0154\u0155\u0005w\u0000\u0000\u0155\u0156\u0005h\u0000"+
		"\u0000\u0156\u0157\u0005i\u0000\u0000\u0157\u0158\u0005l\u0000\u0000\u0158"+
		"\u0159\u0005e\u0000\u0000\u0159h\u0001\u0000\u0000\u0000\u015a\u015b\u0005"+
		"c\u0000\u0000\u015b\u015c\u0005o\u0000\u0000\u015c\u015d\u0005n\u0000"+
		"\u0000\u015d\u015e\u0005s\u0000\u0000\u015e\u015f\u0005t\u0000\u0000\u015f"+
		"j\u0001\u0000\u0000\u0000\u0160\u0161\u0005i\u0000\u0000\u0161\u0162\u0005"+
		"n\u0000\u0000\u0162\u0176\u0005t\u0000\u0000\u0163\u0164\u0005b\u0000"+
		"\u0000\u0164\u0165\u0005o\u0000\u0000\u0165\u0166\u0005o\u0000\u0000\u0166"+
		"\u0176\u0005l\u0000\u0000\u0167\u0168\u0005d\u0000\u0000\u0168\u0169\u0005"+
		"o\u0000\u0000\u0169\u016a\u0005u\u0000\u0000\u016a\u016b\u0005b\u0000"+
		"\u0000\u016b\u016c\u0005l\u0000\u0000\u016c\u0176\u0005e\u0000\u0000\u016d"+
		"\u016e\u0005c\u0000\u0000\u016e\u016f\u0005h\u0000\u0000\u016f\u0170\u0005"+
		"a\u0000\u0000\u0170\u0176\u0005r\u0000\u0000\u0171\u0172\u0005v\u0000"+
		"\u0000\u0172\u0173\u0005o\u0000\u0000\u0173\u0174\u0005i\u0000\u0000\u0174"+
		"\u0176\u0005d\u0000\u0000\u0175\u0160\u0001\u0000\u0000\u0000\u0175\u0163"+
		"\u0001\u0000\u0000\u0000\u0175\u0167\u0001\u0000\u0000\u0000\u0175\u016d"+
		"\u0001\u0000\u0000\u0000\u0175\u0171\u0001\u0000\u0000\u0000\u0176l\u0001"+
		"\u0000\u0000\u0000\u0177\u0179\u0003\u008bE\u0000\u0178\u0177\u0001\u0000"+
		"\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u0178\u0001\u0000"+
		"\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b\u0182\u0001\u0000"+
		"\u0000\u0000\u017c\u017e\u0005.\u0000\u0000\u017d\u017f\u0003\u008bE\u0000"+
		"\u017e\u017d\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000"+
		"\u0180\u017e\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000"+
		"\u0181\u0183\u0001\u0000\u0000\u0000\u0182\u017c\u0001\u0000\u0000\u0000"+
		"\u0182\u0183\u0001\u0000\u0000\u0000\u0183n\u0001\u0000\u0000\u0000\u0184"+
		"\u019b\u0003w;\u0000\u0185\u019b\u0003{=\u0000\u0186\u0187\u0005r\u0000"+
		"\u0000\u0187\u0188\u0005\'\u0000\u0000\u0188\u018c\u0001\u0000\u0000\u0000"+
		"\u0189\u018b\b\u0000\u0000\u0000\u018a\u0189\u0001\u0000\u0000\u0000\u018b"+
		"\u018e\u0001\u0000\u0000\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018c"+
		"\u018d\u0001\u0000\u0000\u0000\u018d\u018f\u0001\u0000\u0000\u0000\u018e"+
		"\u018c\u0001\u0000\u0000\u0000\u018f\u019b\u0005\'\u0000\u0000\u0190\u0191"+
		"\u0005r\u0000\u0000\u0191\u0192\u0005\"\u0000\u0000\u0192\u0196\u0001"+
		"\u0000\u0000\u0000\u0193\u0195\b\u0001\u0000\u0000\u0194\u0193\u0001\u0000"+
		"\u0000\u0000\u0195\u0198\u0001\u0000\u0000\u0000\u0196\u0194\u0001\u0000"+
		"\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0199\u0001\u0000"+
		"\u0000\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0199\u019b\u0005\"\u0000"+
		"\u0000\u019a\u0184\u0001\u0000\u0000\u0000\u019a\u0185\u0001\u0000\u0000"+
		"\u0000\u019a\u0186\u0001\u0000\u0000\u0000\u019a\u0190\u0001\u0000\u0000"+
		"\u0000\u019bp\u0001\u0000\u0000\u0000\u019c\u01a0\u0003\u0085B\u0000\u019d"+
		"\u019f\u0003\u0087C\u0000\u019e\u019d\u0001\u0000\u0000\u0000\u019f\u01a2"+
		"\u0001\u0000\u0000\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a0\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a1r\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001"+
		"\u0000\u0000\u0000\u01a3\u01a6\u0007\u0002\u0000\u0000\u01a4\u01a6\u0003"+
		"\u0083A\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a5\u01a4\u0001\u0000"+
		"\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7\u01a5\u0001\u0000"+
		"\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000"+
		"\u0000\u0000\u01a9\u01aa\u00069\u0000\u0000\u01aat\u0001\u0000\u0000\u0000"+
		"\u01ab\u01ac\u0005/\u0000\u0000\u01ac\u01ad\u0005/\u0000\u0000\u01ad\u01b1"+
		"\u0001\u0000\u0000\u0000\u01ae\u01b0\b\u0003\u0000\u0000\u01af\u01ae\u0001"+
		"\u0000\u0000\u0000\u01b0\u01b3\u0001\u0000\u0000\u0000\u01b1\u01af\u0001"+
		"\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b4\u01b5\u0006"+
		":\u0000\u0000\u01b5v\u0001\u0000\u0000\u0000\u01b6\u01ba\u0005\"\u0000"+
		"\u0000\u01b7\u01b9\u0003y<\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000\u01b9"+
		"\u01bc\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01ba"+
		"\u01b8\u0001\u0000\u0000\u0000\u01bb\u01bd\u0001\u0000\u0000\u0000\u01bc"+
		"\u01ba\u0001\u0000\u0000\u0000\u01bd\u01be\u0005\"\u0000\u0000\u01bex"+
		"\u0001\u0000\u0000\u0000\u01bf\u01ce\b\u0004\u0000\u0000\u01c0\u01c1\u0005"+
		"\\\u0000\u0000\u01c1\u01ce\b\u0003\u0000\u0000\u01c2\u01ce\u0003w;\u0000"+
		"\u01c3\u01c4\u0005$\u0000\u0000\u01c4\u01c5\u0005{\u0000\u0000\u01c5\u01c9"+
		"\u0001\u0000\u0000\u0000\u01c6\u01c8\u0003y<\u0000\u01c7\u01c6\u0001\u0000"+
		"\u0000\u0000\u01c8\u01cb\u0001\u0000\u0000\u0000\u01c9\u01ca\u0001\u0000"+
		"\u0000\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000\u01ca\u01cc\u0001\u0000"+
		"\u0000\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cc\u01ce\u0005}\u0000"+
		"\u0000\u01cd\u01bf\u0001\u0000\u0000\u0000\u01cd\u01c0\u0001\u0000\u0000"+
		"\u0000\u01cd\u01c2\u0001\u0000\u0000\u0000\u01cd\u01c3\u0001\u0000\u0000"+
		"\u0000\u01cez\u0001\u0000\u0000\u0000\u01cf\u01d3\u0005\'\u0000\u0000"+
		"\u01d0\u01d2\u0003}>\u0000\u01d1\u01d0\u0001\u0000\u0000\u0000\u01d2\u01d5"+
		"\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d3\u01d1"+
		"\u0001\u0000\u0000\u0000\u01d4\u01d6\u0001\u0000\u0000\u0000\u01d5\u01d3"+
		"\u0001\u0000\u0000\u0000\u01d6\u01d7\u0005\'\u0000\u0000\u01d7|\u0001"+
		"\u0000\u0000\u0000\u01d8\u01e7\b\u0005\u0000\u0000\u01d9\u01da\u0005\\"+
		"\u0000\u0000\u01da\u01e7\b\u0003\u0000\u0000\u01db\u01e7\u0003{=\u0000"+
		"\u01dc\u01dd\u0005$\u0000\u0000\u01dd\u01de\u0005{\u0000\u0000\u01de\u01e2"+
		"\u0001\u0000\u0000\u0000\u01df\u01e1\u0003}>\u0000\u01e0\u01df\u0001\u0000"+
		"\u0000\u0000\u01e1\u01e4\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000"+
		"\u0000\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e3\u01e5\u0001\u0000"+
		"\u0000\u0000\u01e4\u01e2\u0001\u0000\u0000\u0000\u01e5\u01e7\u0005}\u0000"+
		"\u0000\u01e6\u01d8\u0001\u0000\u0000\u0000\u01e6\u01d9\u0001\u0000\u0000"+
		"\u0000\u01e6\u01db\u0001\u0000\u0000\u0000\u01e6\u01dc\u0001\u0000\u0000"+
		"\u0000\u01e7~\u0001\u0000\u0000\u0000\u01e8\u01f0\b\u0006\u0000\u0000"+
		"\u01e9\u01ea\u0005\"\u0000\u0000\u01ea\u01f0\b\u0007\u0000\u0000\u01eb"+
		"\u01ec\u0005\"\u0000\u0000\u01ec\u01ed\u0005\"\u0000\u0000\u01ed\u01ee"+
		"\u0001\u0000\u0000\u0000\u01ee\u01f0\b\u0007\u0000\u0000\u01ef\u01e8\u0001"+
		"\u0000\u0000\u0000\u01ef\u01e9\u0001\u0000\u0000\u0000\u01ef\u01eb\u0001"+
		"\u0000\u0000\u0000\u01f0\u0080\u0001\u0000\u0000\u0000\u01f1\u01f2\u0005"+
		"\'\u0000\u0000\u01f2\u01f9\b\b\u0000\u0000\u01f3\u01f4\u0005\'\u0000\u0000"+
		"\u01f4\u01f5\u0005\'\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6"+
		"\u01f9\b\b\u0000\u0000\u01f7\u01f9\t\u0000\u0000\u0000\u01f8\u01f1\u0001"+
		"\u0000\u0000\u0000\u01f8\u01f3\u0001\u0000\u0000\u0000\u01f8\u01f7\u0001"+
		"\u0000\u0000\u0000\u01f9\u0082\u0001\u0000\u0000\u0000\u01fa\u01fe\u0007"+
		"\u0003\u0000\u0000\u01fb\u01fc\u0005\r\u0000\u0000\u01fc\u01fe\u0005\n"+
		"\u0000\u0000\u01fd\u01fa\u0001\u0000\u0000\u0000\u01fd\u01fb\u0001\u0000"+
		"\u0000\u0000\u01fe\u0084\u0001\u0000\u0000\u0000\u01ff\u0202\u0003\u0089"+
		"D\u0000\u0200\u0202\u0007\t\u0000\u0000\u0201\u01ff\u0001\u0000\u0000"+
		"\u0000\u0201\u0200\u0001\u0000\u0000\u0000\u0202\u0086\u0001\u0000\u0000"+
		"\u0000\u0203\u0206\u0003\u0085B\u0000\u0204\u0206\u0003\u008bE\u0000\u0205"+
		"\u0203\u0001\u0000\u0000\u0000\u0205\u0204\u0001\u0000\u0000\u0000\u0206"+
		"\u0088\u0001\u0000\u0000\u0000\u0207\u0208\u0007\n\u0000\u0000\u0208\u008a"+
		"\u0001\u0000\u0000\u0000\u0209\u020a\u000209\u0000\u020a\u008c\u0001\u0000"+
		"\u0000\u0000\u0017\u0000\u0175\u017a\u0180\u0182\u018c\u0196\u019a\u01a0"+
		"\u01a5\u01a7\u01b1\u01ba\u01c9\u01cd\u01d3\u01e2\u01e6\u01ef\u01f8\u01fd"+
		"\u0201\u0205\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}