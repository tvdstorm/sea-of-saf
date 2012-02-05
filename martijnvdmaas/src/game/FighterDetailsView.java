package game;

import game.fighter.Fighter;

import javax.swing.JPanel;

public class FighterDetailsView extends JPanel {

	private FighterDetailsViewController fighterDetailsViewController;
	private Fighter fighter;

	public FighterDetailsView(Fighter fighter, FighterDetailsViewController fighterDetailsViewController) {
		this.fighterDetailsViewController = fighterDetailsViewController;
		this.fighter = fighter;
	}

}
