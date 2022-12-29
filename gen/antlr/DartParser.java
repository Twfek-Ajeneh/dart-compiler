// Generated from java-escape by ANTLR 4.11.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DartParser extends Parser {
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
		TYPEOFVARIABLES=53, TYPEOFFUNCTION=54, NUMBER=55, STRING=56, IDENTIFIER=57, 
		WHITESPACE=58, COMMENT=59;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_variablesDeclaration = 2, 
		RULE_parameterDeclaration = 3, RULE_argumentDeclaration = 4, RULE_classDeclaration = 5, 
		RULE_classConstructor = 6, RULE_functionDeclaration = 7, RULE_functionCall = 8, 
		RULE_literal = 9, RULE_objectLiteral = 10, RULE_objectContent = 11, RULE_listLiteral = 12, 
		RULE_operation = 13, RULE_blockBody = 14, RULE_classBody = 15, RULE_statement = 16, 
		RULE_importStatement = 17, RULE_expression = 18, RULE_assignableExpression = 19, 
		RULE_variablesExpression = 20, RULE_conditionExpression = 21, RULE_forExpression = 22, 
		RULE_whileExpression = 23, RULE_ifExpression = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "variablesDeclaration", "parameterDeclaration", 
			"argumentDeclaration", "classDeclaration", "classConstructor", "functionDeclaration", 
			"functionCall", "literal", "objectLiteral", "objectContent", "listLiteral", 
			"operation", "blockBody", "classBody", "statement", "importStatement", 
			"expression", "assignableExpression", "variablesExpression", "conditionExpression", 
			"forExpression", "whileExpression", "ifExpression"
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
			"'true'", "'var'", "'while'"
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
			"SWITCH_", "THIS_", "TRUE_", "VAR_", "WHILE_", "TYPEOFVARIABLES", "TYPEOFFUNCTION", 
			"NUMBER", "STRING", "IDENTIFIER", "WHITESPACE", "COMMENT"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DartParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DartParser.EOF, 0); }
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 18016599680221184L) != 0) {
				{
				setState(53);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TYPEOFFUNCTION:
					{
					setState(50);
					functionDeclaration();
					}
					break;
				case CLASS_:
					{
					setState(51);
					classDeclaration();
					}
					break;
				case IMPORT_:
					{
					setState(52);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public VariablesDeclarationContext variablesDeclaration() {
			return getRuleContext(VariablesDeclarationContext.class,0);
		}
		public ParameterDeclarationContext parameterDeclaration() {
			return getRuleContext(ParameterDeclarationContext.class,0);
		}
		public ArgumentDeclarationContext argumentDeclaration() {
			return getRuleContext(ArgumentDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				variablesDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				parameterDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				argumentDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				classDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				functionDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariablesDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public TerminalNode SC() { return getToken(DartParser.SC, 0); }
		public TerminalNode VAR_() { return getToken(DartParser.VAR_, 0); }
		public TerminalNode FINAL_() { return getToken(DartParser.FINAL_, 0); }
		public TerminalNode TYPEOFVARIABLES() { return getToken(DartParser.TYPEOFVARIABLES, 0); }
		public TerminalNode EQ() { return getToken(DartParser.EQ, 0); }
		public AssignableExpressionContext assignableExpression() {
			return getRuleContext(AssignableExpressionContext.class,0);
		}
		public VariablesDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablesDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterVariablesDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitVariablesDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitVariablesDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesDeclarationContext variablesDeclaration() throws RecognitionException {
		VariablesDeclarationContext _localctx = new VariablesDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variablesDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_la = _input.LA(1);
			if ( !(_la==FINAL_ || _la==VAR_) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPEOFVARIABLES) {
				{
				setState(68);
				match(TYPEOFVARIABLES);
				}
			}

			setState(71);
			match(IDENTIFIER);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(72);
				match(EQ);
				setState(73);
				assignableExpression();
				}
			}

			setState(76);
			match(SC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(DartParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DartParser.IDENTIFIER, i);
		}
		public List<TerminalNode> C() { return getTokens(DartParser.C); }
		public TerminalNode C(int i) {
			return getToken(DartParser.C, i);
		}
		public List<TerminalNode> VAR_() { return getTokens(DartParser.VAR_); }
		public TerminalNode VAR_(int i) {
			return getToken(DartParser.VAR_, i);
		}
		public List<TerminalNode> FINAL_() { return getTokens(DartParser.FINAL_); }
		public TerminalNode FINAL_(int i) {
			return getToken(DartParser.FINAL_, i);
		}
		public List<TerminalNode> TYPEOFVARIABLES() { return getTokens(DartParser.TYPEOFVARIABLES); }
		public TerminalNode TYPEOFVARIABLES(int i) {
			return getToken(DartParser.TYPEOFVARIABLES, i);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitParameterDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameterDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL_ || _la==VAR_) {
				{
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(78);
						_la = _input.LA(1);
						if ( !(_la==FINAL_ || _la==VAR_) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(80);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==TYPEOFVARIABLES) {
							{
							setState(79);
							match(TYPEOFVARIABLES);
							}
						}

						setState(82);
						match(IDENTIFIER);
						setState(83);
						match(C);
						}
						} 
					}
					setState(88);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				{
				setState(89);
				_la = _input.LA(1);
				if ( !(_la==FINAL_ || _la==VAR_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPEOFVARIABLES) {
					{
					setState(90);
					match(TYPEOFVARIABLES);
					}
				}

				setState(93);
				match(IDENTIFIER);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentDeclarationContext extends ParserRuleContext {
		public List<AssignableExpressionContext> assignableExpression() {
			return getRuleContexts(AssignableExpressionContext.class);
		}
		public AssignableExpressionContext assignableExpression(int i) {
			return getRuleContext(AssignableExpressionContext.class,i);
		}
		public List<TerminalNode> C() { return getTokens(DartParser.C); }
		public TerminalNode C(int i) {
			return getToken(DartParser.C, i);
		}
		public ArgumentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterArgumentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitArgumentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitArgumentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentDeclarationContext argumentDeclaration() throws RecognitionException {
		ArgumentDeclarationContext _localctx = new ArgumentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_argumentDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 271368334548926464L) != 0) {
				{
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(96);
						assignableExpression();
						setState(97);
						match(C);
						}
						} 
					}
					setState(103);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(104);
				assignableExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS_() { return getToken(DartParser.CLASS_, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(DartParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DartParser.IDENTIFIER, i);
		}
		public TerminalNode OBC() { return getToken(DartParser.OBC, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode CBC() { return getToken(DartParser.CBC, 0); }
		public TerminalNode EXTENDS_() { return getToken(DartParser.EXTENDS_, 0); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(CLASS_);
			setState(108);
			match(IDENTIFIER);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS_) {
				{
				setState(109);
				match(EXTENDS_);
				setState(110);
				match(IDENTIFIER);
				}
			}

			setState(113);
			match(OBC);
			setState(114);
			classBody();
			setState(115);
			match(CBC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassConstructorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public TerminalNode OP() { return getToken(DartParser.OP, 0); }
		public ParameterDeclarationContext parameterDeclaration() {
			return getRuleContext(ParameterDeclarationContext.class,0);
		}
		public TerminalNode CP() { return getToken(DartParser.CP, 0); }
		public TerminalNode OBC() { return getToken(DartParser.OBC, 0); }
		public BlockBodyContext blockBody() {
			return getRuleContext(BlockBodyContext.class,0);
		}
		public TerminalNode CBC() { return getToken(DartParser.CBC, 0); }
		public ClassConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterClassConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitClassConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitClassConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassConstructorContext classConstructor() throws RecognitionException {
		ClassConstructorContext _localctx = new ClassConstructorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(IDENTIFIER);
			setState(118);
			match(OP);
			setState(119);
			parameterDeclaration();
			setState(120);
			match(CP);
			setState(121);
			match(OBC);
			setState(122);
			blockBody();
			setState(123);
			match(CBC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode TYPEOFFUNCTION() { return getToken(DartParser.TYPEOFFUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public TerminalNode OP() { return getToken(DartParser.OP, 0); }
		public ParameterDeclarationContext parameterDeclaration() {
			return getRuleContext(ParameterDeclarationContext.class,0);
		}
		public TerminalNode CP() { return getToken(DartParser.CP, 0); }
		public TerminalNode OBC() { return getToken(DartParser.OBC, 0); }
		public BlockBodyContext blockBody() {
			return getRuleContext(BlockBodyContext.class,0);
		}
		public TerminalNode RETURN_() { return getToken(DartParser.RETURN_, 0); }
		public TerminalNode SC() { return getToken(DartParser.SC, 0); }
		public TerminalNode CBC() { return getToken(DartParser.CBC, 0); }
		public AssignableExpressionContext assignableExpression() {
			return getRuleContext(AssignableExpressionContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(TYPEOFFUNCTION);
			setState(126);
			match(IDENTIFIER);
			setState(127);
			match(OP);
			setState(128);
			parameterDeclaration();
			setState(129);
			match(CP);
			setState(130);
			match(OBC);
			setState(131);
			blockBody();
			setState(132);
			match(RETURN_);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 271368334548926464L) != 0) {
				{
				setState(133);
				assignableExpression();
				}
			}

			setState(136);
			match(SC);
			setState(137);
			match(CBC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public TerminalNode OP() { return getToken(DartParser.OP, 0); }
		public ArgumentDeclarationContext argumentDeclaration() {
			return getRuleContext(ArgumentDeclarationContext.class,0);
		}
		public TerminalNode CP() { return getToken(DartParser.CP, 0); }
		public TerminalNode SC() { return getToken(DartParser.SC, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(IDENTIFIER);
			setState(140);
			match(OP);
			setState(141);
			argumentDeclaration();
			setState(142);
			match(CP);
			setState(143);
			match(SC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(DartParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(DartParser.STRING, 0); }
		public TerminalNode FALSE_() { return getToken(DartParser.FALSE_, 0); }
		public TerminalNode TRUE_() { return getToken(DartParser.TRUE_, 0); }
		public TerminalNode NULL_() { return getToken(DartParser.NULL_, 0); }
		public ListLiteralContext listLiteral() {
			return getRuleContext(ListLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_literal);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(STRING);
				}
				break;
			case FALSE_:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				match(FALSE_);
				}
				break;
			case TRUE_:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				match(TRUE_);
				}
				break;
			case NULL_:
				enterOuterAlt(_localctx, 5);
				{
				setState(149);
				match(NULL_);
				}
				break;
			case OB:
				enterOuterAlt(_localctx, 6);
				{
				setState(150);
				listLiteral();
				}
				break;
			case NEW_:
				enterOuterAlt(_localctx, 7);
				{
				setState(151);
				objectLiteral();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode NEW_() { return getToken(DartParser.NEW_, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(DartParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DartParser.IDENTIFIER, i);
		}
		public TerminalNode OP() { return getToken(DartParser.OP, 0); }
		public ArgumentDeclarationContext argumentDeclaration() {
			return getRuleContext(ArgumentDeclarationContext.class,0);
		}
		public TerminalNode CB() { return getToken(DartParser.CB, 0); }
		public List<TerminalNode> C() { return getTokens(DartParser.C); }
		public TerminalNode C(int i) {
			return getToken(DartParser.C, i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitObjectLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_objectLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(NEW_);
			setState(155);
			match(IDENTIFIER);
			setState(156);
			match(OP);
			setState(157);
			argumentDeclaration();
			setState(158);
			match(CB);
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(159);
					match(C);
					setState(160);
					match(IDENTIFIER);
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectContentContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(DartParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DartParser.IDENTIFIER, i);
		}
		public List<TerminalNode> C() { return getTokens(DartParser.C); }
		public TerminalNode C(int i) {
			return getToken(DartParser.C, i);
		}
		public ObjectContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterObjectContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitObjectContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitObjectContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContentContext objectContent() throws RecognitionException {
		ObjectContentContext _localctx = new ObjectContentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_objectContent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(IDENTIFIER);
			setState(169); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(167);
					match(C);
					setState(168);
					match(IDENTIFIER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(171); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListLiteralContext extends ParserRuleContext {
		public TerminalNode OB() { return getToken(DartParser.OB, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public TerminalNode CB() { return getToken(DartParser.CB, 0); }
		public List<TerminalNode> C() { return getTokens(DartParser.C); }
		public TerminalNode C(int i) {
			return getToken(DartParser.C, i);
		}
		public ListLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterListLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitListLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitListLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListLiteralContext listLiteral() throws RecognitionException {
		ListLiteralContext _localctx = new ListLiteralContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_listLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(OB);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(174);
					literal();
					setState(175);
					match(C);
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(182);
			literal();
			setState(183);
			match(CB);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperationContext extends ParserRuleContext {
		public TerminalNode OP() { return getToken(DartParser.OP, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode CP() { return getToken(DartParser.CP, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode ST() { return getToken(DartParser.ST, 0); }
		public TerminalNode SL() { return getToken(DartParser.SL, 0); }
		public TerminalNode PC() { return getToken(DartParser.PC, 0); }
		public TerminalNode PL() { return getToken(DartParser.PL, 0); }
		public TerminalNode MINUS() { return getToken(DartParser.MINUS, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		return operation(0);
	}

	private OperationContext operation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperationContext _localctx = new OperationContext(_ctx, _parentState);
		OperationContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_operation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(186);
				match(OP);
				setState(187);
				operation(0);
				setState(188);
				match(CP);
				}
				break;
			case 2:
				{
				setState(190);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(191);
				literal();
				}
				break;
			case 4:
				{
				setState(192);
				functionCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(210);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(195);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(196);
						match(ST);
						setState(197);
						operation(9);
						}
						break;
					case 2:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(198);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(199);
						match(SL);
						setState(200);
						operation(8);
						}
						break;
					case 3:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(201);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(202);
						match(PC);
						setState(203);
						operation(7);
						}
						break;
					case 4:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(204);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(205);
						match(PL);
						setState(206);
						operation(6);
						}
						break;
					case 5:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(207);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(208);
						match(MINUS);
						setState(209);
						operation(5);
						}
						break;
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockBodyContext extends ParserRuleContext {
		public List<VariablesDeclarationContext> variablesDeclaration() {
			return getRuleContexts(VariablesDeclarationContext.class);
		}
		public VariablesDeclarationContext variablesDeclaration(int i) {
			return getRuleContext(VariablesDeclarationContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BlockBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterBlockBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitBlockBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBlockBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockBodyContext blockBody() throws RecognitionException {
		BlockBodyContext _localctx = new BlockBodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_blockBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 278125520696377344L) != 0) {
				{
				setState(217);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FINAL_:
				case VAR_:
					{
					setState(215);
					variablesDeclaration();
					}
					break;
				case OB:
				case OP:
				case FALSE_:
				case FOR_:
				case IF_:
				case NEW_:
				case NULL_:
				case TRUE_:
				case WHILE_:
				case TYPEOFFUNCTION:
				case NUMBER:
				case STRING:
				case IDENTIFIER:
					{
					setState(216);
					expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(221);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public List<VariablesDeclarationContext> variablesDeclaration() {
			return getRuleContexts(VariablesDeclarationContext.class);
		}
		public VariablesDeclarationContext variablesDeclaration(int i) {
			return getRuleContext(VariablesDeclarationContext.class,i);
		}
		public ClassConstructorContext classConstructor() {
			return getRuleContext(ClassConstructorContext.class,0);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL_ || _la==VAR_) {
				{
				{
				setState(222);
				variablesDeclaration();
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(228);
				classConstructor();
				}
			}

			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPEOFFUNCTION) {
				{
				{
				setState(231);
				functionDeclaration();
				}
				}
				setState(236);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			importStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT_() { return getToken(DartParser.IMPORT_, 0); }
		public TerminalNode STRING() { return getToken(DartParser.STRING, 0); }
		public TerminalNode SC() { return getToken(DartParser.SC, 0); }
		public TerminalNode AS_() { return getToken(DartParser.AS_, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(IMPORT_);
			setState(240);
			match(STRING);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS_) {
				{
				setState(241);
				match(AS_);
				setState(242);
				match(IDENTIFIER);
				}
			}

			setState(245);
			match(SC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public AssignableExpressionContext assignableExpression() {
			return getRuleContext(AssignableExpressionContext.class,0);
		}
		public VariablesExpressionContext variablesExpression() {
			return getRuleContext(VariablesExpressionContext.class,0);
		}
		public ConditionExpressionContext conditionExpression() {
			return getRuleContext(ConditionExpressionContext.class,0);
		}
		public ForExpressionContext forExpression() {
			return getRuleContext(ForExpressionContext.class,0);
		}
		public WhileExpressionContext whileExpression() {
			return getRuleContext(WhileExpressionContext.class,0);
		}
		public IfExpressionContext ifExpression() {
			return getRuleContext(IfExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expression);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				assignableExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				variablesExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				conditionExpression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(250);
				forExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(251);
				whileExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(252);
				ifExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignableExpressionContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public ObjectContentContext objectContent() {
			return getRuleContext(ObjectContentContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public AssignableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignableExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterAssignableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitAssignableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitAssignableExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignableExpressionContext assignableExpression() throws RecognitionException {
		AssignableExpressionContext _localctx = new AssignableExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assignableExpression);
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				functionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(258);
				objectLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(259);
				match(IDENTIFIER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(260);
				objectContent();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(261);
				operation(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariablesExpressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public TerminalNode SC() { return getToken(DartParser.SC, 0); }
		public TerminalNode EQ() { return getToken(DartParser.EQ, 0); }
		public AssignableExpressionContext assignableExpression() {
			return getRuleContext(AssignableExpressionContext.class,0);
		}
		public VariablesExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablesExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterVariablesExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitVariablesExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitVariablesExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesExpressionContext variablesExpression() throws RecognitionException {
		VariablesExpressionContext _localctx = new VariablesExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variablesExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(IDENTIFIER);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(265);
				match(EQ);
				setState(266);
				assignableExpression();
				}
			}

			setState(269);
			match(SC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionExpressionContext extends ParserRuleContext {
		public List<AssignableExpressionContext> assignableExpression() {
			return getRuleContexts(AssignableExpressionContext.class);
		}
		public AssignableExpressionContext assignableExpression(int i) {
			return getRuleContext(AssignableExpressionContext.class,i);
		}
		public TerminalNode EE() { return getToken(DartParser.EE, 0); }
		public TerminalNode GT() { return getToken(DartParser.GT, 0); }
		public TerminalNode LT() { return getToken(DartParser.LT, 0); }
		public TerminalNode LTE() { return getToken(DartParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(DartParser.GTE, 0); }
		public TerminalNode NE() { return getToken(DartParser.NE, 0); }
		public List<ConditionExpressionContext> conditionExpression() {
			return getRuleContexts(ConditionExpressionContext.class);
		}
		public ConditionExpressionContext conditionExpression(int i) {
			return getRuleContext(ConditionExpressionContext.class,i);
		}
		public TerminalNode AA() { return getToken(DartParser.AA, 0); }
		public TerminalNode PP() { return getToken(DartParser.PP, 0); }
		public ConditionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterConditionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitConditionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitConditionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionExpressionContext conditionExpression() throws RecognitionException {
		return conditionExpression(0);
	}

	private ConditionExpressionContext conditionExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionExpressionContext _localctx = new ConditionExpressionContext(_ctx, _parentState);
		ConditionExpressionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_conditionExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(272);
			assignableExpression();
			setState(273);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 81152L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(274);
			assignableExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(282);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditionExpression);
						setState(276);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(277);
						match(AA);
						setState(278);
						conditionExpression(4);
						}
						break;
					case 2:
						{
						_localctx = new ConditionExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditionExpression);
						setState(279);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(280);
						match(PP);
						setState(281);
						conditionExpression(3);
						}
						break;
					}
					} 
				}
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForExpressionContext extends ParserRuleContext {
		public TerminalNode FOR_() { return getToken(DartParser.FOR_, 0); }
		public TerminalNode OP() { return getToken(DartParser.OP, 0); }
		public List<TerminalNode> SC() { return getTokens(DartParser.SC); }
		public TerminalNode SC(int i) {
			return getToken(DartParser.SC, i);
		}
		public ConditionExpressionContext conditionExpression() {
			return getRuleContext(ConditionExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CP() { return getToken(DartParser.CP, 0); }
		public TerminalNode OBC() { return getToken(DartParser.OBC, 0); }
		public BlockBodyContext blockBody() {
			return getRuleContext(BlockBodyContext.class,0);
		}
		public TerminalNode CBC() { return getToken(DartParser.CBC, 0); }
		public VariablesExpressionContext variablesExpression() {
			return getRuleContext(VariablesExpressionContext.class,0);
		}
		public TerminalNode TYPEOFVARIABLES() { return getToken(DartParser.TYPEOFVARIABLES, 0); }
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterForExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitForExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitForExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_forExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(FOR_);
			setState(288);
			match(OP);
			{
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPEOFVARIABLES) {
				{
				setState(289);
				match(TYPEOFVARIABLES);
				}
			}

			setState(292);
			variablesExpression();
			}
			setState(294);
			match(SC);
			setState(295);
			conditionExpression(0);
			setState(296);
			match(SC);
			setState(297);
			expression();
			setState(298);
			match(CP);
			setState(299);
			match(OBC);
			setState(300);
			blockBody();
			setState(301);
			match(CBC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileExpressionContext extends ParserRuleContext {
		public TerminalNode WHILE_() { return getToken(DartParser.WHILE_, 0); }
		public TerminalNode OP() { return getToken(DartParser.OP, 0); }
		public ConditionExpressionContext conditionExpression() {
			return getRuleContext(ConditionExpressionContext.class,0);
		}
		public TerminalNode CP() { return getToken(DartParser.CP, 0); }
		public TerminalNode OBC() { return getToken(DartParser.OBC, 0); }
		public BlockBodyContext blockBody() {
			return getRuleContext(BlockBodyContext.class,0);
		}
		public TerminalNode CBC() { return getToken(DartParser.CBC, 0); }
		public WhileExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterWhileExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitWhileExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitWhileExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileExpressionContext whileExpression() throws RecognitionException {
		WhileExpressionContext _localctx = new WhileExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_whileExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(WHILE_);
			setState(304);
			match(OP);
			setState(305);
			conditionExpression(0);
			setState(306);
			match(CP);
			setState(307);
			match(OBC);
			setState(308);
			blockBody();
			setState(309);
			match(CBC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfExpressionContext extends ParserRuleContext {
		public TerminalNode IF_() { return getToken(DartParser.IF_, 0); }
		public TerminalNode OP() { return getToken(DartParser.OP, 0); }
		public ConditionExpressionContext conditionExpression() {
			return getRuleContext(ConditionExpressionContext.class,0);
		}
		public TerminalNode CP() { return getToken(DartParser.CP, 0); }
		public List<TerminalNode> OBC() { return getTokens(DartParser.OBC); }
		public TerminalNode OBC(int i) {
			return getToken(DartParser.OBC, i);
		}
		public List<BlockBodyContext> blockBody() {
			return getRuleContexts(BlockBodyContext.class);
		}
		public BlockBodyContext blockBody(int i) {
			return getRuleContext(BlockBodyContext.class,i);
		}
		public List<TerminalNode> CBC() { return getTokens(DartParser.CBC); }
		public TerminalNode CBC(int i) {
			return getToken(DartParser.CBC, i);
		}
		public TerminalNode ELSE_() { return getToken(DartParser.ELSE_, 0); }
		public IfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterIfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitIfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitIfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExpressionContext ifExpression() throws RecognitionException {
		IfExpressionContext _localctx = new IfExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ifExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(IF_);
			setState(312);
			match(OP);
			setState(313);
			conditionExpression(0);
			setState(314);
			match(CP);
			setState(315);
			match(OBC);
			setState(316);
			blockBody();
			setState(317);
			match(CBC);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_) {
				{
				setState(318);
				match(ELSE_);
				setState(319);
				match(OBC);
				setState(320);
				blockBody();
				setState(321);
				match(CBC);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return operation_sempred((OperationContext)_localctx, predIndex);
		case 21:
			return conditionExpression_sempred((ConditionExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean operation_sempred(OperationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean conditionExpression_sempred(ConditionExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001;\u0146\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u00006\b\u0000\n\u0000\f\u0000"+
		"9\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001B\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0003\u0002F\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"K\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003"+
		"Q\b\u0003\u0001\u0003\u0001\u0003\u0005\u0003U\b\u0003\n\u0003\f\u0003"+
		"X\t\u0003\u0001\u0003\u0001\u0003\u0003\u0003\\\b\u0003\u0001\u0003\u0003"+
		"\u0003_\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004d\b\u0004"+
		"\n\u0004\f\u0004g\t\u0004\u0001\u0004\u0003\u0004j\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005p\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u0087\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0099\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00a2\b\n\n\n\f\n\u00a5"+
		"\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u00aa\b\u000b\u000b"+
		"\u000b\f\u000b\u00ab\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00b2\b\f"+
		"\n\f\f\f\u00b5\t\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00c2\b\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0005\r\u00d3\b\r\n\r\f\r\u00d6\t\r\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u00da\b\u000e\n\u000e\f\u000e\u00dd\t\u000e\u0001"+
		"\u000f\u0005\u000f\u00e0\b\u000f\n\u000f\f\u000f\u00e3\t\u000f\u0001\u000f"+
		"\u0003\u000f\u00e6\b\u000f\u0001\u000f\u0005\u000f\u00e9\b\u000f\n\u000f"+
		"\f\u000f\u00ec\t\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u00f4\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u00fe\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0107\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u010c\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015"+
		"\u011b\b\u0015\n\u0015\f\u0015\u011e\t\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u0123\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0144\b\u0018\u0001"+
		"\u0018\u0000\u0002\u001a*\u0019\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0\u0000\u0002\u0002"+
		"\u0000%%33\u0003\u0000\b\b\n\r\u0010\u0010\u0164\u00007\u0001\u0000\u0000"+
		"\u0000\u0002A\u0001\u0000\u0000\u0000\u0004C\u0001\u0000\u0000\u0000\u0006"+
		"^\u0001\u0000\u0000\u0000\bi\u0001\u0000\u0000\u0000\nk\u0001\u0000\u0000"+
		"\u0000\fu\u0001\u0000\u0000\u0000\u000e}\u0001\u0000\u0000\u0000\u0010"+
		"\u008b\u0001\u0000\u0000\u0000\u0012\u0098\u0001\u0000\u0000\u0000\u0014"+
		"\u009a\u0001\u0000\u0000\u0000\u0016\u00a6\u0001\u0000\u0000\u0000\u0018"+
		"\u00ad\u0001\u0000\u0000\u0000\u001a\u00c1\u0001\u0000\u0000\u0000\u001c"+
		"\u00db\u0001\u0000\u0000\u0000\u001e\u00e1\u0001\u0000\u0000\u0000 \u00ed"+
		"\u0001\u0000\u0000\u0000\"\u00ef\u0001\u0000\u0000\u0000$\u00fd\u0001"+
		"\u0000\u0000\u0000&\u0106\u0001\u0000\u0000\u0000(\u0108\u0001\u0000\u0000"+
		"\u0000*\u010f\u0001\u0000\u0000\u0000,\u011f\u0001\u0000\u0000\u0000."+
		"\u012f\u0001\u0000\u0000\u00000\u0137\u0001\u0000\u0000\u000026\u0003"+
		"\u000e\u0007\u000036\u0003\n\u0005\u000046\u0003 \u0010\u000052\u0001"+
		"\u0000\u0000\u000053\u0001\u0000\u0000\u000054\u0001\u0000\u0000\u0000"+
		"69\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000"+
		"\u00008:\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000:;\u0005\u0000"+
		"\u0000\u0001;\u0001\u0001\u0000\u0000\u0000<B\u0003\u0004\u0002\u0000"+
		"=B\u0003\u0006\u0003\u0000>B\u0003\b\u0004\u0000?B\u0003\n\u0005\u0000"+
		"@B\u0003\u000e\u0007\u0000A<\u0001\u0000\u0000\u0000A=\u0001\u0000\u0000"+
		"\u0000A>\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000A@\u0001\u0000"+
		"\u0000\u0000B\u0003\u0001\u0000\u0000\u0000CE\u0007\u0000\u0000\u0000"+
		"DF\u00055\u0000\u0000ED\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000"+
		"FG\u0001\u0000\u0000\u0000GJ\u00059\u0000\u0000HI\u0005\t\u0000\u0000"+
		"IK\u0003&\u0013\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000"+
		"KL\u0001\u0000\u0000\u0000LM\u0005\u001b\u0000\u0000M\u0005\u0001\u0000"+
		"\u0000\u0000NP\u0007\u0000\u0000\u0000OQ\u00055\u0000\u0000PO\u0001\u0000"+
		"\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0005"+
		"9\u0000\u0000SU\u0005\u0002\u0000\u0000TN\u0001\u0000\u0000\u0000UX\u0001"+
		"\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000"+
		"WY\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000Y[\u0007\u0000\u0000"+
		"\u0000Z\\\u00055\u0000\u0000[Z\u0001\u0000\u0000\u0000[\\\u0001\u0000"+
		"\u0000\u0000\\]\u0001\u0000\u0000\u0000]_\u00059\u0000\u0000^V\u0001\u0000"+
		"\u0000\u0000^_\u0001\u0000\u0000\u0000_\u0007\u0001\u0000\u0000\u0000"+
		"`a\u0003&\u0013\u0000ab\u0005\u0002\u0000\u0000bd\u0001\u0000\u0000\u0000"+
		"c`\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000"+
		"\u0000ef\u0001\u0000\u0000\u0000fh\u0001\u0000\u0000\u0000ge\u0001\u0000"+
		"\u0000\u0000hj\u0003&\u0013\u0000ie\u0001\u0000\u0000\u0000ij\u0001\u0000"+
		"\u0000\u0000j\t\u0001\u0000\u0000\u0000kl\u0005\u001f\u0000\u0000lo\u0005"+
		"9\u0000\u0000mn\u0005#\u0000\u0000np\u00059\u0000\u0000om\u0001\u0000"+
		"\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0005"+
		"\u0013\u0000\u0000rs\u0003\u001e\u000f\u0000st\u0005\u0004\u0000\u0000"+
		"t\u000b\u0001\u0000\u0000\u0000uv\u00059\u0000\u0000vw\u0005\u0014\u0000"+
		"\u0000wx\u0003\u0006\u0003\u0000xy\u0005\u0006\u0000\u0000yz\u0005\u0013"+
		"\u0000\u0000z{\u0003\u001c\u000e\u0000{|\u0005\u0004\u0000\u0000|\r\u0001"+
		"\u0000\u0000\u0000}~\u00056\u0000\u0000~\u007f\u00059\u0000\u0000\u007f"+
		"\u0080\u0005\u0014\u0000\u0000\u0080\u0081\u0003\u0006\u0003\u0000\u0081"+
		"\u0082\u0005\u0006\u0000\u0000\u0082\u0083\u0005\u0013\u0000\u0000\u0083"+
		"\u0084\u0003\u001c\u000e\u0000\u0084\u0086\u0005-\u0000\u0000\u0085\u0087"+
		"\u0003&\u0013\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0086\u0087\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0089\u0005"+
		"\u001b\u0000\u0000\u0089\u008a\u0005\u0004\u0000\u0000\u008a\u000f\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u00059\u0000\u0000\u008c\u008d\u0005\u0014"+
		"\u0000\u0000\u008d\u008e\u0003\b\u0004\u0000\u008e\u008f\u0005\u0006\u0000"+
		"\u0000\u008f\u0090\u0005\u001b\u0000\u0000\u0090\u0011\u0001\u0000\u0000"+
		"\u0000\u0091\u0099\u00057\u0000\u0000\u0092\u0099\u00058\u0000\u0000\u0093"+
		"\u0099\u0005$\u0000\u0000\u0094\u0099\u00052\u0000\u0000\u0095\u0099\u0005"+
		",\u0000\u0000\u0096\u0099\u0003\u0018\f\u0000\u0097\u0099\u0003\u0014"+
		"\n\u0000\u0098\u0091\u0001\u0000\u0000\u0000\u0098\u0092\u0001\u0000\u0000"+
		"\u0000\u0098\u0093\u0001\u0000\u0000\u0000\u0098\u0094\u0001\u0000\u0000"+
		"\u0000\u0098\u0095\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000"+
		"\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u0013\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0005+\u0000\u0000\u009b\u009c\u00059\u0000\u0000\u009c"+
		"\u009d\u0005\u0014\u0000\u0000\u009d\u009e\u0003\b\u0004\u0000\u009e\u00a3"+
		"\u0005\u0003\u0000\u0000\u009f\u00a0\u0005\u0002\u0000\u0000\u00a0\u00a2"+
		"\u00059\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a4\u0015\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a9\u00059\u0000\u0000\u00a7\u00a8\u0005\u0002"+
		"\u0000\u0000\u00a8\u00aa\u00059\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u0017\u0001\u0000\u0000"+
		"\u0000\u00ad\u00b3\u0005\u0012\u0000\u0000\u00ae\u00af\u0003\u0012\t\u0000"+
		"\u00af\u00b0\u0005\u0002\u0000\u0000\u00b0\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b1\u00ae\u0001\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b7\u0003\u0012\t\u0000\u00b7\u00b8\u0005\u0003\u0000\u0000\u00b8"+
		"\u0019\u0001\u0000\u0000\u0000\u00b9\u00ba\u0006\r\uffff\uffff\u0000\u00ba"+
		"\u00bb\u0005\u0014\u0000\u0000\u00bb\u00bc\u0003\u001a\r\u0000\u00bc\u00bd"+
		"\u0005\u0006\u0000\u0000\u00bd\u00c2\u0001\u0000\u0000\u0000\u00be\u00c2"+
		"\u00059\u0000\u0000\u00bf\u00c2\u0003\u0012\t\u0000\u00c0\u00c2\u0003"+
		"\u0010\b\u0000\u00c1\u00b9\u0001\u0000\u0000\u0000\u00c1\u00be\u0001\u0000"+
		"\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c2\u00d4\u0001\u0000\u0000\u0000\u00c3\u00c4\n\b\u0000"+
		"\u0000\u00c4\u00c5\u0005\u001a\u0000\u0000\u00c5\u00d3\u0003\u001a\r\t"+
		"\u00c6\u00c7\n\u0007\u0000\u0000\u00c7\u00c8\u0005\u0019\u0000\u0000\u00c8"+
		"\u00d3\u0003\u001a\r\b\u00c9\u00ca\n\u0006\u0000\u0000\u00ca\u00cb\u0005"+
		"\u0015\u0000\u0000\u00cb\u00d3\u0003\u001a\r\u0007\u00cc\u00cd\n\u0005"+
		"\u0000\u0000\u00cd\u00ce\u0005\u0016\u0000\u0000\u00ce\u00d3\u0003\u001a"+
		"\r\u0006\u00cf\u00d0\n\u0004\u0000\u0000\u00d0\u00d1\u0005\u000e\u0000"+
		"\u0000\u00d1\u00d3\u0003\u001a\r\u0005\u00d2\u00c3\u0001\u0000\u0000\u0000"+
		"\u00d2\u00c6\u0001\u0000\u0000\u0000\u00d2\u00c9\u0001\u0000\u0000\u0000"+
		"\u00d2\u00cc\u0001\u0000\u0000\u0000\u00d2\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u001b\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00da\u0003\u0004\u0002\u0000"+
		"\u00d8\u00da\u0003$\u0012\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9"+
		"\u00d8\u0001\u0000\u0000\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db"+
		"\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc"+
		"\u001d\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de"+
		"\u00e0\u0003\u0004\u0002\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e6\u0003\f\u0006\u0000\u00e5\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00ea"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e9\u0003\u000e\u0007\u0000\u00e8\u00e7"+
		"\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8"+
		"\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u001f"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u0003\"\u0011\u0000\u00ee!\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005"+
		")\u0000\u0000\u00f0\u00f3\u00058\u0000\u0000\u00f1\u00f2\u0005\u001c\u0000"+
		"\u0000\u00f2\u00f4\u00059\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f6\u0005\u001b\u0000\u0000\u00f6#\u0001\u0000\u0000\u0000\u00f7"+
		"\u00fe\u0003&\u0013\u0000\u00f8\u00fe\u0003(\u0014\u0000\u00f9\u00fe\u0003"+
		"*\u0015\u0000\u00fa\u00fe\u0003,\u0016\u0000\u00fb\u00fe\u0003.\u0017"+
		"\u0000\u00fc\u00fe\u00030\u0018\u0000\u00fd\u00f7\u0001\u0000\u0000\u0000"+
		"\u00fd\u00f8\u0001\u0000\u0000\u0000\u00fd\u00f9\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fa\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fe%\u0001\u0000\u0000\u0000\u00ff"+
		"\u0107\u0003\u0010\b\u0000\u0100\u0107\u0003\u0012\t\u0000\u0101\u0107"+
		"\u0003\u000e\u0007\u0000\u0102\u0107\u0003\u0014\n\u0000\u0103\u0107\u0005"+
		"9\u0000\u0000\u0104\u0107\u0003\u0016\u000b\u0000\u0105\u0107\u0003\u001a"+
		"\r\u0000\u0106\u00ff\u0001\u0000\u0000\u0000\u0106\u0100\u0001\u0000\u0000"+
		"\u0000\u0106\u0101\u0001\u0000\u0000\u0000\u0106\u0102\u0001\u0000\u0000"+
		"\u0000\u0106\u0103\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000"+
		"\u0000\u0106\u0105\u0001\u0000\u0000\u0000\u0107\'\u0001\u0000\u0000\u0000"+
		"\u0108\u010b\u00059\u0000\u0000\u0109\u010a\u0005\t\u0000\u0000\u010a"+
		"\u010c\u0003&\u0013\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010b\u010c"+
		"\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010e"+
		"\u0005\u001b\u0000\u0000\u010e)\u0001\u0000\u0000\u0000\u010f\u0110\u0006"+
		"\u0015\uffff\uffff\u0000\u0110\u0111\u0003&\u0013\u0000\u0111\u0112\u0007"+
		"\u0001\u0000\u0000\u0112\u0113\u0003&\u0013\u0000\u0113\u011c\u0001\u0000"+
		"\u0000\u0000\u0114\u0115\n\u0003\u0000\u0000\u0115\u0116\u0005\u0001\u0000"+
		"\u0000\u0116\u011b\u0003*\u0015\u0004\u0117\u0118\n\u0002\u0000\u0000"+
		"\u0118\u0119\u0005\u0018\u0000\u0000\u0119\u011b\u0003*\u0015\u0003\u011a"+
		"\u0114\u0001\u0000\u0000\u0000\u011a\u0117\u0001\u0000\u0000\u0000\u011b"+
		"\u011e\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011c"+
		"\u011d\u0001\u0000\u0000\u0000\u011d+\u0001\u0000\u0000\u0000\u011e\u011c"+
		"\u0001\u0000\u0000\u0000\u011f\u0120\u0005\'\u0000\u0000\u0120\u0122\u0005"+
		"\u0014\u0000\u0000\u0121\u0123\u00055\u0000\u0000\u0122\u0121\u0001\u0000"+
		"\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000"+
		"\u0000\u0000\u0124\u0125\u0003(\u0014\u0000\u0125\u0126\u0001\u0000\u0000"+
		"\u0000\u0126\u0127\u0005\u001b\u0000\u0000\u0127\u0128\u0003*\u0015\u0000"+
		"\u0128\u0129\u0005\u001b\u0000\u0000\u0129\u012a\u0003$\u0012\u0000\u012a"+
		"\u012b\u0005\u0006\u0000\u0000\u012b\u012c\u0005\u0013\u0000\u0000\u012c"+
		"\u012d\u0003\u001c\u000e\u0000\u012d\u012e\u0005\u0004\u0000\u0000\u012e"+
		"-\u0001\u0000\u0000\u0000\u012f\u0130\u00054\u0000\u0000\u0130\u0131\u0005"+
		"\u0014\u0000\u0000\u0131\u0132\u0003*\u0015\u0000\u0132\u0133\u0005\u0006"+
		"\u0000\u0000\u0133\u0134\u0005\u0013\u0000\u0000\u0134\u0135\u0003\u001c"+
		"\u000e\u0000\u0135\u0136\u0005\u0004\u0000\u0000\u0136/\u0001\u0000\u0000"+
		"\u0000\u0137\u0138\u0005(\u0000\u0000\u0138\u0139\u0005\u0014\u0000\u0000"+
		"\u0139\u013a\u0003*\u0015\u0000\u013a\u013b\u0005\u0006\u0000\u0000\u013b"+
		"\u013c\u0005\u0013\u0000\u0000\u013c\u013d\u0003\u001c\u000e\u0000\u013d"+
		"\u0143\u0005\u0004\u0000\u0000\u013e\u013f\u0005\"\u0000\u0000\u013f\u0140"+
		"\u0005\u0013\u0000\u0000\u0140\u0141\u0003\u001c\u000e\u0000\u0141\u0142"+
		"\u0005\u0004\u0000\u0000\u0142\u0144\u0001\u0000\u0000\u0000\u0143\u013e"+
		"\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u01441\u0001"+
		"\u0000\u0000\u0000!57AEJPV[^eio\u0086\u0098\u00a3\u00ab\u00b3\u00c1\u00d2"+
		"\u00d4\u00d9\u00db\u00e1\u00e5\u00ea\u00f3\u00fd\u0106\u010b\u011a\u011c"+
		"\u0122\u0143";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}