parser grammar DartParser;

options { tokenVocab=DartLexer; }

program: (functionDeclaration | classDeclaration | statement)* EOF;

declaration: variablesDeclaration
           | parameterDeclaration
           | argumentDeclaration
           | classDeclaration
           | functionDeclaration
           ;

type: TYPE | IDENTIFIER;

//************************************************
// VariableS Declaration: int x, y, z | final x, y, z | const x, y, z, | var x, y, z;
finalConstVarOrType: FINAL_ type?
                   | CONST_ type?
                   | varOrType
                   ;

varOrType: VAR_ | type;

declaredIdentifier: finalConstVarOrType IDENTIFIER;

variablesDeclaration: declaredIdentifier (C IDENTIFIER)*;
//************************************************



//************************************************
// VariableS Initialization: int x = 30, y, z | int x = 30, y = 40, z | x = 50, y = 50, z = 40;
initializedVariableDeclaration: declaredIdentifier (EQ expression)? (C initializedIdentifier)*;

initializedIdentifier: IDENTIFIER (EQ expression)?;

initializedIdentifierList: initializedIdentifier (C initializedIdentifier)*;
//************************************************



parameterDeclaration: (((VAR_ | FINAL_) TYPE? IDENTIFIER C)* ((VAR_ | FINAL_) TYPE? IDENTIFIER))?;

argumentDeclaration: ((assignableExpression C)* assignableExpression)?;

classDeclaration : CLASS_ IDENTIFIER (EXTENDS_ IDENTIFIER)? OBC classBody CBC;

classConstructor: IDENTIFIER OP parameterDeclaration CP OBC blockBody CBC;

functionDeclaration: TYPEOFFUNCTION IDENTIFIER OP parameterDeclaration CP OBC blockBody RETURN_  assignableExpression? SC CBC;

functionCall: IDENTIFIER OP argumentDeclaration CP SC;

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

blockBody: (variablesDeclaration | expression)*;

classBody : variablesDeclaration* classConstructor? functionDeclaration*;

statement: importStatement;

importStatement: IMPORT_  STRING  (AS_ IDENTIFIER)? SC;

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

forExpression: FOR_ OP (TYPE? variablesExpression) conditionExpression SC expression CP OBC blockBody CBC;

whileExpression: WHILE_ OP conditionExpression CP OBC blockBody CBC;

ifExpression: IF_ OP conditionExpression CP OBC blockBody CBC (ELSE_ OBC blockBody CBC)?;