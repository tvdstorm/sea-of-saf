module Outline

import Ast;
import List;

public node outlineBot(Bot bot) = outline(bot);

node outline(Bot bot) = 
    "outline"([outline(bot.characteristics), outline(bot.behaviourRules)])[@label="Bot"];

node outline(list[Characteristic] characteristics) = 
    "Characteristics"([ outline(characteristic) | characteristic <- characteristics ])[@label="Characteristics"];

node outline(Characteristic characteristic) = 
    "Characteristic"()[@label="<characteristic.name>: <characteristic.val>"][@\loc=characteristic@location];

node outline(list[BehaviourRule] behaviourRules) = 
    "BehaviourRules"([ outline(behaviourRule) | behaviourRule <- behaviourRules ])[@label="BehaviourRules"];

node outline(BehaviourRule behaviourRule) = 
    "BehaviourRule"([outline(behaviourRule.condition), outline(behaviourRule.moveAction), 
    outline(behaviourRule.fightAction)])[@label="Rule"][@\loc=behaviourRule@location];

node outline(Condition condition) = { 
    str conditionText = prettyPrintCondition(condition);
    "Condition"()[@label= "Condition: " + conditionText][@\loc=condition@location];
};

node outline(MoveAction moveAction) = { 
    str moveText = prettyPrintMove(moveAction);
    "MoveAction"()[@label= "Move action: " + moveText][@\loc=moveAction@location]; 
};

node outline(FightAction fightAction) = { 
    str fightText = prettyPrintFight(fightAction);
    "FightAction"()[@label= "Fight action: " + fightText][@\loc=fightAction@location]; 
};

private str prettyPrintMove(chooseMoveAction(actions)) = "choose( " + intercalate(" ", actions) + ")";
private str prettyPrintMove(simpleMoveAction(action)) = action;
    
private str prettyPrintFight(chooseFightAction(actions)) = "choose( " + intercalate(" ", actions) + ")";   
private str prettyPrintFight(simpleFightAction(action)) = action;

private str prettyPrintCondition(andCondition(a, b)) 
    =  "(" + prettyPrintCondition(a) + " and " + prettyPrintCondition(b) + ")";
    
private str prettyPrintCondition(orCondition(a, b)) 
    =  "(" + prettyPrintCondition(a) + " or " + prettyPrintCondition(b) + ")";

private str prettyPrintCondition(simpleCondition(a)) =  a;
    

