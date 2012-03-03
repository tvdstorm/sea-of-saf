package saf.game;

import java.io.*;

/**
 * This class contains all properties of a behaviour rule of a fighter bot
 **/
public class BehaviourRule {
//////////// interface ///////////////    
    public void print() {
        // print condition
        System.out.print(condition1 + " ");
        if (!logicalOperator.isEmpty()) {
            System.out.print(logicalOperator + " " + condition2 + " ");
        }
        System.out.print("-> ");
        // print move actions
        if (!moveAction2.isEmpty()) {
            System.out.print("move = (" + moveAction1 + " or " + moveAction2 + "), ");
        } else {
            System.out.print("move = " + moveAction1 + ", ");
        }
        // print fight actions
        if (!fightAction2.isEmpty()) {
            System.out.print("fight = (" + fightAction1 + " or " + fightAction2 + ")");
        } else {
            System.out.print("fight = " + fightAction1 + "");
        }
        System.out.print("\n");
    }

    // check if two rules have the same conditions
    public boolean equalCondition(BehaviourRule rule) {
        if (condition1.equals(rule.condition1) &&
            condition2.equals(rule.condition2) &&
            logicalOperator.equals(rule.logicalOperator)) {
            return true;
        }
        return false;
    }
    
//////////// constructor ///////////////    
    BehaviourRule (String c1, String c2, String lo, String m1, String m2, String f1, String f2) {
            condition1 = c1;
            condition2 = c2;
            logicalOperator = lo;
            
            moveAction1 = m1;
            moveAction2 = m2;
            
            fightAction1 = f1;
            fightAction2 = f2;               
    }

//////////// variables ///////////////   
    private String condition1;
    private String condition2;
    private String logicalOperator;
    
    private String moveAction1;
    private String moveAction2;
    
    private String fightAction1;
    private String fightAction2;
}