package fighter.gui;

import java.awt.GridLayout;

import javax.swing.JPanel;

import fighter.algorithm.FighterDescription;

public class StatusPanel extends JPanel {

	private FighterStatus firstFighter;
	private FighterStatus secondFighter;

	public StatusPanel(FighterDescription firstFighterDesc,
			FighterDescription secondFighterDesc) {
		setLayout(new GridLayout(1, 2));
		this.firstFighter = new FighterStatus(firstFighterDesc);
		this.secondFighter = new FighterStatus(secondFighterDesc);
		add(this.firstFighter);
		add(this.secondFighter);
	}
	
}
