package saf.mvc.views;

import java.awt.*;
import javax.swing.*;

import saf.mvc.FighterModel;
import saf.mvc.IView;
import saf.mvc.views.fighterfigures.PencilDrawnFigure;

public class SimpleFighterArenaView extends JPanel implements IView {
	private static final long serialVersionUID = -2587487392484802159L;
	
	private FighterModel leftFighter;
	private FighterModel rightFighter;

	private JFrame f;	
	
	private static final int APPLICATION_WIDTH = 600;
	private static final int APPLICATION_HEIGHT = 350; 
	private static final int APPLICATION_X_POSITION = 100;
	private static final int APPLICATION_Y_POSITION = 100;
	
	public SimpleFighterArenaView(FighterModel leftFighter, FighterModel rightFighter){		
		this.leftFighter = leftFighter;
		this.rightFighter = rightFighter;
		
		f = new JFrame("SAF Fight Area");
		f.setTitle("Super Awesome Fighters");
		f.setSize(APPLICATION_WIDTH, APPLICATION_HEIGHT);//Size of the total window
		f.setVisible(true);
		f.setBackground(Color.white);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(this);//Because this is a JPanel add this so the paint event will be called in this class.
		
		this.setOpaque(true);//To make the background white!
	}
	
	public void render() {
		this.repaint();
	}
	
	public void paint(Graphics g) {

		g.clearRect(0, 0, APPLICATION_WIDTH, APPLICATION_HEIGHT);
		g.setColor(Color.BLACK);
		
		//If one of the fighters disappears out of the window, place them both back in the middle!
		if((this.leftFighter.getX() < 0 || this.leftFighter.getX()* PencilDrawnFigure.WIDTH_BODY > APPLICATION_WIDTH) && 
		   (this.rightFighter.getX() < 0 || this.rightFighter.getX()* PencilDrawnFigure.WIDTH_BODY > APPLICATION_WIDTH)){
			
			int toMove = APPLICATION_WIDTH /PencilDrawnFigure.WIDTH_BODY;//Move half of the size of the window, to get in the middle
			
			this.leftFighter.setX((this.leftFighter.getX() + toMove)%(APPLICATION_WIDTH/PencilDrawnFigure.WIDTH_BODY));
			this.rightFighter.setX((this.rightFighter.getX() + toMove)%(APPLICATION_WIDTH/PencilDrawnFigure.WIDTH_BODY));
		}

	    new PencilDrawnFigure(leftFighter.getX(), 
	    					  leftFighter.getCurrentMoveState(), 
	    					  leftFighter.getCurrentFightState(), 
	    					  true).draw(g);
	    
	    new PencilDrawnFigure(rightFighter.getX(), 
				    		  rightFighter.getCurrentMoveState(), 
				    		  rightFighter.getCurrentFightState(), 
				    		  false).draw(g);
		
		g.drawString("Left Fighter: " + this.leftFighter.getFighterNode().getName(), 100, 250); 
		g.drawString("Health: " + this.leftFighter.getHealth(), 100, 265);

		g.drawString("Right Fighter: " + this.rightFighter.getFighterNode().getName(), 400, 250); 
		g.drawString("Health: " + this.rightFighter.getHealth(), 400, 265);
	 }
}