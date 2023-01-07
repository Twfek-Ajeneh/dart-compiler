package compiler.visitors;

import com.mxgraph.layout.mxCircleLayout;
import com.mxgraph.layout.mxIGraphLayout;
import com.mxgraph.util.mxCellRenderer;
import compiler.ast.DartClass;
import compiler.ast.DartFunction;
import compiler.ast.Program;
import compiler.ast.dartStatement.*;

import compiler.utils.Edge;
import gen.DartParser;
import gen.DartParser.ImportStatementContext;
import gen.DartParserBaseVisitor;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.jgrapht.ext.JGraphXAdapter;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.traverse.DepthFirstIterator;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class AstDartVisitor extends DartParserBaseVisitor<Object> {

    DefaultDirectedGraph<Object, Edge> directedGraph = new DefaultDirectedGraph<>(Edge.class);

    HashMap<String, String> symbolTable = new HashMap<>();

    public void getSymbolTable() {
        for (String key : symbolTable.keySet()) {
            System.out.println(key + " : " + symbolTable.get(key));
        }
    }

    public void dfs() {
        Iterator<Object> iterator = new DepthFirstIterator<>(directedGraph);
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next.toString());
            System.out.println("==========================");
        }
    }

    public void generateAstPng() throws IOException {
        JGraphXAdapter<Object, Edge> graphAdapter = new JGraphXAdapter<>(directedGraph);
        mxIGraphLayout layout = new mxCircleLayout(graphAdapter);
        layout.execute(graphAdapter.getDefaultParent());
        BufferedImage image =
                mxCellRenderer.createBufferedImage(graphAdapter, null, 2, Color.WHITE, true, null);
        File imgFile = new File("D:/graph.png");
        ImageIO.write(image, "PNG", imgFile);
    }

    @Override
    public Program visitProgram(DartParser.ProgramContext ctx) {
        ArrayList<ImportStatement> imports = new ArrayList<>();
        ArrayList<DartFunction> functions = new ArrayList<>();
        ArrayList<DartClass> classes = new ArrayList<>();
        for (ImportStatementContext item : ctx.importStatement()) {
            ImportStatement importStatement = visitImportStatement(item);
            imports.add(importStatement);

        }
        for (DartParser.FunctionDeclarationContext item : ctx.functionDeclaration()) {
            DartFunction dartFunction = visitFunctionDeclaration(item);
            functions.add(dartFunction);

        }
        for (DartParser.ClassDeclarationContext item : ctx.classDeclaration()) {
            DartClass dartClass = visitClassDeclaration(item);
            classes.add(dartClass);
        }
        Program program = new Program(imports, functions, classes, ctx.getText());
        program.addToTree(directedGraph);
        return program;
    }

    @Override
    public ArrayList<Statement> visitSemiColonStatement(DartParser.SemiColonStatementContext ctx) {
        ArrayList<Statement> list = visitStatement(ctx.statement());
        return list;
    }

    @Override
    public Statement visitNonSemiColonStatement(DartParser.NonSemiColonStatementContext ctx) {
        Statement statement = (Statement) visit(ctx.getChild(0));
        return statement;
    }

    @Override
    public ArrayList<Statement> visitStatement(DartParser.StatementContext ctx) {
        ArrayList<Statement> list = new ArrayList<>();
        if (ctx.variableStatement() != null) list.addAll(visitVariableStatement(ctx.variableStatement()));
        if (ctx.expression() != null) list.add(visitExpression(ctx.expression()));
        return list;
    }

    @Override
    public String visitType(DartParser.TypeContext ctx) {
        return ctx.getText();
    }

    @Override
    public ArrayList<VariableStatement> visitVariableStatement(DartParser.VariableStatementContext ctx) {
        ArrayList<VariableStatement> list = new ArrayList<>();
        if (ctx.variablesDeclaration() != null) {
            list.addAll(visitVariablesDeclaration(ctx.variablesDeclaration()));
        } else if (ctx.initializedVariableDeclaration() != null) {
            list.addAll(visitInitializedVariableDeclaration(ctx.initializedVariableDeclaration()));
        } else {
            list.addAll(visitInitializedIdentifierList(ctx.initializedIdentifierList()));
        }
        for (VariableStatement statement : list) {
            symbolTable.put(statement.getName(), statement.getVariableValue());
        }
        return list;
    }

    @Override
    public String visitFinalConstVarOrType(DartParser.FinalConstVarOrTypeContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitVarOrType(DartParser.VarOrTypeContext ctx) {
        return ctx.getText();
    }

    @Override
    //          type   , name
    public Pair<String, String> visitDeclaredIdentifier(DartParser.DeclaredIdentifierContext ctx) {
        String type = ctx.finalConstVarOrType().getText();
        String name = ctx.IDENTIFIER().getText();
        return new Pair<String, String>(type, name);
    }

    @Override
    public ArrayList<VariableStatement> visitVariablesDeclaration(DartParser.VariablesDeclarationContext ctx) {
        ArrayList<VariableStatement> list = new ArrayList<>();
        Pair<String, String> firstDeclare = visitDeclaredIdentifier(ctx.declaredIdentifier());
        list.add(new VariableStatement(ctx.start.getLine(), ctx.getText(), firstDeclare.a, firstDeclare.b, ""));
        for (TerminalNode item : ctx.IDENTIFIER()) {
            list.add(new VariableStatement(ctx.start.getLine(), ctx.getText(), firstDeclare.a, item.getText(), ""));
        }

        return list;
    }

    @Override
    public ArrayList<VariableStatement> visitInitializedVariableDeclaration(DartParser.InitializedVariableDeclarationContext ctx) {
        ArrayList<VariableStatement> list = new ArrayList<>();
        Pair<String, String> firstDeclare = visitDeclaredIdentifier(ctx.declaredIdentifier());
        list.add(new VariableStatement(ctx.start.getLine(), ctx.getText(), firstDeclare.a, firstDeclare.b, ctx.expression().getText()));
        for (DartParser.InitializedIdentifierContext item : ctx.initializedIdentifier()) {
            Pair<String, String> temp = visitInitializedIdentifier(item);
            list.add(new VariableStatement(ctx.start.getLine(), ctx.getText(), firstDeclare.a, temp.a, temp.b));
        }
        return list;
    }

    @Override
    //          name     value
    public Pair<String, String> visitInitializedIdentifier(DartParser.InitializedIdentifierContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        String value = "";
        if (ctx.expression() != null) value = ctx.expression().getText();
        return new Pair<String, String>(name, value);
    }

    @Override
    public ArrayList<VariableStatement> visitInitializedIdentifierList(DartParser.InitializedIdentifierListContext ctx) {
        ArrayList<VariableStatement> list = new ArrayList<>();
        for (DartParser.InitializedIdentifierContext item : ctx.initializedIdentifier()) {
            Pair<String, String> temp = visitInitializedIdentifier(item);
            list.add(new VariableStatement(ctx.start.getLine(), ctx.getText(), "", temp.a, temp.b));
        }
        return list;
    }

    @Override
    public ArrayList<String> visitFunctionSignature(DartParser.FunctionSignatureContext ctx) {
        ArrayList<String> list = new ArrayList<>();
        list.add(ctx.type().getText());
        list.add(ctx.IDENTIFIER().getText());
        list.add(ctx.parameters().getText());
        return list;
    }

    @Override
    public String visitParameters(DartParser.ParametersContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitNamedParameters(DartParser.NamedParametersContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitNormalFormalParameters(DartParser.NormalFormalParametersContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitNormalFormalParameter(DartParser.NormalFormalParameterContext ctx) {
        return ctx.getText();
    }

    @Override
    //             body                    returnValue
    public Pair<ArrayList<Statement>, ExpressionStatement> visitFunctionBlock(DartParser.FunctionBlockContext ctx) {
        ExpressionStatement returnValue = new ExpressionStatement(ctx.RETURN_().getSymbol().getLine(), ctx.expression() != null ? ctx.expression().getText() : "");
        ArrayList<Statement> body = new ArrayList<>();
        for (DartParser.NonSemiColonStatementContext item : ctx.nonSemiColonStatement())
            body.add(visitNonSemiColonStatement(item));
        for (DartParser.SemiColonStatementContext item : ctx.semiColonStatement())
            body.addAll(visitSemiColonStatement(item));
        return new Pair<>(body, returnValue);
    }

    @Override
    public DartFunction visitFunctionDeclaration(DartParser.FunctionDeclarationContext ctx) {
        ArrayList<String> functionSignature = visitFunctionSignature(ctx.functionSignature());
        Pair<ArrayList<Statement>, ExpressionStatement> functionBlock = visitFunctionBlock(ctx.functionBlock());
        DartFunction function = new DartFunction(ctx.start.getLine(), ctx.getText(), functionSignature.get(1), functionSignature.get(0), functionSignature.get(2), functionBlock.a, functionBlock.b);
        return function;
    }

    @Override
    public String visitFunctionCall(DartParser.FunctionCallContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitArguments(DartParser.ArgumentsContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitPositionalArguments(DartParser.PositionalArgumentsContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitNamedArguments(DartParser.NamedArgumentsContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitNamedArgument(DartParser.NamedArgumentContext ctx) {
        return ctx.getText();
    }

    @Override
    public ImportStatement visitImportStatement(DartParser.ImportStatementContext ctx) {
        ImportStatement importStatement = (ctx.IDENTIFIER() == null
                    ?  new ImportStatement(ctx.start.getLine(), ctx.getText(), ctx.getChild(2).getText())
                    :  new ImportStatement(ctx.start.getLine(), ctx.getText(), ctx.getChild(1).getText(), ctx.IDENTIFIER().getText())
                );
        return importStatement;
    }

    @Override
    public DartClass visitClassDeclaration(DartParser.ClassDeclarationContext ctx) {
        String parent = ctx.IDENTIFIER().size() > 1 ? ctx.IDENTIFIER().get(1).getText() : "";
        Pair<String, ArrayList<Statement>> constructor = new Pair<>("", new ArrayList<>());
        ArrayList<VariableStatement> variableList = new ArrayList<>();
        ArrayList<DartFunction> functionList = new ArrayList<>();
        if (ctx.classBlock().classConstructor() != null)
            constructor = visitClassConstructor(ctx.classBlock().classConstructor());
        for (DartParser.VariableStatementContext item : ctx.classBlock().variableStatement())
            variableList.addAll(visitVariableStatement(item));
        for (DartParser.FunctionDeclarationContext item : ctx.classBlock().functionDeclaration())
            functionList.add(visitFunctionDeclaration(item));
        DartClass dartClass = new DartClass(
                ctx.start.getLine(),
                ctx.getText(),
                ctx.getChild(1).getText(),
                functionList,
                variableList,
                constructor.a,
                constructor.b,
                parent
        );
        return dartClass;
    }

    @Override
    public String visitClassBlock(DartParser.ClassBlockContext ctx) {
        return ctx.getText();
    }

    @Override
    public Pair<String, ArrayList<Statement>> visitClassConstructor(DartParser.ClassConstructorContext ctx) {
        ArrayList<Statement> body = visitClassConstructorBody(ctx.classConstructorBody());
        String parameters = ctx.parameters().getText();
        return new Pair<String, ArrayList<Statement>>(parameters, body);
    }

    @Override
    public ArrayList<Statement> visitClassConstructorBody(DartParser.ClassConstructorBodyContext ctx) {
        ArrayList<Statement> body = new ArrayList<>();
        for (DartParser.NonSemiColonStatementContext item : ctx.nonSemiColonStatement())
            body.add(visitNonSemiColonStatement(item));
        for (DartParser.SemiColonStatementContext item : ctx.semiColonStatement())
            body.addAll(visitSemiColonStatement(item));
        return body;
    }

    @Override
    public ExpressionStatement visitExpression(DartParser.ExpressionContext ctx) {
        ExpressionStatement expressionStatement = new ExpressionStatement(ctx.start.getLine(), ctx.getText());
        return expressionStatement;
    }

    @Override
    public String visitOperationExpression(DartParser.OperationExpressionContext ctx) {
        return ctx.getText();
    }

    @Override
    public ExpressionStatement visitConditionalExpression(DartParser.ConditionalExpressionContext ctx) {
        ExpressionStatement expressionStatement = new ExpressionStatement(ctx.start.getLine(), ctx.getText());
        return expressionStatement;
    }

    @Override
    public String visitLiteral(DartParser.LiteralContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitObjectLiteral(DartParser.ObjectLiteralContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitListLiteral(DartParser.ListLiteralContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitObjectContent(DartParser.ObjectContentContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitOperation(DartParser.OperationContext ctx) {
        return ctx.getText();
    }

    @Override
    public ForStatement visitForStatement(DartParser.ForStatementContext ctx) {
        Statement beginStatement = visitStatement(ctx.statement().get(0)).get(0);
        Statement endStatement = visitStatement(ctx.statement().get(ctx.statement().size() - 1)).get(0);
        ExpressionStatement condition = visitConditionalExpression(ctx.conditionalExpression());
        ArrayList<Statement> body = visitStatementsBlock(ctx.statementsBlock());
        return new ForStatement(ctx.start.getLine(), ctx.getText(), beginStatement, condition, endStatement, body);
    }

    @Override
    public WhileStatement visitWhileStatement(DartParser.WhileStatementContext ctx) {
        ExpressionStatement condition = visitConditionalExpression(ctx.conditionalExpression());
        ArrayList<Statement> body = visitStatementsBlock(ctx.statementsBlock());
        return new WhileStatement(ctx.start.getLine(), ctx.getText(), condition, body);
    }

    @Override
    public IfStatement visitIfStatement(DartParser.IfStatementContext ctx) {
        ExpressionStatement condition = visitConditionalExpression(ctx.conditionalExpression());
        ArrayList<Statement> body = visitStatementsBlock(ctx.statementsBlock());
        ArrayList<Statement> elseBlock = visitElseIfBlock(ctx.elseIfBlock());

        return new IfStatement(ctx.start.getLine(), ctx.getText(), condition, body, elseBlock);
    }

    @Override
    public ArrayList<Statement> visitElseIfBlock(DartParser.ElseIfBlockContext ctx) {
        ArrayList<Statement> list = new ArrayList<>();
        if (ctx.ifStatement() != null) list.add(visitIfStatement(ctx.ifStatement()));
        if (ctx.statementsBlock() != null)
            list.addAll(visitStatementsBlock(ctx.statementsBlock())); // check return from statement block
        return list;
    }

    @Override
    public ArrayList<Statement> visitStatementsBlock(DartParser.StatementsBlockContext ctx) {
        ArrayList<Statement> list = new ArrayList<>();
        for (DartParser.BreakContinueStatementContext item : ctx.breakContinueStatement())
            list.add(visitBreakContinueStatement(item));
        for (DartParser.NonSemiColonStatementContext item : ctx.nonSemiColonStatement())
            list.add(visitNonSemiColonStatement(item));
        for (DartParser.SemiColonStatementContext item : ctx.semiColonStatement())
            list.addAll(visitSemiColonStatement(item));
        return list;
    }

    @Override
    public Statement visitBreakContinueStatement(DartParser.BreakContinueStatementContext ctx) {
        return new Statement(ctx.start.getLine(), ctx.getText());
    }
}
