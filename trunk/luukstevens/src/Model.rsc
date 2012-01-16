module Model

import Ast;

//Uses BehaviourRule data type from Ast.
data Bot = bot(str name, int punchReach, int punchPower, int kickReach, int kickPower, list[BehaviourRule] behaviourRules);

public Bot convertAstToModel(Ast::Bot astBot) {
    Bot modelBot = bot( astBot.name,    
                        getCharacteristicValue("punchReach", astBot),
                        getCharacteristicValue("punchPower", astBot),
                        getCharacteristicValue("kickReach", astBot),
                        getCharacteristicValue("kickPower", astBot),
                        astBot.behaviour.behaviourRules);
                        
    return modelBot;
}

//Get the value of a given characteristic from ast. Return 5 if not defined.
public int getCharacteristicValue(str characteristicName, Ast::Bot astBot) {
    for(Characteristic characteristic <- astBot.personality.characteristics) {
        if(characteristic.name == characteristicName) return characteristic.val;
    }
    
    return 5;
}