// Generated from java-escape by ANTLR 4.11.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DartParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DartParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DartParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DartParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#semiColonStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemiColonStatement(DartParser.SemiColonStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#nonSemiColonStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonSemiColonStatement(DartParser.NonSemiColonStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DartParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(DartParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#variableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableStatement(DartParser.VariableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#finalConstVarOrType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalConstVarOrType(DartParser.FinalConstVarOrTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#varOrType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarOrType(DartParser.VarOrTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#declaredIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaredIdentifier(DartParser.DeclaredIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#variablesDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariablesDeclaration(DartParser.VariablesDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#initializedVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializedVariableDeclaration(DartParser.InitializedVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#initializedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializedIdentifier(DartParser.InitializedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#initializedIdentifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializedIdentifierList(DartParser.InitializedIdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#functionSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSignature(DartParser.FunctionSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(DartParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#namedParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedParameters(DartParser.NamedParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#normalFormalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalFormalParameters(DartParser.NormalFormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#normalFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalFormalParameter(DartParser.NormalFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#functionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBlock(DartParser.FunctionBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(DartParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(DartParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(DartParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#positionalArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionalArguments(DartParser.PositionalArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#namedArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedArguments(DartParser.NamedArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#namedArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedArgument(DartParser.NamedArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(DartParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(DartParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#classBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBlock(DartParser.ClassBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#classMemberDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDefinition(DartParser.ClassMemberDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#classConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassConstructor(DartParser.ClassConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#classConstructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassConstructorBody(DartParser.ClassConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(DartParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#operationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationExpression(DartParser.OperationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(DartParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(DartParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(DartParser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#listLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListLiteral(DartParser.ListLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#objectContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectContent(DartParser.ObjectContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(DartParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(DartParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(DartParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(DartParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#elseIfBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfBlock(DartParser.ElseIfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#statementsBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementsBlock(DartParser.StatementsBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#breakContinueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakContinueStatement(DartParser.BreakContinueStatementContext ctx);
}