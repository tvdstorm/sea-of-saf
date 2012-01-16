module XmlSerialization

import Ast;
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

public Node toXmlNodeTree(Fighter fighter) {
    Node name = attribute("name", fighter.fighteName);
    Node personality = attribute("personality", "test");
    Node behaviour = attribute("behaviour", "test");
    return element("fighter", [name, personality, behaviour]);
}

//public Node behaviourToXmlNodeTree(Fighter fighter) {
//   list[Node] behaviourRuleNodes = []; 
//   
//   for(BehaviourRules behaviourRule <- fighter.behaviour.behaviourRules) {
//        Node condition = attribute("condition", behaviourRule.condition);
//        Node
//        behaviourRuleNodes += attribute("behaviour", "test");
//   }
//
//   element("rule", [])
//}