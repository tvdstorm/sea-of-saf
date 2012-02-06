package logic;

import java.util.LinkedList;
import java.util.List;

import view.*;
import model.*;
import model.attack.*;
import model.enums.*;
import model.move.Move;

public class Fight {
	private static final int MUCH_WEAKER_STRONGER_DIFFERENCE = 20;
	private static final int THRESHOLD_REACH_BOTH_FAR = 10;
	private static final int THRESHOLD_REACH_ONE_FAR = 5;
	private static final int DELAY = 500;
	
	public void start(Bot a, Bot b, Main view) throws InterruptedException {
		if(a.getPosition().equals(b.getPosition())) {
			throw new IllegalArgumentException("A left and right positioned bot must be argumented.");
		}
		
		while(a.getHealth() > 0 && b.getHealth() > 0) {
			reduceHealth(a, b);
			reduceHealth(b, a);
			updateBotsAndView(a, b, view);
			
			Thread.sleep(DELAY);
		}
	}
	
	private void reduceHealth(Bot a, Bot b) {
		Attack aAttack = a.getCurrentAttack();
		Attack bAttack = b.getCurrentAttack();
		
		if(aAttack.equals(bAttack) && a.isFaster(b)) {
			//Same attack. Bot a only does damage if he kicks or punches faster.
			reduceHealthSameAttack(a, b);
		} else {
			//Different attacks
			retuceHealthDifferentAttack(a, b);
		}
	}
	
	private void retuceHealthDifferentAttack(Bot a, Bot b) {
		Attack aAttack = a.getCurrentAttack();
		Attack bAttack = b.getCurrentAttack();
		
		if(aAttack.isAttack(KickLow.class) && !bAttack.isAttack(BlockLow.class)) {
			if(kickCanReach(a, b))
				b.reduceHealth(a.getCharacteristicValue(CharacteristicType.KICK_POWER));
		}
		
		if(aAttack.isAttack(PunchLow.class) && !bAttack.isAttack(PunchHigh.class)) {
			if(punchCanReach(a, b))
				b.reduceHealth(a.getCharacteristicValue(CharacteristicType.PUNCH_POWER));
		}
		
		if(aAttack.isAttack(KickHigh.class) && !bAttack.isAttack(BlockHigh.class)) {
			if(kickCanReach(a, b))
				b.reduceHealth(a.getCharacteristicValue(CharacteristicType.KICK_POWER));
		}
		
		if(aAttack.isAttack(PunchHigh.class) && !bAttack.isAttack(BlockHigh.class)) {
			if(punchCanReach(a, b))
				b.reduceHealth(a.getCharacteristicValue(CharacteristicType.PUNCH_POWER));
		}
	}

	private void reduceHealthSameAttack(Bot a, Bot b) {
		Attack aAttack = a.getCurrentAttack();
		
		if(aAttack.isAttack(KickHigh.class) || aAttack.isAttack(KickLow.class)) {
			if(kickCanReach(a, b))
				b.reduceHealth(a.getCharacteristicValue(CharacteristicType.KICK_POWER));
		}
		
		if(aAttack.isAttack(PunchHigh.class) || aAttack.isAttack(PunchLow.class)) {
			if(punchCanReach(a, b))
				b.reduceHealth(a.getCharacteristicValue(CharacteristicType.PUNCH_POWER));
		}
	}
	
	public boolean punchCanReach(Bot a, Bot b) {
		if(a.getWalkedOrRunnedAway() && b.getWalkedOrRunnedAway() 
				&& a.getCharacteristicValue(CharacteristicType.PUNCH_REACH) > THRESHOLD_REACH_BOTH_FAR) return true;
		if(a.getWalkedOrRunnedAway() || b.getWalkedOrRunnedAway() 
				&& a.getCharacteristicValue(CharacteristicType.PUNCH_REACH) > THRESHOLD_REACH_ONE_FAR) return true;
		
		return false;
	}
	
	public boolean kickCanReach(Bot a, Bot b) {
		if(a.getWalkedOrRunnedAway() && b.getWalkedOrRunnedAway() 
				&& a.getCharacteristicValue(CharacteristicType.KICK_REACH) > THRESHOLD_REACH_BOTH_FAR) return true;
		if(a.getWalkedOrRunnedAway() || b.getWalkedOrRunnedAway() 
				&& a.getCharacteristicValue(CharacteristicType.KICK_REACH) > THRESHOLD_REACH_ONE_FAR) return true;
		
		return false;
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
