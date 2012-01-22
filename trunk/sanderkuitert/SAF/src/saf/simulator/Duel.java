package saf.simulator;

import saf.Fighter;


public class Duel implements Runnable {
	
	private Fighter fighter1;
	private Fighter fighter2;
	
	public Duel(Fighter fighter1, Fighter fighter2) {
		this.fighter1 = fighter1;
		this.fighter2 = fighter2;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	}
	
}
