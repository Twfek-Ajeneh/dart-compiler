package compiler;

import compiler.ast.Program;
import compiler.visitors.AstDartVisitor;
import gen.DartLexer;
import gen.DartParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
    public static void main(String[] args) throws Exception {
            String filePath = "C:\\Users\\Twfek Ajeneh\\Desktop\\Collage\\Forth year\\Chapter one\\Practical\\Compiler\\Final-Project\\dart-compiler\\src\\compiler\\tests/test1.txt";
            CharStream input = CharStreams.fromFileName(filePath);
            DartLexer lexer = new DartLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            DartParser parser = new DartParser(tokens);
            ParseTree tree = parser.program();
            AstDartVisitor astDartVisitor = new AstDartVisitor();
            Program root = (Program) astDartVisitor.visit(tree);
            astDartVisitor.getSymbolTable();
            astDartVisitor.generateAstPng();
//            System.out.print(root.toString());
//            DartParserVisitor dartParserVisitor = new DartParserVisitor();
//            AstNode root = dartParserVisitor.visit(tree);
//            dartParserVisitor.getSymbolTable();
//            AstNode.printTree(root);
    }
}