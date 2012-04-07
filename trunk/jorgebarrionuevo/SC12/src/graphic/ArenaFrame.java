package graphic;

import java.awt.BorderLayout;
import java.awt.Graphics;
import graphic.ArenaConfiguration;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ArenaFrame extends JFrame implements ArenaConfiguration{
	
	private GameGraphicController graphicController;
	private static final long serialVersionUID = 1L;

	public ArenaFrame(GameGraphicController gc){
		this.graphicController = gc;
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  JPanel mainPanel = new JPanel();
		  this.setTitle(TITLE); 
		  this.getContentPane().add(mainPanel); 
		  this.isOpaque();
		  this.setPreferredSize(SIZE_ARENA);
		  this.setBackground(BACKGROUND_COLOR);
		  this.setLayout(new BorderLayout(5, 5));
	      this.pack();
	      this.setVisible(true);
	}
	
	public void paint(Graphics g) {
		g.drawImage(this.graphicController.getFighterPanelL().getImage(), 100, 200, null);
		g.drawImage(this.graphicController.getFighterPanelR().getImage(), 400, 200, null);
    }
}