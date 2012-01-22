package saf.simulator;

import java.security.InvalidParameterException;
import java.util.List;

import saf.Fighter;


public class Simulator {

	private Tournament tournament;
	private SimulatorGUI gui;
	
	public Simulator() {
		this.gui = new SimulatorGUI();
	}

	/**
	 * 
	 * @param fighters
	 * @throws InvalidParameterException when fighters.size() < 2
	 */
	public void simulate(List<Fighter> fighters) throws InvalidParameterException {
		if(fighters == null || fighters.size() < 2)
			throw new InvalidParameterException("Simulation needs at least two fighters!");
		
		tournament = new Tournament(fighters);
		
		//gui.show(); TODO fix usage of deprecated method
		
		//tournament.run(); TODO add listener to gui for 'play' button
	}
	
}
