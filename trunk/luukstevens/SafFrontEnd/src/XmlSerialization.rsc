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
    list[Node] characteristicNodes = [ element("characteristic", [attribute("name", characteristic.name), 
            attribute("value", "<characteristic.val>")]) | Characteristic characteristic <- characteristics ];
    
    return element("characteristics", characteristicNodes);
}

private Node behaviourToXmlNode(Bot bot) {
   
   behaviourRuleNodes = for(BehaviourRule behaviourRule <- bot.behaviourRules) {
        Node moveActionNode = element("moveActions", 
            convertListToNodes("action", getMoveActions(behaviourRule.moveAction)));
        
        Node fightActionNode = element("fightActions", 
            convertListToNodes("action", getFightActions(behaviourRule.fightAction)));
        
        Node condition = conditionsToXmlNodeTree(behaviourRule.condition);
   
        append element("behaviourRule", [condition, moveActionNode, fightActionNode]);
   }
   
   return element("behaviourRules", behaviourRuleNodes);
}

private Node conditionsToXmlNodeTree(andCondition(a, b)) =
    element("andCondition", [conditionsToXmlNodeTree(a), conditionsToXmlNodeTree(b)]);
    
private Node conditionsToXmlNodeTree(orCondition(a, b)) =
    element("orCondition", [conditionsToXmlNodeTree(a), conditionsToXmlNodeTree(b)]);

private Node conditionsToXmlNodeTree(simpleCondition(str condition)) =
    element("simpleCondition", [attribute("value", condition)]);

private list[str] getMoveActions(simpleMoveAction(str moveAction)) = [moveAction];
private list[str] getMoveActions(chooseMoveAction(list[str] moveActions)) = moveActions;

private list[str] getFightActions(simpleFightAction(str fightAction)) = [fightAction];
private list[str] getFightActions(chooseFightAction(list[str] fightActions)) = fightActions;

private list[Node] convertListToNodes(str nodeName, list[str] items) =
    [ element(nodeName, [attribute("value", item)]) | item <- items ];
    
    
    