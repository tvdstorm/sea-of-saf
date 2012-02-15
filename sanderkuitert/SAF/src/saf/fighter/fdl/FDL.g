grammar FDL; //Grammar if the Fighter Description Language

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
}

@parser::header {
    package saf.fighter.fdl;
}

@parser::members {
    public CommonTree parse() throws RecognitionException {
        return (CommonTree) fighter().getTree(); //start parsing at root
    }
}

@lexer::header {
    package saf.fighter.fdl;
}

// PARSER rules
fighter:            name attributes;

name:               TEXT;
attributes:         L_CURLY_BRACKET! (characteristic | behaviour_rule)* R_CURLY_BRACKET!;

characteristic:     property IS! value;
behaviour_rule:     condition L_BRACKET! move attack R_BRACKET!;

property:           TEXT;
value:              NUMBER;
condition:          TEXT;
move:               TEXT | choose;
attack:             TEXT | choose;

choose:             CHOOSE L_PAREN! TEXT TEXT R_PAREN!;

// LEXER rules
TEXT:               LETTER (LETTER | UNDERSCORE | DIGIT)*;
NUMBER:             DIGIT+; //(MINUS | DIGIT) DIGIT*;
WHITESPACE:         WHITE_CHAR+     { $channel = HIDDEN; };

fragment LETTER:    ('a'..'z' | 'A'..'Z');
fragment UNDERSCORE:('_');
fragment DIGIT:     ('0'..'9');
//fragment MINUS:     ('-');
fragment WHITE_CHAR:(' ' | '\t' | '\r' | '\n' | '\u000C');
