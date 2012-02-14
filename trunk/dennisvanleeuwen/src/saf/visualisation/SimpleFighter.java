package saf.visualisation;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;

import javax.crypto.spec.PSource;
import javax.imageio.ImageIO;

import mvc.models.FighterModel;
import mylib.Position;
import saf.IFighterFigure;

public class SimpleFighter implements IFighterFigure{

	private static final int HEIGHT_ARMS = 17;
	//private static final float HEIGHT_LEG = 10;
	private static final int RADIUS_HIT_ROUND = 3;
	
	private static final int HEIGHT_LEG = 10;
	private static final int NECKBODYLENGTH = 25;
	private static final int WIDTH_BODY = 20;
	private static final int LENGTH_ARMS = 10;
	private static final int MOVELENGTH_ARMS = 5;
	
	private FighterModel curStateFighter;
	
	private int getX(){
		return (int) (this.curStateFighter.getX()*WIDTH_BODY + 100);
	}

	private int getY(){
		return 100;
	}
	
	private Position getCurHipPosition(){
		Position hipPos = new Position(this.getX(), this.getY());
		if(curStateFighter.getJumping())
			return new Position(hipPos.getX(), hipPos.getY() - HEIGHT_LEG);
		return hipPos;
	}
	
	private Position getCurShoulderPosition(){
		Position hipPos = getCurHipPosition();
		int lengthBody = NECKBODYLENGTH;
		if(curStateFighter.getCrouching())
			lengthBody /= 2;
		return new Position(hipPos.getX(), hipPos.getY() - lengthBody);
	}
	
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
//        this.drawLegs(graphics2D);
	}
	
	public SimpleFighter(FighterModel fighterModel, Boolean left){
		this.curStateFighter = fighterModel;
	}
	
	private void drawArms(Graphics2D graphics){
        switch(this.curStateFighter.getFrontArm()){
        	case NORMAL:{
        		this.drawNormalArms(graphics);
        		break;
        	}
        	case HIGH:{
        		this.drawHighPunchArms(graphics);
         	   break;
         	}
        	case LOW:{
        		this.drawLowPunchArms(graphics);
        		break;
         	}
        }
	}
	
	private class MirrorTransformation{
		private int xAxeValue;
		private int yAxeValue;
		public MirrorTransformation(int xAxeValue, int yAxeValue){
			this.xAxeValue = xAxeValue;
			this.yAxeValue = yAxeValue;
		}
		
		public Position transform(Position pos){
			return new Position((this.xAxeValue - pos.getX()) + this.xAxeValue, 
								(this.yAxeValue - pos.getY()) + this.yAxeValue);
		}
	}
	
	private void drawHighPunchArms(Graphics2D graphics){
		Position curShoulder = this.getCurShoulderPosition();
		
		
		
		
		graphics.draw(new Line2D.Float(this.getX() - LENGTH_ARMS, 
				   					   this.getY() + WIDTH_BODY + (NECKBODYLENGTH - HEIGHT_ARMS) - MOVELENGTH_ARMS, 
				   					   this.getX() + LENGTH_ARMS, 
				   					   this.getY() + WIDTH_BODY + (NECKBODYLENGTH - HEIGHT_ARMS) - MOVELENGTH_ARMS));   
	}
	
	private void drawLowPunchArms(Graphics2D graphics){
		graphics.draw(new Line2D.Float(this.getX() - LENGTH_ARMS, 
				   					   this.getY() + WIDTH_BODY + (NECKBODYLENGTH - HEIGHT_ARMS) + MOVELENGTH_ARMS, 
				   					   this.getX() + LENGTH_ARMS, 
				   					   this.getY() + WIDTH_BODY + (NECKBODYLENGTH - HEIGHT_ARMS) + MOVELENGTH_ARMS));   
	}
	
	private void drawNormalArms(Graphics2D graphics){
		graphics.draw(new Line2D.Float(this.getX() - LENGTH_ARMS, 
				   					   this.getY() + WIDTH_BODY + (NECKBODYLENGTH - HEIGHT_ARMS), 
				   					   this.getX() + LENGTH_ARMS, 
				   					   this.getY() + WIDTH_BODY + (NECKBODYLENGTH - HEIGHT_ARMS)));   
	}
	
	private void drawLegs(Graphics2D graphics){
        Line2D leftLeg = new Line2D.Float(this.getX(), 
						  this.getY()+WIDTH_BODY+NECKBODYLENGTH, 
						  this.getX() - HEIGHT_LEG, 
						  this.getY() + WIDTH_BODY + NECKBODYLENGTH + HEIGHT_LEG);        
		graphics.draw(leftLeg);
		switch(this.curStateFighter.getFrontLeg()){
			case NORMAL:{
				this.drawNormalLegs(graphics);
				break;
			}
			case LOW:{
				this.drawLowKickLegs(graphics);
				break;
			}
			case HIGH:{
				this.drawHighKickLegs(graphics);
				break;
			}
		}
	}
	
	private void drawHighKickLegs(Graphics2D graphics){
		graphics.draw(new Line2D.Float(this.getX(), 
			    					   this.getY() + WIDTH_BODY+NECKBODYLENGTH, 
			    					   this.getX() + HEIGHT_LEG, 
			    					   this.getY() + WIDTH_BODY + NECKBODYLENGTH - HEIGHT_LEG));		
	}
	
	private void drawLowKickLegs(Graphics2D graphics){
		graphics.draw(new Line2D.Float(this.getX(), 
			    					   this.getY() + WIDTH_BODY+NECKBODYLENGTH, 
			    					   this.getX() + HEIGHT_LEG, 
			    					   this.getY() + WIDTH_BODY + NECKBODYLENGTH));        					
	}
	
	private void drawNormalLegs(Graphics2D graphics){
		graphics.draw(new Line2D.Float(this.getX(), 
			    					   this.getY() + WIDTH_BODY+NECKBODYLENGTH, 
			    					   this.getX() + HEIGHT_LEG, 
			    					   this.getY() + WIDTH_BODY + NECKBODYLENGTH + HEIGHT_LEG));		
	}
}