package saf.simulator;

import java.util.LinkedList;
import java.util.List;

import saf.Fighter;


public class Tournament {
	
	private List<Fighter> fighters;
	private List<Duel> duels;
	
	public Tournament(List<Fighter> fighters) {
		this.fighters = fighters;
		this.duels = scheduleTournament();
	}
	
	private List<Duel> scheduleTournament() {
		List<Duel> duels = new LinkedList<Duel>();
		
		for(int i=0;i<fighters.size();i++)
			for(int j=i+1;j<fighters.size();j++)
				duels.add(new Duel(fighters.get(i),fighters.get(j)));
		
		return duels;
	}
	
}
