package compiler.ast;

import compiler.ast.dartStatement.ImportStatement;
import compiler.ast.dartStatement.Statement;
import compiler.utils.Edge;
import org.jgrapht.graph.DefaultDirectedGraph;

import java.util.ArrayList;
import java.util.Date;

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

    public void addToTree(DefaultDirectedGraph<Object, Edge> directedGraph){
        directedGraph.addVertex(this);
        for (ImportStatement anImport : importsStatement) {
            directedGraph.addEdge(this, anImport);
        }
        for (DartFunction function : functions) {
            directedGraph.addEdge(this,function);
        }
        for (DartClass aClass : classes) {
            directedGraph.addEdge(this, aClass);
        }
    }


    @Override
    public String toString() {
        return  (new Date()).getTime() + "\nProgram{" +
                "  \n Number of import =" + importsStatement.size() +
                "  \n Number of functions=" + functions.size() +
                "  \n Number of classes=" + classes.size() +
                "\n}";
    }
}
