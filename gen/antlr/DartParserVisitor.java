// Generated from java-escape by ANTLR 4.11.1
package antlr;
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
	 * Visit a parse tree produced by {@link DartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(DartParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#variablesDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariablesDeclaration(DartParser.VariablesDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(DartParser.ParameterDeclarationContext ctx);
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
	 * Visit a parse tree produced by {@link DartParser#blockBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockBody(DartParser.BlockBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(DartParser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#conditionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionExpression(DartParser.ConditionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#assignableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignableExpression(DartParser.AssignableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#variablesExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariablesExpression(DartParser.VariablesExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#forExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpression(DartParser.ForExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#whileExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileExpression(DartParser.WhileExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#ifExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpression(DartParser.IfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(DartParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#listLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListLiteral(DartParser.ListLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(DartParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(DartParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(DartParser.ClassBodyContext ctx);
}