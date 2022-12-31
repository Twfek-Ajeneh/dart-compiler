parser grammar DartParser;

options { tokenVocab=DartLexer; }


//===================================================
// Essentials
program: (functionDeclaration /*| classDeclaration*/ | statement)* EOF;

declaration: variablesDeclaration
           | /*argumentsDeclaration*/
           | /* classDeclaration */
           | functionDeclaration
           ;

type: TYPE | IDENTIFIER;
//===================================================


//===================================================
// VariableS Declaration: int x, y, z | final x, y, z | const x, y, z, | var x, y, z;
finalConstVarOrType: FINAL_ type?
                   | CONST_ type?
                   | varOrType
                   ;

varOrType: VAR_ | type;

declaredIdentifier: finalConstVarOrType IDENTIFIER;

variablesDeclaration: declaredIdentifier (C IDENTIFIER)*;
//===================================================


//===================================================
// VariableS Initialization: int x = 30, y, z | int x = 30, y = 40, z | x = 50, y = 50, z = 40;
initializedVariableDeclaration: declaredIdentifier (EQ assignableExpression)? (C initializedIdentifier)*;

initializedIdentifier: IDENTIFIER (EQ assignableExpression)?;

initializedIdentifierList: initializedIdentifier (C initializedIdentifier)*;
//===================================================


//===================================================
// Function Declaration:
functionSignature: type? IDENTIFIER parameters;

parameters: (OP CP | OP normalFormalParameters C? CP);

normalFormalParameters: normalFormalParameter (C normalFormalParameter)*;
//************************************************
statement: importStatement;

importStatement: IMPORT_  STRING  (AS_ IDENTIFIER)? SC;

normalFormalParameter: finalConstVarOrType? IDENTIFIER;
variableStatement: (variablesDeclaration | initializedVariableDeclaration | initializedIdentifierList) SC;
//************************************************

//************************************************
classDeclaration : CLASS_ IDENTIFIER (EXTENDS_ IDENTIFIER)? OBC classMemberDefinition CBC;

classMemberDefinition: variableStatement*  classConstructor? functionDeclaration*;

classConstructor: IDENTIFIER parameters classConstructorBody;

classConstructorBody: OBC statement* CBC;
//************************************************

funcitonBlock: OBC (statement)* RETURN_ assignableExpression? SC CBC;

functionDeclaration: functionSignature funcitonBlock;
//===================================================


//===================================================
// Function Call:
functionCall: IDENTIFIER ((OP CP) | OP argumentsDeclaration C? CP);

argumentsDeclaration: assignableExpression (C assignableExpression)*;
//===================================================

// functionCall: IDENTIFIER OP argumentDeclaration CP SC;

literal: NUMBER
       | STRING
       | FALSE_
       | TRUE_
       | NULL_
       | listLiteral
       | objectLiteral
       ;

objectLiteral: NEW_ IDENTIFIER OP argumentsDeclaration CB (C IDENTIFIER)*;

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