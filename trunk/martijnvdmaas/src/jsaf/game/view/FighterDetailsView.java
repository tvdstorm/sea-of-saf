package jsaf.game.view;


import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import jsaf.game.fighter.Fighter;

public class FighterDetailsView extends JPanel {

	public FighterDetailsView(Fighter fighter) {

		initializeGUI(fighter);
	}

	private void initializeGUI(Fighter fighter) {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setPreferredSize(new Dimension(100, 300));
		
		JLabel title = new JLabel(" Properties:");
		Font boldFont = new Font(title.getFont().getName(), Font.BOLD,
				title.getFont().getSize());
		
		title.setFont(boldFont);

		this.add(title);
		this.add(new JLabel(" kickReach: " + fighter.getKickReach()));
		this.add(new JLabel(" kickPower: " + fighter.getKickPower()));
		this.add(new JLabel(" punchReach: " + fighter.getPunchReach()));
		this.add(new JLabel(" punchPower: " + fighter.getPunchPower()));
	}

}
