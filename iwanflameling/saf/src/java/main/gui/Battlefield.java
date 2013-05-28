package gui;

import game.FighterAI;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Battlefield extends JPanel implements UpdatableGui {
	
	private FighterAI fighterOne;
	private FighterAI fighterTwo;
	private FighterPanel fp1;
	private FighterPanel fp2;
	
	public Battlefield(FighterAI fighterOne, FighterAI fighterTwo){
		this.fighterOne = fighterOne;
		this.fighterTwo = fighterTwo;
		init();
	}
	
	private void init(){
		this.setBorder(BorderFactory.createTitledBorder("Battlefield"));
		this.setBounds(0, 100, 800, 400);
		this.setLayout(null);
		this.add(new JLabel("This is the battlefield!"));
		this.setVisible(true);
		
		fp1 = new FighterPanel(fighterOne);
		fp1.setLocation(0, 50);
		this.add(fp1);
		
		fp2 = new FighterPanel(fighterTwo);
		fp2.setLocation(200, 50);
		this.add(fp2);
		
		this.setVisible(true);
	}

	@Override
	public void update() {
		fp1.update();
		fp2.update();
	}

}
