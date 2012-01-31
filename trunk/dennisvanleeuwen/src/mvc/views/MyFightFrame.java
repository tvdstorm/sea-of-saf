package mvc.views;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JApplet;

import saf.visualisation.SimpleFighter;

public class MyFightFrame extends JApplet{
	private SimpleFighter fighter1;
	private SimpleFighter fighter2;	
	
	public MyFightFrame(SimpleFighter fighter1, SimpleFighter fighter2){
		this.fighter1 = fighter1;
		this.fighter2 = fighter2;
	}
	
	public void paint (Graphics g) {
	    Graphics2D g2 = (Graphics2D) g;
	    g2.clearRect( 0, 0, this.getWidth(), this.getHeight());
		if(fighter1 != null && fighter2 != null){
		    fighter1.draw(g2);
			fighter2.draw(g2);
		}
		
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}