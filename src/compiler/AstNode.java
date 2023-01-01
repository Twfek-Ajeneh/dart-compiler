package compiler;

import java.util.ArrayList;

public class AstNode {
    private final Type type;
    private final AstNode parent;
    private final int lineNumber;
    private final String value;


    private final ArrayList<AstNode> children;

    public AstNode(Type type, AstNode parent, int lineNumber , String value, ArrayList<AstNode> children) {
        this.type = type;
        this.parent = parent;
        this.lineNumber = lineNumber;
        this.children = children;
        this.value = value;
    }

    public Type getType() {
        return type;
    }

    public AstNode getParent() {
        return parent;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public ArrayList<AstNode> getChildren() {
        return children;
    }

    public static void printTree(AstNode astNode) {
        System.out.println(astNode.toString());
        for (AstNode child : astNode.children) {
            if(child != null) {
                printTree(child);
            }
        }
    }

    @Override
    public String toString() {
        return "AstNode {\n" +
                "   type = " + type + ",\n" +
                "   parent = " + parent + ",\n" +
                "   lineNumber = " + lineNumber + ",\n" +
                "   value = " + value + "\n" +
                "}";
    }
}
