package compiler.ast.dartStatement;

import compiler.utils.Edge;
import org.jgrapht.graph.DefaultDirectedGraph;

public class ImportStatement extends Statement {
    private final String importPath;
    private final String alias;

    public ImportStatement(int lineNumber, String value, String importPath, String alias) {
        super(lineNumber, value);
        this.importPath = importPath;
        this.alias = alias;
    }

    public ImportStatement(int lineNumber, String value, String importPath) {
        super(lineNumber, value);
        this.importPath = importPath;
        this.alias = "";
    }

    public void addToTree(DefaultDirectedGraph<Object, Edge> directedGraph){
        directedGraph.addVertex(this);
        directedGraph.addVertex(this.importPath);
        directedGraph.addVertex(this.alias);
        directedGraph.addEdge(this , this.importPath);
        directedGraph.addEdge(this , this.alias);
    }

    public String toString() {
        return "Import Statement{" +
                "lineNumber =" + lineNumber +
                '}';
    }
}
