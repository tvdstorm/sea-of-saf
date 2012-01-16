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


    BEHAVIOUR;
    BOT;
    CHARACTERISTIC;
    CHOOSE;
    CONDITION;
    PERSONALITY;
    STATE;
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
    : name=STRING LCURLY personality behaviour RCURLY ->
        ^(BOT<Bot>[$name.text] personality behaviour)
    ;

personality
    : characteristic* -> ^(PERSONALITY<Personality> characteristic*)
    ;

characteristic
    : name=STRING EQUALS value=DIGIT ->
        ^(CHARACTERISTIC<Characteristic>[$name.text, $value.text])
    ;

behaviour
    : rule* -> ^(BEHAVIOUR<Behaviour> rule*)
    ;

rule
    : condition LSQUARE moveAction fightAction RSQUARE ->
        ^(CONDITION<Condition> moveAction fightAction)
    ;

condition
    : state AND^ state
    | state OR^ state
    | state
    ;

state
    : id=STRING -> STATE<State>[$id.text]
    ;

moveAction
    : 'choose' LPAREN a=STRING b=STRING RPAREN ->
        ^(CHOOSE<Choose> STRING<MoveAction>[$a.text] STRING<FightAction>[$b.text])
    | action=STRING -> STRING<MoveAction>[$action.text]
    ;

fightAction
    : 'choose' LPAREN a=STRING b=STRING RPAREN ->
        ^(CHOOSE<Choose> STRING<FightAction>[$a.text] STRING<FightAction>[$b.text])
    | action=STRING -> STRING<FightAction>[$action.text]
    ;
