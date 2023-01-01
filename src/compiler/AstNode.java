package compiler;

import java.util.ArrayList;

public class AstNode {
    private final String rule;
    private final AstNode parent;
    private final int lineNumber;

    private final ArrayList<AstNode> children;

    public AstNode(String rule, AstNode parent, int lineNumber, ArrayList<AstNode> children) {
        this.rule = rule;
        this.parent = parent;
        this.lineNumber = lineNumber;
        this.children = children;
    }

    public String getRule() {
        return rule;
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
                "   rule = " + rule + ",\n" +
                "   parent = " + parent + ",\n" +
                "   lineNumber = " + lineNumber + ",\n" +
                "}";
    }
}
