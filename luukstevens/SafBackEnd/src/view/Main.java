package view;

import java.awt.*;
import javax.swing.*;

import state.Game;

import ast.Bot;


public class Main extends JFrame {
	private static final int WIDTH = 600;
	private static final int HEIGHT = 350; 
	
	private static final int X_POSITION = 100;
	private static final int Y_POSITION = 100;

	private Arena arena;
	private Health health;
	
	public Main(Game game, Bot left, Bot right) {
		
		arena = new Arena(game, left, right);
		add(arena);
		
		health = new Health(game, left, right);
		add(health);

		setTitle("Super Awesome Fighters");
		setSize(WIDTH, HEIGHT);
		setLocation(X_POSITION, Y_POSITION);
		setVisible(true);
		setBackground(Color.LIGHT_GRAY);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void update() {
		arena.repaint();
		health.update();
	}
}
