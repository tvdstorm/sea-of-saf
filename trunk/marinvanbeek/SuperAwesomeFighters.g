grammar SuperAwesomeFighters;

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

super_awesome_fighter 
    : STRING CURLY_OPEN personality behaviour CURLY_CLOSE EOF
    ;

personality
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


