package gui;

import game.FighterAI;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Battlefield extends JPanel implements UpdatableGui {
	
	private FighterAI fighterOne;
	private FighterAI fighterTwo;
	private FighterPanel fp1;
	private FighterPanel fp2;
	public static final int WIDTH = Arena.WIDTH;
	public static final int HEIGHT = Arena.HEIGHT-HealthPanel.HEIGTH;
	
	public Battlefield(FighterAI fighterOne, FighterAI fighterTwo){
		this.fighterOne = fighterOne;
		this.fighterTwo = fighterTwo;
		init();
	}
	
	private void init(){
		setSize(WIDTH, HEIGHT);
		this.setLayout(null);
		this.add(new JLabel("This is the battlefield!"));
		this.setVisible(true);
		
		fp1 = new FighterPanel(fighterOne);
		fp1.setLocation(0, 50);
		this.add(fp1);
		
		fp2 = new FighterPanel(fighterTwo);
		fp2.setLocation(200, 50);
		this.add(fp2);
	}

	@Override
	public void update() {
		fp1.update();
		fp2.update();
	}

}
