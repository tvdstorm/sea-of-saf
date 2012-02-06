package view;

import javax.swing.*;

import model.Bot;

public class Health extends JPanel {	
	private Bot left;
	private Bot right;
	
	private JProgressBar leftHealthBar;
	private JProgressBar rightHealthBar;
	
	public Health(Bot left, Bot right) {
		this.left = left;
		this.right = right;
		
		addComponents();
	}
	
	public void update() {
		leftHealthBar.setValue(left.getHealth());
		rightHealthBar.setValue(right.getHealth());
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
