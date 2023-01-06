package compiler.ast.dartStatement;

public class VariableStatement extends Statement{
    private final String type;
    private final String name;
    private final String variableValue;

    public VariableStatement(int lineNumber, String value, String type, String name, String variableValue) {
        super(lineNumber, value);
        this.type = type;
        this.name = name;
        this.variableValue = variableValue;
    }
	
	public String getName(){ return name; }

    public String getVariableValue(){ return variableValue; }
}
