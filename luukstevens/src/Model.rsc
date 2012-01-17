module Model

import Ast;
import List;

private int defaultCharacteristicValue = 5;

data Bot            = bot(str name, int punchReach, int punchPower, int kickReach, int kickPower, 
                        list[BehaviourRule] behaviourRules);

data BehaviourRule  = behaviourRule(Condition condition, list[str] moveActions, list[str] fightActions);

public Bot convertAstToModel(Ast::Bot astBot) {
    Bot modelBot = bot( astBot.name,    
                        getCharacteristicValue("punchReach", astBot),
                        getCharacteristicValue("punchPower", astBot),
                        getCharacteristicValue("kickReach", astBot),
                        getCharacteristicValue("kickPower", astBot),
                        convertBehaviourRules(astBot.behaviourRules));
                        
    return modelBot;
}

private list[BehaviourRule] convertBehaviourRules(list[Ast::BehaviourRule] astBehaviourRules) {
    list[BehaviourRule] modelBehaviourRules = [];
    
    for(Ast::BehaviourRule astBehaviourRule <- astBehaviourRules) {
        //Add condition
        BehaviourRule modelBehaviourRule = behaviourRule(astBehaviourRule.condition, [], []);
        
        visit(astBehaviourRule) {
            case chooseMoveAction(list[str] moveActions): {
               modelBehaviourRule.moveActions += moveActions;
            }
            case simpleMoveAction(str moveAction): {
                modelBehaviourRule.moveActions += [moveAction];
            }
            case chooseFightAction(list[str] fightActions): {
                modelBehaviourRule.fightActions += fightActions;
            }
            case simpleFightAction(str fightAction): {
                modelBehaviourRule.fightActions += [fightAction];
            }
        }
        
        modelBehaviourRules += modelBehaviourRule;
    }
    
    return modelBehaviourRules;
} 

//Get the value of a given characteristic from ast. Return default if not defined.
public int getCharacteristicValue(str characteristicName, Ast::Bot astBot) {
    for(Characteristic characteristic <- astBot.characteristics) {
        if(characteristic.name == characteristicName) return characteristic.val;
    }
    
    return defaultCharacteristicValue;
}