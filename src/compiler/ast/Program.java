package compiler.ast;

import compiler.ast.dartStatement.ImportStatement;
import compiler.ast.dartStatement.Statement;

import java.util.ArrayList;

public class Program {
    private final ArrayList<ImportStatement> importsStatement;
    private final ArrayList<DartFunction> functions;
    private final ArrayList<DartClass> classes;
    private final String value;

    public Program(ArrayList<ImportStatement> importsStatement, ArrayList<DartFunction> functions, ArrayList<DartClass> classes , String value) {
        this.importsStatement = importsStatement;
        this.functions = functions;
        this.classes = classes;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Program{" +
                "  \n importsStatement=" + importsStatement.size() +
                "  \n functions=" + functions.size() +
                "  \n classes=" + classes.size() +
                "  \n value='" + value + '\'' +
                "\n}";
    }
}
