parser grammar DartParser;

options { tokenVocab=DartLexer; }


//===================================================
// Essentials
program: (functionDeclaration | classDeclaration | importStatement)* EOF;

semiColonStatement: statement SC;

nonSemiColonStatement: forStatement | whileStatement | ifStatement;

statement: expression
         | variableStatement
         ;

type: TYPE | IDENTIFIER;
//===================================================

variableStatement: variablesDeclaration
                 | initializedVariableDeclaration
                 | initializedIdentifierList
                 ;

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
functionSignature: type IDENTIFIER parameters;

parameters: OP CP
          | OP normalFormalParameters C namedParameters CP
          | OP normalFormalParameters C? CP
          | OP namedParameters CP;

namedParameters: OBC normalFormalParameters C? CBC;

normalFormalParameters: normalFormalParameter (C normalFormalParameter)*;

normalFormalParameter: finalConstVarOrType? IDENTIFIER;

functionBlock: OBC (semiColonStatement | nonSemiColonStatement)* RETURN_ expression? SC CBC;

functionDeclaration: functionSignature functionBlock;
//===================================================


//===================================================
// Function Call:
functionCall: IDENTIFIER arguments;

arguments: OP CP
         | OP positionalArguments C namedArguments C? CP
         | OP positionalArguments C? CP
         | OP namedArguments C? CP;

positionalArguments: expression (C expression)*;

namedArguments: namedArgument (C namedArgument)*;

namedArgument: IDENTIFIER CO expression;
//===================================================


//===================================================
// Class Declaration:
importStatement: IMPORT_ STRING (AS_ IDENTIFIER)? SC;

classDeclaration : CLASS_ IDENTIFIER (EXTENDS_ IDENTIFIER)? classBlock;

classBlock: OBC (variableStatement SC)* classConstructor? functionDeclaration*  CBC;

// classBlock: OBC classMemberDefinition* CBC;

//classMemberDefinition: (variableStatement SC)
//                     | classConstructor
//                     | functionDeclaration;

classConstructor: IDENTIFIER parameters classConstructorBody;

classConstructorBody: OBC (nonSemiColonStatement | semiColonStatement)* CBC;
//===================================================


//===================================================
// Expressions:
expression: conditionalExpression
          | operationExpression
          ;

operationExpression: functionCall
                  | literal
                  | objectContent
                  | IDENTIFIER
                  | operation
                  ;

conditionalExpression: conditionalExpression AA conditionalExpression
                   | conditionalExpression PP conditionalExpression
                   | operationExpression (EE | GT | LT | LTE | GTE | NE) operationExpression
                   | TRUE_
                   | FALSE_
                   ;
//===================================================


//===================================================
// Literals:
literal: NUMBER
       | STRING
       | FALSE_
       | TRUE_
       | NULL_
       | listLiteral
       | objectLiteral
       ;

objectLiteral: NEW_ IDENTIFIER  arguments (D IDENTIFIER)*;

listLiteral: (OB CB) | OB (literal | functionCall) (C (literal | functionCall))* C? CB;

objectContent: IDENTIFIER (D IDENTIFIER)+;
//===================================================


//===================================================
// Operations:
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
//===================================================


//===================================================
// Statements:
forStatement: FOR_ OP statement SC conditionalExpression SC statement CP statementsBlock;

whileStatement: WHILE_ OP conditionalExpression CP statementsBlock;

ifStatement: IF_ OP conditionalExpression CP statementsBlock (ELSE_ elseIfBlock)?;

elseIfBlock: statementsBlock | ifStatement;

statementsBlock: OBC (semiColonStatement | nonSemiColonStatement | breakContinueStatement)* CBC;

breakContinueStatement: (BREAK_ | CONTINUE_) SC;
//===================================================