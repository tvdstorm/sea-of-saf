module Model

import Ast;
import List;

private int defaultCharacteristicValue = 5;

data ModelBot            = modelBot(str name, int punchReach, int punchPower, int kickReach, int kickPower, 
                            list[ModelBehaviourRule] behaviourRules);

data ModelBehaviourRule  = modelBehaviourRule(Condition condition, list[str] moveActions, list[str] fightActions);

public ModelBot convertAstToModel(Bot bot) {
    ModelBot modelBot = modelBot( bot.name,    
                        getCharacteristicValue("punchReach", bot),
                        getCharacteristicValue("punchPower", bot),
                        getCharacteristicValue("kickReach", bot),
                        getCharacteristicValue("kickPower", bot),
                        convertBehaviourRules(bot.behaviourRules));
                        
    return modelBot;
}

private list[ModelBehaviourRule] convertBehaviourRules(list[BehaviourRule] behaviourRules) {
   
    return for(BehaviourRule astBehaviourRule <- behaviourRules) {
        
        ModelBehaviourRule modelBehaviourRule = modelBehaviourRule(astBehaviourRule.condition, [], []);
        
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
        
        append modelBehaviourRule;
    }
} 

//Get the value of a given characteristic from ast. Return default if not defined.
public int getCharacteristicValue(str characteristicName, Ast::Bot astBot) {
    for(Characteristic characteristic <- astBot.characteristics) {
        if(characteristic.name == characteristicName) return characteristic.val;
    }
    
    return defaultCharacteristicValue;
}