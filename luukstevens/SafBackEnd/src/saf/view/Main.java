package saf.view;

import java.awt.*;
import javax.swing.*;

import saf.ast.Bot;
import saf.state.Game;
import saf.variable.ISettings;

public class Main extends JFrame implements ISettings {
	
	private Arena arena;
	private Health health;
	
	public Main(Game game, Bot left, Bot right) {
		
		arena = new Arena(game, left, right);
		add(arena);
		
		health = new Health(game, left, right);
		add(health);

		setTitle("Super Awesome Fighters");
		setSize(APPLICATION_WIDTH, APPLICATION_HEIGHT);
		setLocation(APPLICATION_X_POSITION, APPLICATION_Y_POSITION);
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
