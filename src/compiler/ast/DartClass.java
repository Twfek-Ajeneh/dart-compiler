package compiler.ast;

import compiler.ast.dartStatement.Statement;
import compiler.ast.dartStatement.VariableStatement;
import compiler.utils.Edge;
import org.jgrapht.graph.DefaultDirectedGraph;

import java.util.ArrayList;
import java.util.Date;

public class DartClass {
    private final Date date = new Date();
    private final int lineNumber;
    private final String value;
    private final String name;
    private final ArrayList<DartFunction> functions;
    private final ArrayList<VariableStatement> variables;
    private final String constructorParameter;
    private final ArrayList<Statement> constructorStatement;
    private final String parent;

    public DartClass(int lineNumber ,String value , String name, ArrayList<DartFunction> functions, ArrayList<VariableStatement> variables, String constructorParameter, ArrayList<Statement> constructorStatement) {
        this.lineNumber = lineNumber;
        this. value = value;
        this.name = name;
        this.functions = functions;
        this.variables = variables;
        this.constructorParameter = constructorParameter;
        this.constructorStatement = constructorStatement;
        this.parent = "";
    }

    public DartClass(int lineNumber , String value ,String name, ArrayList<DartFunction> functions, ArrayList<VariableStatement> variables, String constructorParameter, ArrayList<Statement> constructorStatement, String parent) {
        this.lineNumber = lineNumber;
        this.value = value;
        this.name = name;
        this.functions = functions;
        this.variables = variables;
        this.constructorParameter = constructorParameter;
        this.constructorStatement = constructorStatement;
        this.parent = parent;
    }

    public void addToTree(DefaultDirectedGraph<Object, Edge> directedGraph){
        String nameKey = getKey(name) , parentKey = getKey(parent) , parameterKey = getKey(constructorParameter);
        directedGraph.addVertex(this);
        directedGraph.addVertex(nameKey);
        directedGraph.addVertex(parentKey);
        directedGraph.addVertex(parameterKey);
        directedGraph.addEdge(this , nameKey);
        directedGraph.addEdge(this , parentKey);
        directedGraph.addEdge(this , parameterKey);
        for (Statement item : constructorStatement) {
            directedGraph.addEdge(this , item);
        }
        for (VariableStatement item : variables) {
            directedGraph.addEdge(this , item);
        }
        for (DartFunction item : functions) {
            directedGraph.addEdge(this , item);
        }
    }

    public String getKey(String str){
        return date.getTime() + "\n" + str;
    }

    @Override
    public String toString() {
        return date.getTime() +  "\nDartClass{" +
                "lineNumber=" + lineNumber +
                '}';
    }
}
