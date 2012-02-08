package mvc.views;

import java.awt.Graphics;
import javax.swing.JApplet;

import saf.IFighterFigure;

public class MyFightFrame extends JApplet{
	private IFighterFigure fighter1;
	private IFighterFigure fighter2;	
	
	public MyFightFrame(IFighterFigure fighter1, IFighterFigure fighter2){
		this.fighter1 = fighter1;
		this.fighter2 = fighter2;
	}
	
	public void paint (Graphics g) {
	    g.clearRect( 0, 0, this.getWidth(), this.getHeight());
		if(fighter1 != null && fighter2 != null){
		    fighter1.draw(g);
			fighter2.draw(g);
		}
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}
}