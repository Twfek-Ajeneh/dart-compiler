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
        String importPathKey = getKey(importPath) , aliasKey = getKey(alias);
        directedGraph.addVertex(this);
        directedGraph.addVertex(importPathKey);
        directedGraph.addVertex(aliasKey);
        directedGraph.addEdge(this , importPathKey);
        directedGraph.addEdge(this , aliasKey);
    }

    public String toString() {
        return date.getTime() + "\nImport Statement{" +
                "lineNumber =" + lineNumber +
                '}';
    }
}
