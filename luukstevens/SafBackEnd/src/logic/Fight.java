package logic;

import java.util.LinkedList;
import java.util.List;

import view.Main;
import model.*;
import model.attack.Attack;
import model.attack.BlockHigh;
import model.attack.BlockLow;
import model.attack.KickHigh;
import model.attack.KickLow;
import model.attack.PunchHigh;
import model.attack.PunchLow;
import model.enums.*;

public class Fight {
	private static final int MUCH_WEAKER_STRONGER_DIFFERENCE = 20;
	private static final int DELAY = 500;
	private static final int KICK_DAMAGE = 5;
	private static final int PUNCH_DAMAGE = 5;
	
	public void start(Bot left, Bot right, Main view) throws InterruptedException {
		
		if(left.getPosition().equals(right.getPosition())) {
			//TODO: Throw error.
		}
		
		while(left.getHealth() > 0 && right.getHealth() > 0) {
			reduceHealth(left, right);
			//reduceHealth(right, left);
			updateBotsAndView(left, right, view);
			
			Thread.sleep(DELAY);
		}
	}
	
	private void reduceHealth(Bot a, Bot b) {
		//Bots can't hit eachother when far from each other.
		if(isFarOrNear(a,b).equals(ConditionType.FAR)) return;
		
		Attack aAttack = a.getCurrentAttack();
		Attack bAttack = b.getCurrentAttack();
		
		if(aAttack.isMove(PunchHigh.class) && !bAttack.isMove(BlockHigh.class)) {
			b.reduceHealth(PUNCH_DAMAGE);
		} 
		
		if(aAttack.isMove(KickHigh.class) && !bAttack.isMove(BlockHigh.class)) {
			b.reduceHealth(KICK_DAMAGE);
		} 

		if(aAttack.isMove(PunchLow.class) && !bAttack.isMove(BlockLow.class)) {
			b.reduceHealth(PUNCH_DAMAGE);
		} 
		
		if(aAttack.isMove(KickLow.class) && !bAttack.isMove(BlockLow.class)) {
			b.reduceHealth(KICK_DAMAGE);
		}
		
		if(aAttack.isMove(PunchHigh.class) && bAttack.isMove(PunchHigh.class)) {
			if(a.getSpeed() > b.getSpeed()) b.reduceHealth(PUNCH_DAMAGE);
		} 
		
		if(aAttack.isMove(KickHigh.class) && bAttack.isMove(KickHigh.class)) {
			if(a.getSpeed() > b.getSpeed()) b.reduceHealth(KICK_DAMAGE);
		} 
		
		if(aAttack.isMove(PunchLow.class) && bAttack.isMove(PunchLow.class)) {
			if(a.getSpeed() > b.getSpeed()) b.reduceHealth(PUNCH_DAMAGE);
		} 
		
		if(aAttack.isMove(KickLow.class) && bAttack.isMove(KickLow.class)) {
			if(a.getSpeed() > b.getSpeed()) b.reduceHealth(KICK_DAMAGE);
		} 
	}
	
	
	private void updateBotsAndView(Bot left, Bot right, Main view) {
		List<ConditionType> leftBotConditions = new LinkedList<ConditionType>();
		List<ConditionType> rightBotConditions = new LinkedList<ConditionType>();
		
		leftBotConditions.add(isWeakerStrongerEven(left, right));
		rightBotConditions.add(isWeakerStrongerEven(right, left));
		
		ConditionType farOrNear = isFarOrNear(left, right);
		
		leftBotConditions.add(farOrNear);
		rightBotConditions.add(farOrNear);
		
		ConditionType leftMuchWeakerStronger = isMuchWeakerStronger(left, right);
		ConditionType rightMuchWeakerStronger = isMuchWeakerStronger(right, left);
		
		if(leftMuchWeakerStronger != null) leftBotConditions.add(leftMuchWeakerStronger);
		if(rightMuchWeakerStronger != null) leftBotConditions.add(rightMuchWeakerStronger);
		
		left.update(leftBotConditions);
		right.update(rightBotConditions);
		view.update();
	}
	
	private ConditionType isWeakerStrongerEven(Bot a, Bot b) {
		if(a.getHealth() > b.getHealth()) return ConditionType.STRONGER;
		if(a.getHealth() < b.getHealth()) return ConditionType.WEAKER;
		
		return ConditionType.EVEN;
	}
	
	private ConditionType isMuchWeakerStronger(Bot a, Bot b) {
		if((a.getHealth() +  MUCH_WEAKER_STRONGER_DIFFERENCE) > b.getHealth()) 
			return ConditionType.MUCH_STRONGER;
		if((a.getHealth() - MUCH_WEAKER_STRONGER_DIFFERENCE) < b.getHealth()) 
			return ConditionType.MUCH_WEAKER;
		
		return null;
	}
	
	private ConditionType isFarOrNear(Bot a, Bot b) {
		if(a.getWalkedOrRunnedAway() && b.getWalkedOrRunnedAway()) return ConditionType.FAR;
		
		return ConditionType.NEAR;
	}
}
