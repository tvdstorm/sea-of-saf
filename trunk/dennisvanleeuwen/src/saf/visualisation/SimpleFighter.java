package saf.visualisation;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import mvc.models.FighterModel;
import saf.IFighterFigure;

public class SimpleFighter implements IFighterFigure{
	private static final float HEIGHT_ARMS = 17;
	//private static final float HEIGHT_LEG = 10;
	private static final float RADIUS_HIT_ROUND = 3;
	
	private static final float HEIGHT_LEG = 10;
	private static final float NECKBODYLENGTH = 25;
	private static final float WIDTH_BODY = 20;
	private static final float LENGTH_ARMS = 10;
	private static final float MOVELENGTH_ARMS = 5;
	
	private FighterModel curStateFighter;
	
	public void draw(Graphics graphics){
		Graphics2D graphics2D = (Graphics2D) graphics;
		
        Ellipse2D head = new Ellipse2D.Double(this.getX()-WIDTH_BODY/2, 
        									  this.getY(), 
        									  WIDTH_BODY, 
        									  WIDTH_BODY);
        graphics2D.draw(head);
		
        Line2D neckAndTorso = new Line2D.Float(this.getX(), 
        									   this.getY()+WIDTH_BODY, 
        									   this.getX(), 
        									   this.getY()+WIDTH_BODY+NECKBODYLENGTH);        
        graphics2D.draw(neckAndTorso);       

        this.drawArms(graphics2D);        
        this.drawLegs(graphics2D);
	}
	
	public SimpleFighter(FighterModel fighterModel, Boolean left){
		this.curStateFighter = fighterModel;
	}
	
	private int getX(){
		return (int) (this.curStateFighter.getX()*5 + 100);
	}

	private int getY(){
		return 100;
	}
	
	private void drawArms(Graphics2D graphics){
		Line2D bothArms = null;
//		int lowY = ;
//		int highY = ;
//		int leftX = ;
//		int rightX = ;
        switch(this.curStateFighter.getFrontArm()){
        	case NORMAL:{
        	   bothArms = new Line2D.Float(this.getX() - LENGTH_ARMS, 
        								   this.getY() + WIDTH_BODY + (NECKBODYLENGTH - HEIGHT_ARMS), 
        								   this.getX() + LENGTH_ARMS, 
        								   this.getY() + WIDTH_BODY + (NECKBODYLENGTH - HEIGHT_ARMS));   
        	   break;
        	}
        	case HIGH:{
         	   bothArms = new Line2D.Float(this.getX() - LENGTH_ARMS, 
         								   this.getY() + WIDTH_BODY + (NECKBODYLENGTH - HEIGHT_ARMS) - MOVELENGTH_ARMS, 
         								   this.getX() + LENGTH_ARMS, 
         								   this.getY() + WIDTH_BODY + (NECKBODYLENGTH - HEIGHT_ARMS) - MOVELENGTH_ARMS);   
         	   break;
         	}
        	case LOW:{
         	   bothArms = new Line2D.Float(this.getX() - LENGTH_ARMS, 
         								   this.getY() + WIDTH_BODY + (NECKBODYLENGTH - HEIGHT_ARMS) + MOVELENGTH_ARMS, 
         								   this.getX() + LENGTH_ARMS, 
         								   this.getY() + WIDTH_BODY + (NECKBODYLENGTH - HEIGHT_ARMS) + MOVELENGTH_ARMS);   
         	   break;
         	}
        }
        if(bothArms != null)
        	graphics.draw(bothArms);  		
	}
	
	private void drawLegs(Graphics2D graphics){
        Line2D leftLeg = new Line2D.Float(this.getX(), 
						  this.getY()+WIDTH_BODY+NECKBODYLENGTH, 
						  this.getX() - HEIGHT_LEG, 
						  this.getY() + WIDTH_BODY + NECKBODYLENGTH + HEIGHT_LEG);        
		graphics.draw(leftLeg);
		
		Line2D rightLeg = null;
		switch(this.curStateFighter.getFrontLeg()){
			case NORMAL:{
				rightLeg = new Line2D.Float(this.getX(), 
										    this.getY() + WIDTH_BODY+NECKBODYLENGTH, 
										    this.getX() + HEIGHT_LEG, 
										    this.getY() + WIDTH_BODY + NECKBODYLENGTH + HEIGHT_LEG);        			
				break;
			}
			case LOW:{
				rightLeg = new Line2D.Float(this.getX(), 
										    this.getY() + WIDTH_BODY+NECKBODYLENGTH, 
										    this.getX() + HEIGHT_LEG, 
										    this.getY() + WIDTH_BODY + NECKBODYLENGTH);        			
				break;
			}
			case HIGH:{
				rightLeg = new Line2D.Float(this.getX(), 
										    this.getY() + WIDTH_BODY+NECKBODYLENGTH, 
										    this.getX() + HEIGHT_LEG, 
										    this.getY() + WIDTH_BODY + NECKBODYLENGTH - HEIGHT_LEG);        			
				break;
			}
		}
	
		graphics.draw(rightLeg);		
	}
}