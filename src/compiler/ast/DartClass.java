package compiler.ast;

import compiler.ast.dartStatement.Statement;
import compiler.ast.dartStatement.VariableStatement;
import compiler.utils.Edge;
import org.jgrapht.graph.DefaultDirectedGraph;

import java.util.ArrayList;

public class DartClass {
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
        directedGraph.addVertex(this);
        directedGraph.addVertex(this.name);
        directedGraph.addVertex(this.parent);
        directedGraph.addVertex(this.constructorParameter);
        directedGraph.addEdge(this , this.name);
        directedGraph.addEdge(this , this.parent);
        directedGraph.addEdge(this , this.constructorParameter);
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

    @Override
    public String toString() {
        return "DartClass{" +
                "lineNumber=" + lineNumber +
                '}';
    }
}
