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

	public ArenaFrame(){
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  JPanel mainPanel = new JPanel();
		  this.setTitle(TITLE); 
		  this.getContentPane().add(mainPanel); 
		  this.isOpaque();
		  this.setPreferredSize(SIZE_ARENA);
		  this.setBackground(BACKGROUND_COLOR);
		  this.setLayout(new BorderLayout(5, 5));
	      this.pack();
	      this.setVisible(false);
	}
    
	public void setGameGraphicController(GameGraphicController gc){
		this.graphicController = gc;
	}
	
	public void paint(Graphics g) {
		g.drawImage(this.graphicController.getFighterPanelL().getImage(), this.graphicController.getFighterPanelL().getFighterStatus().getXPosition(), this.graphicController.getFighterPanelL().getFighterStatus().getYPosition(), rootPane);
		g.drawImage(this.graphicController.getFighterPanelL().getImage(), this.graphicController.getFighterPanelR().getFighterStatus().getXPosition(), this.graphicController.getFighterPanelR().getFighterStatus().getYPosition(), rootPane);
    }
}