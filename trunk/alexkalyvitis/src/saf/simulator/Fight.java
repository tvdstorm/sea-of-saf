package saf.simulator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import saf.ast.*;
import saf.simulator.enums.*;

public class Fight {
	private Fighter firstFighter;
	private Fighter secondFighter;
	
	private float firstFighterLocation;
	private float secondFighterLocation;
	
	private long endTime;
	
	private List<String> firstFighterConditions;
	private List<String> secondFighterConditions;
	
	private Behavior firstFightersMove;
	private Behavior secondFightersMove;
	
	private String winner;
	
	private boolean end;
	
	public Fight(List<Fighter> fighters){
		int firstFighterPosition = (int)((Math.random() * 10) % fighters.size() -1);
		firstFighter = fighters.get(firstFighterPosition);
		fighters.remove(firstFighterPosition);
		
		int secondFighterPosition = (int)((Math.random() * 10) % fighters.size() -1);
		secondFighter = fighters.get(secondFighterPosition);
		fighters.remove(secondFighterPosition);
		
		endTime = getTimeInSecs() + 30;
		
		firstFighterConditions = new ArrayList<String>();
		secondFighterConditions = new ArrayList<String>();
		
		firstFighterLocation = 150;
		secondFighterLocation = 800 - 150;
	}
	
	private long getTimeInSecs() { return System.currentTimeMillis() / 1000; }
	
	public Fighter getFirstFighter(){ return firstFighter; }
	public Fighter getSecondFighter(){ return secondFighter; }
	
	public boolean hasEnded(){ return end; }
	
	public String getWinner(){ return winner; }
	
	public void assess(){
		firstFighterConditions.clear();
		secondFighterConditions.clear();
		
		// Assess distance : near,far
		float distanceX = Math.abs(firstFighterLocation - secondFighterLocation);
		if(distanceX < 400){
			firstFighterConditions.add("near");
			secondFighterConditions.add("near");
		} else {
			firstFighterConditions.add("far");
			secondFighterConditions.add("far");
		}
		
		// Assess strength : weaker, much_weaker, stronger, much_stronger
		if (firstFighter.getTotalStrength() > secondFighter.getTotalStrength()){
			if (firstFighter.getTotalStrength() > secondFighter.getTotalStrength() + 10){
				firstFighterConditions.add("much_stronger");
				secondFighterConditions.add("much_weaker");
			} else {
				firstFighterConditions.add("stronger");
				secondFighterConditions.add("weaker");
			}
		} else if (firstFighter.getTotalStrength() < secondFighter.getTotalStrength()){
			if (firstFighter.getTotalStrength() < secondFighter.getTotalStrength() - 10){
				firstFighterConditions.add("much_weaker");
				secondFighterConditions.add("much_stronger");
			} else {
				firstFighterConditions.add("weaker");
				secondFighterConditions.add("stronger");
			}
		} else {
			firstFighterConditions.add("even");
			secondFighterConditions.add("even");
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
		
		if(firstFighter.getStatus() == FighterStatus.READY){
			firstFightersMove = calculateNextMove(firstFighter, firstFighterConditions);
		}
		if(secondFighter.getStatus() == FighterStatus.READY){
			secondFightersMove = calculateNextMove(secondFighter, secondFighterConditions);
		}
	}
	
	private Behavior calculateNextMove(Fighter f, List<String> conditions) {
		List<Behavior> behaviors = f.getBehaviors();
		Collections.shuffle(behaviors);
		
		for(Behavior b : behaviors){
			Condition c = b.getCondition();
			if (conditions.contains(c)){
				if(c.getClass() == AndCondition.class){
					if(conditions.contains(((AndCondition)c).getAndCondition())){
						return b;
					}
				} else {
					return b;
				}
			}
			else if(c.getClass() == OrCondition.class){
				if(conditions.contains(((OrCondition)c).getOrCondition()))
					return b;
			}
			else if(conditions.contains("always")){
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
}
