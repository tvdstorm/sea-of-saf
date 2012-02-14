package game.view;

import game.controller.FightControlController;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;

public class FightControlView extends JPanel {
	
	FightControlController fightControlController;
	
	public FightControlView(FightControlController fightControlController) {
		this.fightControlController = fightControlController;
		initializeGUI();
	}

	private void initializeGUI() {
		JButton button = new JButton("(Re) Start");
		button.setSize(new Dimension(100,10));
		button.addActionListener(fightControlController);
		add(button);
		
		button = new JButton("Play automatically");
		button.setSize(new Dimension(100,10));
		add(button);

		button = new JButton("Next step");
		button.setSize(new Dimension(100,10));
		button.addActionListener(fightControlController);
		add(button);
	}

}
