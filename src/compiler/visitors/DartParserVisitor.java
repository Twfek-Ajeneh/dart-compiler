package compiler.visitors;

import compiler.AstNode;
import gen.DartParser;
import gen.DartParserBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;

public class DartParserVisitor extends DartParserBaseVisitor<AstNode> {
    @Override
    public AstNode visitProgram(DartParser.ProgramContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode("program", null, ctx.start.getLine(), arrayList);
    }

    @Override
    public AstNode visitFunctionDeclaration(DartParser.FunctionDeclarationContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode("functionDeclaration", null, ctx.start.getLine(), arrayList);
    }

    @Override
    public AstNode visitImportStatement(DartParser.ImportStatementContext ctx) {
        ArrayList<AstNode> arrayList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            arrayList.add(visit(child));
        }
        return new AstNode("importStatement", null, ctx.start.getLine(), arrayList);
    }
}
