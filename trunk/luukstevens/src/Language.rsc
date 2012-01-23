//Add annotations @category="Constant"

module Language

lexical Layout = [\ \t\n\r];
layout LayoutList = Layout* !>> [\t\n\r\ ];

lexical Id = [a-zA-Z_]+ !>> [a-zA-Z_];
lexical Num = [0-9]+;

//Introduced to annotated lexical tokens.
syntax Number
    = @category = "Constant" Num;
    
syntax CharacteristicId
    = @category = "Comment" Id;
    
syntax ConditionId
    = @category = "Todo" Id;
    
syntax MoveId
    = @category = "Identifier" Id;
    
syntax FightId
    = @category = "MetaAmbiguity" Id;

syntax BotName
    = @category = "Type" Id;

start syntax Bot 
    = bot: BotName name "{" Characteristic* characteristics BehaviourRule* behaviourRules "}";  

//Grammar    
syntax Characteristic
    = characteristic : CharacteristicId name "=" Number val;    
    
syntax BehaviourRule
    = behaviourRule : Condition "[" MoveAction moveAction FightAction fightAction "]";

syntax Condition 
    = left orCondition : Condition firstCondition "or" Condition secondCondition
    | simpleCondition : ConditionId condition 
    > left andCondition : Condition firstCondition "and" Condition secondCondition; 
    
syntax MoveAction
    = simpleMoveAction : MoveId moveAction
    | chooseMoveAction : "choose" "(" MoveId+ moveActions ")";
    
syntax FightAction
    = simpleFightAction : FightId fightAction 
    | chooseFightAction : "choose" "(" FightId+ fightActions ")";
