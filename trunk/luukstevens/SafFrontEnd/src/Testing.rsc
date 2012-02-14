module Testing

import ParseTree;
import Set;
import lang::xml::DOM;
import Message;

import Language;
import Ast;
import Validation;
import XmlSerialization;

import IO;

//Ast tests

public test bool minimumAst() {
    ast1 = getAst("Test{}");
    ast2 = Ast::bot("Test", [], []);
    return ast1 == ast2;
}

public test bool astWithCharacteristic() {
    ast1 = getAst("Test{ kickPower = 5 }");
    ast2 = Ast::bot("Test", [] + characteristic("kickPower", 5), []);
    
    return ast1 == ast2;
}

public test bool astWithBehaviourRule() {
    ast1 = getAst("Test{ always[walk_towards kick_high] }");
         
    condition = simpleCondition("always");    
    moveAction = simpleMoveAction("walk_towards");
    fightAction = simpleFightAction("kick_high");
    behaviourRule = behaviourRule(condition, moveAction, fightAction);      
    ast2 = Ast::bot("Test", [], [] + behaviourRule);
    
    return ast1 == ast2;
}

public test bool astWithChooseMove() {
    ast1 = getAst("Test{ always[choose(walk_towards walk_away) kick_high] }");
         
    condition = simpleCondition("always");    
    moveAction = chooseMoveAction(["walk_towards", "walk_away"]);
    fightAction = simpleFightAction("kick_high");
    behaviourRule = behaviourRule(condition, moveAction, fightAction);      
    ast2 = Ast::bot("Test", [], [] + behaviourRule);
    
    return ast1 == ast2;
}

public test bool astWithChooseFight() {
    ast1 = getAst("Test{ always[walk_towards choose(kick_high kick_low)] }");
         
    condition = simpleCondition("always");    
    moveAction = simpleMoveAction("walk_towards");
    fightAction = chooseFightAction(["kick_high", "kick_low"]);
    behaviourRule = behaviourRule(condition, moveAction, fightAction);      
    ast2 = Ast::bot("Test", [], [] + behaviourRule);
    
    return ast1 == ast2;
}

public test bool conditionAssociativity() {
    ast1 = getAst("Test{ far and near and weaker [walk_towards kick_high] }");     
         
    condition1 = simpleCondition("far");
    condition2 = simpleCondition("near");
    condition3 = simpleCondition("weaker");
    condition4 = andCondition(condition1, condition2);
    condition5 = andCondition(condition4, condition3);
       
    moveAction = simpleMoveAction("walk_towards");
    fightAction = simpleFightAction("kick_high");
    behaviourRule = behaviourRule(condition5, moveAction, fightAction);      
    ast2 = Ast::bot("Test", [], [] + behaviourRule);
    
    return ast1 == ast2;
}

public test bool conditionPrecedence() {
    ast1 = getAst("Test{ far or near and weaker [walk_towards kick_high] }");
         
    condition1 = simpleCondition("far");
    condition2 = simpleCondition("near");
    condition3 = simpleCondition("weaker");
    condition4 = andCondition(condition2, condition3);
    condition5 = orCondition(condition1, condition4);
       
    moveAction = simpleMoveAction("walk_towards");
    fightAction = simpleFightAction("kick_high");
    behaviourRule = behaviourRule(condition5, moveAction, fightAction);      
    ast2 = Ast::bot("Test", [], [] + behaviourRule);
    
    return ast1 == ast2;
}

public test bool conditionBrackets() {
    ast1 = getAst("Test{ far and (near and weaker) [walk_towards kick_high] }");
         
    condition1 = simpleCondition("far");
    condition2 = simpleCondition("near");
    condition3 = simpleCondition("weaker");
    condition4 = andCondition(condition2, condition3);
    condition5 = andCondition(condition1, condition4);
       
    moveAction = simpleMoveAction("walk_towards");
    fightAction = simpleFightAction("kick_high");
    behaviourRule = behaviourRule(condition5, moveAction, fightAction);      
    ast2 = Ast::bot("Test", [], [] + behaviourRule);
    
    return ast1 == ast2;
}

//Validation tests

public test bool valid() {
     ast = getAst("Test{ always[run_away kick_high] }");
     messages = validate(ast);
     return size(messages) == 0;
}

public test bool alwaysOmittedBot() {
     ast = getAst("Test{}");
     if (m <- validate(ast)) {
       return m.msg == alwaysOmittedMessage;
     }
     return false;
}

public test bool invalidCharacteristic() {
     ast = getAst(
            "Test{
                x = 10
                always[run_away kick_high] 
            }");
     if (m <- validate(ast)) {
       return m.msg == unknownCharacteristicMessage + "x";
     }
     return false;
}

public test bool invalidCondition() {
     ast = getAst(
            "Test{ 
                x[run_away kick_high]
                always[run_away kick_high] 
            }");
     if (m <- validate(ast)) {
       return m.msg == unknownConditionMessage + "x";
     }
     return false;
}

public test bool invalidMove() {
     ast = getAst("Test{ always[x kick_high] }");
     if (m <- validate(ast)) {
       return m.msg == unknownMoveActionMessage + "x";
     }
     return false;
}

public test bool invalidAttack() {
     ast = getAst("Test{ always[run_away x] }");
     if (m <- validate(ast)) {
       return m.msg == unknownFightActionMessage + "x";
     }
     return false;
}

//Serialization tests

public test bool simpleBotToXml() {
     ast = getAst("Test{}");
     
     xmlNodeTree = document(
        element("bot",[attribute("name","Test"),
            element("characteristics", []),
            element("behaviourRules", [])
        ])
     );
    
     return toXmlNodeTree(ast) == xmlNodeTree;
}

//Helper methods

private Ast::Bot getAst(str bot) {
    parseTree = parse(#Language::Bot, bot);
    return implode(#Ast::Bot, parseTree);
}