package saf.simulator;

import java.util.List;

import saf.Fighter;
import saf.GameOutput;


public class Simulator implements GameOutput {

	private Tournament tournament;
	private SimulatorGUI gui;
	
	public Simulator() {
		this.gui = new SimulatorGUI();
	}

	public void showFighters(List<Fighter> fighters) {
		tournament = new Tournament(fighters);
		
		gui.show(); //TODO fix use of deprecated method
		
		//tournament.run(); TODO add listener to gui for 'play' button
	}
	
}
