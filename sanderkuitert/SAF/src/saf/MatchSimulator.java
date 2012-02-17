package saf;

import saf.fighter.Fighter;


public class MatchSimulator implements Runnable {
	
	private Fighter fighter1;
	private Fighter fighter2;
	
	public MatchSimulator(Fighter fighter1, Fighter fighter2) {
		this.fighter1 = fighter1;
		this.fighter2 = fighter2;
	}

	public void run() {
		assert fighter1 != null && fighter2 != null: "Fighters not initialized";
		
		
	}
	
}
