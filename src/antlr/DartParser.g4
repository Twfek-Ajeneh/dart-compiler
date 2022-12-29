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