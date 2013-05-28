package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;

import game.Jury;

import javax.swing.JFrame;

public class Arena extends JFrame implements UpdatableGui {
	
	private Jury jury;
	private Battlefield battlefield;
	private HealthPanel hp1;
	private HealthPanel hp2;
	
	public Arena(Jury jury){
		this.jury = jury;
		init();
	}

	private void init(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Arena");
		this.setBounds(0, 0, 800, 500);
		this.setLayout(null);
		this.setVisible(true);
		
		hp1 = new HealthPanel(jury.getFighterOne());
		hp1.setBounds(0, 0, 200, 100);
		this.getContentPane().add(hp1);
		
		hp2 = new HealthPanel(jury.getFighterTwo());
		hp2.setBounds(600, 0, 200, 100);
		this.getContentPane().add(hp2);
		
		battlefield = new Battlefield(jury.getFighterOne(), jury.getFighterTwo());
		battlefield.setBounds(0, 100, 800, 400);
		this.getContentPane().add(battlefield);
		
		this.setVisible(true);
	}

	@Override
	public void update() {
		this.battlefield.update();
		this.hp1.update();
		this.hp2.update();
	}


}
