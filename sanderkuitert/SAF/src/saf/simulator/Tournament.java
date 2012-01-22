package saf.simulator;

import java.util.List;

import saf.Fighter;


public class Tournament implements Runnable {
	
	private List<Fighter> fighters;
	private List<Duel> duels;
	
	public Tournament(List<Fighter> fighters) {
		this.fighters = fighters;
		this.duels = scheduleTournament();
	}
	
	private List<Duel> scheduleTournament() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	}
	
}
