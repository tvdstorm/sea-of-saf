package game;



import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GameFrame extends JFrame {


    private static String stage = "src/com/mike/SAF/Resources/Sprites/stage.png";
    private Image img;
	public GameFrame(){
		Board b = new Board();
        add(b);
    	this.img = new ImageIcon(stage).getImage(); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640, 320);
        setLocationRelativeTo(null);
        setTitle("R - Type");
        setResizable(false);
        setVisible(true);
	}
	

}
