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

public str unknownConditionMessage = "Unknown condition: ";
public str unknownMoveActionMessage = "Unknown move action: ";
public str unknownFightActionMessage = "Unknown fight action: ";
public str unknownCharacteristicMessage = "Unknown characteristic: ";
public str alwaysOmittedMessage = "One of the characteristics must start with an always condition.";
public str invalidCharacteristicValueMessage = 
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
    
    validationMessages += validateAlways(bot);
    
    return validationMessages;
}

private set[Message] validateAlways(Bot bot) {
    visit(bot) {
        case simpleCondition("always"): return {};
    }
    
    return { error(alwaysOmittedMessage, bot@location) };
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
            if(!(condition in conditions)) {
                validationMessages += error(unknownConditionMessage + condition, sc@location);
            }
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

private set[Message] validateMoveActions(list[str] checkMoveActions, loc location) = 
   { error(unknownMoveActionMessage + checkMoveAction, location) 
        | str checkMoveAction <- checkMoveActions, !(checkMoveAction in moveActions) };

private set[Message] validateFightActions(list[str] checkFightActions, loc location) =
    { error(unknownFightActionMessage + checkFightAction, location) 
        | str checkFightAction <- checkFightActions, !(checkFightAction in fightActions) };
