package compiler.ast;

import compiler.ast.dartStatement.ExpressionStatement;
import compiler.ast.dartStatement.Statement;

import java.security.PrivateKey;
import java.util.ArrayList;

public class DartFunction {
    private final int lineNumber;
    private final String value;
    private final String name;
    private final String returnType;
    private final String parameters;
    private final ArrayList<Statement> body;
    private final ExpressionStatement returnValue;

    public DartFunction(int lineNumber , String value, String name, String returnType, String parameters, ArrayList<Statement> body, ExpressionStatement returnValue) {
        this.lineNumber = lineNumber;
        this.value = value;
        this.name = name;
        this.returnType = returnType;
        this.parameters = parameters;
        this.body = body;
        this.returnValue = returnValue;
    }
}
