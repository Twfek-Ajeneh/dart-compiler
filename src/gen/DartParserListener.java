// Generated from java-escape by ANTLR 4.11.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DartParser}.
 */
public interface DartParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DartParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DartParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DartParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#semiColonStatement}.
	 * @param ctx the parse tree
	 */
	void enterSemiColonStatement(DartParser.SemiColonStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#semiColonStatement}.
	 * @param ctx the parse tree
	 */
	void exitSemiColonStatement(DartParser.SemiColonStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#nonSemiColonStatement}.
	 * @param ctx the parse tree
	 */
	void enterNonSemiColonStatement(DartParser.NonSemiColonStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#nonSemiColonStatement}.
	 * @param ctx the parse tree
	 */
	void exitNonSemiColonStatement(DartParser.NonSemiColonStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DartParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DartParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(DartParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(DartParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatement(DartParser.VariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatement(DartParser.VariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#finalConstVarOrType}.
	 * @param ctx the parse tree
	 */
	void enterFinalConstVarOrType(DartParser.FinalConstVarOrTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#finalConstVarOrType}.
	 * @param ctx the parse tree
	 */
	void exitFinalConstVarOrType(DartParser.FinalConstVarOrTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#varOrType}.
	 * @param ctx the parse tree
	 */
	void enterVarOrType(DartParser.VarOrTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#varOrType}.
	 * @param ctx the parse tree
	 */
	void exitVarOrType(DartParser.VarOrTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#declaredIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclaredIdentifier(DartParser.DeclaredIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#declaredIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclaredIdentifier(DartParser.DeclaredIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#variablesDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariablesDeclaration(DartParser.VariablesDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#variablesDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariablesDeclaration(DartParser.VariablesDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#initializedVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInitializedVariableDeclaration(DartParser.InitializedVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#initializedVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInitializedVariableDeclaration(DartParser.InitializedVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#initializedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterInitializedIdentifier(DartParser.InitializedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#initializedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitInitializedIdentifier(DartParser.InitializedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#initializedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterInitializedIdentifierList(DartParser.InitializedIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#initializedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitInitializedIdentifierList(DartParser.InitializedIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#functionSignature}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSignature(DartParser.FunctionSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#functionSignature}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSignature(DartParser.FunctionSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(DartParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(DartParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#namedParameters}.
	 * @param ctx the parse tree
	 */
	void enterNamedParameters(DartParser.NamedParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#namedParameters}.
	 * @param ctx the parse tree
	 */
	void exitNamedParameters(DartParser.NamedParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#normalFormalParameters}.
	 * @param ctx the parse tree
	 */
	void enterNormalFormalParameters(DartParser.NormalFormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#normalFormalParameters}.
	 * @param ctx the parse tree
	 */
	void exitNormalFormalParameters(DartParser.NormalFormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#normalFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterNormalFormalParameter(DartParser.NormalFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#normalFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitNormalFormalParameter(DartParser.NormalFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#functionBlock}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBlock(DartParser.FunctionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#functionBlock}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBlock(DartParser.FunctionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(DartParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(DartParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(DartParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(DartParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(DartParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(DartParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#positionalArguments}.
	 * @param ctx the parse tree
	 */
	void enterPositionalArguments(DartParser.PositionalArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#positionalArguments}.
	 * @param ctx the parse tree
	 */
	void exitPositionalArguments(DartParser.PositionalArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#namedArguments}.
	 * @param ctx the parse tree
	 */
	void enterNamedArguments(DartParser.NamedArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#namedArguments}.
	 * @param ctx the parse tree
	 */
	void exitNamedArguments(DartParser.NamedArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#namedArgument}.
	 * @param ctx the parse tree
	 */
	void enterNamedArgument(DartParser.NamedArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#namedArgument}.
	 * @param ctx the parse tree
	 */
	void exitNamedArgument(DartParser.NamedArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(DartParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(DartParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(DartParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(DartParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#classBlock}.
	 * @param ctx the parse tree
	 */
	void enterClassBlock(DartParser.ClassBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#classBlock}.
	 * @param ctx the parse tree
	 */
	void exitClassBlock(DartParser.ClassBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#classMemberDefinition}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDefinition(DartParser.ClassMemberDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#classMemberDefinition}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDefinition(DartParser.ClassMemberDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#classConstructor}.
	 * @param ctx the parse tree
	 */
	void enterClassConstructor(DartParser.ClassConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#classConstructor}.
	 * @param ctx the parse tree
	 */
	void exitClassConstructor(DartParser.ClassConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#classConstructorBody}.
	 * @param ctx the parse tree
	 */
	void enterClassConstructorBody(DartParser.ClassConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#classConstructorBody}.
	 * @param ctx the parse tree
	 */
	void exitClassConstructorBody(DartParser.ClassConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DartParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DartParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#operationExpression}.
	 * @param ctx the parse tree
	 */
	void enterOperationExpression(DartParser.OperationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#operationExpression}.
	 * @param ctx the parse tree
	 */
	void exitOperationExpression(DartParser.OperationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(DartParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(DartParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(DartParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(DartParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(DartParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(DartParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void enterListLiteral(DartParser.ListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void exitListLiteral(DartParser.ListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#objectContent}.
	 * @param ctx the parse tree
	 */
	void enterObjectContent(DartParser.ObjectContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#objectContent}.
	 * @param ctx the parse tree
	 */
	void exitObjectContent(DartParser.ObjectContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(DartParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(DartParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(DartParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(DartParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(DartParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(DartParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(DartParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(DartParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#elseIfBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseIfBlock(DartParser.ElseIfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#elseIfBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseIfBlock(DartParser.ElseIfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#statementsBlock}.
	 * @param ctx the parse tree
	 */
	void enterStatementsBlock(DartParser.StatementsBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#statementsBlock}.
	 * @param ctx the parse tree
	 */
	void exitStatementsBlock(DartParser.StatementsBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#breakContinueStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakContinueStatement(DartParser.BreakContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#breakContinueStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakContinueStatement(DartParser.BreakContinueStatementContext ctx);
}