package compiler.visitors;

import compiler.AstNode;
import compiler.Type;
import gen.DartParser;
import gen.DartParserBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;

public class DartParserVisitor extends DartParserBaseVisitor<AstNode> {

    HashMap <String,String> symbolTable = new HashMap<>();

    public void getSymbolTable (){
        for (String key : symbolTable.keySet()) {
            System.out.println(key + " : " + symbolTable.get(key));
        }
    }

    @Override
    public AstNode visitProgram(DartParser.ProgramContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Program, null, ctx.start.getLine(), ctx.getText() , arrayList);
    }

    @Override
    public AstNode visitFunctionDeclaration(DartParser.FunctionDeclarationContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Function_Declaration, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitImportStatement(DartParser.ImportStatementContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Statements, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitSemiColonStatement(DartParser.SemiColonStatementContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Statements, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitStatement(DartParser.StatementContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Statements, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitType(DartParser.TypeContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Other, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitFinalConstVarOrType(DartParser.FinalConstVarOrTypeContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Other, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitVarOrType(DartParser.VarOrTypeContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Other, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitDeclaredIdentifier(DartParser.DeclaredIdentifierContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        symbolTable.put(ctx.IDENTIFIER().getText(),null);
        return new AstNode(Type.Variables, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitVariablesDeclaration(DartParser.VariablesDeclarationContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        for (TerminalNode variable : ctx.IDENTIFIER())
            symbolTable.put(variable.getText(),null);
        return new AstNode(Type.Variables, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitInitializedVariableDeclaration(DartParser.InitializedVariableDeclarationContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        if(ctx.getChild(2) != null)
            symbolTable.put(ctx.declaredIdentifier().IDENTIFIER().getText(),ctx.getChild(2).getText());
        else
            symbolTable.put(ctx.declaredIdentifier().IDENTIFIER().getText(),null);
        return new AstNode(Type.Variables, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitNonSemiColonStatement(DartParser.NonSemiColonStatementContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Statements, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitVariableStatement(DartParser.VariableStatementContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Statements, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitInitializedIdentifier(DartParser.InitializedIdentifierContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        if(ctx.getChild(2) != null)
            symbolTable.put(ctx.IDENTIFIER().getText(),ctx.getChild(2).getText());
        else
            symbolTable.put(ctx.IDENTIFIER().getText(),null);
        return new AstNode(Type.Variables, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitInitializedIdentifierList(DartParser.InitializedIdentifierListContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Variables, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitFunctionSignature(DartParser.FunctionSignatureContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Function_Declaration, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitParameters(DartParser.ParametersContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Function_Declaration, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitNamedParameters(DartParser.NamedParametersContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Function_Declaration, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitNormalFormalParameters(DartParser.NormalFormalParametersContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Function_Declaration, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitNormalFormalParameter(DartParser.NormalFormalParameterContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Function_Declaration, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitFunctionCall(DartParser.FunctionCallContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Function_Declaration, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitFunctionBlock(DartParser.FunctionBlockContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Function_Declaration, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitArguments(DartParser.ArgumentsContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Function_Declaration, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitPositionalArguments(DartParser.PositionalArgumentsContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Function_Declaration, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitNamedArguments(DartParser.NamedArgumentsContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Function_Declaration, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitNamedArgument(DartParser.NamedArgumentContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Function_Declaration, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitClassDeclaration(DartParser.ClassDeclarationContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Class_Declaration, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitClassBlock(DartParser.ClassBlockContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Class_Declaration, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

//    @Override
//    public AstNode visitClassMemberDefinition(DartParser.ClassMemberDefinitionContext ctx) {
//        ArrayList<AstNode> arrayList = new ArrayList<>();
//        for (ParseTree child : ctx.children) {
//            arrayList.add(visit(child));
//        }
//        return new AstNode(Type.Class_Declaration, null, ctx.start.getLine(), ctx.getText(), arrayList);
//    }

    @Override
    public AstNode visitClassConstructor(DartParser.ClassConstructorContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Class_Declaration, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitClassConstructorBody(DartParser.ClassConstructorBodyContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Class_Declaration, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitExpression(DartParser.ExpressionContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Statements, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitOperationExpression(DartParser.OperationExpressionContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Statements, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitConditionalExpression(DartParser.ConditionalExpressionContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Statements, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitLiteral(DartParser.LiteralContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Literals, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitObjectLiteral(DartParser.ObjectLiteralContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Literals, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitListLiteral(DartParser.ListLiteralContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Literals, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitObjectContent(DartParser.ObjectContentContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Other, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitOperation(DartParser.OperationContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Statements, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitForStatement(DartParser.ForStatementContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Statements, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitWhileStatement(DartParser.WhileStatementContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Statements, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitIfStatement(DartParser.IfStatementContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Statements, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitElseIfBlock(DartParser.ElseIfBlockContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Statements, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitStatementsBlock(DartParser.StatementsBlockContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Statements, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

    @Override
    public AstNode visitBreakContinueStatement(DartParser.BreakContinueStatementContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode(Type.Statements, null, ctx.start.getLine(), ctx.getText(), arrayList);
    }

}
