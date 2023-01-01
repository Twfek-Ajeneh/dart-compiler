package compiler;

import compiler.visitors.DartParserVisitor;
import gen.DartLexer;
import gen.DartParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
    public static void main(String[] args) throws Exception {
            String filePath = "C:\\Users\\DIGI TECH\\IdeaProjects\\dart-compiler\\src\\compiler/hello.txt";
            CharStream input = CharStreams.fromFileName(filePath);
            DartLexer lexer = new DartLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            DartParser parser = new DartParser(tokens);
            ParseTree tree = parser.program();
            DartParserVisitor dartParserVisitor = new DartParserVisitor();
            AstNode root = dartParserVisitor.visit(tree);
            AstNode.printTree(root);
    }
}