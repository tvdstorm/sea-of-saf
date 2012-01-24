module XmlSerialization

import Ast;
import lang::xml::DOM;

public void serializeBot(Bot bot, loc location) {
    writeXMLPretty(location, toXmlNodeTree(bot));
}

public Node toXmlNodeTree(Bot bot) {
    Node name = attribute("name", bot.name);
    return document(element("bot", 
        [name, characteristicToXmlNode(bot.characteristics), behaviourToXmlNode(bot)]));
}

private Node characteristicToXmlNode(list[Characteristic] characteristics) {
    list[Node] characteristicNodes = [];
    
    for(Characteristic characteristic <- characteristics) {
        characteristicNodes += element("characteristic", [attribute("name", characteristic.name), 
            attribute("value", "<characteristic.val>")]);
    }
    
    return element("characteristics", characteristicNodes);
}

private Node behaviourToXmlNode(Bot bot) {
   list[Node] behaviourRuleNodes = [];
   
   for(BehaviourRule behaviourRule <- bot.behaviourRules) {
        Node moveActionNode = element("moveActions", 
            convertListToNodes("moveAction", getMoveActions(behaviourRule.moveAction)));
        
        Node fightActionNode = element("fightActions", 
            convertListToNodes("fightAction", getFightActions(behaviourRule.fightAction)));
        
        Node condition = conditionsToXmlNodeTree(behaviourRule.condition);
   
        behaviourRuleNodes += element("behaviourRule", [condition, moveActionNode, fightActionNode]);
   }
   
   return element("behaviourRules", behaviourRuleNodes);
}

public Node conditionsToXmlNodeTree(Ast::Condition condition) {
    switch(condition) {
        case andCondition(Condition firstCondition, Condition secondCondition): {
            return element("andCondition", 
                [conditionsToXmlNodeTree(firstCondition), conditionsToXmlNodeTree(secondCondition)]);
        }
        case orCondition(Condition firstCondition, Condition secondCondition): {
            return element("orCondition", 
                [conditionsToXmlNodeTree(firstCondition), conditionsToXmlNodeTree(secondCondition)]);
        }
        case simpleCondition(str condition): {
            return element("simpleCondition", [charData(condition)]);
        }
    }
}

private list[str] getMoveActions(MoveAction moveAction) {
    switch(moveAction) {
        case simpleMoveAction(str moveAction): return [moveAction];
        case chooseMoveAction(list[str] moveActions): return moveActions;
    }
}

private list[str] getFightActions(FightAction moveAction) {
    switch(moveAction) {
        case simpleFightAction(str fightAction): return [fightAction];
        case chooseFightAction(list[str] fightActions): return fightActions;
    }
}

private list[Node] convertListToNodes(str nodeName, list[str] items) =
    [ element(nodeName, [charData(item)]) | item <- items ];
    
    
    