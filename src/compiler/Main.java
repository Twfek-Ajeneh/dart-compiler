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

public class Main {
    public static void main(String[] args) throws Exception {
            // path of file to parse
            String filePath = "C:\\Users\\Twfek Ajeneh\\Desktop\\Collage\\Forth year\\Chapter one\\Practical\\Compiler\\Final-Project\\dart-compiler\\src\\compiler\\tests/test3.txt";

            // get token from lexer
            CharStream input = CharStreams.fromFileName(filePath);
            DartLexer lexer = new DartLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // parse the token and get the tree
            DartParser parser = new DartParser(tokens);
            ParseTree tree = parser.program();

            // visit the tree by visitor and get the root
            AstDartVisitor astDartVisitor = new AstDartVisitor();
            Program root = (Program) astDartVisitor.visit(tree);

            // print symbol table and Ast TREE
            astDartVisitor.getSymbolTable();
            astDartVisitor.dfs();
            //astDartVisitor.generateAstPng();

            // try another visitor on the parser tree
            // DartParserVisitor dartParserVisitor = new DartParserVisitor();
            // AstNode root = dartParserVisitor.visit(tree);
            // dartParserVisitor.getSymbolTable();
            // AstNode.printTree(root);
    }
}