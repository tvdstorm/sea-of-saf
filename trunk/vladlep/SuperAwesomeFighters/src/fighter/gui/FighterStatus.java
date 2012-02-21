package fighter.gui;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import fighter.algorithm.BattleConstants;
import fighter.algorithm.FighterDescription;

@SuppressWarnings("serial")
public class FighterStatus extends JPanel {

	private FighterDescription fighterDesc;
	private JLabel health;
	private JLabel name;
	
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
