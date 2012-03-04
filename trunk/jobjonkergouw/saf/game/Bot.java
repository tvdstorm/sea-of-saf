package saf.game;

import java.util.ArrayList;

import saf.game.EnumTypes.*;

/**
 * This class contains all properties of a fighter bot
 **/
public class Bot {
    // fighter attributes
    private String name;
    private int punchReach;
    private int punchPower;
    private int kickReach;
    private int kickPower;         
    private double speed;
    private int totalPower;
    private ArrayList<BehaviourRule> rules = new ArrayList<BehaviourRule>();
    
    // values describing current fighter state
    private MoveType currentMove = MoveType.STAND;
    private AttackType currentAttack = AttackType.IDLE;
    private ConditionType strengthCondition = ConditionType.EVEN;
    private ConditionType rangeCondition = ConditionType.FAR;  
    private double currentPosition = 0.;
    private double currentHealth = 100.;
    
    
    public Bot(String name, int punchReach, int punchPower, int kickReach, int kickPower) {
        this.name = name;
        this.punchReach = punchReach;
        this.punchPower = punchPower;
        this.kickReach = kickReach;
        this.kickPower = kickPower;
        
        double weight = (punchPower + kickPower) / 2.;
        double height = (punchReach + kickReach) / 2.;
        this.speed = java.lang.Math.abs(0.5 * (height - weight));
                                
        computeTotalPower();
    }

    public String botSummaryAsString() {
        String result = "Bot " + name + "\n";
        result += "----------------------------\n";
        result += "Attributes = (" + punchReach + ", " + punchPower + ", " + kickReach + ", " + kickPower + ")\n"; 
        result += "Speed = " + speed + "\n";  
        result += "totalPower = " + totalPower + "\n"; 
        result += "rules:\n";
        for (BehaviourRule rule : rules) {
            result += "\t" + rule.toString() + "\n";
        }
        result += botStateAsString();
        return result;
    }
    
    public String botStateAsString() {
        String result = "Current state of " + name + ":\n";
        result += "\tposition = " + currentPosition + "\thealth = " + currentHealth + "\n";
        result += "\tmove = " + currentMove.toString() + "\tattack = " + currentAttack.toString() + "\n";
        return result;
    }

//     public void setPosition(double position) {
//         currentPosition = position;
//     }

    public void moveBot(Bot other) {
        // check the orientation of the other bot
        boolean otherIsRight = (other.currentPosition - this.currentPosition) > 0;
        
    }
    
    public void compareStrengthConditions(Bot other) {
        double strengthDifference = this.totalPower - other.totalPower;
        if (strengthDifference > 15) {
            this.strengthCondition = ConditionType.MUCH_STRONGER;
            other.strengthCondition = ConditionType.MUCH_WEAKER;;
        } else if (strengthDifference > 5) {
            this.strengthCondition = ConditionType.STRONGER;
            other.strengthCondition = ConditionType.WEAKER;        
        } else if (strengthDifference < -15) {
            this.strengthCondition = ConditionType.MUCH_WEAKER;
            other.strengthCondition = ConditionType.MUCH_STRONGER;        
        } else if (strengthDifference < -5) {
            this.strengthCondition = ConditionType.WEAKER;
            other.strengthCondition = ConditionType.STRONGER;        
        } else {
            this.strengthCondition = ConditionType.EVEN;
            other.strengthCondition = ConditionType.EVEN;              
        }
    }
    
    public void compareRangeConditions(Bot other) {
        double distance = java.lang.Math.abs(this.currentPosition - other.currentPosition);
        if (distance > 5.) {
            this.rangeCondition = ConditionType.FAR;
            other.rangeCondition = ConditionType.FAR;
        } else {
            this.rangeCondition = ConditionType.NEAR;
            other.rangeCondition = ConditionType.NEAR;
        }
    }
    
    /**
    *   Search for a rule that is valid and adjust the move and attack of the bot.
    *   Returns false if no valid rule was found.
    **/    
    public boolean determineMoveAndAttackByRules() {
        if ( rules.isEmpty() ) {
            return false;
        }
        
        for (BehaviourRule rule : rules) {
            if ( rule.ruleIsTrue(strengthCondition, rangeCondition) ) {
                currentMove = rule.getMove();
                currentAttack = rule.getAttack();
                return true;
            }
        }
        return false;
    }
    
    public void addRule(BehaviourRule rule) {
        rules.add(rule);
    }
    
    private void computeTotalPower() {
        totalPower = punchPower + punchReach + kickReach + kickPower;
    }
    
}
