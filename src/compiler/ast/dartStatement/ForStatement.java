package compiler.ast.dartStatement;

import java.util.ArrayList;

public class ForStatement extends Statement {
    private final Statement beginStatement;
    private final String condition;
    private final Statement endStatement;
    private final ArrayList<Statement> body;

    public ForStatement(int lineNumber, String value, Statement beginStatement, String condition, Statement endStatement, ArrayList<Statement> body) {
        super(lineNumber, value);
        this.beginStatement = beginStatement;
        this.condition = condition;
        this.endStatement = endStatement;
        this.body = body;
    }
}
