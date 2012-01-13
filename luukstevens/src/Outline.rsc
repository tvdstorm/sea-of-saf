module Outline

import Ast;

public node outlineFighter(Fighter fighter) = outline(fighter);
node outline(Fighter fighter) = "outline"([outline(fighter.personality), outline(fighter.behaviour)])[@label="Fighter"];

node outline(Personality personality) = "Personality"(outline(personality.characteristics))[@label="Personality"];
node outline(list[Characteristic] characteristics) = "Characteristics"([ outline(characteristic) | characteristic <- characteristics ])[@label="Characteristics"];
node outline(Characteristic characteristic) = "Characteristic"()[@label="<characteristic.name> = <characteristic.val>"];

node outline(Behaviour behaviour) = "Behaviour"(outline(behaviour.behaviourRules))[@label="Behaviour"];
node outline(list[BehaviourRule] behaviourRules) = "BehaviourRules"([ outline(behaviourRule) | behaviourRule <- behaviourRules ])[@label="Rules"];
node outline(BehaviourRule behaviourRule) = "BehaviourRule"([outline(behaviourRule.condition), outline(behaviourRule.moveAction), outline(behaviourRule.fightAction)])[@label="Rule"];

node outline(Condition condition) = { 
    str conditionText = "";

    switch(condition) {
        case andCondition(str firstCondition, str secondCondition): conditionText = "<firstCondition> and <secondCondition>";
        case orCondition(str firstCondition, str secondCondition): conditionText = "<firstCondition> or <secondCondition>";
        case simpleCondition(str condition): conditionText = condition;
    }
    
    "Condition"()[@label= "Condition: " + conditionText]; 
};

node outline(MoveAction moveAction) = { 
    str moveText = "";

    switch(moveAction) {
        case chooseMoveAction(str firstMoveAction, str secondMoveAction): moveText = "choose(<firstMoveAction> <secondMoveAction>)";
        case simpleMoveAction(str moveAction): moveText = moveAction;
    }
    
    "MoveAction"()[@label= "Move action: " + moveText]; 
};

node outline(FightAction fightAction) = { 
    str fightText = "";

    switch(fightAction) {
        case chooseFightAction(str firstFightAction, str secondFightAction): fightText = "choose(<firstFightAction> <secondFightAction>)";
        case simpleFightAction(str fightAction): fightText = fightAction;
    }
    
    "FightAction"()[@label= "Fight action: " + fightText]; 
};

