package saf.game;

import java.util.ArrayList;

import saf.game.EnumTypes.*;

/**
 * This class contains all properties of a fighter bot
 **/
public class Bot { 
    // general game configuration
    public static final double STARTING_HEALTH = 100.;
    public static final double MINIMAL_SPEED = 0.2;
    public static final double BLOCK_MODIFIER = 0.5;
    public static final double REACH_MODIFIER = 0.5;    // how much distance a unit of reach is worth
    
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
    private double currentHealth = STARTING_HEALTH;    
    
    public Bot(String name, int punchReach, int punchPower, int kickReach, int kickPower) {
        this.name = name;
        this.punchReach = punchReach;
        this.punchPower = punchPower;
        this.kickReach = kickReach;
        this.kickPower = kickPower;
        
        double weight = (punchPower + kickPower) / 2.;
        double height = (punchReach + kickReach) / 2.;
        speed = java.lang.Math.abs(0.5 * (height - weight));
        if (speed < MINIMAL_SPEED) {
            speed = MINIMAL_SPEED;
        }
                                
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
        result += "\tstrengthCondition = " + strengthCondition.toString() + "\trangeCondition = " + rangeCondition.toString() + "\n";
        return result;
    }
    
    public boolean isDead() {
        return (currentHealth <= 0.);
    }

    public void setPosition(double position) {
        currentPosition = position;
    }
    
    private void moveBot(Bot other, double distance) {   
        if (orientationFromOther(other) == Orientation.LEFT) {
            // prevent bot from moving through other
            if ( currentPosition + distance < other.currentPosition) {
                setPosition(currentPosition + distance);
            }
        } else {
            // bot is at the right of other
            if ( currentPosition - distance > other.currentPosition) {
                setPosition(currentPosition - distance);
            }        
        }
    }

    public void moveOtherAccordingToState(Bot other) {       
        if (currentMove ==  MoveType.RUN_AWAY) {
                moveBot(other, -2. * speed );
        } else if (currentMove ==  MoveType.WALK_AWAY) {
                moveBot(other, -1. * speed );
        } else if (currentMove ==  MoveType.RUN_TOWARDS) {
                moveBot(other, 2. * speed );
        }  else if (currentMove ==  MoveType.WALK_TOWARDS) {
                moveBot(other, 1. * speed );
        }      
    }
    
    public void attackOtherAccordingToState(Bot other) {
        double distance = java.lang.Math.abs(this.currentPosition - other.currentPosition);   
        if (currentAttack == AttackType.KICK_HIGH) {
            if (distance <= kickReach * REACH_MODIFIER && other.currentMove != MoveType.CROUCH) {
                hitOtherBot(other);
            }
        } else if (currentAttack == AttackType.KICK_LOW) {
            if (distance <= kickReach * REACH_MODIFIER  && other.currentMove != MoveType.JUMP) {
                hitOtherBot(other);
            }
        } else if (currentAttack == AttackType.PUNCH_HIGH) {
            if (distance <= punchReach * REACH_MODIFIER  && other.currentMove != MoveType.CROUCH) {
                hitOtherBot(other);
            }
        } else if (currentAttack == AttackType.PUNCH_LOW) {
            if (distance <= punchReach * REACH_MODIFIER  && other.currentMove != MoveType.JUMP) {
                hitOtherBot(other);
            }
        }
    }
    
    private void hitOtherBot(Bot other) {
        System.out.println("HIER1");
        if (other.currentAttack == AttackType.BLOCK_HIGH) {
            if (currentAttack == AttackType.KICK_HIGH) {
                damageOtherBot(other, BLOCK_MODIFIER * kickPower);
            } else if (currentAttack == AttackType.KICK_LOW) {
                damageOtherBot(other, kickPower);
            } else if (currentAttack == AttackType.PUNCH_HIGH) {
                damageOtherBot(other, BLOCK_MODIFIER * kickPower);
            } else if (currentAttack == AttackType.PUNCH_LOW) {
                damageOtherBot(other, kickPower);
            }
        } else if (other.currentAttack == AttackType.BLOCK_LOW) {
            if (currentAttack == AttackType.KICK_HIGH) {
                damageOtherBot(other, kickPower);
            } else if (currentAttack == AttackType.KICK_LOW) {
                damageOtherBot(other, BLOCK_MODIFIER * kickPower);
            } else if (currentAttack == AttackType.PUNCH_HIGH) {
                damageOtherBot(other, kickPower);
            } else if (currentAttack == AttackType.PUNCH_LOW) {
                damageOtherBot(other, BLOCK_MODIFIER * kickPower);
            }        
        } else {
             if (currentAttack == AttackType.KICK_HIGH) {
                damageOtherBot(other, kickPower);
            } else if (currentAttack == AttackType.KICK_LOW) {
                damageOtherBot(other, kickPower);
            } else if (currentAttack == AttackType.PUNCH_HIGH) {
                damageOtherBot(other, kickPower);
            } else if (currentAttack == AttackType.PUNCH_LOW) {
                damageOtherBot(other, kickPower);
            }           
        }
    }
    
    private void damageOtherBot(Bot other, double damage) {
        System.out.println("HIER2");
        other.currentHealth -= damage;
    }
      
    public Orientation orientationFromOther(Bot other) {
        if ( (other.currentPosition - this.currentPosition) > 0) {
            return Orientation.LEFT;
        } else {
            return Orientation.RIGHT;
        }
    }
    
    public void compareStrengthConditions(Bot other) {
        double strengthDifference = this.totalPower - other.totalPower;
        if (strengthDifference > 15) {
            this.strengthCondition = ConditionType.MUCH_STRONGER;
        } else if (strengthDifference > 5) {
            this.strengthCondition = ConditionType.STRONGER;    
        } else if (strengthDifference < -15) {
            this.strengthCondition = ConditionType.MUCH_WEAKER;       
        } else if (strengthDifference < -5) {
            this.strengthCondition = ConditionType.WEAKER;    
        } else {
            this.strengthCondition = ConditionType.EVEN;            
        }
    }
    
    public void compareRangeConditions(Bot other) {
        double distance = java.lang.Math.abs(this.currentPosition - other.currentPosition);
        double minimumDistance = (kickReach < punchReach) ? kickReach * REACH_MODIFIER : punchReach * REACH_MODIFIER;
        if (distance > minimumDistance) {
            this.rangeCondition = ConditionType.FAR;
        } else {
            this.rangeCondition = ConditionType.NEAR;
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
