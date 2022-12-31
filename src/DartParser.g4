parser grammar DartParser;

options { tokenVocab=DartLexer; }

// Declaration
program: (functionDeclaration | classDeclaration | statement)* EOF;

declaration: variablesDeclaration
           | parameterDeclaration
           | argumentDeclaration
           | classDeclaration
           | functionDeclaration
           ;

variablesDeclaration: (VAR_ | FINAL_) TYPEOFVARIABLES? IDENTIFIER (EQ assignableExpression)? SC;

parameterDeclaration: (((VAR_ | FINAL_) TYPEOFVARIABLES? IDENTIFIER C)* ((VAR_ | FINAL_) TYPEOFVARIABLES? IDENTIFIER))?;

argumentDeclaration: ((assignableExpression C)* assignableExpression)?;

classDeclaration : CLASS_ IDENTIFIER (EXTENDS_ IDENTIFIER)? OBC classBody CBC;

classConstructor: IDENTIFIER OP parameterDeclaration CP OBC blockBody CBC;

functionDeclaration: TYPEOFFUNCTION IDENTIFIER OP parameterDeclaration CP OBC blockBody RETURN_  assignableExpression? SC CBC;

functionCall: IDENTIFIER OP argumentDeclaration CP SC;

// Literal
literal: NUMBER
       | STRING
       | FALSE_
       | TRUE_
       | NULL_
       | listLiteral
       | objectLiteral
       ;

objectLiteral: NEW_ IDENTIFIER OP argumentDeclaration CB (C IDENTIFIER)*;

objectContent: IDENTIFIER (D IDENTIFIER)+;

listLiteral: OB (literal C)* literal CB;

// Operation
operation : OP operation CP
          | operation ST operation
          | operation SL operation
          | operation PC operation
          | operation PL operation
          | operation MINUS operation
          | IDENTIFIER
          | literal
          | functionCall
          ;

// Block Body
blockBody: (variablesDeclaration | expression)*;

classBody : variablesDeclaration* classConstructor? functionDeclaration*;

// Statement
statement: importStatement;

importStatement: IMPORT_  STRING  (AS_ IDENTIFIER)? SC;

// Expression
expression: assignableExpression
          | variablesExpression
          | conditionExpression
          | forExpression
          | whileExpression
          | ifExpression
          ;

assignableExpression: functionCall
                    | literal
                    | functionDeclaration
                    | objectLiteral
                    | IDENTIFIER
                    | objectContent
                    | operation
                    ;

variablesExpression: IDENTIFIER (EQ assignableExpression)? SC?;

conditionExpression: conditionExpression AA conditionExpression
                   | conditionExpression PP conditionExpression
                   | assignableExpression (EE | GT | LT | LTE | GTE | NE) assignableExpression
                   | assignableExpression
                   ;

forExpression: FOR_ OP (TYPEOFVARIABLES? variablesExpression) conditionExpression SC expression CP OBC blockBody CBC;

whileExpression: WHILE_ OP conditionExpression CP OBC blockBody CBC;

ifExpression: IF_ OP conditionExpression CP OBC blockBody CBC (ELSE_ OBC blockBody CBC)?;