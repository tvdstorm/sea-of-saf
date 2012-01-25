package saf.visualisation;



import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import saf.IFighterFigure;

public class SimpleFighter implements IFighterFigure{
	private static final int RADIUS_HEAD = 10;
	private static final int LENGTH_NECK = 10;
	
	public SimpleFighter(){
		
	}
	
	public void draw(Graphics2D graphics, State curState){
		double x = 110,
			   y = 110;
		 
		graphics.draw(new Ellipse2D.Double(x, y, RADIUS_HEAD*2, RADIUS_HEAD*2));
		graphics.draw(new Line2D.Double(x+RADIUS_HEAD, y+RADIUS_HEAD*2, 
										x+RADIUS_HEAD, y+RADIUS_HEAD+LENGTH_NECK));

	}
	
//	public static void main(String args[]){
//		
//		System.out.println("hiii");
//
//	}
	

}
