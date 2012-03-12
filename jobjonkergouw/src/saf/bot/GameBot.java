package saf.bot;

import saf.ast.nodes.*;
import saf.bot.EnumTypes.*;

/**
 * Adds game logic to the bot. Including the states and game configurations.
 **/
public class GameBot extends Fighter {
	// fighter attributes
	private int punchReach = 5;
    private int punchPower = 5;
    private int kickReach = 5;
    private int kickPower = 5;         
    private double speed = 0;
    private int totalPower;
	
    // general game configuration
    private final double STARTING_HEALTH = 100.;
    private final double BLOCK_MODIFIER = 0.5;
    private final double REACH_MODIFIER = 0.5;    // how much distance a unit of reach is worth
    private final int MUCHSTRONGER_MINIMUM = 15; 
    private final int STRONGER_MINIMUM = 5;
    private final double RUN_SPEED = 1.; 
    private final double MOVE_SPEED = 0.5;
    private final double MINIMUM_SPEED = 0.2;
    private double gameWidth = 20.;
    
    // values describing current fighter state
    private MoveType currentMove = MoveType.STAND;
	private AttackType currentAttack = AttackType.IDLE;
    private ConditionType strengthCondition = ConditionType.EVEN;
    private ConditionType rangeCondition = ConditionType.FAR;  
    private double currentPosition = 0.;
    private double currentHealth = STARTING_HEALTH;    
    private double timeForNextAction = 0.;

	public GameBot(String name) {
		super(name);
	}

	/**
	 * @return String containing bot states
	 */
    public String statesAsString() {
        String result = "Current state of " + name + ":\n";
        result += "\tposition = " + currentPosition + "\thealth = " + currentHealth + "\n";
        result += "\tmove = " + currentMove.toString() + "\tattack = " + currentAttack.toString() + "\n";
        result += "\tstrengthCondition = " + strengthCondition.toString() + "\trangeCondition = " + rangeCondition.toString() + "\n";
        return result;
    }
    
    public String attributesAsString() {
        String result = "Bot " + name + "\n";
        result += "----------------------------\n";
        result += "Attributes = (" + punchReach + ", " + punchPower + ", " + kickReach + ", " + kickPower + ")\n"; 
        result += "Speed = " + speed + "\n";  
        result += "totalPower = " + totalPower + "\n"; 
        result += "rules:\n";
        for (Rule rule : rules) {
            result += "\t" + rule.toString() + "\n";
        }
        return result;
    }
    
    /******************* Getters and setters *******************/
    
    public MoveType getCurrentMove() {
		return currentMove;
	}

	public void setCurrentMove(MoveType currentMove) {
		this.currentMove = currentMove;
	}

	public AttackType getCurrentAttack() {
		return currentAttack;
	}

	public void setCurrentAttack(AttackType currentAttack) {
		this.currentAttack = currentAttack;
	}

	public double getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(double currentPosition) {
		// check for out of bounds
		if (currentPosition < 0) { 
			this.currentPosition = 0.;
		} else if (currentPosition > gameWidth){
			this.currentPosition = gameWidth;
		} else {
			this.currentPosition = currentPosition;
		}
	}	
    
    public double getGameWidth() {
		return gameWidth;
	}

	public void setGameWidth(double gameWidth) {
		this.gameWidth = gameWidth;

    }
	
	/******************* General utility functions *******************/
	
