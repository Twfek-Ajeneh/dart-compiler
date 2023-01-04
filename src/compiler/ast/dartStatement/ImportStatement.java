package compiler.ast.dartStatement;

public class ImportStatement extends Statement {
    private final String importPath;
    private final String alias;

    public ImportStatement(int lineNumber, String value, String importPath, String alias) {
        super(lineNumber, value);
        this.importPath = importPath;
        this.alias = alias;
    }

    public ImportStatement(int lineNumber, String value, String importPath) {
        super(lineNumber, value);
        this.importPath = importPath;
        this.alias = "";
    }
}
