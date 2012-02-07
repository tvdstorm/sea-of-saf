module Ast

import List;

anno loc Characteristic@location;
anno loc BehaviourRule@location;
anno loc Condition@location;
anno loc MoveAction@location;
anno loc FightAction@location;
anno loc Bot@location;

data Bot            = bot(str name, list[Characteristic] characteristics, list[BehaviourRule] behaviourRules);

data Characteristic = characteristic(str name, int val);

data BehaviourRule  = behaviourRule(Condition condition, MoveAction moveAction, FightAction fightAction); 

data Condition      = andCondition(Condition firstCondition, Condition secondCondition) 
                    | orCondition(Condition firstCondition, Condition secondCondition) 
                    | simpleCondition(str condition);    
                    
data MoveAction     = simpleMoveAction(str moveAction)
                    | chooseMoveAction(list[str] moveActions);

data FightAction    = simpleFightAction(str fightAction)
                    | chooseFightAction(list[str] fightActions); 
                    