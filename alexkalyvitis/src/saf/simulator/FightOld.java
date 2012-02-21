package saf.simulator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import saf.ast.*;
import saf.ast.identifiers.*;
import saf.simulator.enums.*;

public class FightOld {
	private Fighter firstFighter;
	private Fighter secondFighter;
	
	private float firstFighterLocation;
	private float secondFighterLocation;
	
	private long endTime;
	
	private List<Conditions> firstFighterConditions;
	private List<Conditions> secondFighterConditions;
	
	private Behavior firstFightersMove;
	private Behavior secondFightersMove;
	
	private String winner;
	
	private boolean end;
	
	private static final int FIGHT_TIME = 60;
	private static final int ATTACK_EFFECTIVE_DISTANCE = 200;
	
	public FightOld(List<Fighter> fighters, int firstFighterX, int secondFighterX){
		int firstFighterRandPosition = (int)((Math.random() * 10) % fighters.size() -1);
		firstFighter = fighters.get(firstFighterRandPosition);
		fighters.remove(firstFighterRandPosition);
		
		int secondFighterRandPosition = (int)((Math.random() * 10) % fighters.size() -1);
		secondFighter = fighters.get(secondFighterRandPosition);
		fighters.remove(secondFighterRandPosition);
		
		endTime = getTimeInSecs() + FIGHT_TIME;
		
		firstFighterConditions = new ArrayList<Conditions>();
		secondFighterConditions = new ArrayList<Conditions>();
		
		firstFighterLocation = firstFighterX;
		secondFighterLocation = secondFighterX;
		
		firstFighter.setStatus(FighterStatus.READY);
		secondFighter.setStatus(FighterStatus.READY);
	}
	
	private long getTimeInSecs() { return System.currentTimeMillis() / 1000; }
	
	public Fighter getFirstFighter(){ return firstFighter; }
	public Fighter getSecondFighter(){ return secondFighter; }
	
	public boolean hasEnded(){ return end; }
	
	public String getWinner(){ return winner; }
	
	public long getCountDown(){
		return endTime - getTimeInSecs(); 
	}
	
	public void assess(){
		firstFighterConditions.clear();
		secondFighterConditions.clear();
		
		// Assess distance : near,far
		float distanceX = Math.abs(firstFighterLocation - secondFighterLocation);
		if(distanceX < 200){
			firstFighterConditions.add(Conditions.NEAR);
			secondFighterConditions.add(Conditions.NEAR);
		} else {
			firstFighterConditions.add(Conditions.FAR);
			secondFighterConditions.add(Conditions.FAR);
		}
		
		// Assess strength : weaker, much_weaker, stronger, much_stronger
		if (firstFighter.getTotalStrength() > secondFighter.getTotalStrength()){
			if (firstFighter.getTotalStrength() > secondFighter.getTotalStrength() + 10){
				firstFighterConditions.add(Conditions.MUCH_STRONGER);
				secondFighterConditions.add(Conditions.MUCH_WEAKER);
			} else {
				firstFighterConditions.add(Conditions.STRONGER);
				secondFighterConditions.add(Conditions.WEAKER);
			}
		} else if (firstFighter.getTotalStrength() < secondFighter.getTotalStrength()){
			if (firstFighter.getTotalStrength() < secondFighter.getTotalStrength() - 10){
				firstFighterConditions.add(Conditions.MUCH_WEAKER);
				secondFighterConditions.add(Conditions.MUCH_STRONGER);
			} else {
				firstFighterConditions.add(Conditions.WEAKER);
				secondFighterConditions.add(Conditions.STRONGER);
			}
		} else {
			firstFighterConditions.add(Conditions.EVEN);
			secondFighterConditions.add(Conditions.EVEN);
		}
		
		if(firstFighter.getHealth() <= 0){
			winner = firstFighter.getName();
			end = true;
		} 
		else if(secondFighter.getHealth() <= 0){
			winner = secondFighter.getName();
			end = true;
		}
		else if(endTime <= getTimeInSecs()){
			winner = "Draw";
			end = true;
		}
		
		if(firstFighter.getStatus().equals(FighterStatus.READY)){
			reduceSecondFightersHealth();
			firstFightersMove = calculateNextMove(firstFighter, firstFighterConditions);
		}
		if(secondFighter.getStatus().equals(FighterStatus.READY)){
			reduceFirstFightersHealth();
			secondFightersMove = calculateNextMove(secondFighter, secondFighterConditions);
		}
	}
	
	private Behavior calculateNextMove(Fighter f, List<Conditions> conditions) {
		List<Behavior> behaviors = f.getBehaviors();
		Collections.shuffle(behaviors);
		
		for(Behavior b : behaviors){
			ConditionOld c = b.getCondition();
			if (conditions.contains(Conditions.valueOf(c.getName().toUpperCase()))){
				if(c instanceof AndCondition){
					if(conditions.contains(Conditions.valueOf(((AndCondition)c).getAndCondition().toUpperCase()))){
						return b;
					}
				} else {
					return b;
				}
			}
			else if(c instanceof OrCondition){
				if(conditions.contains(Conditions.valueOf(((OrCondition)c).getOrCondition().toUpperCase())))
					return b;
			}
			else if(conditions.contains(Conditions.ALWAYS)){
				return b;
			}
		}
		assert false: "Never happens";
		return null;
	}
	
	public void reduceFirstFightersHealth(){
		try {
			if(Math.abs(firstFighterLocation - secondFighterLocation) < ATTACK_EFFECTIVE_DISTANCE)
				firstFighter.reduceHealth(
					secondFighter.getValueOfStrength(
						secondFightersMove.getAttack().getName()
					)
				);
		} catch(Exception e){}
	}
	
	public void reduceSecondFightersHealth(){
		try {
			if(Math.abs(firstFighterLocation - secondFighterLocation) < ATTACK_EFFECTIVE_DISTANCE)
				secondFighter.reduceHealth(
					firstFighter.getValueOfStrength(
						firstFightersMove.getAttack().getName()
					)
				);
		} catch(Exception e){}
	}

	public Behavior getFirstFightersMove(){
		return firstFightersMove;
	}
	
	public Behavior getSecondFightersMove(){
		return secondFightersMove;
	}

	public void syncFighterLocations(int firstFighterCurrentX, int secondFighterCurrentX) {
		assert firstFighterCurrentX > 0: "Bug: x should be > 0";
		firstFighterLocation = firstFighterCurrentX;
		secondFighterLocation = secondFighterCurrentX;
	}
}
