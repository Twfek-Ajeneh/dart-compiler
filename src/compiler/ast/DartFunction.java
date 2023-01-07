package compiler.ast;

import compiler.ast.dartStatement.ExpressionStatement;
import compiler.ast.dartStatement.Statement;
import compiler.utils.Edge;
import org.jgrapht.graph.DefaultDirectedGraph;

import java.util.ArrayList;
import java.util.Date;

public class DartFunction {
    private final Date date = new Date();
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
        String nameKey = getKey(name) , returnTypeKey = getKey(returnType) , parameterKey = getKey(parameters);
        directedGraph.addVertex(this);
        directedGraph.addVertex(nameKey);
        directedGraph.addVertex(returnTypeKey);
        directedGraph.addVertex(parameterKey);
        directedGraph.addEdge(this , nameKey);
        directedGraph.addEdge(this , returnTypeKey);
        directedGraph.addEdge(this , parameterKey);
        directedGraph.addEdge(this , returnValue);
        for (Statement item : body) {
            directedGraph.addEdge(this , item);
        }
    }

    public String getKey(String str){
        return date.getTime() + "\n" + str;
    }

    @Override
    public String toString() {
        return date.getTime() +  "\nDartFunction{" +
                "lineNumber=" + lineNumber +
                '}';
    }
}

