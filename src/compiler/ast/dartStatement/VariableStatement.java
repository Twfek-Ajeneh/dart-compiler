package compiler.ast.dartStatement;

import compiler.utils.Edge;
import org.jgrapht.graph.DefaultDirectedGraph;

public class VariableStatement extends Statement{
    private final String type;
    private final String name;
    private final String variableValue;

    public VariableStatement(int lineNumber, String value, String type, String name, String variableValue) {
        super(lineNumber, value);
        this.type = type;
        this.name = name;
        this.variableValue = variableValue;
    }
	
	public String getName(){ return name; }

    public String getVariableValue(){ return variableValue; }

    public void addToTree(DefaultDirectedGraph<Object, Edge> directedGraph){
        directedGraph.addVertex(this);
        directedGraph.addVertex(this.type);
        directedGraph.addVertex(this.name);
        directedGraph.addVertex(this.variableValue);
        directedGraph.addEdge(this , this.type);
        directedGraph.addEdge(this , this.name);
        directedGraph.addEdge(this , this.variableValue);
    }

    public String toString() {
        return "Variable Statement{" +
                "lineNumber =" + lineNumber +
                '}';
    }
}
