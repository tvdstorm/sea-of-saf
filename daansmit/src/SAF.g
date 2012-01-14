grammar SAF;

options {
    output = AST;
}


tokens {
    AND     = 'and';
    OR      = 'or';
    EQUALS  = '=';
    LPAREN  = '(';
    RPAREN  = ')';
    LCURLY  = '{';
    RCURLY  = '}';
    LSQUARE = '[';
    RSQUARE = ']';

    CHOOSE = 'choose';

    PERSONALITY;
    BEHAVIOUR;
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
    : name^ LCURLY! personality behaviour RCURLY!
    ;

name
    : STRING
    ;

personality
    : characteristic* -> ^(PERSONALITY characteristic*)
    ;

characteristic
    : name^ EQUALS! DIGIT
    ;

behaviour
    : rule* -> ^(BEHAVIOUR rule*)
    ;

rule
    : condition^ LSQUARE! moveAction fightAction RSQUARE!
    ;

condition
    : state AND^ state
    | state OR^ state
    | state
    ;

state
    : name
    ;

moveAction
    : CHOOSE^ LPAREN! name name RPAREN!
    | name
    ;

fightAction
    : CHOOSE^ LPAREN! name name RPAREN!
    | name
    ;
