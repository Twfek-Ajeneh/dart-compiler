package compiler.ast.dartStatement;

import compiler.utils.Edge;
import org.jgrapht.graph.DefaultDirectedGraph;

import java.util.Date;

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
        String typeKey = getKey(type) , nameKey = getKey(name) , variableValueKey = getKey(variableValue);
        directedGraph.addVertex(this);
        directedGraph.addVertex(nameKey);
        directedGraph.addEdge(this , nameKey);
        directedGraph.addVertex(typeKey);
        directedGraph.addEdge(this , typeKey);
        directedGraph.addVertex(variableValueKey);
        directedGraph.addEdge(this , variableValueKey);
    }

    public String toString() {
        return date.getTime() + "\nVariable Statement{" +
                "lineNumber =" + lineNumber +
                '}';
    }
}
