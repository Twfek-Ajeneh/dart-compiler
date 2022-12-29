// Generated from java-escape by ANTLR 4.11.1
package antlr;
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
		AA=1, C=2, CB=3, CBC=4, CO=5, CP=6, D=7, EE=8, EQ=9, GT=10, LT=11, GTE=12, 
		LTE=13, MINUS=14, MM=15, NE=16, NOT=17, OB=18, OBC=19, OP=20, PC=21, PL=22, 
		PLPL=23, PP=24, SC=25, SL=26, ST=27, BREAK_=28, CASE_=29, CLASS_=30, CONTINUE_=31, 
		DEFAULT_=32, ELSE_=33, EXTENDS_=34, FALSE_=35, FINAL_=36, FINALLY_=37, 
		FOR_=38, IF_=39, IMPORT_=40, IS_=41, NULL_=42, RETURN_=43, STATIC_=44, 
		SUPER_=45, SWITCH_=46, THIS_=47, TRUE_=48, VAR_=49, VOID_=50, WHILE_=51, 
		NUMBER=52, SingleLineString=53, IDENTIFIER=54, WHITESPACE=55, SINGLE_LINE_COMMENT=56;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AA", "C", "CB", "CBC", "CO", "CP", "D", "EE", "EQ", "GT", "LT", "GTE", 
			"LTE", "MINUS", "MM", "NE", "NOT", "OB", "OBC", "OP", "PC", "PL", "PLPL", 
			"PP", "SC", "SL", "ST", "BREAK_", "CASE_", "CLASS_", "CONTINUE_", "DEFAULT_", 
			"ELSE_", "EXTENDS_", "FALSE_", "FINAL_", "FINALLY_", "FOR_", "IF_", "IMPORT_", 
			"IS_", "NULL_", "RETURN_", "STATIC_", "SUPER_", "SWITCH_", "THIS_", "TRUE_", 
			"VAR_", "VOID_", "WHILE_", "NUMBER", "SingleLineString", "IDENTIFIER", 
			"WHITESPACE", "SINGLE_LINE_COMMENT", "StringDQ", "StringContentDQ", "StringSQ", 
			"StringContentSQ", "StringContentTDQ", "StringContentTSQ", "NEWLINE", 
			"IDENTIFIER_NO_DOLLAR", "IDENTIFIER_START_NO_DOLLAR", "IDENTIFIER_PART_NO_DOLLAR", 
			"IDENTIFIER_START", "IDENTIFIER_PART", "LETTER", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'&&'", "','", "']'", "'}'", "':'", "')'", "'.'", "'=='", "'='", 
			"'>'", "'<'", "'>='", "'<='", "'-'", "'--'", "'!='", "'!'", "'['", "'{'", 
			"'('", "'%'", "'+'", "'++'", "'||'", "';'", "'/'", "'*'", "'break'", 
			"'case'", "'class'", "'continue'", "'default'", "'else'", "'extends'", 
			"'false'", "'final'", "'finally'", "'for'", "'if'", "'import'", "'is'", 
			"'null'", "'return'", "'static'", "'super'", "'switch'", "'this'", "'true'", 
			"'var'", "'void'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AA", "C", "CB", "CBC", "CO", "CP", "D", "EE", "EQ", "GT", "LT", 
			"GTE", "LTE", "MINUS", "MM", "NE", "NOT", "OB", "OBC", "OP", "PC", "PL", 
			"PLPL", "PP", "SC", "SL", "ST", "BREAK_", "CASE_", "CLASS_", "CONTINUE_", 
			"DEFAULT_", "ELSE_", "EXTENDS_", "FALSE_", "FINAL_", "FINALLY_", "FOR_", 
			"IF_", "IMPORT_", "IS_", "NULL_", "RETURN_", "STATIC_", "SUPER_", "SWITCH_", 
			"THIS_", "TRUE_", "VAR_", "VOID_", "WHILE_", "NUMBER", "SingleLineString", 
			"IDENTIFIER", "WHITESPACE", "SINGLE_LINE_COMMENT"
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

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 57:
			return StringContentDQ_sempred((RuleContext)_localctx, predIndex);
		case 59:
			return StringContentSQ_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean StringContentDQ_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return  CheckNotOpenBrace() ;
		}
		return true;
	}
	private boolean StringContentSQ_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return  CheckNotOpenBrace() ;
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00008\u01ff\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
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
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 "+
		"\u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u00010\u00010\u00010\u00010\u00011\u00011\u00011\u00011\u0001"+
		"1\u00012\u00012\u00012\u00012\u00012\u00012\u00013\u00043\u015a\b3\u000b"+
		"3\f3\u015b\u00013\u00013\u00043\u0160\b3\u000b3\f3\u0161\u00033\u0164"+
		"\b3\u00014\u00014\u00014\u00014\u00014\u00014\u00054\u016c\b4\n4\f4\u016f"+
		"\t4\u00014\u00014\u00014\u00014\u00014\u00054\u0176\b4\n4\f4\u0179\t4"+
		"\u00014\u00034\u017c\b4\u00015\u00015\u00055\u0180\b5\n5\f5\u0183\t5\u0001"+
		"6\u00016\u00046\u0187\b6\u000b6\f6\u0188\u00016\u00016\u00017\u00017\u0001"+
		"7\u00017\u00057\u0191\b7\n7\f7\u0194\t7\u00017\u00017\u00018\u00018\u0005"+
		"8\u019a\b8\n8\f8\u019d\t8\u00018\u00018\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00059\u01a9\b9\n9\f9\u01ac\t9\u00019\u00019\u0001"+
		"9\u00039\u01b1\b9\u0001:\u0001:\u0005:\u01b5\b:\n:\f:\u01b8\t:\u0001:"+
		"\u0001:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0005"+
		";\u01c4\b;\n;\f;\u01c7\t;\u0001;\u0001;\u0001;\u0003;\u01cc\b;\u0001<"+
		"\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0003<\u01d5\b<\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0001=\u0003=\u01de\b=\u0001>\u0001>\u0001"+
		">\u0003>\u01e3\b>\u0001?\u0001?\u0005?\u01e7\b?\n?\f?\u01ea\t?\u0001@"+
		"\u0001@\u0003@\u01ee\b@\u0001A\u0001A\u0003A\u01f2\bA\u0001B\u0001B\u0003"+
		"B\u01f6\bB\u0001C\u0001C\u0003C\u01fa\bC\u0001D\u0001D\u0001E\u0001E\u0004"+
		"\u019b\u01aa\u01b6\u01c5\u0000F\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d"+
		";\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e3g4i5k6m7o8q\u0000"+
		"s\u0000u\u0000w\u0000y\u0000{\u0000}\u0000\u007f\u0000\u0081\u0000\u0083"+
		"\u0000\u0085\u0000\u0087\u0000\u0089\u0000\u008b\u0000\u0001\u0000\n\u0003"+
		"\u0000\n\n\r\r\'\'\u0003\u0000\n\n\r\r\"\"\u0002\u0000\t\t  \u0002\u0000"+
		"\n\n\r\r\u0005\u0000\n\n\r\r\"\"$$\\\\\u0005\u0000\n\n\r\r$$\'\'\\\\\u0002"+
		"\u0000\"\"\\\\\u0001\u0000\"\"\u0001\u0000\'\'\u0002\u0000AZaz\u0212\u0000"+
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
		"\u0001\u008d\u0001\u0000\u0000\u0000\u0003\u0090\u0001\u0000\u0000\u0000"+
		"\u0005\u0092\u0001\u0000\u0000\u0000\u0007\u0094\u0001\u0000\u0000\u0000"+
		"\t\u0096\u0001\u0000\u0000\u0000\u000b\u0098\u0001\u0000\u0000\u0000\r"+
		"\u009a\u0001\u0000\u0000\u0000\u000f\u009c\u0001\u0000\u0000\u0000\u0011"+
		"\u009f\u0001\u0000\u0000\u0000\u0013\u00a1\u0001\u0000\u0000\u0000\u0015"+
		"\u00a3\u0001\u0000\u0000\u0000\u0017\u00a5\u0001\u0000\u0000\u0000\u0019"+
		"\u00a8\u0001\u0000\u0000\u0000\u001b\u00ab\u0001\u0000\u0000\u0000\u001d"+
		"\u00ad\u0001\u0000\u0000\u0000\u001f\u00b0\u0001\u0000\u0000\u0000!\u00b3"+
		"\u0001\u0000\u0000\u0000#\u00b5\u0001\u0000\u0000\u0000%\u00b7\u0001\u0000"+
		"\u0000\u0000\'\u00b9\u0001\u0000\u0000\u0000)\u00bb\u0001\u0000\u0000"+
		"\u0000+\u00bd\u0001\u0000\u0000\u0000-\u00bf\u0001\u0000\u0000\u0000/"+
		"\u00c2\u0001\u0000\u0000\u00001\u00c5\u0001\u0000\u0000\u00003\u00c7\u0001"+
		"\u0000\u0000\u00005\u00c9\u0001\u0000\u0000\u00007\u00cb\u0001\u0000\u0000"+
		"\u00009\u00d1\u0001\u0000\u0000\u0000;\u00d6\u0001\u0000\u0000\u0000="+
		"\u00dc\u0001\u0000\u0000\u0000?\u00e5\u0001\u0000\u0000\u0000A\u00ed\u0001"+
		"\u0000\u0000\u0000C\u00f2\u0001\u0000\u0000\u0000E\u00fa\u0001\u0000\u0000"+
		"\u0000G\u0100\u0001\u0000\u0000\u0000I\u0106\u0001\u0000\u0000\u0000K"+
		"\u010e\u0001\u0000\u0000\u0000M\u0112\u0001\u0000\u0000\u0000O\u0115\u0001"+
		"\u0000\u0000\u0000Q\u011c\u0001\u0000\u0000\u0000S\u011f\u0001\u0000\u0000"+
		"\u0000U\u0124\u0001\u0000\u0000\u0000W\u012b\u0001\u0000\u0000\u0000Y"+
		"\u0132\u0001\u0000\u0000\u0000[\u0138\u0001\u0000\u0000\u0000]\u013f\u0001"+
		"\u0000\u0000\u0000_\u0144\u0001\u0000\u0000\u0000a\u0149\u0001\u0000\u0000"+
		"\u0000c\u014d\u0001\u0000\u0000\u0000e\u0152\u0001\u0000\u0000\u0000g"+
		"\u0159\u0001\u0000\u0000\u0000i\u017b\u0001\u0000\u0000\u0000k\u017d\u0001"+
		"\u0000\u0000\u0000m\u0186\u0001\u0000\u0000\u0000o\u018c\u0001\u0000\u0000"+
		"\u0000q\u0197\u0001\u0000\u0000\u0000s\u01b0\u0001\u0000\u0000\u0000u"+
		"\u01b2\u0001\u0000\u0000\u0000w\u01cb\u0001\u0000\u0000\u0000y\u01d4\u0001"+
		"\u0000\u0000\u0000{\u01dd\u0001\u0000\u0000\u0000}\u01e2\u0001\u0000\u0000"+
		"\u0000\u007f\u01e4\u0001\u0000\u0000\u0000\u0081\u01ed\u0001\u0000\u0000"+
		"\u0000\u0083\u01f1\u0001\u0000\u0000\u0000\u0085\u01f5\u0001\u0000\u0000"+
		"\u0000\u0087\u01f9\u0001\u0000\u0000\u0000\u0089\u01fb\u0001\u0000\u0000"+
		"\u0000\u008b\u01fd\u0001\u0000\u0000\u0000\u008d\u008e\u0005&\u0000\u0000"+
		"\u008e\u008f\u0005&\u0000\u0000\u008f\u0002\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0005,\u0000\u0000\u0091\u0004\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0005]\u0000\u0000\u0093\u0006\u0001\u0000\u0000\u0000\u0094\u0095\u0005"+
		"}\u0000\u0000\u0095\b\u0001\u0000\u0000\u0000\u0096\u0097\u0005:\u0000"+
		"\u0000\u0097\n\u0001\u0000\u0000\u0000\u0098\u0099\u0005)\u0000\u0000"+
		"\u0099\f\u0001\u0000\u0000\u0000\u009a\u009b\u0005.\u0000\u0000\u009b"+
		"\u000e\u0001\u0000\u0000\u0000\u009c\u009d\u0005=\u0000\u0000\u009d\u009e"+
		"\u0005=\u0000\u0000\u009e\u0010\u0001\u0000\u0000\u0000\u009f\u00a0\u0005"+
		"=\u0000\u0000\u00a0\u0012\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005>\u0000"+
		"\u0000\u00a2\u0014\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005<\u0000\u0000"+
		"\u00a4\u0016\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005>\u0000\u0000\u00a6"+
		"\u00a7\u0005=\u0000\u0000\u00a7\u0018\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0005<\u0000\u0000\u00a9\u00aa\u0005=\u0000\u0000\u00aa\u001a\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0005-\u0000\u0000\u00ac\u001c\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0005-\u0000\u0000\u00ae\u00af\u0005-\u0000\u0000\u00af"+
		"\u001e\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005!\u0000\u0000\u00b1\u00b2"+
		"\u0005=\u0000\u0000\u00b2 \u0001\u0000\u0000\u0000\u00b3\u00b4\u0005!"+
		"\u0000\u0000\u00b4\"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005[\u0000"+
		"\u0000\u00b6$\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005{\u0000\u0000\u00b8"+
		"&\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005(\u0000\u0000\u00ba(\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0005%\u0000\u0000\u00bc*\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u0005+\u0000\u0000\u00be,\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c0\u0005+\u0000\u0000\u00c0\u00c1\u0005+\u0000\u0000\u00c1.\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c3\u0005|\u0000\u0000\u00c3\u00c4\u0005|\u0000"+
		"\u0000\u00c40\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005;\u0000\u0000\u00c6"+
		"2\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005/\u0000\u0000\u00c84\u0001"+
		"\u0000\u0000\u0000\u00c9\u00ca\u0005*\u0000\u0000\u00ca6\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cc\u0005b\u0000\u0000\u00cc\u00cd\u0005r\u0000\u0000\u00cd"+
		"\u00ce\u0005e\u0000\u0000\u00ce\u00cf\u0005a\u0000\u0000\u00cf\u00d0\u0005"+
		"k\u0000\u0000\u00d08\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005c\u0000"+
		"\u0000\u00d2\u00d3\u0005a\u0000\u0000\u00d3\u00d4\u0005s\u0000\u0000\u00d4"+
		"\u00d5\u0005e\u0000\u0000\u00d5:\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005"+
		"c\u0000\u0000\u00d7\u00d8\u0005l\u0000\u0000\u00d8\u00d9\u0005a\u0000"+
		"\u0000\u00d9\u00da\u0005s\u0000\u0000\u00da\u00db\u0005s\u0000\u0000\u00db"+
		"<\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005c\u0000\u0000\u00dd\u00de\u0005"+
		"o\u0000\u0000\u00de\u00df\u0005n\u0000\u0000\u00df\u00e0\u0005t\u0000"+
		"\u0000\u00e0\u00e1\u0005i\u0000\u0000\u00e1\u00e2\u0005n\u0000\u0000\u00e2"+
		"\u00e3\u0005u\u0000\u0000\u00e3\u00e4\u0005e\u0000\u0000\u00e4>\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0005d\u0000\u0000\u00e6\u00e7\u0005e\u0000"+
		"\u0000\u00e7\u00e8\u0005f\u0000\u0000\u00e8\u00e9\u0005a\u0000\u0000\u00e9"+
		"\u00ea\u0005u\u0000\u0000\u00ea\u00eb\u0005l\u0000\u0000\u00eb\u00ec\u0005"+
		"t\u0000\u0000\u00ec@\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005e\u0000"+
		"\u0000\u00ee\u00ef\u0005l\u0000\u0000\u00ef\u00f0\u0005s\u0000\u0000\u00f0"+
		"\u00f1\u0005e\u0000\u0000\u00f1B\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005"+
		"e\u0000\u0000\u00f3\u00f4\u0005x\u0000\u0000\u00f4\u00f5\u0005t\u0000"+
		"\u0000\u00f5\u00f6\u0005e\u0000\u0000\u00f6\u00f7\u0005n\u0000\u0000\u00f7"+
		"\u00f8\u0005d\u0000\u0000\u00f8\u00f9\u0005s\u0000\u0000\u00f9D\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fb\u0005f\u0000\u0000\u00fb\u00fc\u0005a\u0000"+
		"\u0000\u00fc\u00fd\u0005l\u0000\u0000\u00fd\u00fe\u0005s\u0000\u0000\u00fe"+
		"\u00ff\u0005e\u0000\u0000\u00ffF\u0001\u0000\u0000\u0000\u0100\u0101\u0005"+
		"f\u0000\u0000\u0101\u0102\u0005i\u0000\u0000\u0102\u0103\u0005n\u0000"+
		"\u0000\u0103\u0104\u0005a\u0000\u0000\u0104\u0105\u0005l\u0000\u0000\u0105"+
		"H\u0001\u0000\u0000\u0000\u0106\u0107\u0005f\u0000\u0000\u0107\u0108\u0005"+
		"i\u0000\u0000\u0108\u0109\u0005n\u0000\u0000\u0109\u010a\u0005a\u0000"+
		"\u0000\u010a\u010b\u0005l\u0000\u0000\u010b\u010c\u0005l\u0000\u0000\u010c"+
		"\u010d\u0005y\u0000\u0000\u010dJ\u0001\u0000\u0000\u0000\u010e\u010f\u0005"+
		"f\u0000\u0000\u010f\u0110\u0005o\u0000\u0000\u0110\u0111\u0005r\u0000"+
		"\u0000\u0111L\u0001\u0000\u0000\u0000\u0112\u0113\u0005i\u0000\u0000\u0113"+
		"\u0114\u0005f\u0000\u0000\u0114N\u0001\u0000\u0000\u0000\u0115\u0116\u0005"+
		"i\u0000\u0000\u0116\u0117\u0005m\u0000\u0000\u0117\u0118\u0005p\u0000"+
		"\u0000\u0118\u0119\u0005o\u0000\u0000\u0119\u011a\u0005r\u0000\u0000\u011a"+
		"\u011b\u0005t\u0000\u0000\u011bP\u0001\u0000\u0000\u0000\u011c\u011d\u0005"+
		"i\u0000\u0000\u011d\u011e\u0005s\u0000\u0000\u011eR\u0001\u0000\u0000"+
		"\u0000\u011f\u0120\u0005n\u0000\u0000\u0120\u0121\u0005u\u0000\u0000\u0121"+
		"\u0122\u0005l\u0000\u0000\u0122\u0123\u0005l\u0000\u0000\u0123T\u0001"+
		"\u0000\u0000\u0000\u0124\u0125\u0005r\u0000\u0000\u0125\u0126\u0005e\u0000"+
		"\u0000\u0126\u0127\u0005t\u0000\u0000\u0127\u0128\u0005u\u0000\u0000\u0128"+
		"\u0129\u0005r\u0000\u0000\u0129\u012a\u0005n\u0000\u0000\u012aV\u0001"+
		"\u0000\u0000\u0000\u012b\u012c\u0005s\u0000\u0000\u012c\u012d\u0005t\u0000"+
		"\u0000\u012d\u012e\u0005a\u0000\u0000\u012e\u012f\u0005t\u0000\u0000\u012f"+
		"\u0130\u0005i\u0000\u0000\u0130\u0131\u0005c\u0000\u0000\u0131X\u0001"+
		"\u0000\u0000\u0000\u0132\u0133\u0005s\u0000\u0000\u0133\u0134\u0005u\u0000"+
		"\u0000\u0134\u0135\u0005p\u0000\u0000\u0135\u0136\u0005e\u0000\u0000\u0136"+
		"\u0137\u0005r\u0000\u0000\u0137Z\u0001\u0000\u0000\u0000\u0138\u0139\u0005"+
		"s\u0000\u0000\u0139\u013a\u0005w\u0000\u0000\u013a\u013b\u0005i\u0000"+
		"\u0000\u013b\u013c\u0005t\u0000\u0000\u013c\u013d\u0005c\u0000\u0000\u013d"+
		"\u013e\u0005h\u0000\u0000\u013e\\\u0001\u0000\u0000\u0000\u013f\u0140"+
		"\u0005t\u0000\u0000\u0140\u0141\u0005h\u0000\u0000\u0141\u0142\u0005i"+
		"\u0000\u0000\u0142\u0143\u0005s\u0000\u0000\u0143^\u0001\u0000\u0000\u0000"+
		"\u0144\u0145\u0005t\u0000\u0000\u0145\u0146\u0005r\u0000\u0000\u0146\u0147"+
		"\u0005u\u0000\u0000\u0147\u0148\u0005e\u0000\u0000\u0148`\u0001\u0000"+
		"\u0000\u0000\u0149\u014a\u0005v\u0000\u0000\u014a\u014b\u0005a\u0000\u0000"+
		"\u014b\u014c\u0005r\u0000\u0000\u014cb\u0001\u0000\u0000\u0000\u014d\u014e"+
		"\u0005v\u0000\u0000\u014e\u014f\u0005o\u0000\u0000\u014f\u0150\u0005i"+
		"\u0000\u0000\u0150\u0151\u0005d\u0000\u0000\u0151d\u0001\u0000\u0000\u0000"+
		"\u0152\u0153\u0005w\u0000\u0000\u0153\u0154\u0005h\u0000\u0000\u0154\u0155"+
		"\u0005i\u0000\u0000\u0155\u0156\u0005l\u0000\u0000\u0156\u0157\u0005e"+
		"\u0000\u0000\u0157f\u0001\u0000\u0000\u0000\u0158\u015a\u0003\u008bE\u0000"+
		"\u0159\u0158\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000"+
		"\u015b\u0159\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000"+
		"\u015c\u0163\u0001\u0000\u0000\u0000\u015d\u015f\u0005.\u0000\u0000\u015e"+
		"\u0160\u0003\u008bE\u0000\u015f\u015e\u0001\u0000\u0000\u0000\u0160\u0161"+
		"\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0161\u0162"+
		"\u0001\u0000\u0000\u0000\u0162\u0164\u0001\u0000\u0000\u0000\u0163\u015d"+
		"\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164h\u0001"+
		"\u0000\u0000\u0000\u0165\u017c\u0003q8\u0000\u0166\u017c\u0003u:\u0000"+
		"\u0167\u0168\u0005r\u0000\u0000\u0168\u0169\u0005\'\u0000\u0000\u0169"+
		"\u016d\u0001\u0000\u0000\u0000\u016a\u016c\b\u0000\u0000\u0000\u016b\u016a"+
		"\u0001\u0000\u0000\u0000\u016c\u016f\u0001\u0000\u0000\u0000\u016d\u016b"+
		"\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u0170"+
		"\u0001\u0000\u0000\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u0170\u017c"+
		"\u0005\'\u0000\u0000\u0171\u0172\u0005r\u0000\u0000\u0172\u0173\u0005"+
		"\"\u0000\u0000\u0173\u0177\u0001\u0000\u0000\u0000\u0174\u0176\b\u0001"+
		"\u0000\u0000\u0175\u0174\u0001\u0000\u0000\u0000\u0176\u0179\u0001\u0000"+
		"\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000"+
		"\u0000\u0000\u0178\u017a\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000"+
		"\u0000\u0000\u017a\u017c\u0005\"\u0000\u0000\u017b\u0165\u0001\u0000\u0000"+
		"\u0000\u017b\u0166\u0001\u0000\u0000\u0000\u017b\u0167\u0001\u0000\u0000"+
		"\u0000\u017b\u0171\u0001\u0000\u0000\u0000\u017cj\u0001\u0000\u0000\u0000"+
		"\u017d\u0181\u0003\u0085B\u0000\u017e\u0180\u0003\u0087C\u0000\u017f\u017e"+
		"\u0001\u0000\u0000\u0000\u0180\u0183\u0001\u0000\u0000\u0000\u0181\u017f"+
		"\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182l\u0001"+
		"\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0184\u0187\u0007"+
		"\u0002\u0000\u0000\u0185\u0187\u0003}>\u0000\u0186\u0184\u0001\u0000\u0000"+
		"\u0000\u0186\u0185\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000"+
		"\u0000\u0188\u0186\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000"+
		"\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018b\u00066\u0000\u0000"+
		"\u018bn\u0001\u0000\u0000\u0000\u018c\u018d\u0005/\u0000\u0000\u018d\u018e"+
		"\u0005/\u0000\u0000\u018e\u0192\u0001\u0000\u0000\u0000\u018f\u0191\b"+
		"\u0003\u0000\u0000\u0190\u018f\u0001\u0000\u0000\u0000\u0191\u0194\u0001"+
		"\u0000\u0000\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0192\u0193\u0001"+
		"\u0000\u0000\u0000\u0193\u0195\u0001\u0000\u0000\u0000\u0194\u0192\u0001"+
		"\u0000\u0000\u0000\u0195\u0196\u00067\u0000\u0000\u0196p\u0001\u0000\u0000"+
		"\u0000\u0197\u019b\u0005\"\u0000\u0000\u0198\u019a\u0003s9\u0000\u0199"+
		"\u0198\u0001\u0000\u0000\u0000\u019a\u019d\u0001\u0000\u0000\u0000\u019b"+
		"\u019c\u0001\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019c"+
		"\u019e\u0001\u0000\u0000\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019e"+
		"\u019f\u0005\"\u0000\u0000\u019fr\u0001\u0000\u0000\u0000\u01a0\u01b1"+
		"\b\u0004\u0000\u0000\u01a1\u01a2\u0005\\\u0000\u0000\u01a2\u01b1\b\u0003"+
		"\u0000\u0000\u01a3\u01b1\u0003q8\u0000\u01a4\u01a5\u0005$\u0000\u0000"+
		"\u01a5\u01a6\u0005{\u0000\u0000\u01a6\u01aa\u0001\u0000\u0000\u0000\u01a7"+
		"\u01a9\u0003s9\u0000\u01a8\u01a7\u0001\u0000\u0000\u0000\u01a9\u01ac\u0001"+
		"\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01aa\u01a8\u0001"+
		"\u0000\u0000\u0000\u01ab\u01ad\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001"+
		"\u0000\u0000\u0000\u01ad\u01b1\u0005}\u0000\u0000\u01ae\u01af\u0005$\u0000"+
		"\u0000\u01af\u01b1\u00049\u0000\u0000\u01b0\u01a0\u0001\u0000\u0000\u0000"+
		"\u01b0\u01a1\u0001\u0000\u0000\u0000\u01b0\u01a3\u0001\u0000\u0000\u0000"+
		"\u01b0\u01a4\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000"+
		"\u01b1t\u0001\u0000\u0000\u0000\u01b2\u01b6\u0005\'\u0000\u0000\u01b3"+
		"\u01b5\u0003w;\u0000\u01b4\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b8\u0001"+
		"\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b7\u01b9\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001"+
		"\u0000\u0000\u0000\u01b9\u01ba\u0005\'\u0000\u0000\u01bav\u0001\u0000"+
		"\u0000\u0000\u01bb\u01cc\b\u0005\u0000\u0000\u01bc\u01bd\u0005\\\u0000"+
		"\u0000\u01bd\u01cc\b\u0003\u0000\u0000\u01be\u01cc\u0003u:\u0000\u01bf"+
		"\u01c0\u0005$\u0000\u0000\u01c0\u01c1\u0005{\u0000\u0000\u01c1\u01c5\u0001"+
		"\u0000\u0000\u0000\u01c2\u01c4\u0003w;\u0000\u01c3\u01c2\u0001\u0000\u0000"+
		"\u0000\u01c4\u01c7\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000"+
		"\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c6\u01c8\u0001\u0000\u0000"+
		"\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c8\u01cc\u0005}\u0000\u0000"+
		"\u01c9\u01ca\u0005$\u0000\u0000\u01ca\u01cc\u0004;\u0001\u0000\u01cb\u01bb"+
		"\u0001\u0000\u0000\u0000\u01cb\u01bc\u0001\u0000\u0000\u0000\u01cb\u01be"+
		"\u0001\u0000\u0000\u0000\u01cb\u01bf\u0001\u0000\u0000\u0000\u01cb\u01c9"+
		"\u0001\u0000\u0000\u0000\u01ccx\u0001\u0000\u0000\u0000\u01cd\u01d5\b"+
		"\u0006\u0000\u0000\u01ce\u01cf\u0005\"\u0000\u0000\u01cf\u01d5\b\u0007"+
		"\u0000\u0000\u01d0\u01d1\u0005\"\u0000\u0000\u01d1\u01d2\u0005\"\u0000"+
		"\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d5\b\u0007\u0000\u0000"+
		"\u01d4\u01cd\u0001\u0000\u0000\u0000\u01d4\u01ce\u0001\u0000\u0000\u0000"+
		"\u01d4\u01d0\u0001\u0000\u0000\u0000\u01d5z\u0001\u0000\u0000\u0000\u01d6"+
		"\u01d7\u0005\'\u0000\u0000\u01d7\u01de\b\b\u0000\u0000\u01d8\u01d9\u0005"+
		"\'\u0000\u0000\u01d9\u01da\u0005\'\u0000\u0000\u01da\u01db\u0001\u0000"+
		"\u0000\u0000\u01db\u01de\b\b\u0000\u0000\u01dc\u01de\t\u0000\u0000\u0000"+
		"\u01dd\u01d6\u0001\u0000\u0000\u0000\u01dd\u01d8\u0001\u0000\u0000\u0000"+
		"\u01dd\u01dc\u0001\u0000\u0000\u0000\u01de|\u0001\u0000\u0000\u0000\u01df"+
		"\u01e3\u0007\u0003\u0000\u0000\u01e0\u01e1\u0005\r\u0000\u0000\u01e1\u01e3"+
		"\u0005\n\u0000\u0000\u01e2\u01df\u0001\u0000\u0000\u0000\u01e2\u01e0\u0001"+
		"\u0000\u0000\u0000\u01e3~\u0001\u0000\u0000\u0000\u01e4\u01e8\u0003\u0081"+
		"@\u0000\u01e5\u01e7\u0003\u0083A\u0000\u01e6\u01e5\u0001\u0000\u0000\u0000"+
		"\u01e7\u01ea\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001\u0000\u0000\u0000"+
		"\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9\u0080\u0001\u0000\u0000\u0000"+
		"\u01ea\u01e8\u0001\u0000\u0000\u0000\u01eb\u01ee\u0003\u0089D\u0000\u01ec"+
		"\u01ee\u0005_\u0000\u0000\u01ed\u01eb\u0001\u0000\u0000\u0000\u01ed\u01ec"+
		"\u0001\u0000\u0000\u0000\u01ee\u0082\u0001\u0000\u0000\u0000\u01ef\u01f2"+
		"\u0003\u0081@\u0000\u01f0\u01f2\u0003\u008bE\u0000\u01f1\u01ef\u0001\u0000"+
		"\u0000\u0000\u01f1\u01f0\u0001\u0000\u0000\u0000\u01f2\u0084\u0001\u0000"+
		"\u0000\u0000\u01f3\u01f6\u0003\u0081@\u0000\u01f4\u01f6\u0005$\u0000\u0000"+
		"\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f5\u01f4\u0001\u0000\u0000\u0000"+
		"\u01f6\u0086\u0001\u0000\u0000\u0000\u01f7\u01fa\u0003\u0085B\u0000\u01f8"+
		"\u01fa\u0003\u008bE\u0000\u01f9\u01f7\u0001\u0000\u0000\u0000\u01f9\u01f8"+
		"\u0001\u0000\u0000\u0000\u01fa\u0088\u0001\u0000\u0000\u0000\u01fb\u01fc"+
		"\u0007\t\u0000\u0000\u01fc\u008a\u0001\u0000\u0000\u0000\u01fd\u01fe\u0002"+
		"09\u0000\u01fe\u008c\u0001\u0000\u0000\u0000\u0019\u0000\u015b\u0161\u0163"+
		"\u016d\u0177\u017b\u0181\u0186\u0188\u0192\u019b\u01aa\u01b0\u01b6\u01c5"+
		"\u01cb\u01d4\u01dd\u01e2\u01e8\u01ed\u01f1\u01f5\u01f9\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}