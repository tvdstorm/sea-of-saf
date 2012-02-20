package saf.engine;

import saf.IArenaEngine;
import saf.mvc.FighterModel;
import saf.mvc.models.SimpleFighterModel;

public class SimpleArenaEngine implements IArenaEngine{
	private SimpleFighterModel currentFighter;
	private SimpleFighterModel enemyFighter;
	
	private double currentFighterTime;
	private double enemyFighterTime;
	
	private static final int MINIMUM_DISTANCE_BETWEEN_FIGHTERS = 1;
	
	public SimpleArenaEngine(SimpleFighterModel currentFighter, SimpleFighterModel enemyFighter){
		this.currentFighter = currentFighter;
		this.enemyFighter = enemyFighter;
		
		this.currentFighterTime = 0;
		this.enemyFighterTime = 0;
	}
	
	public FighterModel getCurrentFighter(){
		return this.currentFighter;
	}
	
	/* 
	 * Next fighter can be the same fighter as the 'current', because in SimpleController we check and get 
	 * the next fighter by checking the speed of the fighter.
	 */
	public void nextTurn(){
		this.currentFighterTime += this.currentFighter.getSpeed();
		this.enemyFighterTime += this.enemyFighter.getSpeed();
		
		if(this.enemyFighterTime > this.currentFighterTime){
			SimpleFighterModel tempModel = this.currentFighter;
			this.currentFighter = this.enemyFighter;
			this.enemyFighter = tempModel;
			
			double tempTime = this.currentFighterTime;
			this.currentFighterTime = this.enemyFighterTime;
			this.enemyFighterTime = tempTime;
		}
		this.currentFighterTime -= 1;
	}
	
	public Boolean isTheCase(String condition){
		if(condition.equals("far"))
			return this.getDistanceBetweenFighters() > 20;
		else if(condition.equals("near"))
			return this.getDistanceBetweenFighters() < 5;
		/* Put the much_..... conditons before the .... conditions because of priority! */
		else if(condition.equals("much_weaker"))
			return this.calculateTotalStrength(this.currentFighter)*2 < this.calculateTotalStrength(this.enemyFighter);
		else if(condition.equals("weaker"))
			return this.calculateTotalStrength(this.currentFighter) < this.calculateTotalStrength(this.enemyFighter);		
		else if(condition.equals("even"))
			return this.calculateTotalStrength(this.currentFighter) == this.calculateTotalStrength(this.enemyFighter);
		else if(condition.equals("much_stronger"))
			return this.calculateTotalStrength(this.currentFighter) > this.calculateTotalStrength(this.enemyFighter)*2;
		else if(condition.equals("stronger"))
			return this.calculateTotalStrength(this.currentFighter) > this.calculateTotalStrength(this.enemyFighter);
		else if(condition.equals("always"))
			return true;
		
		return false;
	}

	public void doMoveAction(String action){
		if(action.equals("jump") || action.equals("crouch")){
			this.currentFighter.setCurrentMoveState(action);
		}
		else{
			if(action.equals("run_away")){
				this.doMoveIfPossible(-7);
			}else if(action.equals("walk_away")){
				this.doMoveIfPossible(-2);
			}else if(action.equals("walk_towards")){
				this.doMoveIfPossible(2);
			}else if(action.equals("run_towards")){
				this.doMoveIfPossible(7);
			}
			//if there is no 'special' MOVE action, so move action will be stand.
			this.currentFighter.setCurrentMoveState("stand");
		}
	}
	
	public void doFightAction(String action){
		Boolean lowHitBlock = this.enemyFighter.getCurrentFightState().equals("block_low") || this.enemyFighter.getCurrentMoveState().equals("jump"); 
		Boolean highHitBlock = this.enemyFighter.getCurrentFightState().equals("block_high") || this.enemyFighter.getCurrentMoveState().equals("crouch"); 
		
		if(!lowHitBlock){
			if(action.equals("punch_low")){
				if(getDistanceBetweenFighters() <= this.currentFighter.findCharacteristicValue("punchReach"))
					this.enemyFighter.setHealth(this.enemyFighter.getHealth() - (this.currentFighter.findCharacteristicValue("punchPower")));
			}
			else if(action.equals("kick_low")){
				if(getDistanceBetweenFighters() <= this.currentFighter.findCharacteristicValue("kickReach"))
					this.enemyFighter.setHealth(this.enemyFighter.getHealth() - (this.currentFighter.findCharacteristicValue("kickPower")));
			}
		}
		
		if(!highHitBlock){
			if(action.equals("punch_high")){
				if(getDistanceBetweenFighters() <= this.currentFighter.findCharacteristicValue("punchReach"))
					this.enemyFighter.setHealth(this.enemyFighter.getHealth() - (this.currentFighter.findCharacteristicValue("punchPower")));						
			}
			else if(action.equals("kick_high")){
				if(getDistanceBetweenFighters() <= this.currentFighter.findCharacteristicValue("kickReach"))
					this.enemyFighter.setHealth(this.enemyFighter.getHealth() - (this.currentFighter.findCharacteristicValue("kickPower")));				
			}
		}
		
		if(this.enemyFighter.getHealth() < 0)
			this.enemyFighter.setHealth(0);
		
		this.currentFighter.setCurrentFightState(action);
	}
	
	public FighterModel getFightWinner(){
		if(this.currentFighter.getHealth() <= 0)
			return this.enemyFighter;
		else if(this.enemyFighter.getHealth() <= 0)
			return this.currentFighter;
		
		return null;
	}
	
	private void doMoveIfPossible(int distanceToMove){
		if(Math.abs(this.currentFighter.getX() - this.enemyFighter.getX()) >= Math.abs(distanceToMove + MINIMUM_DISTANCE_BETWEEN_FIGHTERS)){
			if(this.currentFighter.getX() > this.enemyFighter.getX()){
				distanceToMove = -distanceToMove;
			}
			this.currentFighter.setX(this.currentFighter.getX() + distanceToMove);
		}
	}
	
	private int getDistanceBetweenFighters(){
		return Math.abs(this.currentFighter.getX() - this.enemyFighter.getX());
	}
	
	private int calculateTotalStrength(SimpleFighterModel fighter){
		return fighter.findCharacteristicValue("punchReach") * 
			   fighter.findCharacteristicValue("punchPower") +
			   fighter.findCharacteristicValue("kickReach") * 
			   fighter.findCharacteristicValue("kickPower");
	}
}