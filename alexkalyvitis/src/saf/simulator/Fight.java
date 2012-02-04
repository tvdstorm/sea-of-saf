package saf.simulator;

import java.util.List;

import saf.ast.Fighter;

public class Fight {
	private Fighter firstFighter;
	private Fighter secondFighter;
	
	public Fight(List<Fighter> fighters){
		int firstFighterPosition = (int)((Math.random() * 10) % fighters.size() -1);
		firstFighter = fighters.get(firstFighterPosition);
		fighters.remove(firstFighterPosition);
		
		int secondFighterPosition = (int)((Math.random() * 10) % fighters.size() -1);
		secondFighter = fighters.get(secondFighterPosition);
		fighters.remove(secondFighterPosition);
	}
	
	public Fighter getFirstFighter(){ return firstFighter; }
	public Fighter getSecondFighter(){ return secondFighter; }
	
	public void nextAction(){
		
	}
}
