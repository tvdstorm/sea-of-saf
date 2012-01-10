module Validation

import Set;

import Message;
import Ast;

private set[str] characteristics = {"punchReach", "punchPower", "kickReach", "kickPower"};
private set[str] moveActions = {"walk_towards", "walk_away", "run_towards", "run_away", "jump", "crouch", "stand"};
private set[str] fightActions = {"block_low", "block_high", "punch_low", "punch_high", "kick_low", "kick_high"};
private set[str] conditions = {"always", "near", "near", "much_stronger", "stronger", "even", "weaker", "much_weaker"};

private int characteristicMinimum = 0;
private int characteristicMaximum = 15;

private str unknownCharacteristicMessage = "Unknown characteristic: ";
private str invalidCharacteristicValueMessage = "Invalid characteristic value (<characteristicMinimum> - <characteristicMaximum> allowed): ";
private str unknownMoveAction = "Unknown moveAction: ";

public set[Message] validate(Fighter fighter) {
    set[Message] validationMessages = validateCharacteristics(fighter);
    validationMessages += validateMoveActions(fighter);
    return validationMessages;
}

public set[Message] validateCharacteristics(Fighter fighter) {
    set[Message] validationMessages = {};
    
    for(Characteristic characteristic <- fighter.personality.characteristics) {
        if(!(characteristic.name in characteristics)) { 
            validationMessages += error(unknownCharacteristicMessage + "<characteristic.name>", characteristic@location);
        }
        
        if(characteristic.val < characteristicMinimum || characteristic.val > characteristicMaximum) {
            validationMessages += error(invalidCharacteristicValueMessage + "<characteristic.val>", characteristic@location);
        }
    }
    
    return validationMessages;
}

public set[Message] validateMoveActions(Fighter fighter) {
    set[Message] validationMessages = {};
    
    for(BehaviourRule behaviourRule <- fighter.behaviour.behaviourRules) {
        switch(behaviourRule.moveAction) {
            case chooseMoveAction(str firstMoveAction, str secondMoveAction): {
                    if(!(firstMoveAction in moveActions)) validationMessages += error(unknownMoveAction + firstMoveAction, behaviourRule@location);
                    if(!(secondMoveAction in moveActions)) validationMessages += error(unknownMoveAction + secondMoveAction, behaviourRule@location);
                }
            case simpleMoveAction(str moveAction):
                if(!(moveAction in moveActions)) validationMessages += error("error2", behaviourRule@location);
        }
    }
    
    return validationMessages;
}

public set[Message] validateFightActions(Fighter fighter) {
    return {};
}

public set[Message] validateConditions(Fighter fighter) {
    return {};
}