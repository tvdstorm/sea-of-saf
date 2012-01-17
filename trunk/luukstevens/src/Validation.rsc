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
private str invalidCharacteristicValueMessage = "Invalid characteristic value (<characteristicMinimum> - <characteristicMaximum> allowed): ";

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
        case sc:simpleCondition(str condition): {
            if(!(condition in conditions))
                validationMessages += error(unknownConditionMessage + condition, sc@location);
        }
        case cma:chooseMoveAction(list[str] chooseMoveActions): {
            for(str chooseMoveAction <- chooseMoveActions) {
                if(!(chooseMoveAction in moveActions)) {
                    validationMessages += error(unknownMoveActionMessage + chooseMoveAction, cma@location);
                }
            }
        }
        case sma:simpleMoveAction(str moveAction): {
            if(!(moveAction in moveActions)) 
                validationMessages += error(unknownMoveActionMessage + moveAction, sma@location);
        }
        case cfa:chooseFightAction(list[str] chooseFightActions): {
            for(str chooseFightAction <- chooseFightActions) {
                if(!(chooseFightAction in fightActions)) {
                    validationMessages += error(unknownFightActionMessage + chooseFightAction, cfa@location);
                }
            }
        }
        case sfa:simpleFightAction(str fightAction): {
            if(!(fightAction in fightActions)) 
                validationMessages += error(unknownFightActionMessage + fightAction, sfa@location);
        }
    };
    
    return validationMessages;
}
