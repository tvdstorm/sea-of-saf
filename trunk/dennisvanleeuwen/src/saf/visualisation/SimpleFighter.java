package saf.visualisation;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import mvc.models.FighterModel;
import saf.IFighterFigure;
import saf.visualisation.limbs.Arm;
import saf.visualisation.limbs.states.ArmHandsNormal;


public class SimpleFighter implements IFighterFigure{
	private static final float NECKBODYLENGTH = 25;
	private static final float RADIUS_HEAD = 10;
	private static final float HEIGHT_ARMS = 17;
	private static final float LENGTH_ARMS = 10;
	private static final float MOVELENGTH_ARMS = 5;
	private static final float HEIGHT_LEG = 10;
	
	private ILimb leftArm;
	
	private FighterModel curStateFighter;
	
	public SimpleFighter(FighterModel fighterModel){
		this.curStateFighter = fighterModel;
		//this.leftArm = new Arm();
	}
	
	public void draw(Graphics2D graphics){   
		
        Line2D bothArms = null;
        switch(this.curStateFighter.getFrontArm()){
        	case NORMAL:{
        	   bothArms = new Line2D.Float(curStateFighter.getX()-LENGTH_ARMS, 
        								   curStateFighter.getY()+RADIUS_HEAD*2+(NECKBODYLENGTH-HEIGHT_ARMS), 
        								   curStateFighter.getX() + LENGTH_ARMS, 
        								   curStateFighter.getY()+RADIUS_HEAD*2+(NECKBODYLENGTH-HEIGHT_ARMS));   
        	   break;
        	}
        	case HIGH:{
         	   bothArms = new Line2D.Float(curStateFighter.getX()-LENGTH_ARMS, 
         								   curStateFighter.getY()+RADIUS_HEAD*2+(NECKBODYLENGTH-HEIGHT_ARMS)-MOVELENGTH_ARMS, 
         								   curStateFighter.getX() + LENGTH_ARMS, 
         								   curStateFighter.getY()+RADIUS_HEAD*2+(NECKBODYLENGTH-HEIGHT_ARMS)-MOVELENGTH_ARMS);   
         	   break;
         	}
        	case LOW:{
         	   bothArms = new Line2D.Float(curStateFighter.getX()-LENGTH_ARMS, 
         								   curStateFighter.getY()+RADIUS_HEAD*2+(NECKBODYLENGTH-HEIGHT_ARMS)+MOVELENGTH_ARMS, 
         								   curStateFighter.getX() + LENGTH_ARMS, 
         								   curStateFighter.getY()+RADIUS_HEAD*2+(NECKBODYLENGTH-HEIGHT_ARMS)+MOVELENGTH_ARMS);   
         	   break;
         	}
        }
        graphics.draw(bothArms);  
		
		
		
        Ellipse2D head = new Ellipse2D.Double(curStateFighter.getX()-RADIUS_HEAD, 
        									  curStateFighter.getY(), 
        									  RADIUS_HEAD*2, 
        									  RADIUS_HEAD*2);
		graphics.draw(head);
		
        Line2D neckAndTorso = new Line2D.Float(curStateFighter.getX(), 
        									   curStateFighter.getY()+RADIUS_HEAD*2, 
        									   curStateFighter.getX(), 
        									   curStateFighter.getY()+RADIUS_HEAD*2+NECKBODYLENGTH);        
        graphics.draw(neckAndTorso);       
        
        Line2D leftLeg = new Line2D.Float(curStateFighter.getX(), 
        								  curStateFighter.getY()+RADIUS_HEAD*2+NECKBODYLENGTH, 
        								  curStateFighter.getX() - HEIGHT_LEG, 
        								  curStateFighter.getY() + RADIUS_HEAD*2 + NECKBODYLENGTH + HEIGHT_LEG);        
        graphics.draw(leftLeg);

        Line2D rightLeg = new Line2D.Float(curStateFighter.getX(), 
        								   curStateFighter.getY()+RADIUS_HEAD*2+NECKBODYLENGTH, 
        								   curStateFighter.getX() + HEIGHT_LEG, 
        								   curStateFighter.getY() + RADIUS_HEAD*2 + NECKBODYLENGTH + HEIGHT_LEG);        
        graphics.draw(rightLeg);
	}
}

//
//package saf.visualisation;
//
//import java.awt.Graphics2D;
//import java.awt.geom.Ellipse2D;
//import java.awt.geom.Line2D;
//import java.util.ArrayList;
//import java.util.List;
//
//import mvc.models.FighterModel;
//import saf.IFighterFigure;
//import saf.visualisation.limbs.Arm;
//import saf.visualisation.limbs.LeftArm;
//import saf.visualisation.limbs.states.ArmHandsNormal;
//
//
//public class SimpleFighter implements IFighterFigure{
//	private static final float NECKBODYLENGTH = 25;
//	private static final float RADIUS_HEAD = 10;
//	private static final float HEIGHT_ARMS = 17;
//	private static final float LENGTH_ARMS = 10;
//	private static final float HEIGHT_LEG = 10;
//	
//	private List<Limb> limbs;
//	
//	private FighterModel curStateFighter;
//	
//	public SimpleFighter(FighterModel fighterModel){
//		this.curStateFighter = fighterModel;
//		this.limbs = new ArrayList<Limb>();
//		this.limbs.add(new LeftArm(new ArmHandsNormal()));
//		
//	}
//	
//	public void draw(Graphics2D graphics){   
//		
//        Ellipse2D head = new Ellipse2D.Double(curStateFighter.getX()-RADIUS_HEAD, 
//        									  curStateFighter.getY(), 
//        									  RADIUS_HEAD*2, 
//        									  RADIUS_HEAD*2);
//		graphics.draw(head);
//		
//        Line2D neckAndTorso = new Line2D.Float(curStateFighter.getX(), 
//        									   curStateFighter.getY()+RADIUS_HEAD*2, 
//        									   curStateFighter.getX(), 
//        									   curStateFighter.getY()+RADIUS_HEAD*2+NECKBODYLENGTH);        
//        graphics.draw(neckAndTorso);
//
//        //this.leftArm.draw(graphics);
//        graphics.draw(bothArms);         
//        
//        Line2D leftLeg = new Line2D.Float(curStateFighter.getX(), 
//        								  curStateFighter.getY()+RADIUS_HEAD*2+NECKBODYLENGTH, 
//        								  curStateFighter.getX() - HEIGHT_LEG, 
//        								  curStateFighter.getY() + RADIUS_HEAD*2 + NECKBODYLENGTH + HEIGHT_LEG);        
//        graphics.draw(leftLeg);
//
//        Line2D rightLeg = new Line2D.Float(curStateFighter.getX(), 
//        								   curStateFighter.getY()+RADIUS_HEAD*2+NECKBODYLENGTH, 
//        								   curStateFighter.getX() + HEIGHT_LEG, 
//        								   curStateFighter.getY() + RADIUS_HEAD*2 + NECKBODYLENGTH + HEIGHT_LEG);        
//        graphics.draw(rightLeg);
//	}
//}
