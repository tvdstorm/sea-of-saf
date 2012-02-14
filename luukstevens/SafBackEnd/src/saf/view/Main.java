package saf.view;

import java.awt.*;
import javax.swing.*;

import saf.ast.Bot;
import saf.state.BotState;
import saf.variable.ISettings;

@SuppressWarnings("serial")
public class Main extends JFrame implements ISettings {
	
	private Arena arena;
	private Health health;
	
	public Main(Bot left, BotState leftState, Bot right, BotState rightState) {
		
		arena = new Arena(left, leftState, right, rightState);
		add(arena);
		
		health = new Health(left, leftState, right, rightState);
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
