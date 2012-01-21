grammar FDL;

options {
    language = Java;
    output = AST;
}

tokens{
    L_CURLY_BRACKET =   '{';
    R_CURLY_BRACKET =   '}';    
    L_BRACKET =         '[';
    R_BRACKET =         ']';
    L_PAREN =           '(';
    R_PAREN =           ')';
    IS =                '=';
    CHOOSE =            'choose';
    
    //imaginary
//    FIGHTER;
//    NAME;
}

@parser::header {
    package saf.fighter;
}

@lexer::header {
    package saf.fighter;
}

// PARSER rules
saf:                name attributes;

name:               TEXT;
attributes:         L_CURLY_BRACKET (characteristic | behaviour_rule)* R_CURLY_BRACKET;

characteristic:     property !IS value;
behaviour_rule:     condition !L_BRACKET move attack !R_BRACKET;

property:           TEXT;
value:              NUMBER;
condition:          TEXT;
move:               TEXT | choice;
attack:             TEXT | choice;

choice:             CHOOSE !L_PAREN TEXT TEXT !R_PAREN;

// LEXER rules
TEXT:               LETTER (LETTER | UNDERSCORE | DIGIT)*;
NUMBER:             DIGIT+;
WHITESPACE:         WHITE_CHAR+     { $channel = HIDDEN; };

fragment DIGIT:     ('0'..'9');
fragment LETTER:    ('a'..'z' | 'A'..'Z');
fragment UNDERSCORE:('_');
fragment WHITE_CHAR:(' ' | '\t' | '\r' | '\n' | '\u000C');


