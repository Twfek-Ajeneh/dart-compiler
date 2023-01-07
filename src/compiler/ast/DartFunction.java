package compiler.ast;

import compiler.ast.dartStatement.ExpressionStatement;
import compiler.ast.dartStatement.Statement;
import compiler.utils.Edge;
import org.jgrapht.graph.DefaultDirectedGraph;

import java.security.PrivateKey;
import java.util.ArrayList;

public class DartFunction {
    private final int lineNumber;
    private final String value;
    private final String name;
    private final String returnType;
    private final String parameters;
    private final ArrayList<Statement> body;
    private final ExpressionStatement returnValue;

    public DartFunction(int lineNumber , String value, String name, String returnType, String parameters, ArrayList<Statement> body, ExpressionStatement returnValue) {
        this.lineNumber = lineNumber;
        this.value = value;
        this.name = name;
        this.returnType = returnType;
        this.parameters = parameters;
        this.body = body;
        this.returnValue = returnValue;
    }

    public void addToTree(DefaultDirectedGraph<Object, Edge> directedGraph){
        directedGraph.addVertex(this);
        directedGraph.addVertex(this.name);
        directedGraph.addVertex(this.returnType);
        directedGraph.addVertex(this.parameters);
        directedGraph.addEdge(this , this.name);
        directedGraph.addEdge(this , this.returnType);
        directedGraph.addEdge(this , this.parameters);
        directedGraph.addEdge(this , returnValue);
        for (Statement item : body) {
            directedGraph.addEdge(this , item);
        }
    }

    @Override
    public String toString() {
        return "DartFunction{" +
                "lineNumber=" + lineNumber +
                '}';
    }
}

