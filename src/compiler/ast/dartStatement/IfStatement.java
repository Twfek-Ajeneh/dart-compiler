package compiler.ast.dartStatement;

import compiler.utils.Edge;
import org.jgrapht.graph.DefaultDirectedGraph;

import java.util.ArrayList;

public class IfStatement extends Statement {
    private final ExpressionStatement condition;
    private final ArrayList<Statement> body;
    private final ArrayList<Statement> elseBlock;

    public IfStatement(int lineNumber, String value, ExpressionStatement condition, ArrayList<Statement> body, ArrayList<Statement> elseBlock) {
        super(lineNumber, value);
        this.condition = condition;
        this.body = body;
        this.elseBlock = elseBlock;
    }

    public void addToTree(DefaultDirectedGraph<Object, Edge> directedGraph){
        directedGraph.addVertex(this);
        directedGraph.addEdge(this , this.condition);
        for (Statement item : body) {
            directedGraph.addEdge(this , item);
        }
        for (Statement item : elseBlock) {
            directedGraph.addEdge(this , item);
        }
    }

    public String toString() {
        return "IF Statement{" +
                "lineNumber =" + lineNumber +
                '}';
    }
}
