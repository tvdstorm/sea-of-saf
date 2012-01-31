package view;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;

import model.Bot;

public class Main extends JFrame {
	
	//Subcomponents of the main view.
	private Arena arena;
	private Health health;
	
	public Main(Bot left, Bot right) {
		
		//Add components
		arena = new Arena(left, right);
		add(arena);
		
		health = new Health(left, right);
		add(health);
		
		//Frame properties
		setTitle("Super Awesome Fighters");
		setSize(800,600);
		setLocation(100,100);
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.WHITE);
	}
	
	public void update() {
		arena.update();
		health.update();
	}
}
