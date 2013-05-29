package gui;

import game.FighterAI;

import java.awt.Component;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HealthPanel extends JPanel implements UpdatableGui{
	
	private FighterAI fighter;
	private JLabel healthStatusLabel;
	public static final int WIDTH = 200;
	public static final int HEIGTH = 100;

	public HealthPanel(FighterAI fighter){
		this.fighter = fighter;
		init();
	}
	
	private void init(){
		this.setSize(WIDTH, HEIGTH);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JLabel healthLabel = new JLabel(fighter.getAst().getName() + "'s Health:");
		healthLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.add(healthLabel);
		String healthStatus = String.valueOf(fighter.getHealth());
		this.healthStatusLabel = new JLabel(healthStatus);
		this.healthStatusLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.healthStatusLabel.setFont(new Font("Arial Black", Font.PLAIN, 14));
		this.add(healthStatusLabel);
	}

	@Override
	public void update() {
		this.healthStatusLabel.setText(String.valueOf(fighter.getHealth()));
	}

}
