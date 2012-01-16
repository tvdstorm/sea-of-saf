//Annotaties toevoegen  @category="Constant"

module Language

import IO;

lexical Layout = [\ \t\n\r];
layout LayoutList = Layout* !>> [\t\n\r\ ];

lexical Id = [a-zA-Z_]+ !>> [a-zA-Z_];
lexical Number = [0-9]+;

syntax Bla = Id+;

start syntax Bot 
    = bot: Id name "{" Characteristic* characteristics BehaviourRule* behaviourRules "}"; 
    
syntax Characteristic
    = characteristic : Id name "=" Number val;    
    
syntax BehaviourRule
    = behaviourRule : Condition "[" MoveAction moveAction FightAction fightAction "]";

syntax Condition
    = andCondition : Id firstCondition "and" Id secondCondition
    | orCondition : Id firstCondition "or" Id secondCondition
    | simpleCondition : Id condition;    
    
syntax MoveAction
    = simpleMoveAction : Id moveAction
    | chooseMoveAction : "choose" "(" Id+ moveActions ")";
    
syntax FightAction
    = simpleFightAction : Id fightAction 
    | chooseFightAction : "choose" "(" Id+ fightActions ")";