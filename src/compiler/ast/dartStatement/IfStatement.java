package compiler.ast.dartStatement;

import java.util.ArrayList;

public class IfStatement extends Statement {
    private final String condition;
    private final ArrayList<Statement> body;
    private final ArrayList<Statement> elseBlock;

    public IfStatement(int lineNumber, String value, String condition, ArrayList<Statement> body, ArrayList<Statement> elseBlock) {
        super(lineNumber, value);
        this.condition = condition;
        this.body = body;
        this.elseBlock = elseBlock;
    }
}
