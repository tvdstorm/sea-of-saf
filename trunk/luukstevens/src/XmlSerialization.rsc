module XmlSerialization

import Model;
import Ast;
import lang::xml::DOM;

public void serializeBot(ModelBot bot, loc location) {
    Node xmlFighter = toXmlNodeTree(bot);
    Node document = document(xmlFighter);
    writeXMLPretty(location, document);
}

public Node toXmlNodeTree(ModelBot bot) {
    Node name       = element("name", [charData(bot.name)]);
    Node punchReach = element("punchReach", [charData("<bot.punchReach>")]);
    Node punchPower = element("punchPower", [charData("<bot.punchPower>")]);
    Node kickReach  = element("kickReach", [charData("<bot.kickReach>")]);
    Node kickPower  = element("kickPower", [charData("<bot.kickPower>")]);
    
    return element("bot", [name, punchReach, punchPower, kickReach, kickPower, element("behaviouRules", behaviourToXmlNode(bot))]);
}

private list[Node] behaviourToXmlNode(ModelBot bot) {
   
   return for(ModelBehaviourRule behaviourRule <- bot.behaviourRules) {
        
        Node moveActionNode   = element("moveActions", convertListToNodes("moveAction", behaviourRule.moveActions));
        Node fightActionNode  = element("fightActions", convertListToNodes("fightAction", behaviourRule.moveActions));
        Node condition        = conditionsToXmlNodeTree(behaviourRule.condition);
   
        append element("behaviourRule", [condition, moveActionNode, fightActionNode]);
   }
}

public Node conditionsToXmlNodeTree(Ast::Condition condition) {
    switch(condition) {
        case andCondition(Condition firstCondition, Condition secondCondition): {
            return element("condition", [element("type", [charData("and")]), 
                conditionsToXmlNodeTree(firstCondition), conditionsToXmlNodeTree(secondCondition)]);
        }
        case orCondition(Condition firstCondition, Condition secondCondition): {
            return element("condition", [element("type", [charData("or")]), 
                conditionsToXmlNodeTree(firstCondition), conditionsToXmlNodeTree(secondCondition)]);
        }
        case simpleCondition(str condition): {
            return element("condition", [charData(condition)]);
        }
    }
}

public list[Node] convertListToNodes(str nodeName, list[str] items) =
    [ element(nodeName, [charData(item)]) | item <- items ];