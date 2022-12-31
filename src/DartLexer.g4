lexer grammar DartLexer;

AA: '&&';
C: ',';
CB: ']';
CBC: '}';
CO: ':';
CP: ')';
D: '.';
EE: '==';
EQ: '=';
GT: '>';
LT: '<';
LTE: '<=';
GTE: '>=';
MINUS: '-';
MM: '--';
NE: '!=';
NOT: '!';
OB: '[';
OBC: '{';
OP: '(';
PC: '%';
PL: '+';
PLPL: '++';
PP: '||';
SL: '/';
ST: '*';
SC: ';';
AS_: 'as';
BREAK_: 'break';
CASE_: 'case';
CLASS_: 'class';
CONTINUE_: 'continue';
DEFAULT_: 'default';
ELSE_: 'else';
EXTENDS_: 'extends';
FALSE_: 'false';
FINAL_: 'final';
FINALLY_: 'finally';
FOR_: 'for';
IF_: 'if';
IMPORT_: 'import';
IS_: 'is';
NEW_: 'new';
NULL_: 'null';
RETURN_: 'return';
STATIC_: 'static';
SUPER_: 'super';
SWITCH_: 'switch';
THIS_: 'this';
TRUE_: 'true';
VAR_: 'var';
WHILE_: 'while';

TYPEOFVARIABLES : 'int' | 'String' | 'bool' | 'double' ;
TYPEOFFUNCTION : TYPEOFVARIABLES | 'void';

NUMBER : DIGIT+ ( '.' DIGIT+ )? ;
STRING : StringDQ | StringSQ | 'r\'' (~('\'' | '\n' | '\r'))* '\'' | 'r"' (~('"' | '\n' | '\r'))* '"' ;

IDENTIFIER : IDENTIFIER_START IDENTIFIER_PART* ;

WHITESPACE : ( '\t' | ' ' | NEWLINE )+  -> skip ;
COMMENT : '//' ~[\r\n]* -> skip ;

fragment StringDQ : '"' StringContentDQ*? '"' ;
fragment StringContentDQ : ~('\\' | '"' | '\n' | '\r' | '$') | '\\' ~('\n' | '\r') | StringDQ | '${' StringContentDQ*? '}' ;
fragment StringSQ : '\'' StringContentSQ*? '\'' ;
fragment StringContentSQ : ~('\\' | '\'' | '\n' | '\r' | '$') | '\\' ~('\n' | '\r') | StringSQ | '${' StringContentSQ*? '}' ;
fragment StringContentTDQ : ~('\\' | '"') | '"' ~'"' | '""' ~'"' ;
fragment StringContentTSQ : '\'' ~'\'' | '\'\'' ~'\'' | . ;
fragment NEWLINE : '\n' | '\r' | '\r\n' ;

fragment IDENTIFIER_START : LETTER | '_' | '$' ;
fragment IDENTIFIER_PART : IDENTIFIER_START | DIGIT ;

fragment LETTER : 'a' .. 'z' | 'A' .. 'Z' ;
fragment DIGIT : '0' .. '9' ;