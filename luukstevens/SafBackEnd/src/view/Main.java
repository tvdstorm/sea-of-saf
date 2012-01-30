package view;

import java.awt.Color;

import javax.swing.JFrame;

public class Main extends JFrame {
	
	public Main(Arena arena) {
		setTitle("Super Awesome Fighters");
		
		setSize(800,600);
		setLocation(100,100);
		
		setVisible(true);
		setLayout(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBackground(Color.WHITE);
		
		add(arena);
	}
	
	public void addComponents() {
		
	}
}
