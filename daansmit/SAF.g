grammar SAF;

tokens {
    AND     = 'and';
    OR      = 'or';
    EQUALS  = '=';
    LCURLY  = '{';
    RCURLY  = '}';
    LSQUARE = '[';
    RSQUARE = ']';
}

bot
    : name LCURLY personality behaviour RCURLY
    ;

name
    : ('a'..'z' | 'A'..'Z')+
    ;

personality
    : (characteristic EQUALS digit)*
    ;

characteristic
    : punchReach
    | punchPower
    | kickReach
    | kickPower
    ;

behaviour
    : rule*
    ;

digit
    : '10'
    | '1'..'9'
    ;

rule
    : (condition LSQUARE moveAction fightAction RSQUARE)*
    ;

condition
    : state AND state
    | state OR state
    | state
    ;

state
    : always
    | near
    | far
    | much_stronger
    | stronger
    | even
    | weaker
    | much_weaker
    ;

moveAction
    : walk_towards
    | walk_away
    | run_towards
    | run_away
    | jump
    | crouch
    | stand
    ;

fightAction
    : block_low
    | block_high
    | punch_low
    | punch_high
    | kick_low
    | kick_high
    ;

