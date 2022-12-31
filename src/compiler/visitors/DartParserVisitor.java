package compiler.visitors;

import gen.DartParser;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class DartParserVisitor implements gen.DartParserVisitor<Object> {
    @Override
    public Object visitProgram(DartParser.ProgramContext ctx) {
        return null;
    }

    @Override
    public Object visitDeclaration(DartParser.DeclarationContext ctx) {
        return null;
    }

    @Override
    public Object visitVariablesDeclaration(DartParser.VariablesDeclarationContext ctx) {
        return null;
    }

    @Override
    public Object visitParameterDeclaration(DartParser.ParameterDeclarationContext ctx) {
        return null;
    }

    @Override
    public Object visitArgumentDeclaration(DartParser.ArgumentDeclarationContext ctx) {
        return null;
    }

    @Override
    public Object visitClassDeclaration(DartParser.ClassDeclarationContext ctx) {
        return null;
    }

    @Override
    public Object visitClassConstructor(DartParser.ClassConstructorContext ctx) {
        return null;
    }

    @Override
    public Object visitFunctionDeclaration(DartParser.FunctionDeclarationContext ctx) {
        return null;
    }

    @Override
    public Object visitFunctionCall(DartParser.FunctionCallContext ctx) {
        return null;
    }

    @Override
    public Object visitLiteral(DartParser.LiteralContext ctx) {
        return null;
    }

    @Override
    public Object visitObjectLiteral(DartParser.ObjectLiteralContext ctx) {
        return null;
    }

    @Override
    public Object visitObjectContent(DartParser.ObjectContentContext ctx) {
        return null;
    }

    @Override
    public Object visitListLiteral(DartParser.ListLiteralContext ctx) {
        return null;
    }

    @Override
    public Object visitOperation(DartParser.OperationContext ctx) {
        return null;
    }

    @Override
    public Object visitBlockBody(DartParser.BlockBodyContext ctx) {
        return null;
    }

    @Override
    public Object visitClassBody(DartParser.ClassBodyContext ctx) {
        return null;
    }

    @Override
    public Object visitStatement(DartParser.StatementContext ctx) {
        return null;
    }

    @Override
    public Object visitImportStatement(DartParser.ImportStatementContext ctx) {
        return null;
    }

    @Override
    public Object visitExpression(DartParser.ExpressionContext ctx) {
        return null;
    }

    @Override
    public Object visitAssignableExpression(DartParser.AssignableExpressionContext ctx) {
        return null;
    }

    @Override
    public Object visitVariablesExpression(DartParser.VariablesExpressionContext ctx) {
        return null;
    }

    @Override
    public Object visitConditionExpression(DartParser.ConditionExpressionContext ctx) {
        return null;
    }

    @Override
    public Object visitForExpression(DartParser.ForExpressionContext ctx) {
        return null;
    }

    @Override
    public Object visitWhileExpression(DartParser.WhileExpressionContext ctx) {
        return null;
    }

    @Override
    public Object visitIfExpression(DartParser.IfExpressionContext ctx) {
        return null;
    }

    @Override
    public Object visit(ParseTree parseTree) {
        return null;
    }

    @Override
    public Object visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public Object visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public Object visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