	/**
	 * Returns if it is time for next action yet 
	 */
	public boolean isTimeForNextAction(double time) {
		if (time >= timeForNextAction) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Updates timeForNextAction
	 */
	public void updateTimeForNextAction() {
		this.timeForNextAction += speed;
	}

	/**
	 * @return true if bot is below 0 health, otherwise false
	 */
    public boolean isDead() {
        return (currentHealth <= 0.);
    }
    
    /**
     * @param other - opponent to be compared with
     * @return LEFT - if this bot is left from the opponent, right otherwise
     */
    public Orientation orientationFromOther(GameBot other) {
        if ( (other.currentPosition - this.currentPosition) > 0) {
            return Orientation.LEFT;
        } else {
            return Orientation.RIGHT;
        }
    }
	
	/******************* Methods for analyzing, applying and executing states *******************/
	
	/**
	 * Update the states, choose which rule to follow and execute the actions following the rule.
	 * @param other - the opponent to be compared with
	 */
	public void updateBotActions(GameBot other) {
		this.compareRangeConditions(other);
		this.compareStrengthConditions(other);

		this.determineMoveAndAttackByRules();
		this.moveOtherAccordingToState(other);
		this.attackOtherAccordingToState(other);
	}
	
	private void compareRangeConditions(GameBot other) {
		    double distance = java.lang.Math.abs(this.currentPosition - other.currentPosition);
		    double minimumDistance = (kickReach < punchReach) ? kickReach * REACH_MODIFIER : punchReach * REACH_MODIFIER;
		    if (distance > minimumDistance) {
		        this.rangeCondition = ConditionType.FAR;
		    } else {
		        this.rangeCondition = ConditionType.NEAR;
		    }
		}
	
	private void compareStrengthConditions(GameBot other) {
		    double strengthDifference = this.totalPower - other.totalPower;
		    if (strengthDifference > MUCHSTRONGER_MINIMUM) {
		        this.strengthCondition = ConditionType.MUCH_STRONGER;
		    } else if (strengthDifference > STRONGER_MINIMUM) {
		        this.strengthCondition = ConditionType.STRONGER;    
		    } else if (strengthDifference < -MUCHSTRONGER_MINIMUM) {
		        this.strengthCondition = ConditionType.MUCH_WEAKER;       
		    } else if (strengthDifference < -STRONGER_MINIMUM) {
		        this.strengthCondition = ConditionType.WEAKER;    
		    } else {
		        this.strengthCondition = ConditionType.EVEN;            
		    }
		}
	
	/**
	*   Search for a rule that is valid and adjust the move and attack of the bot.
	*   Returns false if no valid rule was found.
	**/    
	private boolean determineMoveAndAttackByRules() {
	    if ( rules.isEmpty() ) {
	        return false;
	    }
	    
	    for (Rule rule : rules) {
	        if ( rule.ruleIsTrue(strengthCondition, rangeCondition) ) {
	            currentMove = rule.getMove();
	            currentAttack = rule.getAttack();
	            return true;
	        }
	    }
	    return false;
	}
	
	private void moveOtherAccordingToState(GameBot other) {       
	    if (currentMove ==  MoveType.RUN_AWAY) {
	            moveBot(other, -RUN_SPEED * speed );
	    } else if (currentMove ==  MoveType.WALK_AWAY) {
	            moveBot(other, -MOVE_SPEED * speed );
	    } else if (currentMove ==  MoveType.RUN_TOWARDS) {
	            moveBot(other, RUN_SPEED * speed );
	    }  else if (currentMove ==  MoveType.WALK_TOWARDS) {
	            moveBot(other, MOVE_SPEED * speed );
	    }      
	}
	
	private void moveBot(GameBot other, double distance) {   
	    if (orientationFromOther(other) == Orientation.LEFT) {
	        // prevent bot from moving through other
	        if ( currentPosition + distance < other.currentPosition) {
	            setCurrentPosition(currentPosition + distance);
	        }
	    } else {
	        // bot is at the right of other
	        if ( currentPosition - distance > other.currentPosition) {
	        	setCurrentPosition(currentPosition - distance);
	        }        
	    }
	}
	
	private void attackOtherAccordingToState(GameBot other) {
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
	
	private void damageOtherBot(GameBot other, double damage) {
	    other.currentHealth -= damage;
	}
	
	private void hitOtherBot(GameBot other) {
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

	public void initializeFighter() {
		for ( Strength strength : getStrengths() ) {
			applyStrength(strength);
		}
		setSpeed();
		setTotalPower();
	}
	
	private void applyStrength(Strength strength) {      
        if (strength.getName().equals("punchReach")) {
        	this.punchReach = strength.getValue();
        } else if (strength.getName().equals("kickReach")) {
        	this.kickReach = strength.getValue();
        } else if (strength.getName().equals("kickPower")) {
        	this.kickPower = strength.getValue();
        } else if (strength.getName().equals("punchPower")) {
        	this.punchPower = strength.getValue();
        }
	}
	
	private void setTotalPower() {
        totalPower = punchPower + punchReach + kickReach + kickPower;
    }
    
    private void setSpeed() {
        double weight = (punchPower + kickPower) / 2.;
        double height = (punchReach + kickReach) / 2.;
        speed = java.lang.Math.abs(0.5 * (height - weight));
        if (speed < MINIMUM_SPEED) {
        	speed = MINIMUM_SPEED;
        }
    }
}