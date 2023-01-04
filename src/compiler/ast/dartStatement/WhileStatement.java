package compiler.ast.dartStatement;

import java.util.ArrayList;

public class WhileStatement extends Statement{
    private final String condition;
    private final ArrayList<Statement> body;

    public WhileStatement(int lineNumber, String value, String condition, ArrayList<Statement> body) {
        super(lineNumber, value);
        this.condition = condition;
        this.body = body;
    }
}
