parser grammar DartParser;

options { tokenVocab=DartLexer; }

// identifier
identifier : IDENTIFIER
           | IMPORT_
           | STATIC_
           ;

// expression
expression : identifier EQ expression;

// declaraiton
declaration: TYPE identifier (EQ literl)?;

// class
classDeclaration : CLASS_ typeIdentifier superclass? OBC ( metadata classMemberDeclaration )* CBC;
superclass : EXTENDS_ typeNotVoid;

// function

// for

// while

// if else


// NEW
variablesDeclaration : ( TYPEOFVARIABLES | VAR_ | Final_ ) IDENTIFIER ( SC  | EQ NUM SC | EQ IDENTIFIER SC) + <EOF>;

functionDeclaration : TYPEOFFUNCTION IDENTIFIER OP ( (TYPEOFVARIABLES IDENTIFIER C)* TYPEOFVARIABLES IDENTIFIER)* CB OBC
                      (expression)*
                      RETURN_  IDENTIFIER ?
                      CBC;

classDeclaration : CLASS_ IDENTIFIER OBC
                   classBody
                   CBC;

classBody : (variablesDeclaration)* (functionDeclaration)*;


objectDeclaratin : IDENTIFIER IDENTIFIER EQ NEW_ IDENTIFIER OP ((IDENTIFIER C)* IDENTIFIER)* CB;

expression : declaration ; // || operation  ||  callFunction  ||  IF condetion ||  for or while loops

declaration : variablesDeclaration
              | classDeclaration
              | functionDeclaration
              | objectDeclaratin ;

operation : IDENTIFIER EQ IDENTIFIER (ST NUM | ST IDENTIFIER)+
            | IDENTIFIER EQ IDENTIFIER (SL NUM | SL IDENTIFIER)+
            | IDENTIFIER EQ IDENTIFIER (PL NUM | PL IDENTIFIER)+
            | IDENTIFIER EQ IDENTIFIER (MINUS NUM | MINUS IDENTIFIER)+ ;
