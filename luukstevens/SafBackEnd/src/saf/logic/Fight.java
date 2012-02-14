package saf.logic;

import java.util.LinkedList;
import java.util.List;

import saf.ast.Action;
import saf.state.Game;
import saf.variable.IEnums;
import saf.variable.ISettings;
import saf.view.*;

public class Fight implements ISettings, IEnums {
	
	public static void start(Game game, saf.ast.Bot left, saf.ast.Bot right, Main view) throws InterruptedException {		
		
		while(game.getLeftBot().getHealth() > 0 && game.getRightBot().getHealth() > 0) {
			reduceHealth(left, game.getLeftBot(), right, game.getRightBot());
			reduceHealth(right, game.getRightBot(), left, game.getLeftBot());
			updateBotsAndView(game, left, right, view);
			
			Thread.sleep(DELAY);
		}
	}
	
	private static void reduceHealth(saf.ast.Bot botA, saf.state.Bot stateA,  saf.ast.Bot botB, saf.state.Bot stateB) {
		
		if(stateA.getCurrentAttack().equals(stateB.getCurrentAttack()) && (botA.getSpeed() > botB.getSpeed())) {
			reduceHealthSameAttack(botA, stateA, botB,  stateB);
		} else {
			retuceHealthDifferentAttack(botA, stateA, botB, stateB);
		}
	}
	
	private static void reduceHealthSameAttack(saf.ast.Bot botA, saf.state.Bot stateA,  saf.ast.Bot botB, saf.state.Bot stateB) {
		
		Action aAttack = stateA.getCurrentAttack();
		
		if(!canReach(botA, stateA, botB, stateB)) return;
		
		if(aAttack.isAttack(Attack.KICK_HIGH) || aAttack.isAttack(Attack.KICK_LOW)) {
			stateB.reduceHealth(botA.getCharacteristicValue(Characteristic.KICK_POWER));
		}
		
		if(aAttack.isAttack(Attack.PUNCH_HIGH) || aAttack.isAttack(Attack.PUNCH_LOW)) {
			stateB.reduceHealth(botA.getCharacteristicValue(Characteristic.PUNCH_POWER));
		}
	}
	
	private static void retuceHealthDifferentAttack(saf.ast.Bot botA, saf.state.Bot stateA,  saf.ast.Bot botB, saf.state.Bot stateB) {
		
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
	
	public static boolean canReach(saf.ast.Bot botA, saf.state.Bot stateA,  saf.ast.Bot botB, saf.state.Bot stateB) {
		
		if(stateA.getCurrentAttack().isAttack(Attack.KICK_LOW) 
				&& stateB.getCurrentMove().isMove(Move.JUMP)) return false;
		
		if(stateA.getCurrentAttack().isAttack(Attack.PUNCH_HIGH) 
				&& stateB.getCurrentMove().isMove(Move.CROUCH)) return false;
		
		if(stateA.getCurrentAttack().isAttack(Attack.PUNCH_LOW) || stateA.getCurrentAttack().isAttack(Attack.PUNCH_HIGH)) {
			if(stateA.getWalkedOrRunnedAway() && stateB.getWalkedOrRunnedAway() 
					&& botA.getCharacteristicValue(Characteristic.PUNCH_REACH) > THRESHOLD_REACH_BOTH_FAR) 
						return true;
			if(stateA.getWalkedOrRunnedAway() || stateB.getWalkedOrRunnedAway() 
					&& botA.getCharacteristicValue(Characteristic.PUNCH_REACH) > THRESHOLD_REACH_ONE_FAR) 
						return true;
		}
		
		if(stateA.getCurrentAttack().isAttack(Attack.KICK_LOW) || stateA.getCurrentAttack().isAttack(Attack.KICK_HIGH)) {
			if(stateA.getWalkedOrRunnedAway() && stateB.getWalkedOrRunnedAway() 
					&& botA.getCharacteristicValue(Characteristic.KICK_REACH) > THRESHOLD_REACH_BOTH_FAR) 
						return true;
			if(stateA.getWalkedOrRunnedAway() || stateB.getWalkedOrRunnedAway() 
					&& botA.getCharacteristicValue(Characteristic.KICK_REACH) > THRESHOLD_REACH_ONE_FAR) 
						return true;
		}
		
		return false;
	}
	
	private static void updateBotsAndView(Game game, saf.ast.Bot left, saf.ast.Bot right, Main view) {
		
		List<Condition> leftBotConditions = new LinkedList<Condition>();
		List<Condition> rightBotConditions = new LinkedList<Condition>();
		
		leftBotConditions.add(isWeakerStrongerEven(game.getLeftBot(), game.getRightBot()));
		rightBotConditions.add(isWeakerStrongerEven(game.getRightBot(), game.getLeftBot()));
		
		Condition farOrNear = isFarOrNear(game.getLeftBot(), game.getRightBot());
		
		leftBotConditions.add(farOrNear);
		rightBotConditions.add(farOrNear);
		
		Condition leftMuchWeakerStronger = isMuchWeakerStronger(game.getLeftBot(), game.getRightBot());
		Condition rightMuchWeakerStronger = isMuchWeakerStronger(game.getRightBot(), game.getLeftBot());
		
		if(leftMuchWeakerStronger != null) leftBotConditions.add(leftMuchWeakerStronger);
		if(rightMuchWeakerStronger != null) rightBotConditions.add(rightMuchWeakerStronger);
		
		game.getLeftBot().update(left.getBehaviourRules(), leftBotConditions);
		game.getRightBot().update(right.getBehaviourRules(), rightBotConditions);
		view.update();
	}

	private static Condition isWeakerStrongerEven(saf.state.Bot botA, saf.state.Bot botB) {
		if(botA.getHealth() > botB.getHealth()) return Condition.STRONGER;
		if(botA.getHealth() < botB.getHealth()) return Condition.WEAKER;
		
		return Condition.EVEN;
	}

	private static Condition isMuchWeakerStronger(saf.state.Bot botA, saf.state.Bot botB) {
		if((botA.getHealth() +  THRESHOLD_MUCH_WEAKER_STRONGER) > botB.getHealth()) 
			return Condition.MUCH_STRONGER;
		if((botA.getHealth() - THRESHOLD_MUCH_WEAKER_STRONGER) < botB.getHealth()) 
			return Condition.MUCH_WEAKER;
		
		return null;
	}

	private static Condition isFarOrNear(saf.state.Bot botA, saf.state.Bot botB) {
		if(botA.getWalkedOrRunnedAway() && botB.getWalkedOrRunnedAway()) return Condition.FAR;
		
		return Condition.NEAR;
	}
}
