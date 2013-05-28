package gui;

import game.FighterAI;

import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HealthPanel extends JPanel implements UpdatableGui{
	
	private FighterAI fighter;
	private JLabel healthStatusLabel;

	public HealthPanel(FighterAI fighter){
		this.fighter = fighter;
		init();
	}
	
	private void init(){
		this.setBorder(BorderFactory.createTitledBorder("HealthPanel"));
		this.setBounds(0, 0, 200, 100);
		this.setLayout(new FlowLayout());
		this.add(new JLabel("Health: "));
		String healthStatus = String.valueOf(fighter.getHealth());
		this.healthStatusLabel = new JLabel(healthStatus);
		this.add(healthStatusLabel);
		
		this.setVisible(true);
	}

	@Override
	public void update() {
		this.healthStatusLabel.setText(String.valueOf(fighter.getHealth()));
	}

}
