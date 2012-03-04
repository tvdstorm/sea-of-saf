package saf.game;

import java.util.ArrayList;

import saf.game.EnumTypes.*;

/**
 * This class contains all properties of a behaviour rule of a fighter bot
 **/
public class BehaviourRule {
    private ArrayList<MoveType> moves = new ArrayList<MoveType>() ;
    private ArrayList<AttackType> attacks = new ArrayList<AttackType>();
    private ConditionType firstCondition;
    private ConditionType secondCondition;
    private LogicalOperatorType logicalOperator;
    
    public BehaviourRule(ConditionType firstCondition) {
        this(firstCondition, ConditionType.EMPTY, LogicalOperatorType.NONE);
    } 
    
    public BehaviourRule (ConditionType firstCondition, ConditionType secondCondition, LogicalOperatorType logicalOperator) {
        this.firstCondition = firstCondition;
        this.secondCondition = secondCondition;
        this.logicalOperator = logicalOperator;
    }
    
    public String toString () {
        String result = "If " + firstCondition.toString() + " ";
        if (logicalOperator != LogicalOperatorType.NONE) {
            result += logicalOperator.toString() + " " + secondCondition.toString() + " ";
        }
        
        result += "\t-> moves [ ";
        for (MoveType move : moves) {
            result += move.toString() + " ";
        }
        
        result += "] attacks [ ";
        for (AttackType attack : attacks) {
            result += attack.toString() + " ";
        }
        result += "]";
        return result;
    }
    
    public void addMove(MoveType move) {
        moves.add(move);
    }
    
    public MoveType getMove() {
        if ( moves.isEmpty() ) {
            return MoveType.EMPTY;
        }
        java.util.Random randomGenerator = new java.util.Random();
        int randomIndex = randomGenerator.nextInt( moves.size() );
        return moves.get(randomIndex);
    }
    
    public void addAttack(AttackType attack) {
        attacks.add(attack);
    }
    
    // Notice: This is a clone of getMove() !
    public AttackType getAttack() {
        if ( attacks.isEmpty() ) {
            return AttackType.EMPTY;
        }
        java.util.Random randomGenerator = new java.util.Random();
        int randomIndex = randomGenerator.nextInt( attacks.size() );
        return attacks.get(randomIndex);
    }
    
    public boolean ruleIsTrue(ConditionType strengthCondition, ConditionType rangeCondition) {
        if (logicalOperator == LogicalOperatorType.NONE) {
            if ( singleRuleIsTrue(firstCondition, strengthCondition, rangeCondition) ) {
                return true; 
            }
        } else if (logicalOperator == LogicalOperatorType.AND) {
            if ( singleRuleIsTrue(firstCondition, strengthCondition, rangeCondition) &&
                 singleRuleIsTrue(secondCondition, strengthCondition, rangeCondition) ) {
                return true; 
            }            
        } else if (logicalOperator == LogicalOperatorType.OR) {
            if ( singleRuleIsTrue(firstCondition, strengthCondition, rangeCondition) ||
                 singleRuleIsTrue(secondCondition, strengthCondition, rangeCondition) ) {
                return true; 
            }            
        }
        return false;
    }
    
    private boolean singleRuleIsTrue(ConditionType ruleCondition, ConditionType strengthCondition, ConditionType rangeCondition) {
        switch (ruleCondition) {
            case MUCH_STRONGER:
                if (strengthCondition == ConditionType.MUCH_STRONGER) {
                    return true;
                }
                break;
                
            case STRONGER:
                if (strengthCondition == ConditionType.MUCH_STRONGER || strengthCondition == ConditionType.STRONGER) {
                    return true;
                }
                break;
                
            case EVEN:
                if (strengthCondition == ConditionType.EVEN) {
                    return true;
                }
                break;
                
            case WEAKER:
                if (strengthCondition == ConditionType.MUCH_WEAKER || strengthCondition == ConditionType.WEAKER) {
                    return true;
                }
                break;

            case MUCH_WEAKER:
                if (strengthCondition == ConditionType.MUCH_WEAKER) {
                    return true;
                }
                break;
            
            case FAR:
                if (rangeCondition == ConditionType.FAR) {
                    return true;
                }
                break;
            
            case NEAR:
                if (rangeCondition == ConditionType.NEAR) {
                    return true;
                }
                break;
            
            case ALWAYS:
                return true;            
        }
        return false;
    }
}
