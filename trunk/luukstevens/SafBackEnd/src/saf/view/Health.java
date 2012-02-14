package saf.view;

import javax.swing.*;

import saf.ast.Bot;
import saf.state.Game;

public class Health extends JPanel {	
	
	private JProgressBar leftHealthBar;
	private JProgressBar rightHealthBar;
	
	private Game game;
	private Bot left;
	private Bot right;
	
	public Health(Game game, Bot left, Bot right) {
		
		this.game = game;
		this.left = left;
		this.right = right;
		
		addComponents();
	}
	
	public void update() {
		
		leftHealthBar.setValue(game.getLeftBot().getHealth());
		rightHealthBar.setValue(game.getRightBot().getHealth());
	}
	
	private void addComponents() {
		
		JLabel leftBotName = new JLabel(left.getName());
		add(leftBotName);
		
		leftHealthBar = new JProgressBar(0, 100);
		leftHealthBar.setValue(100);
		leftHealthBar.setStringPainted(true);
		add(leftHealthBar);
		
		JLabel vs = new JLabel("VS");
		add(vs);
		
		rightHealthBar = new JProgressBar(0, 100);
		rightHealthBar.setValue(100);
		rightHealthBar.setStringPainted(true);
		add(rightHealthBar);
		
		JLabel rightBotName = new JLabel(right.getName());
		add(rightBotName);
	}
}
