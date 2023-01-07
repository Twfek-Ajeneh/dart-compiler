package compiler.ast.dartStatement;

import compiler.utils.Edge;
import org.jgrapht.graph.DefaultDirectedGraph;

import java.util.ArrayList;

public class WhileStatement extends Statement{
    private final ExpressionStatement condition;
    private final ArrayList<Statement> body;

    public WhileStatement(int lineNumber, String value, ExpressionStatement condition, ArrayList<Statement> body) {
        super(lineNumber, value);
        this.condition = condition;
        this.body = body;
    }

    public void addToTree(DefaultDirectedGraph<Object, Edge> directedGraph){
        directedGraph.addVertex(this);
        directedGraph.addEdge(this, this.condition);
        for (Statement item : body) {
            directedGraph.addEdge(this , item);
        }
    }

    public String toString() {
        return date.getTime() + "\nWhile Statement{" +
                "lineNumber =" + lineNumber +
                '}';
    }
}
