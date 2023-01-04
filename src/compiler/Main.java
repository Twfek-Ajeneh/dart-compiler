package compiler;

import compiler.ast.Program;
import compiler.visitors.AstDartVisitor;
import compiler.visitors.DartParserVisitor;
import gen.DartLexer;
import gen.DartParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.function.DoubleToIntFunction;

public class Main {
    public static void main(String[] args) throws Exception {
            String filePath = "C:\\Users\\Twfek Ajeneh\\Desktop\\Collage\\Forth year\\Chapter one\\Practical\\Compiler\\Final-Project\\dart-compiler\\src\\compiler\\tests/test2.txt";
            CharStream input = CharStreams.fromFileName(filePath);
            DartLexer lexer = new DartLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            DartParser parser = new DartParser(tokens);
            ParseTree tree = parser.program();
            //DartParserVisitor dartParserVisitor = new DartParserVisitor();
            AstDartVisitor astDartVisitor = new AstDartVisitor();
            Program root = (Program) astDartVisitor.visit(tree);
            System.out.print(root.toString());
//            AstNode root = dartParserVisitor.visit(tree);
//            dartParserVisitor.getSymbolTable();
//            AstNode.printTree(root);
    }
}