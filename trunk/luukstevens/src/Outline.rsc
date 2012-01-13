module Outline

import Ast;

public node outlineFighter(Fighter fighter) = outline(fighter);
node outline(Fighter fighter) = "outline"([outline(fighter.personality), outline(fighter.behaviour)])[@label="Fighter"];

node outline(Personality personality) = "Personality"([ outline(characteristic) | characteristic <- personality.characteristics ])[@label="Personality"][@\loc=personality@location];
node outline(Characteristic characteristic) = "Characteristic"()[@label="<characteristic.name> = <characteristic.val>"][@\loc=characteristic@location];

node outline(Behaviour behaviour) = "Behaviour"([ outline(behaviourRule) | behaviourRule <- behaviour.behaviourRules ])[@label="Behaviour"][@\loc=behaviour@location];
node outline(BehaviourRule behaviourRule) = "BehaviourRule"([outline(behaviourRule.condition), outline(behaviourRule.moveAction), outline(behaviourRule.fightAction)])[@label="Rule"][@\loc=behaviourRule@location];

node outline(Condition condition) = { 
    str conditionText = "";

    switch(condition) {
        case andCondition(str firstCondition, str secondCondition): conditionText = "<firstCondition> and <secondCondition>";
        case orCondition(str firstCondition, str secondCondition): conditionText = "<firstCondition> or <secondCondition>";
        case simpleCondition(str condition): conditionText = condition;
    }
    
    "Condition"()[@label= "Condition: " + conditionText][@\loc=condition@location]; 
};

node outline(MoveAction moveAction) = { 
    str moveText = "";

    switch(moveAction) {
        case chooseMoveAction(str firstMoveAction, str secondMoveAction): moveText = "choose(<firstMoveAction> <secondMoveAction>)";
        case simpleMoveAction(str moveAction): moveText = moveAction;
    }
    
    "MoveAction"()[@label= "Move action: " + moveText][@\loc=moveAction@location]; 
};

node outline(FightAction fightAction) = { 
    str fightText = "";

    switch(fightAction) {
        case chooseFightAction(str firstFightAction, str secondFightAction): fightText = "choose(<firstFightAction> <secondFightAction>)";
        case simpleFightAction(str fightAction): fightText = fightAction;
    }
    
    "FightAction"()[@label= "Fight action: " + fightText][@\loc=fightAction@location]; 
};

