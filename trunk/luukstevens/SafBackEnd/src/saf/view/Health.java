package saf.view;

import javax.swing.*;

import saf.ast.Bot;
import saf.state.BotState;

@SuppressWarnings("serial")
public class Health extends JPanel {	
	
	private JProgressBar leftHealthBar;
	private JProgressBar rightHealthBar;
	private Bot left;
	private BotState leftState;
	private Bot right;
	private BotState rightState;
	
	public Health(Bot left, BotState leftState, Bot right, BotState rightState) {
		this.left = left;
		this.leftState = leftState;
		this.right = right;
		this.rightState = rightState;
		
		addComponents();
	}
	
	public void update() {
		
		leftHealthBar.setValue(leftState.getHealth());
		rightHealthBar.setValue(rightState.getHealth());
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
