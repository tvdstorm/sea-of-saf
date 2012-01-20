grammar FDL;

options {
    language = Java;
    output = AST;
}

@parser::header {
    package saf.fighter;
}

@lexer::header {
    package saf.fighter;
}

//tokens{
//    L_CURLY_BRACKET =   '{';
//    R_CURLY_BRACKET =   '}';    
//    L_BRACKET =         '[';
//    R_BRACKET =         ']';
//    IS =                '=';
//    
//    FIGHTER;
//    NAME;
//}
//
//saf:            name description -> ^FIGHTER name description;
//
//name:           STRING -> ^NAME STRING;
//
//description:    !L_CURLY_BRACKET properties !R_CURLY_BRACKET;
//
//properties:     (^(characteristic | behaviour_rule) !NEW_LINE)*;
//
//characteristic: ^property !IS value;
//
//behaviour_rule: condition L_BRACKET move R_BRACKET;

property:       STRING;
value:          INT;
condition:      STRING;
move:           STRING;
attack:         STRING;

STRING:         LETTER (LETTER | UNDER_SCORE | DIGIT)*;
INT:            DIGIT+;
NEW_LINE:       NL_CHAR;
WHITESPACE:     WHITE_CHAR+     { $channel = HIDDEN; };

fragment DIGIT  :       ('0'..'9');
fragment LETTER :       ('a'..'z' | 'A'..'Z');
fragment UNDER_SCORE:   ('_');
fragment NL_CHAR:       ('\r' | '\n');
fragment WHITE_CHAR:    ('\t' | ' ' | '\u000C');


