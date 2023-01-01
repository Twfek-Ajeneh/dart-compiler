package compiler;


public enum Type {
    Program("Program"),
    Function_Declaration("Function Declaration"),
    Class_Declaration("Class_Declaration"),
    Literals("Literals"),
    Statements("Statements"),
    Variables("Variables"),
    Other("Other");


    private final String name;

    Type(String name) {
        this.name = name;
    }
}