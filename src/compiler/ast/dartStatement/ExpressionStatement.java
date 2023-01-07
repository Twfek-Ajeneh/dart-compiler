package compiler.ast.dartStatement;

import compiler.utils.Edge;
import org.jgrapht.graph.DefaultDirectedGraph;

public class ExpressionStatement extends Statement {
    public ExpressionStatement(int lineNumber, String value) {
        super(lineNumber, value);
    }


    public void addToTree(DefaultDirectedGraph<Object, Edge> directedGraph){
        directedGraph.addVertex(this);
    }

    @Override
    public String toString() {
        return "Expression Statement{" +
                "lineNumber =" + lineNumber +
                "value = " + value +
                '}';
    }
}
