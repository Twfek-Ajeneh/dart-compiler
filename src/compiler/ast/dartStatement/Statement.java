package compiler.ast.dartStatement;

import compiler.utils.Edge;
import org.jgrapht.graph.DefaultDirectedGraph;

public class Statement {
    protected final int lineNumber;
    protected final String value;

    public Statement(int lineNumber, String value) {
        this.lineNumber = lineNumber;
        this.value = value;
    }

    public void addToTree(DefaultDirectedGraph<Object, Edge> directedGraph){
        directedGraph.addVertex(this);
    }

    @Override
    public String toString() {
        return "Statement{" +
                "lineNumber=" + lineNumber +
                '}';
    }
}
