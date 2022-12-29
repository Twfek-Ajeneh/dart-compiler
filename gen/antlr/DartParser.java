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
		PLPL=23, PP=24, SL=25, ST=26, SC=27, BREAK_=28, CASE_=29, CLASS_=30, CONTINUE_=31, 
		DEFAULT_=32, ELSE_=33, EXTENDS_=34, FALSE_=35, FINAL_=36, FINALLY_=37, 
		FOR_=38, IF_=39, IMPORT_=40, IS_=41, NEW_=42, NULL_=43, RETURN_=44, STATIC_=45, 
		SUPER_=46, SWITCH_=47, THIS_=48, TRUE_=49, VAR_=50, WHILE_=51, TYPEOFVARIABLES=52, 
		TYPEOFFUNCTION=53, VOID_=54, NUMBER=55, STRING=56, IDENTIFIER=57, WHITESPACE=58, 
		COMMENT=59;
	public static final int
		RULE_expression = 0, RULE_variablesDeclaration = 1, RULE_parameterDeclaration = 2, 
		RULE_functionDeclaration = 3, RULE_functionCall = 4, RULE_blockBody = 5, 
		RULE_objectLiteral = 6, RULE_conditionExpression = 7, RULE_assignableExpression = 8, 
		RULE_variablesExpression = 9, RULE_forExpression = 10, RULE_whileExpression = 11, 
		RULE_ifExpression = 12, RULE_literal = 13, RULE_listLiteral = 14, RULE_operation = 15, 
		RULE_classDeclaration = 16, RULE_classBody = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"expression", "variablesDeclaration", "parameterDeclaration", "functionDeclaration", 
			"functionCall", "blockBody", "objectLiteral", "conditionExpression", 
			"assignableExpression", "variablesExpression", "forExpression", "whileExpression", 
			"ifExpression", "literal", "listLiteral", "operation", "classDeclaration", 
			"classBody"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'&&'", "','", "']'", "'}'", "':'", "')'", "'.'", "'=='", "'='", 
			"'>'", "'<'", "'<='", "'>='", "'-'", "'--'", "'!='", "'!'", "'['", "'{'", 
			"'('", "'%'", "'+'", "'++'", "'||'", "'/'", "'*'", "';'", "'break'", 
			"'case'", "'class'", "'continue'", "'default'", "'else'", "'extends'", 
			"'false'", "'final'", "'finally'", "'for'", "'if'", "'import'", "'is'", 
			"'new'", "'null'", "'return'", "'static'", "'super'", "'switch'", "'this'", 
			"'true'", "'var'", "'while'", null, null, "'void'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AA", "C", "CB", "CBC", "CO", "CP", "D", "EE", "EQ", "GT", "LT", 
			"LTE", "GTE", "MINUS", "MM", "NE", "NOT", "OB", "OBC", "OP", "PC", "PL", 
			"PLPL", "PP", "SL", "ST", "SC", "BREAK_", "CASE_", "CLASS_", "CONTINUE_", 
			"DEFAULT_", "ELSE_", "EXTENDS_", "FALSE_", "FINAL_", "FINALLY_", "FOR_", 
			"IF_", "IMPORT_", "IS_", "NEW_", "NULL_", "RETURN_", "STATIC_", "SUPER_", 
			"SWITCH_", "THIS_", "TRUE_", "VAR_", "WHILE_", "TYPEOFVARIABLES", "TYPEOFFUNCTION", 
			"VOID_", "NUMBER", "STRING", "IDENTIFIER", "WHITESPACE", "COMMENT"
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
		enterRule(_localctx, 0, RULE_expression);
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				assignableExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				variablesExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				conditionExpression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				forExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(40);
				whileExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(41);
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
	public static class VariablesDeclarationContext extends ParserRuleContext {
		public TerminalNode TYPEOFVARIABLES() { return getToken(DartParser.TYPEOFVARIABLES, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public TerminalNode SC() { return getToken(DartParser.SC, 0); }
		public TerminalNode EQ() { return getToken(DartParser.EQ, 0); }
		public AssignableExpressionContext assignableExpression() {
			return getRuleContext(AssignableExpressionContext.class,0);
		}
		public TerminalNode VAR_() { return getToken(DartParser.VAR_, 0); }
		public TerminalNode FINAL_() { return getToken(DartParser.FINAL_, 0); }
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
		enterRule(_localctx, 2, RULE_variablesDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL_ || _la==VAR_) {
				{
				setState(44);
				_la = _input.LA(1);
				if ( !(_la==FINAL_ || _la==VAR_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(47);
			match(TYPEOFVARIABLES);
			setState(48);
			match(IDENTIFIER);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(49);
				match(EQ);
				setState(50);
				assignableExpression();
				}
			}

			setState(53);
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
		public List<TerminalNode> TYPEOFVARIABLES() { return getTokens(DartParser.TYPEOFVARIABLES); }
		public TerminalNode TYPEOFVARIABLES(int i) {
			return getToken(DartParser.TYPEOFVARIABLES, i);
		}
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
		enterRule(_localctx, 4, RULE_parameterDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINAL_ || _la==VAR_) {
						{
						setState(55);
						_la = _input.LA(1);
						if ( !(_la==FINAL_ || _la==VAR_) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(58);
					match(TYPEOFVARIABLES);
					setState(59);
					match(IDENTIFIER);
					setState(60);
					match(C);
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL_ || _la==VAR_) {
				{
				setState(66);
				_la = _input.LA(1);
				if ( !(_la==FINAL_ || _la==VAR_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(69);
			match(TYPEOFVARIABLES);
			setState(70);
			match(IDENTIFIER);
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
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode TYPEOFFUNCTION() { return getToken(DartParser.TYPEOFFUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public TerminalNode OP() { return getToken(DartParser.OP, 0); }
		public TerminalNode CP() { return getToken(DartParser.CP, 0); }
		public TerminalNode OBC() { return getToken(DartParser.OBC, 0); }
		public TerminalNode RETURN_() { return getToken(DartParser.RETURN_, 0); }
		public TerminalNode CBC() { return getToken(DartParser.CBC, 0); }
		public ParameterDeclarationContext parameterDeclaration() {
			return getRuleContext(ParameterDeclarationContext.class,0);
		}
		public List<BlockBodyContext> blockBody() {
			return getRuleContexts(BlockBodyContext.class);
		}
		public BlockBodyContext blockBody(int i) {
			return getRuleContext(BlockBodyContext.class,i);
		}
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
		enterRule(_localctx, 6, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(TYPEOFFUNCTION);
			setState(73);
			match(IDENTIFIER);
			setState(74);
			match(OP);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 5629568253689856L) != 0) {
				{
				setState(75);
				parameterDeclaration();
				}
			}

			setState(78);
			match(CP);
			setState(79);
			match(OBC);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 269667149541539840L) != 0) {
				{
				{
				setState(80);
				blockBody();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			match(RETURN_);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 261784956840443904L) != 0) {
				{
				setState(87);
				assignableExpression();
				}
			}

			setState(90);
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
		public TerminalNode CB() { return getToken(DartParser.CB, 0); }
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
		enterRule(_localctx, 8, RULE_functionCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(IDENTIFIER);
			setState(93);
			match(OP);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 261784956840443904L) != 0) {
				{
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(94);
						assignableExpression();
						setState(95);
						match(C);
						}
						} 
					}
					setState(101);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(102);
				assignableExpression();
				}
			}

			setState(105);
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
	public static class BlockBodyContext extends ParserRuleContext {
		public VariablesDeclarationContext variablesDeclaration() {
			return getRuleContext(VariablesDeclarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 10, RULE_blockBody);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL_:
			case VAR_:
			case TYPEOFVARIABLES:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				variablesDeclaration();
				}
				break;
			case OB:
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
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				expression();
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
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public TerminalNode OP() { return getToken(DartParser.OP, 0); }
		public TerminalNode CB() { return getToken(DartParser.CB, 0); }
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
		enterRule(_localctx, 12, RULE_objectLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(NEW_);
			setState(112);
			match(IDENTIFIER);
			setState(113);
			match(OP);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 261784956840443904L) != 0) {
				{
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(114);
						assignableExpression();
						setState(115);
						match(C);
						}
						} 
					}
					setState(121);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(122);
				assignableExpression();
				}
			}

			setState(125);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_conditionExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(128);
			assignableExpression();
			setState(129);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 81152L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(130);
			assignableExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(138);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditionExpression);
						setState(132);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(133);
						match(AA);
						setState(134);
						conditionExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new ConditionExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditionExpression);
						setState(135);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(136);
						match(PP);
						setState(137);
						conditionExpression(2);
						}
						break;
					}
					} 
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
	public static class AssignableExpressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
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
		enterRule(_localctx, 16, RULE_assignableExpression);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				functionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				objectLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				functionCall();
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
		enterRule(_localctx, 18, RULE_variablesExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(IDENTIFIER);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(151);
				match(EQ);
				setState(152);
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
		public VariablesDeclarationContext variablesDeclaration() {
			return getRuleContext(VariablesDeclarationContext.class,0);
		}
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
		enterRule(_localctx, 20, RULE_forExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(FOR_);
			setState(156);
			match(OP);
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(157);
				variablesExpression();
				}
				break;
			case FINAL_:
			case VAR_:
			case TYPEOFVARIABLES:
				{
				setState(158);
				variablesDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(161);
			match(SC);
			setState(162);
			conditionExpression(0);
			setState(163);
			match(SC);
			setState(164);
			expression();
			setState(165);
			match(CP);
			setState(166);
			match(OBC);
			setState(167);
			blockBody();
			setState(168);
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
		public TerminalNode CBC() { return getToken(DartParser.CBC, 0); }
		public BlockBodyContext blockBody() {
			return getRuleContext(BlockBodyContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_whileExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(WHILE_);
			setState(171);
			match(OP);
			setState(172);
			conditionExpression(0);
			setState(173);
			match(CP);
			setState(174);
			match(OBC);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 269667149541539840L) != 0) {
				{
				setState(175);
				blockBody();
				}
			}

			setState(178);
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
		public List<TerminalNode> CBC() { return getTokens(DartParser.CBC); }
		public TerminalNode CBC(int i) {
			return getToken(DartParser.CBC, i);
		}
		public TerminalNode ELSE_() { return getToken(DartParser.ELSE_, 0); }
		public List<BlockBodyContext> blockBody() {
			return getRuleContexts(BlockBodyContext.class);
		}
		public BlockBodyContext blockBody(int i) {
			return getRuleContext(BlockBodyContext.class,i);
		}
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
		enterRule(_localctx, 24, RULE_ifExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(IF_);
			setState(181);
			match(OP);
			setState(182);
			conditionExpression(0);
			setState(183);
			match(CP);
			setState(184);
			match(OBC);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 269667149541539840L) != 0) {
				{
				setState(185);
				blockBody();
				}
			}

			setState(188);
			match(CBC);
			setState(189);
			match(ELSE_);
			setState(190);
			match(OBC);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 269667149541539840L) != 0) {
				{
				setState(191);
				blockBody();
				}
			}

			setState(194);
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(DartParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(DartParser.STRING, 0); }
		public TerminalNode FALSE_() { return getToken(DartParser.FALSE_, 0); }
		public TerminalNode TRUE_() { return getToken(DartParser.TRUE_, 0); }
		public TerminalNode NULL_() { return getToken(DartParser.NULL_, 0); }
		public ListLiteralContext listLiteral() {
			return getRuleContext(ListLiteralContext.class,0);
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
		enterRule(_localctx, 26, RULE_literal);
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(STRING);
				}
				break;
			case FALSE_:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				match(FALSE_);
				}
				break;
			case TRUE_:
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				match(TRUE_);
				}
				break;
			case NULL_:
				enterOuterAlt(_localctx, 5);
				{
				setState(200);
				match(NULL_);
				}
				break;
			case OB:
				enterOuterAlt(_localctx, 6);
				{
				setState(201);
				listLiteral();
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
		enterRule(_localctx, 28, RULE_listLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(OB);
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(205);
					literal();
					setState(206);
					match(C);
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(213);
			literal();
			setState(214);
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
		public AssignableExpressionContext assignableExpression() {
			return getRuleContext(AssignableExpressionContext.class,0);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_operation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP:
				{
				setState(217);
				match(OP);
				setState(218);
				operation(0);
				setState(219);
				match(CP);
				}
				break;
			case OB:
			case FALSE_:
			case NEW_:
			case NULL_:
			case TRUE_:
			case TYPEOFFUNCTION:
			case NUMBER:
			case STRING:
			case IDENTIFIER:
				{
				setState(221);
				assignableExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(239);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(224);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(225);
						match(ST);
						setState(226);
						operation(7);
						}
						break;
					case 2:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(227);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(228);
						match(SL);
						setState(229);
						operation(6);
						}
						break;
					case 3:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(230);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(231);
						match(PC);
						setState(232);
						operation(5);
						}
						break;
					case 4:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(233);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(234);
						match(PL);
						setState(235);
						operation(4);
						}
						break;
					case 5:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(236);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(237);
						match(MINUS);
						setState(238);
						operation(3);
						}
						break;
					}
					} 
				}
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS_() { return getToken(DartParser.CLASS_, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public TerminalNode OBC() { return getToken(DartParser.OBC, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode CBC() { return getToken(DartParser.CBC, 0); }
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
		enterRule(_localctx, 32, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(CLASS_);
			setState(245);
			match(IDENTIFIER);
			setState(246);
			match(OBC);
			setState(247);
			classBody();
			setState(248);
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
	public static class ClassBodyContext extends ParserRuleContext {
		public List<VariablesDeclarationContext> variablesDeclaration() {
			return getRuleContexts(VariablesDeclarationContext.class);
		}
		public VariablesDeclarationContext variablesDeclaration(int i) {
			return getRuleContext(VariablesDeclarationContext.class,i);
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
		enterRule(_localctx, 34, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 14636767508430848L) != 0) {
				{
				setState(252);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FINAL_:
				case VAR_:
				case TYPEOFVARIABLES:
					{
					setState(250);
					variablesDeclaration();
					}
					break;
				case TYPEOFFUNCTION:
					{
					setState(251);
					functionDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(256);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return conditionExpression_sempred((ConditionExpressionContext)_localctx, predIndex);
		case 15:
			return operation_sempred((OperationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean conditionExpression_sempred(ConditionExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean operation_sempred(OperationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001;\u0102\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000+\b\u0000"+
		"\u0001\u0001\u0003\u0001.\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u00014\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0003\u00029\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		">\b\u0002\n\u0002\f\u0002A\t\u0002\u0001\u0002\u0003\u0002D\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003M\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003R\b\u0003\n\u0003\f\u0003U\t\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003Y\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004b\b\u0004\n\u0004\f\u0004e\t"+
		"\u0004\u0001\u0004\u0003\u0004h\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0003\u0005n\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006v\b\u0006\n\u0006"+
		"\f\u0006y\t\u0006\u0001\u0006\u0003\u0006|\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u008b\b\u0007\n\u0007\f\u0007\u008e\t\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u0095\b\b\u0001\t\u0001\t\u0001\t\u0003\t\u009a\b\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00a0\b\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00b1\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00bb\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00c1\b\f"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00cb\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u00d1\b\u000e\n\u000e\f\u000e\u00d4\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00df\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u00f0\b\u000f\n\u000f\f\u000f\u00f3\t\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u00fd\b\u0011\n\u0011\f\u0011\u0100\t\u0011\u0001\u0011\u0000"+
		"\u0002\u000e\u001e\u0012\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"\u0000\u0002\u0002\u0000$$22\u0003"+
		"\u0000\b\b\n\r\u0010\u0010\u011a\u0000*\u0001\u0000\u0000\u0000\u0002"+
		"-\u0001\u0000\u0000\u0000\u0004?\u0001\u0000\u0000\u0000\u0006H\u0001"+
		"\u0000\u0000\u0000\b\\\u0001\u0000\u0000\u0000\nm\u0001\u0000\u0000\u0000"+
		"\fo\u0001\u0000\u0000\u0000\u000e\u007f\u0001\u0000\u0000\u0000\u0010"+
		"\u0094\u0001\u0000\u0000\u0000\u0012\u0096\u0001\u0000\u0000\u0000\u0014"+
		"\u009b\u0001\u0000\u0000\u0000\u0016\u00aa\u0001\u0000\u0000\u0000\u0018"+
		"\u00b4\u0001\u0000\u0000\u0000\u001a\u00ca\u0001\u0000\u0000\u0000\u001c"+
		"\u00cc\u0001\u0000\u0000\u0000\u001e\u00de\u0001\u0000\u0000\u0000 \u00f4"+
		"\u0001\u0000\u0000\u0000\"\u00fe\u0001\u0000\u0000\u0000$+\u0003\u0010"+
		"\b\u0000%+\u0003\u0012\t\u0000&+\u0003\u000e\u0007\u0000\'+\u0003\u0014"+
		"\n\u0000(+\u0003\u0016\u000b\u0000)+\u0003\u0018\f\u0000*$\u0001\u0000"+
		"\u0000\u0000*%\u0001\u0000\u0000\u0000*&\u0001\u0000\u0000\u0000*\'\u0001"+
		"\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*)\u0001\u0000\u0000\u0000"+
		"+\u0001\u0001\u0000\u0000\u0000,.\u0007\u0000\u0000\u0000-,\u0001\u0000"+
		"\u0000\u0000-.\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0005"+
		"4\u0000\u000003\u00059\u0000\u000012\u0005\t\u0000\u000024\u0003\u0010"+
		"\b\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000045\u0001\u0000"+
		"\u0000\u000056\u0005\u001b\u0000\u00006\u0003\u0001\u0000\u0000\u0000"+
		"79\u0007\u0000\u0000\u000087\u0001\u0000\u0000\u000089\u0001\u0000\u0000"+
		"\u00009:\u0001\u0000\u0000\u0000:;\u00054\u0000\u0000;<\u00059\u0000\u0000"+
		"<>\u0005\u0002\u0000\u0000=8\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000"+
		"\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@C\u0001\u0000"+
		"\u0000\u0000A?\u0001\u0000\u0000\u0000BD\u0007\u0000\u0000\u0000CB\u0001"+
		"\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000"+
		"EF\u00054\u0000\u0000FG\u00059\u0000\u0000G\u0005\u0001\u0000\u0000\u0000"+
		"HI\u00055\u0000\u0000IJ\u00059\u0000\u0000JL\u0005\u0014\u0000\u0000K"+
		"M\u0003\u0004\u0002\u0000LK\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000"+
		"\u0000MN\u0001\u0000\u0000\u0000NO\u0005\u0006\u0000\u0000OS\u0005\u0013"+
		"\u0000\u0000PR\u0003\n\u0005\u0000QP\u0001\u0000\u0000\u0000RU\u0001\u0000"+
		"\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TV\u0001"+
		"\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VX\u0005,\u0000\u0000WY\u0003"+
		"\u0010\b\u0000XW\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000Z[\u0005\u0004\u0000\u0000[\u0007\u0001\u0000\u0000"+
		"\u0000\\]\u00059\u0000\u0000]g\u0005\u0014\u0000\u0000^_\u0003\u0010\b"+
		"\u0000_`\u0005\u0002\u0000\u0000`b\u0001\u0000\u0000\u0000a^\u0001\u0000"+
		"\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001"+
		"\u0000\u0000\u0000df\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000"+
		"fh\u0003\u0010\b\u0000gc\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000"+
		"hi\u0001\u0000\u0000\u0000ij\u0005\u0003\u0000\u0000j\t\u0001\u0000\u0000"+
		"\u0000kn\u0003\u0002\u0001\u0000ln\u0003\u0000\u0000\u0000mk\u0001\u0000"+
		"\u0000\u0000ml\u0001\u0000\u0000\u0000n\u000b\u0001\u0000\u0000\u0000"+
		"op\u0005*\u0000\u0000pq\u00059\u0000\u0000q{\u0005\u0014\u0000\u0000r"+
		"s\u0003\u0010\b\u0000st\u0005\u0002\u0000\u0000tv\u0001\u0000\u0000\u0000"+
		"ur\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000"+
		"\u0000wx\u0001\u0000\u0000\u0000xz\u0001\u0000\u0000\u0000yw\u0001\u0000"+
		"\u0000\u0000z|\u0003\u0010\b\u0000{w\u0001\u0000\u0000\u0000{|\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0005\u0003\u0000\u0000~\r\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0006\u0007\uffff\uffff\u0000\u0080\u0081"+
		"\u0003\u0010\b\u0000\u0081\u0082\u0007\u0001\u0000\u0000\u0082\u0083\u0003"+
		"\u0010\b\u0000\u0083\u008c\u0001\u0000\u0000\u0000\u0084\u0085\n\u0002"+
		"\u0000\u0000\u0085\u0086\u0005\u0001\u0000\u0000\u0086\u008b\u0003\u000e"+
		"\u0007\u0003\u0087\u0088\n\u0001\u0000\u0000\u0088\u0089\u0005\u0018\u0000"+
		"\u0000\u0089\u008b\u0003\u000e\u0007\u0002\u008a\u0084\u0001\u0000\u0000"+
		"\u0000\u008a\u0087\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000"+
		"\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000"+
		"\u0000\u008d\u000f\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000"+
		"\u0000\u008f\u0095\u00059\u0000\u0000\u0090\u0095\u0003\u001a\r\u0000"+
		"\u0091\u0095\u0003\u0006\u0003\u0000\u0092\u0095\u0003\f\u0006\u0000\u0093"+
		"\u0095\u0003\b\u0004\u0000\u0094\u008f\u0001\u0000\u0000\u0000\u0094\u0090"+
		"\u0001\u0000\u0000\u0000\u0094\u0091\u0001\u0000\u0000\u0000\u0094\u0092"+
		"\u0001\u0000\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0011"+
		"\u0001\u0000\u0000\u0000\u0096\u0099\u00059\u0000\u0000\u0097\u0098\u0005"+
		"\t\u0000\u0000\u0098\u009a\u0003\u0010\b\u0000\u0099\u0097\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u0013\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0005&\u0000\u0000\u009c\u009f\u0005\u0014\u0000"+
		"\u0000\u009d\u00a0\u0003\u0012\t\u0000\u009e\u00a0\u0003\u0002\u0001\u0000"+
		"\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\u001b\u0000\u0000"+
		"\u00a2\u00a3\u0003\u000e\u0007\u0000\u00a3\u00a4\u0005\u001b\u0000\u0000"+
		"\u00a4\u00a5\u0003\u0000\u0000\u0000\u00a5\u00a6\u0005\u0006\u0000\u0000"+
		"\u00a6\u00a7\u0005\u0013\u0000\u0000\u00a7\u00a8\u0003\n\u0005\u0000\u00a8"+
		"\u00a9\u0005\u0004\u0000\u0000\u00a9\u0015\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ab\u00053\u0000\u0000\u00ab\u00ac\u0005\u0014\u0000\u0000\u00ac\u00ad"+
		"\u0003\u000e\u0007\u0000\u00ad\u00ae\u0005\u0006\u0000\u0000\u00ae\u00b0"+
		"\u0005\u0013\u0000\u0000\u00af\u00b1\u0003\n\u0005\u0000\u00b0\u00af\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0005\u0004\u0000\u0000\u00b3\u0017\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0005\'\u0000\u0000\u00b5\u00b6\u0005\u0014"+
		"\u0000\u0000\u00b6\u00b7\u0003\u000e\u0007\u0000\u00b7\u00b8\u0005\u0006"+
		"\u0000\u0000\u00b8\u00ba\u0005\u0013\u0000\u0000\u00b9\u00bb\u0003\n\u0005"+
		"\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\u0004\u0000"+
		"\u0000\u00bd\u00be\u0005!\u0000\u0000\u00be\u00c0\u0005\u0013\u0000\u0000"+
		"\u00bf\u00c1\u0003\n\u0005\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0005\u0004\u0000\u0000\u00c3\u0019\u0001\u0000\u0000\u0000\u00c4"+
		"\u00cb\u00057\u0000\u0000\u00c5\u00cb\u00058\u0000\u0000\u00c6\u00cb\u0005"+
		"#\u0000\u0000\u00c7\u00cb\u00051\u0000\u0000\u00c8\u00cb\u0005+\u0000"+
		"\u0000\u00c9\u00cb\u0003\u001c\u000e\u0000\u00ca\u00c4\u0001\u0000\u0000"+
		"\u0000\u00ca\u00c5\u0001\u0000\u0000\u0000\u00ca\u00c6\u0001\u0000\u0000"+
		"\u0000\u00ca\u00c7\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000"+
		"\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000\u00cb\u001b\u0001\u0000\u0000"+
		"\u0000\u00cc\u00d2\u0005\u0012\u0000\u0000\u00cd\u00ce\u0003\u001a\r\u0000"+
		"\u00ce\u00cf\u0005\u0002\u0000\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d0\u00cd\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d5\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d6\u0003\u001a\r\u0000\u00d6\u00d7\u0005\u0003\u0000\u0000\u00d7"+
		"\u001d\u0001\u0000\u0000\u0000\u00d8\u00d9\u0006\u000f\uffff\uffff\u0000"+
		"\u00d9\u00da\u0005\u0014\u0000\u0000\u00da\u00db\u0003\u001e\u000f\u0000"+
		"\u00db\u00dc\u0005\u0006\u0000\u0000\u00dc\u00df\u0001\u0000\u0000\u0000"+
		"\u00dd\u00df\u0003\u0010\b\u0000\u00de\u00d8\u0001\u0000\u0000\u0000\u00de"+
		"\u00dd\u0001\u0000\u0000\u0000\u00df\u00f1\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e1\n\u0006\u0000\u0000\u00e1\u00e2\u0005\u001a\u0000\u0000\u00e2\u00f0"+
		"\u0003\u001e\u000f\u0007\u00e3\u00e4\n\u0005\u0000\u0000\u00e4\u00e5\u0005"+
		"\u0019\u0000\u0000\u00e5\u00f0\u0003\u001e\u000f\u0006\u00e6\u00e7\n\u0004"+
		"\u0000\u0000\u00e7\u00e8\u0005\u0015\u0000\u0000\u00e8\u00f0\u0003\u001e"+
		"\u000f\u0005\u00e9\u00ea\n\u0003\u0000\u0000\u00ea\u00eb\u0005\u0016\u0000"+
		"\u0000\u00eb\u00f0\u0003\u001e\u000f\u0004\u00ec\u00ed\n\u0002\u0000\u0000"+
		"\u00ed\u00ee\u0005\u000e\u0000\u0000\u00ee\u00f0\u0003\u001e\u000f\u0003"+
		"\u00ef\u00e0\u0001\u0000\u0000\u0000\u00ef\u00e3\u0001\u0000\u0000\u0000"+
		"\u00ef\u00e6\u0001\u0000\u0000\u0000\u00ef\u00e9\u0001\u0000\u0000\u0000"+
		"\u00ef\u00ec\u0001\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f2\u001f\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0005\u001e\u0000\u0000\u00f5\u00f6\u00059\u0000\u0000\u00f6"+
		"\u00f7\u0005\u0013\u0000\u0000\u00f7\u00f8\u0003\"\u0011\u0000\u00f8\u00f9"+
		"\u0005\u0004\u0000\u0000\u00f9!\u0001\u0000\u0000\u0000\u00fa\u00fd\u0003"+
		"\u0002\u0001\u0000\u00fb\u00fd\u0003\u0006\u0003\u0000\u00fc\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fd\u0100\u0001"+
		"\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001"+
		"\u0000\u0000\u0000\u00ff#\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000"+
		"\u0000\u0000\u001d*-38?CLSXcgmw{\u008a\u008c\u0094\u0099\u009f\u00b0\u00ba"+
		"\u00c0\u00ca\u00d2\u00de\u00ef\u00f1\u00fc\u00fe";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}