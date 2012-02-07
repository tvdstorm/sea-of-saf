package logic;

import java.util.LinkedList;
import java.util.List;

import enums.Attack;
import enums.Characteristic;
import enums.Condition;
import enums.Move;

import ast.Action;
import ast.Bot;

import state.Game;
import view.*;

public class Fight {
	private static final int MUCH_WEAKER_STRONGER_DIFFERENCE = 20;
	private static final int THRESHOLD_REACH_BOTH_FAR = 10;
	private static final int THRESHOLD_REACH_ONE_FAR = 5;
	private static final int DELAY = 500;
	
	public static void start(Game game, ast.Bot left, ast.Bot right, Main view) throws InterruptedException {		
		while(game.getLeftBot().getHealth() > 0 && game.getRightBot().getHealth() > 0) {
			reduceHealth(left, game.getLeftBot(), right, game.getRightBot());
			reduceHealth(right, game.getRightBot(), left, game.getLeftBot());
			updateBotsAndView(game, left, right, view);
			
			Thread.sleep(DELAY);
		}
	}
	
	private static void reduceHealth(ast.Bot a, state.Bot aState,  ast.Bot b, state.Bot bState) {
		
		if(aState.getCurrentAttack().equals(bState.getCurrentAttack()) && (a.getSpeed() > b.getSpeed())) {
			reduceHealthSameAttack(a, aState, b,  bState);
		} else {
			retuceHealthDifferentAttack(a, aState, b, bState);
		}
	}
	
	private static void reduceHealthSameAttack(ast.Bot a, state.Bot aState,  ast.Bot b, state.Bot bState) {
		Action aAttack = aState.getCurrentAttack();
		
		if(aAttack.isAttack(Attack.KICK_HIGH) || aAttack.isAttack(Attack.KICK_LOW)) {
			if(canReach(a, aState, b, bState))
				bState.reduceHealth(a.getCharacteristicValue(Characteristic.KICK_POWER));
		}
		
		if(aAttack.isAttack(Attack.PUNCH_HIGH) || aAttack.isAttack(Attack.PUNCH_LOW)) {
			if(canReach(a, aState, b, bState))
				bState.reduceHealth(a.getCharacteristicValue(Characteristic.PUNCH_POWER));
		}
	}
	
	private static void retuceHealthDifferentAttack(ast.Bot a, state.Bot aState,  ast.Bot b, state.Bot bState) {
		Action aAttack = aState.getCurrentAttack();
		Action bAttack = bState.getCurrentAttack();
		
		if(aAttack.isAttack(Attack.KICK_LOW) && !bAttack.isAttack(Attack.BLOCK_LOW)) {
			if(canReach(a, aState, b, bState))
				bState.reduceHealth(a.getCharacteristicValue(Characteristic.KICK_POWER));
		}
		
		if(aAttack.isAttack(Attack.PUNCH_LOW) && !bAttack.isAttack(Attack.PUNCH_HIGH)) {
			if(canReach(a, aState, b, bState))
				bState.reduceHealth(a.getCharacteristicValue(Characteristic.PUNCH_POWER));
		}
		
		if(aAttack.isAttack(Attack.KICK_HIGH) && !bAttack.isAttack(Attack.BLOCK_HIGH)) {
			if(canReach(a, aState, b, bState))
				bState.reduceHealth(a.getCharacteristicValue(Characteristic.KICK_POWER));
		}
		
		if(aAttack.isAttack(Attack.PUNCH_HIGH) && !bAttack.isAttack(Attack.BLOCK_HIGH)) {
			if(canReach(a, aState, b, bState))
				bState.reduceHealth(a.getCharacteristicValue(Characteristic.PUNCH_POWER));
		}
	}
	
	public static boolean canReach(ast.Bot a, state.Bot aState,  ast.Bot b, state.Bot bState) {
		if(aState.getCurrentAttack().isAttack(Attack.KICK_LOW) 
				&& bState.getCurrentMove().isMove(Move.JUMP)) return false;
		
		if(aState.getCurrentAttack().isAttack(Attack.PUNCH_HIGH) 
				&& bState.getCurrentMove().isMove(Move.CROUCH)) return false;
		
		if(aState.getCurrentAttack().isAttack(Attack.PUNCH_LOW) || aState.getCurrentAttack().isAttack(Attack.PUNCH_HIGH)) {
			if(aState.getWalkedOrRunnedAway() && bState.getWalkedOrRunnedAway() 
					&& a.getCharacteristicValue(Characteristic.PUNCH_REACH) > THRESHOLD_REACH_BOTH_FAR) 
						return true;
			if(aState.getWalkedOrRunnedAway() || bState.getWalkedOrRunnedAway() 
					&& a.getCharacteristicValue(Characteristic.PUNCH_REACH) > THRESHOLD_REACH_ONE_FAR) 
						return true;
		}
		
		if(aState.getCurrentAttack().isAttack(Attack.KICK_LOW) || aState.getCurrentAttack().isAttack(Attack.KICK_HIGH)) {
			if(aState.getWalkedOrRunnedAway() && bState.getWalkedOrRunnedAway() 
					&& a.getCharacteristicValue(Characteristic.KICK_REACH) > THRESHOLD_REACH_BOTH_FAR) 
						return true;
			if(aState.getWalkedOrRunnedAway() || bState.getWalkedOrRunnedAway() 
					&& a.getCharacteristicValue(Characteristic.KICK_REACH) > THRESHOLD_REACH_ONE_FAR) 
						return true;
		}
		
		return false;
	}
	
	private static void updateBotsAndView(Game game, ast.Bot left, ast.Bot right, Main view) {
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

	private static Condition isWeakerStrongerEven(state.Bot a, state.Bot b) {
		if(a.getHealth() > b.getHealth()) return Condition.STRONGER;
		if(a.getHealth() < b.getHealth()) return Condition.WEAKER;
		
		return Condition.EVEN;
	}

	private static Condition isMuchWeakerStronger(state.Bot a, state.Bot b) {
		if((a.getHealth() +  MUCH_WEAKER_STRONGER_DIFFERENCE) > b.getHealth()) 
			return Condition.MUCH_STRONGER;
		if((a.getHealth() - MUCH_WEAKER_STRONGER_DIFFERENCE) < b.getHealth()) 
			return Condition.MUCH_WEAKER;
		
		return null;
	}

	private static Condition isFarOrNear(state.Bot a, state.Bot b) {
		if(a.getWalkedOrRunnedAway() && b.getWalkedOrRunnedAway()) return Condition.FAR;
		
		return Condition.NEAR;
	}
}
