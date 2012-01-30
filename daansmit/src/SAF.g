grammar SAF;

options {
    output = AST;
}

@members {
    private Bot bot;
    private BehaviourRule currentBehaviourRule;
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
    CHOOSE  = 'choose';
}


WS
    :   ( ' ' | '\r' | '\n' | '\t' )+
        { $channel = HIDDEN; }
    ;

STRING
    :   ( 'a'..'z' | 'A'..'Z' | '_' )+
    ;

DIGIT
    :   '10'
    |   '1'..'9'
    ;

bot
    :   name=STRING LCURLY characteristic* behaviourRule* RCURLY
        { bot = new Bot(); }
    ;

characteristic
    :   name=STRING EQUALS value=DIGIT
        { bot.addBehaviourRule(new Characteristic(name, value)); }
    ;

behaviourRule
    :   condition LSQUARE action RSQUARE
        {
            if (!currentBehaviourRule)
            {
                currentBehaviourRule = new BehaviourRule();
            }
        }
    ;

condition
    :   id=STRING AND<And>^ condition
        {
            if (!currentCondition)
            {
                currentCondition = new ConditionNode(new And());
                currentCondition.left = new State(id);
            }                    
        }
    |   id=STRING OR<Or>^ condition
        {
            if (!currentCondition)
            {
                currentCondition = new ConditionNode(new Or());
                currentCondition.left = new State(id);
            }
        }
    |   id=STRING
        {
            currentCondition.right = new State(id);
        }
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
