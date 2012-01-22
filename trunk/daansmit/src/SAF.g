grammar SAF;

options
{
    output = AST;
}

tokens
{
    AND     = 'and';
    OR      = 'or';
    EQUALS  = '=';
    LPAREN  = '(';
    RPAREN  = ')';
    LCURLY  = '{';
    RCURLY  = '}';
    LSQUARE = '[';
    RSQUARE = ']';
    CHOOSE  = 'choose';


    ACTION;
    BEHAVIOUR;
    BOT;
    CHARACTERISTIC;
    CONDITION;
    PERSONALITY;
    RULE;
    STATE;
}

WS
    : ( ' ' | '\r' | '\n' | '\t' )+
      { $channel = HIDDEN; }
    ;

STRING
    : ( 'a'..'z' | 'A'..'Z' | '_' )+
    ;

DIGIT
    : '10'
    | '1'..'9'
    ;

bot
    : name=STRING LCURLY personality behaviour RCURLY ->
        ^(BOT<Bot>[$name] personality behaviour)
    ;

personality
    : characteristic* -> ^(PERSONALITY<Personality> characteristic*)
    ;

characteristic
    : name=STRING EQUALS value=DIGIT ->
        ^(CHARACTERISTIC<Characteristic>[$name] DIGIT<Digit>[$value])
    ;

behaviour
    : rule* -> ^(BEHAVIOUR<Behaviour> rule*)
    ;

rule
    : condition LSQUARE action RSQUARE -> ^(RULE<Rule> condition action)
    ;

condition
    : stateExpression -> ^(CONDITION<Condition> stateExpression)
    ;

stateExpression
    : state AND<And>^ stateExpression
    | state OR<Or>^ stateExpression
    | state
    ;

state
    : id=STRING -> STATE<State>[$id]
    ;

action
    : moveAction fightAction -> ^(ACTION<Action> moveAction fightAction)
    ;

moveAction
    : CHOOSE LPAREN a=STRING b=STRING RPAREN ->
        ^(CHOOSE<Choose> STRING<MoveAction>[$a] STRING<FightAction>[$b])
    | a=STRING -> STRING<MoveAction>[$a]
    ;

fightAction
    : CHOOSE LPAREN a=STRING b=STRING RPAREN ->
        ^(CHOOSE<Choose> STRING<FightAction>[$a] STRING<FightAction>[$b])
    | a=STRING -> STRING<FightAction>[$a]
    ;
