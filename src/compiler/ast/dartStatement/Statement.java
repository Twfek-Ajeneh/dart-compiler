package compiler.ast.dartStatement;

public class Statement {
    private final int lineNumber;
    private final String value;

    public Statement(int lineNumber, String value) {
        this.lineNumber = lineNumber;
        this.value = value;
    }
}
