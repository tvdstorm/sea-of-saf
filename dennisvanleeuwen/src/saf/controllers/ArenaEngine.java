package saf.controllers;

import saf.FighterModel;
import saf.astelements.IAction;
import saf.astelements.ICondition;

public class ArenaEngine {
	private FighterModel currentFighter;
	private FighterModel enemyFighter;
	
	public ArenaEngine(FighterModel currentFighter, FighterModel enemyFighter){
		this.currentFighter = currentFighter;
		this.enemyFighter = enemyFighter;
	}
	
	public FighterModel getCurrentFighter(){
		return this.currentFighter;
	}
	
	public void swapFighters(){
		FighterModel temp = this.currentFighter;
		this.currentFighter = this.enemyFighter;
		this.enemyFighter = temp;
	}
	
	public Boolean isTheCase(ICondition condition){//TODO: refactor with map: string -> Object/Class
		if(condition.getNodeName() == "far")
			return this.calculateDistance() > 10;
		else if(condition.getNodeName() == "near")
			return this.calculateDistance() < 5;
		/* Put the much_..... conditons before the .... conditions because of priority! */
		else if(condition.getNodeName() == "much_weaker")
			return this.calculateTotalStrength(currentFighter)*2 < this.calculateTotalStrength(enemyFighter);
		else if(condition.getNodeName() == "weaker")
			return this.calculateTotalStrength(currentFighter) < this.calculateTotalStrength(enemyFighter);		
		else if(condition.getNodeName() == "even")
			return this.calculateTotalStrength(currentFighter) == this.calculateTotalStrength(enemyFighter);
		else if(condition.getNodeName() == "much_stronger")
			return this.calculateTotalStrength(currentFighter) > this.calculateTotalStrength(enemyFighter)*2;
		else if(condition.getNodeName() == "stronger")
			return this.calculateTotalStrength(currentFighter) > this.calculateTotalStrength(enemyFighter);
		
		return false;
	}
	
	public void doMoveAction(IAction action){ //TODO: refactor same as condition
	//Move Actions
		if(action.getNodeName().equals("jump") || action.getNodeName().equals("crouch")){
			//nothing
			this.currentFighter.setCurrentMoveState(action.getNodeName());
		}
		else{
			if(action.getNodeName().equals("run_away")){
			
			}else if(action.getNodeName().equals("walk_away")){
				
			}else if(action.getNodeName().equals("walk_towards")){
				
			}else if(action.getNodeName().equals("run_towards")){
				
			}
			//if there is no 'special' move action, move action is stand.
			this.currentFighter.setCurrentMoveState("stand");
		}
	}
				
			
			
			
	
	public void doFightAction(IAction action){ //TODO: refactor same as condition
		//FightActions
		if(!enemyFighter.getCurrentFightState().equals("block_low") && enemyFighter.getCurrentMoveState().equals("")){
			if(action.getNodeName().equals("punch_low")){
				if(Math.abs(currentFighter.getX() - enemyFighter.getX()) <= currentFighter.findCharacteristicValue("punchReach"))
					enemyFighter.setHealth(enemyFighter.getHealth() - (currentFighter.findCharacteristicValue("punchPower")));
			}
			else if(action.getNodeName().equals("kick_low")){
				if(Math.abs(currentFighter.getX() - enemyFighter.getX()) <= currentFighter.findCharacteristicValue("kickReach"))
					enemyFighter.setHealth(enemyFighter.getHealth() - (currentFighter.findCharacteristicValue("kickPower")));
			}
		}
		else if(!enemyFighter.getCurrentFightState().equals("block_high")){
			if(action.getNodeName().equals("punch_high")){
				if(Math.abs(currentFighter.getX() - enemyFighter.getX()) <= currentFighter.findCharacteristicValue("punchReach"))
					enemyFighter.setHealth(enemyFighter.getHealth() - (currentFighter.findCharacteristicValue("punchPower")));						
			}
			else if(action.getNodeName().equals("kick_high")){
				if(Math.abs(currentFighter.getX() - enemyFighter.getX()) <= currentFighter.findCharacteristicValue("kickReach"))
					enemyFighter.setHealth(enemyFighter.getHealth() - (currentFighter.findCharacteristicValue("kickPower")));				
			}
		}
		else {
			if(action.getNodeName().equals("block_low")){
				
			}
			else if(action.getNodeName().equals("block_high")){
				
			}
		}
		
		currentFighter.setCurrentFightState(action.getNodeName());
	}
	
	public Boolean isAnyFighterDeath(){
		return currentFighter.getHealth() > 0 && enemyFighter.getHealth() > 0;
	}
	
	private int calculateDistance(){
		return Math.abs(currentFighter.getX() - enemyFighter.getX());
	}
	
	private int calculateTotalStrength(FighterModel fighter){
		return fighter.findCharacteristicValue("punchReach") * 
			   fighter.findCharacteristicValue("punchPower") +
			   fighter.findCharacteristicValue("kickReach") * 
			   fighter.findCharacteristicValue("kickPower");
	}
}
