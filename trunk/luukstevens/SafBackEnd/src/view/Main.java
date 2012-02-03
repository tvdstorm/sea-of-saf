package view;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;

import model.Bot;

public class Main extends JFrame {
	private static final int WIDTH = 600;
	private static final int HEIGHT = 350; 
	
	private static final int X_POSITION = 100;
	private static final int Y_POSITION = 100;
	
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
		setSize(WIDTH, HEIGHT);
		setLocation(X_POSITION, Y_POSITION);
		setVisible(true);
		setBackground(Color.LIGHT_GRAY);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void update() {
		arena.update();
		health.update();
	}
}
