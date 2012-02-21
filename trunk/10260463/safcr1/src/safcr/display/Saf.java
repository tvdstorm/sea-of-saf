package safcr.display;

import java.awt.Dimension;
import java.awt.MediaTracker;
import java.awt.Image;

import javax.swing.JFrame;

public class Saf extends JFrame {
	private String title = "Super Awesome Fighter";
	private Dimension windowSize = new Dimension(1280,720);
	private BotChar bot;
	
	public Saf(){
		add(new Board());
		setTitle(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(windowSize);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }
	
    public static void main(String[] args) {
        new Saf();
    }
}
