package saf.ast;

import java.util.ArrayList;


import saf.ast.nodes.*;
import saf.bot.*;
import saf.bot.EnumTypes.*;

public class BotCompiler implements Visitor {
                   
    // found fighter properties
    private String botName;
    private int punchReach;
    private int punchPower;
    private int kickReach;
    private int kickPower;  
    private ArrayList<BehaviourRule> behaviourRules;
    
    // last found rule properties
    private ArrayList<MoveType> lastMoves;
    private ArrayList<AttackType> lastAttacks;
    private ConditionType  lastFirstCondition;
    private ConditionType  lastSecondCondition;
    private LogicalOperatorType lastLogicalOperator;
    
    public BotCompiler() {
        resetLastRuleProperties();
        resetFighterPorperties();
    }
    
    public GameBot compileBot(Fighter fighterTree) {
        visit(fighterTree);
        GameBot result = new GameBot(botName, punchReach, punchPower, kickReach, kickPower);
        for (BehaviourRule rule : behaviourRules) {
            result.addRule(rule);
        }
        resetFighterPorperties();    
        return result;    
    }
    
    private void resetFighterPorperties() {
        botName = "";
        punchPower = 5;
        punchReach = 5;
        kickPower = 5;  
        kickReach = 5;
        behaviourRules = new ArrayList<BehaviourRule>();    
    }
    
    private void resetLastRuleProperties() {
        lastMoves = new ArrayList<MoveType>();
        lastAttacks = new ArrayList<AttackType>();
        lastFirstCondition = ConditionType.EMPTY;
        lastSecondCondition = ConditionType.EMPTY;;
        lastLogicalOperator = LogicalOperatorType.NONE;     
    }

    
    /************************************ Visit methods ************************************/    
    
    public void visit(Attack attack) {
        for ( String attackChoice : attack.getActionsAsArrayList() ) {
            AttackType attackType = AttackType.stringToAttackType( attackChoice );
            lastAttacks.add(attackType);
        }  
    }
    
    public void visit(Move move) {
        for ( String moveChoice : move.getActionsAsArrayList() ) {
            MoveType moveType = MoveType.stringToMoveType( moveChoice );
            lastMoves.add(moveType);
        }          
    }
    
    public void visit(Condition condition) {
        if (lastFirstCondition == ConditionType.EMPTY) {
            lastFirstCondition = ConditionType.stringToConditionType( condition.getName() );
        } else {
            lastSecondCondition = ConditionType.stringToConditionType( condition.getName() );
        }
    }
 
    public void visit(Strength strength) {
        String strengthName = strength.getName();
        if ( strengthName.equals("punchPower") ) {
            punchPower = strength.getValue();
        } else if ( strengthName.equals("punchReach") ) {
            punchReach = strength.getValue();
        } else if ( strengthName.equals("kickPower") ) {
            kickPower = strength.getValue();
        } else if ( strengthName.equals("kickReach") ) {
            kickReach = strength.getValue();
        }
    }
       
    public void visit(Fighter fighter) {
        botName = fighter.getName();
        visitChildren(fighter);
    }
 
    public void visit(Rule rule) {
        visitChildren(rule);
        
        // create a rule with the last conditions, moves and attacks that have been found
        BehaviourRule behaviourRule = new BehaviourRule(lastFirstCondition, lastSecondCondition, lastLogicalOperator);  
        for (MoveType move : lastMoves) {
            behaviourRule.addMove(move);
        }
        for (AttackType attack : lastAttacks) {
            behaviourRule.addAttack(attack);
        }
        behaviourRules.add(behaviourRule);
        resetLastRuleProperties();  
    }
       
    public void visit(And and) {
        lastLogicalOperator = LogicalOperatorType.AND;     
        visitChildren(and);     
    }
    
    // Note: a clone of visit(And and)!
    public void visit(Or or) {
        lastLogicalOperator = LogicalOperatorType.OR;   
        visitChildren(or);    
    }
    
    private void visitChildren(ASTNode node) {        
        for (int i = 0; i < node.childCount(); i++) {
            ASTNode child = node.getChild(i);
            child.accept(this);
        }      
    }

}

