parser grammar DartParser;

options { tokenVocab=DartLexer; }


//===================================================
// Essentials
program: (functionDeclaration | classDeclaration | statement)* EOF;

declaration: variablesDeclaration
           | classDeclaration
           | functionDeclaration
           ;

type: TYPE | IDENTIFIER;
//===================================================

variableStatement: (variablesDeclaration | initializedVariableDeclaration | initializedIdentifierList) SC;


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
initializedVariableDeclaration: declaredIdentifier (EQ expression)? (C initializedIdentifier)*;

initializedIdentifier: IDENTIFIER (EQ expression)?;

initializedIdentifierList: initializedIdentifier (C initializedIdentifier)*;
//===================================================


//===================================================
// Function Declaration:
functionSignature: type? IDENTIFIER parameters;

parameters: (OP CP | OP normalFormalParameters C? CP);

normalFormalParameters: normalFormalParameter (C normalFormalParameter)*;

normalFormalParameter: finalConstVarOrType? IDENTIFIER;

funcitonBlock: OBC (statement)* RETURN_ expression? SC CBC;

functionDeclaration: functionSignature funcitonBlock;


//===================================================
// Function Call:
functionCall: IDENTIFIER ((OP CP) | OP argumentsDeclaration C? CP);

argumentsDeclaration: expression (C expression)*;
//===================================================


//===================================================
// Class Declaration:
statement: importStatement;

importStatement: IMPORT_ STRING (AS_ IDENTIFIER)? SC;

classDeclaration : CLASS_ IDENTIFIER (EXTENDS_ IDENTIFIER)? OBC classMemberDefinition CBC;

classMemberDefinition: variableStatement* classConstructor? functionDeclaration*;

classConstructor: IDENTIFIER parameters classConstructorBody;

classConstructorBody: OBC statement* CBC;
//===================================================


//===================================================
//Expression
expression: conditionExpression
          | functionCall
          | literal
          | functionDeclaration
          | objectLiteral
          | IDENTIFIER
          | objectContent
          | operation
          ;

conditionExpression: conditionExpression AA conditionExpression
                   | conditionExpression PP conditionExpression
                   | expression (EE | GT | LT | LTE | GTE | NE) expression
                   | TRUE_
                   | FALSE_
                   ;
//===================================================

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

forExpression: FOR_ OP (TYPE? variablesExpression) conditionExpression SC expression CP OBC blockBody CBC;

whileExpression: WHILE_ OP conditionExpression CP OBC blockBody CBC;

ifExpression: IF_ OP conditionExpression CP OBC blockBody CBC (ELSE_ OBC blockBody CBC)?;