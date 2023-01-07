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
        beginStatement.addToTree(directedGraph);
        directedGraph.addEdge(this, this.beginStatement);
        condition.addToTree(directedGraph);
        directedGraph.addEdge(this, this.condition);
        endStatement.addToTree(directedGraph);
        directedGraph.addEdge(this, this.endStatement);
        for (Statement item : body) {
            item.addToTree(directedGraph);
            directedGraph.addEdge(this, item);
        }
    }

    public String toString() {
        return date.getTime() + "\nFor Statement{" +
                "lineNumber =" + lineNumber +
                '}';
    }
}
