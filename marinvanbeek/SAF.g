grammar SAF;

options {
    output = 'AST' ;
    ASTLabelType = 'CommonTree' ;
}

tokens {
    CURLY_OPEN      = '{' ;
    CURLY_CLOSE     = '}' ;

    EQUAL           = '=' ;

    SQUARE_OPEN     = '[' ;
    SQUARE_CLOSE    = ']' ;

    AND             = 'and' ;
    OR              = 'or' ;
}

/*--------------------------------------------------------------------------
 * PARSER RULES
 *--------------------------------------------------------------------------*/

parse
    : super_awesome_fighter
    ;

super_awesome_fighter 
    : name CURLY_OPEN traits behaviour CURLY_CLOSE EOF
    ;

name
    : STRING
    ;

traits
    : (property EQUAL LEVEL)+
    ;

property
    : STRING
    ;

behaviour
    : condition ((AND|OR) condition)* action
    ;

condition
    : STRING
    ;

action
    : SQUARE_OPEN move attack SQUARE_CLOSE
    ;

move
    : STRING
    ;

attack
    : STRING
    ;
 

/*--------------------------------------------------------------------------
 * LEXER RULES
 *--------------------------------------------------------------------------*/

LEVEL   
    : '0'..'9' 
    ;

STRING  
    : ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')+ 
    ;

WHITESPACE 
    : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ { $channel = HIDDEN; } 
    ;


