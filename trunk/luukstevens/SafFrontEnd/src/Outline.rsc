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
    str conditionText = simplifyCondition(condition);
    "Condition"()[@label= "Condition: " + conditionText][@\loc=condition@location];
};

node outline(MoveAction moveAction) = { 
    str moveText = "";

    switch(moveAction) {
        case chooseMoveAction(list[str] moveActions): {
            moveText = "choose( " + intercalate(" ", moveActions) + ")";
        }
        case simpleMoveAction(str moveAction): moveText = moveAction;
    }
    
    "MoveAction"()[@label= "Move action: " + moveText][@\loc=moveAction@location]; 
};

node outline(FightAction fightAction) = { 
    str fightText = "";

    switch(fightAction) {
        case chooseFightAction(list[str] fightActions): {
            fightText = "choose( " + intercalate(" ", fightActions) + ")";
        }
        case simpleFightAction(str fightAction): fightText = fightAction;
    }
    
    "FightAction"()[@label= "Fight action: " + fightText][@\loc=fightAction@location]; 
};

//Compose a string of the condition nodes recursively.
private str simplifyCondition(Condition condition) {
    switch(condition) {
        case andCondition(Condition firstCondition, Condition secondCondition): {
            return "(" + simplifyCondition(firstCondition) + " and " + simplifyCondition(secondCondition) + ")";
        }
        case orCondition(Condition firstCondition, Condition secondCondition): {
            return "(" + simplifyCondition(firstCondition) + " or " + simplifyCondition(secondCondition) + ")";
        }
        case sc:simpleCondition(str condition): {
            return condition;
        }
    }
}

