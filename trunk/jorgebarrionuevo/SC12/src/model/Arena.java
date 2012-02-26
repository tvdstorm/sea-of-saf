package model;

import java.util.ArrayList;

public class Arena extends ASTNode{

	private ArrayList<Fighter> fighters = new ArrayList<Fighter>();
	
	public void addFighter(Fighter fighter) {
		System.out.println("Arena.addFighter() " + "Fighter: " + fighter.getName().toString());
		this.fighters.add(fighter);
	}
	
	public void start() {
		System.out.println("Arena.start()");
		
	}
	
	public ArrayList<Fighter> getFighters() {
		return this.fighters;
	}
	
}
