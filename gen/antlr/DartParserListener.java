// Generated from java-escape by ANTLR 4.11.1
package antlr;
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
	 * Enter a parse tree produced by {@link DartParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(DartParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(DartParser.DeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link DartParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(DartParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(DartParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#argumentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArgumentDeclaration(DartParser.ArgumentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#argumentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArgumentDeclaration(DartParser.ArgumentDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link DartParser#blockBody}.
	 * @param ctx the parse tree
	 */
	void enterBlockBody(DartParser.BlockBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#blockBody}.
	 * @param ctx the parse tree
	 */
	void exitBlockBody(DartParser.BlockBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(DartParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(DartParser.ClassBodyContext ctx);
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
	 * Enter a parse tree produced by {@link DartParser#assignableExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignableExpression(DartParser.AssignableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#assignableExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignableExpression(DartParser.AssignableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#variablesExpression}.
	 * @param ctx the parse tree
	 */
	void enterVariablesExpression(DartParser.VariablesExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#variablesExpression}.
	 * @param ctx the parse tree
	 */
	void exitVariablesExpression(DartParser.VariablesExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#conditionExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionExpression(DartParser.ConditionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#conditionExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionExpression(DartParser.ConditionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void enterForExpression(DartParser.ForExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void exitForExpression(DartParser.ForExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#whileExpression}.
	 * @param ctx the parse tree
	 */
	void enterWhileExpression(DartParser.WhileExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#whileExpression}.
	 * @param ctx the parse tree
	 */
	void exitWhileExpression(DartParser.WhileExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void enterIfExpression(DartParser.IfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void exitIfExpression(DartParser.IfExpressionContext ctx);
}