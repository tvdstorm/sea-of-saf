package saf.logic;

import java.util.LinkedList;
import java.util.List;

import saf.ast.Action;
import saf.ast.Bot;
import saf.state.BotState;
import saf.variable.Options;
import saf.variable.Settings;
import saf.view.*;

public class Fight implements Settings, Options {
	
	private Bot left;
	private BotState leftState;
	private Bot right;
	private BotState rightState;
	private MainView view;
	
	public Fight(Bot left, BotState leftState, Bot right, BotState rightState, MainView view) {
		this.left = left;
		this.leftState = leftState;
		this.right = right;
		this.rightState = rightState;
		this.view = view;
	}
	
	public void start() throws InterruptedException {		
		
		while(leftState.getHealth() > 0 && rightState.getHealth() > 0) {
			reduceHealth(left, leftState, right, rightState);
			reduceHealth(right, rightState, left, leftState);
			updateBotsAndView();
			
			Thread.sleep(DELAY);
		}
	}
	
	private void reduceHealth(Bot botA, BotState stateA, Bot botB, BotState stateB) {
		
		if(stateA.getCurrentAttack().equals(stateB.getCurrentAttack()) && (botA.getSpeed() > botB.getSpeed())) {
			reduceHealthSameAttack(botA, stateA, botB,  stateB);
		} else {
			retuceHealthDifferentAttack(botA, stateA, botB, stateB);
		}
	}
	
	private void reduceHealthSameAttack(Bot botA, BotState stateA, Bot botB, BotState stateB) {
		
		Action aAttack = stateA.getCurrentAttack();
		
		if(!canReach(botA, stateA, botB, stateB)) return;
		
		if(aAttack.isAttack(Attack.KICK_HIGH) || aAttack.isAttack(Attack.KICK_LOW)) {
			stateB.reduceHealth(botA.getCharacteristicValue(Characteristic.KICK_POWER));
		}
		
		if(aAttack.isAttack(Attack.PUNCH_HIGH) || aAttack.isAttack(Attack.PUNCH_LOW)) {
			stateB.reduceHealth(botA.getCharacteristicValue(Characteristic.PUNCH_POWER));
		}
	}
	
	private void retuceHealthDifferentAttack(Bot botA, BotState stateA, Bot botB, BotState stateB) {
		
		Action aAttack = stateA.getCurrentAttack();
		Action bAttack = stateB.getCurrentAttack();
		
		if(!canReach(botA, stateA, botB, stateB)) return;
		
		if(aAttack.isAttack(Attack.KICK_LOW) && !bAttack.isAttack(Attack.BLOCK_LOW)) {
			stateB.reduceHealth(botA.getCharacteristicValue(Characteristic.KICK_POWER));
		}
		
		if(aAttack.isAttack(Attack.PUNCH_LOW) && !bAttack.isAttack(Attack.PUNCH_HIGH)) {
			stateB.reduceHealth(botA.getCharacteristicValue(Characteristic.PUNCH_POWER));
		}
		
		if(aAttack.isAttack(Attack.KICK_HIGH) && !bAttack.isAttack(Attack.BLOCK_HIGH)) {
			stateB.reduceHealth(botA.getCharacteristicValue(Characteristic.KICK_POWER));
		}
		
		if(aAttack.isAttack(Attack.PUNCH_HIGH) && !bAttack.isAttack(Attack.BLOCK_HIGH)) {
			stateB.reduceHealth(botA.getCharacteristicValue(Characteristic.PUNCH_POWER));
		}
	}
	
	public boolean canReach(Bot botA, BotState stateA, Bot botB, BotState stateB) {
		
		if(stateA.getCurrentAttack().isAttack(Attack.KICK_LOW) 
				&& stateB.getCurrentMove().isMove(Move.JUMP)) return false;
		
		if(stateA.getCurrentAttack().isAttack(Attack.PUNCH_HIGH) 
				&& stateB.getCurrentMove().isMove(Move.CROUCH)) return false;
		
		if(stateA.getCurrentAttack().isAttack(Attack.PUNCH_LOW) || stateA.getCurrentAttack().isAttack(Attack.PUNCH_HIGH)) {
			if(stateA.getWalkedOrRanAway() && stateB.getWalkedOrRanAway() 
					&& botA.getCharacteristicValue(Characteristic.PUNCH_REACH) > THRESHOLD_REACH_BOTH_FAR) 
						return true;
			if(stateA.getWalkedOrRanAway() || stateB.getWalkedOrRanAway() 
					&& botA.getCharacteristicValue(Characteristic.PUNCH_REACH) > THRESHOLD_REACH_ONE_FAR) 
						return true;
		}
		
		if(stateA.getCurrentAttack().isAttack(Attack.KICK_LOW) || stateA.getCurrentAttack().isAttack(Attack.KICK_HIGH)) {
			if(stateA.getWalkedOrRanAway() && stateB.getWalkedOrRanAway() 
					&& botA.getCharacteristicValue(Characteristic.KICK_REACH) > THRESHOLD_REACH_BOTH_FAR) 
						return true;
			if(stateA.getWalkedOrRanAway() || stateB.getWalkedOrRanAway() 
					&& botA.getCharacteristicValue(Characteristic.KICK_REACH) > THRESHOLD_REACH_ONE_FAR) 
						return true;
		}
		
		return false;
	}
	
	private void updateBotsAndView() {
		
		List<Condition> leftBotConditions = new LinkedList<Condition>();
		List<Condition> rightBotConditions = new LinkedList<Condition>();
		
		leftBotConditions.add(isWeakerStrongerEven(leftState, rightState));
		rightBotConditions.add(isWeakerStrongerEven(rightState, leftState));
		
		Condition farOrNear = isFarOrNear(leftState, rightState);
		
		leftBotConditions.add(farOrNear);
		rightBotConditions.add(farOrNear);
		
		Condition leftMuchWeakerStronger = isMuchWeakerStronger(leftState, rightState);
		Condition rightMuchWeakerStronger = isMuchWeakerStronger(rightState, leftState);
		
		if(leftMuchWeakerStronger != null) leftBotConditions.add(leftMuchWeakerStronger);
		if(rightMuchWeakerStronger != null) rightBotConditions.add(rightMuchWeakerStronger);
		
		leftState.update(leftBotConditions);
		rightState.update(rightBotConditions);
		view.update();
	}

	private Condition isWeakerStrongerEven(saf.state.BotState botA, saf.state.BotState botB) {
		if(botA.getHealth() > botB.getHealth()) return Condition.STRONGER;
		if(botA.getHealth() < botB.getHealth()) return Condition.WEAKER;
		
		return Condition.EVEN;
	}

	private Condition isMuchWeakerStronger(saf.state.BotState botA, saf.state.BotState botB) {
		if((botA.getHealth() +  THRESHOLD_MUCH_WEAKER_STRONGER) > botB.getHealth()) 
			return Condition.MUCH_STRONGER;
		if((botA.getHealth() - THRESHOLD_MUCH_WEAKER_STRONGER) < botB.getHealth()) 
			return Condition.MUCH_WEAKER;
		
		return null;
	}

	private Condition isFarOrNear(saf.state.BotState botA, saf.state.BotState botB) {
		if(botA.getWalkedOrRanAway() && botB.getWalkedOrRanAway()) return Condition.FAR;
		
		return Condition.NEAR;
	}
}
