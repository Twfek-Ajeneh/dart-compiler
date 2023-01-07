package compiler.ast.dartStatement;

import compiler.utils.Edge;
import org.jgrapht.graph.DefaultDirectedGraph;

import java.util.Date;

public class Statement {
    protected final Date date = new Date();
    protected final int lineNumber;
    protected final String value;
    protected Object astParent = null;

    public Statement(int lineNumber, String value) {
        this.lineNumber = lineNumber;
        this.value = value;
    }

    public void addToTree(DefaultDirectedGraph<Object, Edge> directedGraph , Object astParent){
        setAstParent(astParent);
        directedGraph.addVertex(this);
    }

    public String getKey(){
        return date.getTime() * Math.random() + "\n" ;
    }

    public void setAstParent(Object astParent) { this.astParent = astParent; }

    @Override
    public String toString() {
        return  date.getTime() * Math.random() + "\nStatement{" +
                "lineNumber=" + lineNumber +
                '}';
    }
}
