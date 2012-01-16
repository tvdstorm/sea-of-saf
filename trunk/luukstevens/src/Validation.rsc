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
        case andCondition(str firstCondition, str secondCondition): {
            if(!(firstCondition in conditions))
                validationMessages += error(unknownConditionMessage + firstCondition, behaviourRule@location);
            if(!(secondCondition in conditions))
                validationMessages += error(unknownConditionMessage + secondCondition, behaviourRule@location);
        }
        case orCondition(str firstCondition, str secondCondition): {
             if(!(firstCondition in conditions))
                validationMessages += error(unknownConditionMessage + firstCondition, behaviourRule@location);
             if(!(secondCondition in conditions))
               validationMessages += error(unknownConditionMessage + secondCondition, behaviourRule@location);
        }
        case simpleCondition(str condition): {
            if(!(condition in conditions))
                validationMessages += error(unknownConditionMessage + condition, behaviourRule@location);
        }
        case chooseMoveAction(str firstMoveAction, str secondMoveAction): {
            if(!(firstMoveAction in moveActions)) 
                validationMessages += error(unknownMoveActionMessage + firstMoveAction, behaviourRule@location);
            if(!(secondMoveAction in moveActions)) 
                validationMessages += error(unknownMoveActionMessage + secondMoveAction, behaviourRule@location);
        }
        case simpleMoveAction(str moveAction): {
            if(!(moveAction in moveActions)) 
                validationMessages += error(unknownMoveActionMessage + moveAction, behaviourRule@location);
        }
        case chooseFightAction(str firstFightAction, str secondFightAction): {
            if(!(firstFightAction in fightActions)) 
                validationMessages += error(unknownFightActionMessage + firstFightAction, behaviourRule@location);
            if(!(secondFightAction in fightActions)) 
                validationMessages += error(unknownFightActionMessage + secondFightAction, behaviourRule@location);
        }
        case simpleFightAction(str fightAction): {
            if(!(fightAction in fightActions)) 
                validationMessages += error(unknownFightActionMessage + fightAction, behaviourRule@location);
        }
    };
    
    return validationMessages;
}
