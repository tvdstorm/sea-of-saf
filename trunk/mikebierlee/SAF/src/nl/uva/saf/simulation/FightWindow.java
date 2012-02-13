package nl.uva.saf.simulation;

import javax.swing.JFrame;
import java.awt.Dimension;

public class FightWindow extends JFrame {
	public FightWindow() {
		setSize(new Dimension(854, 480));
		setPreferredSize(new Dimension(854, 480));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Super Awesome Fighters");
		setResizable(false);
	}
	private static final long serialVersionUID = 8456781004070435366L;
	
	
}
