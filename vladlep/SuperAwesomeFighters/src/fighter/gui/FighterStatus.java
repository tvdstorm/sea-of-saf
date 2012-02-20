package fighter.gui;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import fighter.IFighter;
import fighter.algorithm.BattleConstants;

@SuppressWarnings("serial")
public class FighterStatus extends JPanel {

	private JLabel health;
	private JLabel name;

	public FighterStatus(IFighter fighter) {
		setLayout(new GridLayout(2, 1));
		name = new JLabel(fighter.getName());
		add(name);
		health = new JLabel(String.valueOf(BattleConstants.startingHealth));
		add(health);
	}

	public void upadateHealth(int newHealth) {
		this.health.setText(String.valueOf(newHealth));
	}
}
