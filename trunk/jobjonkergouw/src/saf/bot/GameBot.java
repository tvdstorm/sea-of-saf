package saf.bot;

import saf.bot.BehaviourRule;
import saf.bot.Bot;
import saf.bot.EnumTypes.*;

/**
 * Adds game logic to the bot. Including the states and game configurations.
 **/
public class GameBot extends Bot { 
    // general game configuration
    private final double STARTING_HEALTH = 100.;
    private final double MINIMAL_SPEED = 0.2;
    private final double BLOCK_MODIFIER = 0.5;
    private final double REACH_MODIFIER = 0.5;    // how much distance a unit of reach is worth
    private final int MUCHSTRONGER_MINIMUM = 15; 
    private final int STRONGER_MINIMUM = 5;
    private final double RUN_SPEED = 1.; 
    private final double MOVE_SPEED = 0.5;
    private double gameWidth = 20.;
    
    // values describing current fighter state
    private MoveType currentMove = MoveType.STAND;
	private AttackType currentAttack = AttackType.IDLE;
    private ConditionType strengthCondition = ConditionType.EVEN;
    private ConditionType rangeCondition = ConditionType.FAR;  
    private double currentPosition = 0.;
    private double currentHealth = STARTING_HEALTH;    
    private double timeForNextAction = 0.;

	public GameBot(String name, int punchReach, int punchPower, int kickReach, int kickPower) {
        super(name, punchReach, punchPower, kickReach, kickPower);
        if (speed < MINIMAL_SPEED) {
            speed = MINIMAL_SPEED;
        }
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
	    
	    for (BehaviourRule rule : rules) {
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
}