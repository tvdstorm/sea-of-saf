package fighter.gui;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import fighter.IFighter;
import fighter.algorithm.BattleConstants;
import fighter.algorithm.FighterDescription;

@SuppressWarnings("serial")
public class FighterStatus extends JPanel {

	private JLabel health;
	private JLabel name;
	private FighterDescription fighterDesc;
	
	public FighterStatus(FighterDescription fighterDescription) {
		this.fighterDesc = fighterDescription;
		setLayout(new GridLayout(2, 1));
		name = new JLabel(fighterDescription.getFighter().getName());
		add(name);
		health = new JLabel(String.valueOf(BattleConstants.startingHealth));
		add(health);
	}

	public void upadateHealth() {
		this.health.setText(String.valueOf(fighterDesc.getHealth()));
	}
}
