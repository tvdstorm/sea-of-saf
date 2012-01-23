module Validation

import Set;
import Message;
import Ast;

private set[str] characteristics = {"punchReach", "punchPower", "kickReach", "kickPower"};
private set[str] moveActions = {"walk_towards", "walk_away", "run_towards", "run_away", "jump", "crouch", "stand"};
private set[str] fightActions = {"block_low", "block_high", "punch_low", "punch_high", "kick_low", "kick_high"};
private set[str] conditions = {"always", "near", "far", "much_stronger", "stronger", "even", "weaker", "much_weaker"};

private int characteristicMinimum = 0;
private int characteristicMaximum = 15;

private str unknownConditionMessage = "Unknown condition: ";
private str unknownMoveActionMessage = "Unknown move action: ";
private str unknownFightActionMessage = "Unknown fight action: ";
private str unknownCharacteristicMessage = "Unknown characteristic: ";
private str invalidCharacteristicValueMessage = 
    "Invalid characteristic value (<characteristicMinimum> - <characteristicMaximum> allowed): ";

public set[Message] validate(Bot bot) {
    set[Message] validationMessages = {};
    
    visit(bot) {
        case Characteristic characteristic: {
            validationMessages += validateCharacteristic(characteristic);
        }
        case BehaviourRule behaviourRule: {
            validationMessages += validateBehaviourRule(behaviourRule);
        }
    };
    
    return validationMessages;
}

private set[Message] validateCharacteristic(Characteristic characteristic) {
    set[Message] validationMessages = {};
    
    if(!(characteristic.name in characteristics)) { 
        validationMessages += error(unknownCharacteristicMessage + "<characteristic.name>", characteristic@location);
    }
    
    if(characteristic.val < characteristicMinimum || characteristic.val > characteristicMaximum) {
        validationMessages += error(invalidCharacteristicValueMessage + "<characteristic.val>", characteristic@location);
    }
    
    return validationMessages;
}

private set[Message] validateBehaviourRule(BehaviourRule behaviourRule) {
    set[Message] validationMessages = {};
    
    visit(behaviourRule) {
        case sc:simpleCondition(str condition): 
            if(!(condition in conditions)) validationMessages += error(unknownConditionMessage + condition, sc@location);
        case cma:chooseMoveAction(list[str] chooseMoveActions): 
            validationMessages += validateMoveActions(chooseMoveActions, cma@location);
        case sma:simpleMoveAction(str moveAction): 
            validationMessages += validateMoveActions([moveAction], sma@location);
        case cfa:chooseFightAction(list[str] chooseFightActions): 
            validationMessages += validateFightActions(chooseFightActions, cfa@location);
        case sfa:simpleFightAction(str fightAction):
            validationMessages += validateFightActions([fightAction], sfa@location);
    };
    
    return validationMessages;
}

private set[Message] validateMoveActions(list[str] checkMoveActions, loc location) {
   set[Message] validationMessages = {};
   
   for(str checkMoveAction <- checkMoveActions) {
        if(!(checkMoveAction in moveActions)) {
            validationMessages += error(unknownMoveActionMessage + checkMoveAction, location);
        }
    } 
    
    return validationMessages;
}

private set[Message] validateFightActions(list[str] checkFightActions, loc location) {
    set[Message] validationMessages = {};
    
    for(str checkFightAction <- checkFightActions) {
        if(!(checkFightAction in fightActions)) {
            validationMessages += error(unknownFightActionMessage + checkFightAction, location);
        }
    }
    
    return validationMessages;
}
