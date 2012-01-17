module Ast

import List;
import Set;

anno loc Characteristic@location;
anno loc BehaviourRule@location;
anno loc Condition@location;
anno loc MoveAction@location;
anno loc FightAction@location;

data Bot            = bot(str name, list[Characteristic] characteristics, list[BehaviourRule] behaviourRules);

data Characteristic = characteristic(str name, int val);

data BehaviourRule  = behaviourRule(Condition condition, MoveAction moveAction, FightAction fightAction); 
data Condition      = andCondition(str firstCondition, Condition secondCondition) 
                    | orCondition(str firstCondition, Condition secondCondition) 
                    | simpleCondition(str condition);    
                    
data MoveAction     = simpleMoveAction(str moveAction)
                    | chooseMoveAction(list[str] moveActions);

data FightAction    = simpleFightAction(str fightAction)
                    | chooseFightAction(list[str] fightActions); 
                    