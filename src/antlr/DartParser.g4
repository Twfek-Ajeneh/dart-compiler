parser grammar DartParser;

options { tokenVocab=DartLexer; }

// identifier

// expression

// declaraiton

// class

// function

// for

// while

// if else
expression: assignableExpression
          | variablesExpression
          | conditionExpression
          | forExpression
          | whileExpression
          | ifExpression
          ;

variablesDeclaration: (VAR_ | FINAL_)? TYPEOFVARIABLES IDENTIFIER (EQ assignableExpression)? SC;

parameterDeclaration: ((VAR_ | FINAL_)? TYPEOFVARIABLES IDENTIFIER C)* ((VAR_ | FINAL_)? TYPEOFVARIABLES IDENTIFIER);

functionDeclaration: TYPEOFFUNCTION IDENTIFIER OP (parameterDeclaration)? CP OBC
                      (blockBody)*
                      RETURN_  assignableExpression?
                      CBC;

functionCall: IDENTIFIER OP ((assignableExpression C)* assignableExpression)? CB;

blockBody: variablesDeclaration | expression;

objectLiteral : NEW_ IDENTIFIER OP ((assignableExpression C)* assignableExpression)? CB;

conditionExpression: assignableExpression (EE | GT | LT | LTE | GTE | NE) assignableExpression
                   | conditionExpression AA conditionExpression
                   | conditionExpression PP conditionExpression
                   ;

assignableExpression: IDENTIFIER
                    // operation
                    | literal
                    | functionDeclaration
                    | objectLiteral
                    | functionCall
                    ;

variablesExpression: IDENTIFIER (EQ assignableExpression)?;

forExpression: FOR_ OP (TYPEOFVARIABLES? variablesExpression) SC conditionExpression SC expression CP OBC blockBody CBC ;

whileExpression: WHILE_ OP conditionExpression CP OBC (blockBody)? CBC;

ifExpression: IF_ OP conditionExpression CP OBC (blockBody)? CBC ELSE_ OBC (blockBody)? CBC;

literal: NUMBER
       | STRING
       | FALSE_
       | TRUE_
       | NULL_
       | listLiteral
       ;

listLiteral: OB (literal C)* literal  CB;

operation : OP operation CP
          | operation ST operation
          | operation SL operation
          | operation PC operation
          | operation PL operation
          | operation MINUS operation
          | assignableExpression
          ;


classDeclaration : CLASS_ IDENTIFIER OBC
                   classBody
                   CBC;

classBody : (variablesDeclaration | functionDeclaration)*;