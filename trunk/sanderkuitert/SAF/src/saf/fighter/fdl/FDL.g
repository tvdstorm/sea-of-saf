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
    AND =               'and';
    OR =                'or';
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

@rulecatch {
    catch (RecognitionException e) { 
        throw e; //Forward exceptions for custom error handling
    } 
}


// PARSER rules
fighter:            name attributes EOF!;

name:               IDENTIFIER;
attributes:         L_CURLY_BRACKET! (property | behaviour)* R_CURLY_BRACKET!;

property:           aspect IS! value;
behaviour:          condition L_BRACKET! move attack R_BRACKET!;

aspect:             IDENTIFIER;
value:              NUMBER;
condition:          andCondition (OR andCondition)*;
move:               IDENTIFIER | choice;
attack:             IDENTIFIER | choice;

choice:             CHOOSE L_PAREN! IDENTIFIER IDENTIFIER R_PAREN!;
andCondition:       atomicCondition (AND atomicCondition)*;

atomicCondition:    L_PAREN! condition R_PAREN! | IDENTIFIER;


// LEXER rules
IDENTIFIER:         LETTER (LETTER | UNDERSCORE | DIGIT)*;
NUMBER:             DIGIT+;
WHITESPACE:         WHITE_CHAR+     { $channel = HIDDEN; };

fragment LETTER:    ('a'..'z' | 'A'..'Z');
fragment UNDERSCORE:('_');
fragment DIGIT:     ('0'..'9');
fragment WHITE_CHAR:(' ' | '\t' | '\r' | '\n' | '\u000C');
