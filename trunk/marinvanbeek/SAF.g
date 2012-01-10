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

//    SAF             = 'saf' ;
//    NAME            = 'name' ;
//    TRAITS          = 'traits' ;
//    BEHAVIOURS      = 'behaviours' ;
//    ACTION          = 'action' ;
//    CONDITION       = 'condition' ;
    /* Imaginary nodes, used for a well-formed tree. */
    SAF;
    NAME;
    TRAITS;
    BEHAVIOURS;
    ACTION;
    CONDITION;
}

/*--------------------------------------------------------------------------
 * PARSER RULES
 *--------------------------------------------------------------------------*/

parse
    : super_awesome_fighter -> ^(SAF super_awesome_fighter)
    ;

super_awesome_fighter 
    : name CURLY_OPEN traits behaviour CURLY_CLOSE EOF -> ^(NAME name) ^(TRAITS traits) ^(BEHAVIOURS behaviour)
    ;

name
    : STRING
    ;

traits
    : (property EQUAL LEVEL)+ -> ^(property LEVEL)+
    ;

property
    : STRING
    ;

behaviour
    : (complex_condition action)+ -> ^(CONDITION complex_condition ^(ACTION action))+
    ;

complex_condition
    : (condition ((AND|OR)^ condition)*) 
    ;

condition
    : STRING
    ;

action
    : SQUARE_OPEN move attack SQUARE_CLOSE -> move attack
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


