package saf.engine;

import saf.IArenaEngine;
import saf.astelements.IAction;
import saf.astelements.ICondition;
import saf.mvc.FighterModel;
import saf.mvc.models.SimpleFighterModel;

public class SimpleArenaEngine implements IArenaEngine{
	private SimpleFighterModel currentFighter;
	private SimpleFighterModel enemyFighter;
	
	private static final int MINIMUM_DISTANCE_BETWEEN_FIGHTERS = 1;
	
	public SimpleArenaEngine(SimpleFighterModel currentFighter, SimpleFighterModel enemyFighter){
		this.currentFighter = currentFighter;
		this.enemyFighter = enemyFighter;
	}
	
	public FighterModel getCurrentFighter(){
		return this.currentFighter;
	}
	
	public void switchToNextFighter(){
		SimpleFighterModel temp = this.currentFighter;
		this.currentFighter = this.enemyFighter;
		this.enemyFighter = temp;
	}
	
	public Boolean isTheCase(ICondition condition){//TODO: refactor with map: string -> Object/Class
		if(condition.getNodeName().equals("far"))
			return this.calculateDistance() > 10;
		else if(condition.getNodeName().equals("near"))
			return this.calculateDistance() < 5;
		/* Put the much_..... conditons before the .... conditions because of priority! */
		else if(condition.getNodeName().equals("much_weaker"))
			return this.calculateTotalStrength(this.currentFighter)*2 < this.calculateTotalStrength(this.enemyFighter);
		else if(condition.getNodeName().equals("weaker"))
			return this.calculateTotalStrength(this.currentFighter) < this.calculateTotalStrength(this.enemyFighter);		
		else if(condition.getNodeName().equals("even"))
			return this.calculateTotalStrength(this.currentFighter) == this.calculateTotalStrength(this.enemyFighter);
		else if(condition.getNodeName().equals("much_stronger"))
			return this.calculateTotalStrength(this.currentFighter) > this.calculateTotalStrength(this.enemyFighter)*2;
		else if(condition.getNodeName().equals("stronger"))
			return this.calculateTotalStrength(this.currentFighter) > this.calculateTotalStrength(this.enemyFighter);
		else if(condition.getNodeName().equals("always"))
			return true;
		
		return false;
	}

	public void doMoveAction(IAction action){ //TODO: refactor same as condition
		//Move Actions
		
		System.out.println("Cur move: " + action.getNodeName());
		
		if(action.getNodeName().equals("jump") || action.getNodeName().equals("crouch")){
			//nothing
			this.currentFighter.setCurrentMoveState(action.getNodeName());
		}
		else{
			if(action.getNodeName().equals("run_away")){
				this.doMoveIfPossible(-2);
			}else if(action.getNodeName().equals("walk_away")){
				this.doMoveIfPossible(-1);
			}else if(action.getNodeName().equals("walk_towards")){
				this.doMoveIfPossible(1);
			}else if(action.getNodeName().equals("run_towards")){
				this.doMoveIfPossible(2);
			}
			//if there is no 'special' MOVE action, so move action is will become stand.
			this.currentFighter.setCurrentMoveState("stand");
		}
	}
	
	//TODO canReach function that determines if the fighter can hit the other one.
	
	public void doFightAction(IAction action){ //TODO: refactor same as condition
		//FightActions
		Boolean lowHitBlock = this.enemyFighter.getCurrentFightState().equals("block_low") || this.enemyFighter.getCurrentMoveState().equals("jump"); 
		Boolean highHitBlock = this.enemyFighter.getCurrentFightState().equals("block_high") || this.enemyFighter.getCurrentMoveState().equals("crouch"); 
		
		System.out.println("Cur fight: " + action.getNodeName());
		
		if(!lowHitBlock){
			if(action.getNodeName().equals("punch_low")){
				if(Math.abs(this.currentFighter.getX() - this.enemyFighter.getX()) <= this.currentFighter.findCharacteristicValue("punchReach"))
					this.enemyFighter.setHealth(this.enemyFighter.getHealth() - (this.currentFighter.findCharacteristicValue("punchPower")));
			}
			else if(action.getNodeName().equals("kick_low")){
				if(Math.abs(this.currentFighter.getX() - this.enemyFighter.getX()) <= this.currentFighter.findCharacteristicValue("kickReach"))
					this.enemyFighter.setHealth(this.enemyFighter.getHealth() - (this.currentFighter.findCharacteristicValue("kickPower")));
			}
		}
		else if(!highHitBlock){
			if(action.getNodeName().equals("punch_high")){
				if(Math.abs(this.currentFighter.getX() - this.enemyFighter.getX()) <= this.currentFighter.findCharacteristicValue("punchReach"))
					this.enemyFighter.setHealth(this.enemyFighter.getHealth() - (this.currentFighter.findCharacteristicValue("punchPower")));						
			}
			else if(action.getNodeName().equals("kick_high")){
				if(Math.abs(this.currentFighter.getX() - this.enemyFighter.getX()) <= this.currentFighter.findCharacteristicValue("kickReach"))
					this.enemyFighter.setHealth(this.enemyFighter.getHealth() - (this.currentFighter.findCharacteristicValue("kickPower")));				
			}
		}
		else {
//			if(action.getNodeName().equals("block_low")){
//				
//			}
//			else if(action.getNodeName().equals("block_high")){
//				
//			}
		}
		
		this.currentFighter.setCurrentFightState(action.getNodeName());
	}
	
	public FighterModel getFightWinner(){
		if(this.currentFighter.getHealth() <= 0)
			return this.currentFighter;
		else if(this.enemyFighter.getHealth() <= 0)
			return this.enemyFighter;
		
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
	
	private int calculateDistance(){
		return Math.abs(this.currentFighter.getX() - this.enemyFighter.getX());
	}
	
	private int calculateTotalStrength(SimpleFighterModel fighter){
		return fighter.findCharacteristicValue("punchReach") * 
			   fighter.findCharacteristicValue("punchPower") +
			   fighter.findCharacteristicValue("kickReach") * 
			   fighter.findCharacteristicValue("kickPower");
	}
}