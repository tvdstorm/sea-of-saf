package saf.simulator;

import java.util.List;

import saf.ast.*;

public class FightSimulator {
	private Fight fight;
	
	public FightSimulator(List<Fighter> fighters){
		fight = new Fight(fighters);
	}
	
	public void Simulate(){
		System.out.println("Simulating...");
		System.out.println(fight.firstFighter.getName() + " VS " + fight.secondFighter.getName());
		// TODO Simulate
		System.out.println("Simulating Finished");
	}
}
