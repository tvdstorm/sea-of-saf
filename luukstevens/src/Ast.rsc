module Ast

import List;

anno loc Personality@location;
anno loc Characteristic@location;

anno loc Behaviour@location;
anno loc BehaviourRule@location;
anno loc Condition@location;
anno loc MoveAction@location;
anno loc FightAction@location;


data Fighter        = fighter(str fighteName, Personality personality, Behaviour behaviour);

data Personality    = personality(list[Characteristic] characteristics);
data Characteristic = characteristic(str name, int val);

data Behaviour      = behaviour(list[BehaviourRule] behaviourRules);
data BehaviourRule  = behaviourRule(Condition condition, MoveAction moveAction, FightAction fightAction); 
data Condition      = andCondition(str firstCondition, str secondCondition) 
                    | orCondition(str firstCondition, str secondCondition) 
                    | simpleCondition(str condition);    
                    
data MoveAction     = chooseMoveAction(str firstMoveAction, str secondMoveAction)
                    | simpleMoveAction(str moveAction);

data FightAction    = chooseFightAction(str firstFightAction, str secondFightAction)
                    | simpleFightAction(str fightAction); 
                    