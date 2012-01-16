module XmlSerialization

import Model;
//import lang::xml::DOM;

//Remove after bug fix --
data Namespace = namespace(str prefix, str uri)
               | none();
               
data Node = document(Node root)//
          | attribute(Namespace namespace, str name, str text)
          | element(Namespace namespace, str name, list[Node] children)
          | charData(str text)
          | cdata(str text)
          | comment(str text)
          | pi(str target, str text)
          | entityRef(str name)
          | charRef(int code);             


public Node attribute(str name, str text) = attribute(none(), name, text);
public Node element(str name, list[Node] kids) = element(none(), name, kids);

//--

//public str serializeFighter(Fighter fighter, loc location) {
//    Node xmlFighter = toXmlNodeTree(fighter);
//    xmlPretty(xmlFighter);
//}

public Node toXmlNodeTree(Bot bot) {
    Node name       = attribute("name", bot.name);
    Node punchReach = attribute("punchReach", "<bot.punchReach>");
    Node punchPower = attribute("punchPower", "<bot.punchPower>");
    Node kickReach  = attribute("kickReach", "<bot.kickReach>");
    Node kickPower  = attribute("kickPower", "<bot.kickPower>");

    //Add behaviour
    return element("fighter", [name, punchReach, punchPower, kickReach, kickPower, behaviour]);
}

//public Node behaviourToXmlNodeTree(Bot bot) {
//   list[Node] behaviourRuleNodes = []; 
//   
//   for(BehaviourRule behaviourRule <- bot.behaviourRules) {
//        ;
//   }
//
//   return element("behaviouRules", behaviourRuleNodes);
//}

//public Node createConditionNode(BehaviourRule behaviourRule) {
//    switch(behaviourRule.condition) {
//        case andCondition(str firstCondition, str secondCondition): {
//            
//        }
//        case orCondition(str firstCondition, str secondCondition): {
//
//        }
//        case simpleCondition(str condition): {
//            return attribute("firstCondition", "<condition>");
//        } 
//    }
//    
//    return return element("condition", "<condition>");
//}
//
//public Node createMoveActionNode(BehaviourRule behaviourRule) {
//
//}
//
//public Node createFightActionNode(BehaviourRule behaviourRule) {
//
//}