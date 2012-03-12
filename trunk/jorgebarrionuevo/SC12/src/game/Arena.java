package game;

import java.util.ArrayList;

import model.Fighter;

public class Arena{

	private ArrayList<Fighter> fighters = new ArrayList<Fighter>();
	
	public void addFighter(Fighter fighter) {
		this.fighters.add(fighter);
	}
	
	public void start() {
		//System.out.println("Arena.start()");
	}
	
	public ArrayList<Fighter> getFighters() {
		return this.fighters;
	}
	
}
