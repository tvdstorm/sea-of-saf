//Add annotations @category="Constant"

module Language

lexical Layout = [\ \t\n\r];
layout LayoutList = Layout* !>> [\t\n\r\ ];

lexical Id = [a-zA-Z_]+ !>> [a-zA-Z_];
lexical Number = [0-9]+;

start syntax Bot 
    = bot: Id name "{" Characteristic* characteristics BehaviourRule* behaviourRules "}"; 
    
syntax Characteristic
    = characteristic : Id name "=" Number val;    
    
syntax BehaviourRule
    = behaviourRule : Condition "[" MoveAction moveAction FightAction fightAction "]";

syntax Condition 
    = left orCondition : Condition firstCondition "or" Condition secondCondition
    | simpleCondition : Id condition 
    > left andCondition : Condition firstCondition "and" Condition secondCondition; 
    
syntax MoveAction
    = simpleMoveAction : Id moveAction
    | chooseMoveAction : "choose" "(" Id+ moveActions ")";
    
syntax FightAction
    = simpleFightAction : Id fightAction 
    | chooseFightAction : "choose" "(" Id+ fightActions ")";
