package compiler.ast.dartStatement;

import compiler.utils.Edge;
import org.jgrapht.graph.DefaultDirectedGraph;

import java.util.ArrayList;

public class ForStatement extends Statement {
    private final Statement beginStatement;
    private final ExpressionStatement condition;
    private final Statement endStatement;
    private final ArrayList<Statement> body;

    public ForStatement(int lineNumber, String value, Statement beginStatement, ExpressionStatement condition, Statement endStatement, ArrayList<Statement> body) {
        super(lineNumber, value);
        this.beginStatement = beginStatement;
        this.condition = condition;
        this.endStatement = endStatement;
        this.body = body;
    }

    public void addToTree(DefaultDirectedGraph<Object, Edge> directedGraph){
        directedGraph.addVertex(this);
        directedGraph.addEdge(this, this.beginStatement);
        directedGraph.addEdge(this, this.condition);
        directedGraph.addEdge(this, this.endStatement);
        for (Statement item : body) {
            directedGraph.addEdge(this, item);
        }
    }

    public String toString() {
        return "For Statement{" +
                "lineNumber =" + lineNumber +
                '}';
    }
}
