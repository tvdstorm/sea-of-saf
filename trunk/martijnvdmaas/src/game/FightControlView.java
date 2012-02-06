package game;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;

public class FightControlView extends JPanel {
	
	FightControlController fightControlController;
	
	public FightControlView(FightControlController fightControlController) {
		this.fightControlController = fightControlController;
		createGUIElements();
	}

	private void createGUIElements() {
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
