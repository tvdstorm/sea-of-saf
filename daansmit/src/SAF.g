grammar SAF;


options {
    output = AST;
}


tokens {
    AND     = 'and';
    OR      = 'or';
    EQUALS  = '=';
    LCURLY  = '{';
    RCURLY  = '}';
    LSQUARE = '[';
    RSQUARE = ']';
}

WS
    : (' ' | '\r' | '\n' | '\t' | '\u000C')+
      { $channel = HIDDEN; }
    ;

STRING
    : ('a'..'z' | 'A'..'Z' | '_')+
    ;

DIGIT
    : '10'
    | '1'..'9'
    ;

bot
    : name LCURLY personality behaviour RCURLY
    ;

name
    : STRING
    ;

personality
    : (characteristic EQUALS DIGIT)*
    ;

characteristic
    : name
    ;

behaviour
    : rule*
    ;

rule
    : condition LSQUARE moveAction fightAction RSQUARE
    ;

condition
    : state AND state
    | state OR state
    | state
    ;

state
    : name
    ;

moveAction
    : name
    ;

fightAction
    : name
    ;

