package saf.simulator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import saf.ast.*;
import saf.ast.enums.*;
import saf.simulator.enums.*;

public class Fight {
	private Fighter firstFighter;
	private Fighter secondFighter;
	
	private float firstFighterLocation;
	private float secondFighterLocation;
	
	private long endTime;
	
	private List<AvailableConditions> firstFighterConditions;
	private List<AvailableConditions> secondFighterConditions;
	
	private Behavior firstFightersMove;
	private Behavior secondFightersMove;
	
	private String winner;
	
	private boolean end;
	
	public Fight(List<Fighter> fighters, int firstFighterX, int secondFighterX){
		int firstFighterRandPosition = (int)((Math.random() * 10) % fighters.size() -1);
		firstFighter = fighters.get(firstFighterRandPosition);
		fighters.remove(firstFighterRandPosition);
		
		int secondFighterRandPosition = (int)((Math.random() * 10) % fighters.size() -1);
		secondFighter = fighters.get(secondFighterRandPosition);
		fighters.remove(secondFighterRandPosition);
		
		endTime = getTimeInSecs() + 30;
		
		firstFighterConditions = new ArrayList<AvailableConditions>();
		secondFighterConditions = new ArrayList<AvailableConditions>();
		
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
			firstFighterConditions.add(AvailableConditions.NEAR);
			secondFighterConditions.add(AvailableConditions.NEAR);
		} else {
			firstFighterConditions.add(AvailableConditions.FAR);
			secondFighterConditions.add(AvailableConditions.FAR);
		}
		
		// Assess strength : weaker, much_weaker, stronger, much_stronger
		if (firstFighter.getTotalStrength() > secondFighter.getTotalStrength()){
			if (firstFighter.getTotalStrength() > secondFighter.getTotalStrength() + 10){
				firstFighterConditions.add(AvailableConditions.MUCH_STRONGER);
				secondFighterConditions.add(AvailableConditions.MUCH_WEAKER);
			} else {
				firstFighterConditions.add(AvailableConditions.STRONGER);
				secondFighterConditions.add(AvailableConditions.WEAKER);
			}
		} else if (firstFighter.getTotalStrength() < secondFighter.getTotalStrength()){
			if (firstFighter.getTotalStrength() < secondFighter.getTotalStrength() - 10){
				firstFighterConditions.add(AvailableConditions.MUCH_WEAKER);
				secondFighterConditions.add(AvailableConditions.MUCH_STRONGER);
			} else {
				firstFighterConditions.add(AvailableConditions.WEAKER);
				secondFighterConditions.add(AvailableConditions.STRONGER);
			}
		} else {
			firstFighterConditions.add(AvailableConditions.EVEN);
			secondFighterConditions.add(AvailableConditions.EVEN);
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
			firstFightersMove = calculateNextMove(firstFighter, firstFighterConditions);
		}
		if(secondFighter.getStatus().equals(FighterStatus.READY)){
			secondFightersMove = calculateNextMove(secondFighter, secondFighterConditions);
		}
	}
	
	private Behavior calculateNextMove(Fighter f, List<AvailableConditions> conditions) {
		List<Behavior> behaviors = f.getBehaviors();
		Collections.shuffle(behaviors);
		
		for(Behavior b : behaviors){
			Condition c = b.getCondition();
			if (conditions.contains(AvailableConditions.valueOf(c.getName().toUpperCase()))){
				if(c instanceof AndCondition){
					if(conditions.contains(AvailableConditions.valueOf(((AndCondition)c).getAndCondition().toUpperCase()))){
						return b;
					}
				} else {
					return b;
				}
			}
			else if(c instanceof OrCondition){
				if(conditions.contains(AvailableConditions.valueOf(((OrCondition)c).getOrCondition().toUpperCase())))
					return b;
			}
			else if(conditions.contains(AvailableConditions.ALWAYS)){
				return b;
			}
		}
		return null;
	}

	public Behavior getFirstFightersMove(){
		return firstFightersMove;
	}
	
	public Behavior getSecondFightersMove(){
		return secondFightersMove;
	}

	public void syncFighterLocations(int firstFighterCurrentX, int secondFighterCurrentX) {
		firstFighterLocation = firstFighterCurrentX;
		secondFighterLocation = secondFighterCurrentX;
	}
}
