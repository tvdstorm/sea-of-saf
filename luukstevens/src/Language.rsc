module Language

import IO;

lexical Layout = [\ \t\n\r];
layout LayoutList = Layout* !>> [\t\n\r\ ];

lexical Id = [a-zA-Z_]+;
lexical Number = [0-9]+;

start syntax Fighter 
    = fighter: Id fighteName "{" Personality personality Behaviour behaviour "}"; 
    
syntax Personality
    = personality : Characteristic* characteristics;
    
syntax Characteristic
    = characteristic : Id name "=" Number val;    
    
syntax Behaviour
    = behaviour : BehaviourRule* behaviourRules;
    
syntax BehaviourRule
    = behaviourRule : Condition "[" MoveAction moveAction FightAction fightAction "]";

syntax Condition
    = andCondition : Id firstCondition "and" Id secondCondition
    | orCondition : Id firstCondition "or" Id secondCondition
    | simpleCondition : Id condition;    
    
syntax MoveAction
    = chooseMoveAction : "choose" "(" Id firstMoveAction Id secondMoveAction ")" 
    | simpleMoveAction : Id moveAction;
    
syntax FightAction
    = chooseFightAction : "choose" "(" Id firstFightAction Id secondFightAction ")" 
    | simpleFightAction : Id fightAction;