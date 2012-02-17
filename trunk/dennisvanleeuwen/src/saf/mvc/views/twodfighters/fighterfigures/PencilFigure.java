package saf.mvc.views.twodfighters.fighterfigures;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

import saf.mvc.views.twodfighters.IFighterFigure;

public class PencilFigure implements IFighterFigure{
	private int x;
	private int y;
	private String moveAction;
	private String fightAction;
	private Boolean left;
	
	public static final int WIDTH_BODY = 12;
	private static final int NECKBODYLENGTH = 25;	

	private static final int LENGTH_ARM = WIDTH_BODY/2;
	private static final int MOVELENGTH_ARMS = 5;
	
	private static final int HEIGHT_LEG = 10;

	private static final int BLOCKRECT_HEIGHT = 6;
	private static final int BLOCKRECT_WIDTH = 6;
	private static final int ECLIPSE_ON_FIGHTATTEMPT_DIAMETER = 6;
	
	
	public PencilFigure(int x, int y, String moveAction, String fightAction, Boolean left){
		this.x = x;
		this.y = y;
		this.moveAction = moveAction;
		this.fightAction = fightAction;
		this.left = left;
	}
	
	private int getX(){
		return (int) (this.x*(WIDTH_BODY) + 100);
	}

	private int getY(){
		return 100 + this.y;
	}
	
	public void draw(Graphics graphics){
		List<Shape> allShapes = new ArrayList<Shape>();

		this.createAllShapes(allShapes);
		
		Graphics2D graphics2D = (Graphics2D) graphics;
		
		//Set mirrorring
		if(!left){
			graphics2D.scale(-1, 1);//This way there will be a mirror on x =0
			graphics2D.translate(-this.getX()*2, 0);
			//graphics2D.translate(this.getX()*2, 0);//And we have to move -x to x, so x - -x = 2*x
		}
		
		for(Shape shape: allShapes)
		{
			graphics2D.draw(shape);
		}
		//And set to the normal way again!
		if(!left){
			graphics2D.scale(-1, 1);//This way there will be a mirror on x =0
			graphics2D.translate(-this.getX()*2, 0);
		}
	}
	
	private void createAllShapes(List<Shape> allShapes){
		//Y is the lowest point of the fighter so the groundlevel or jumplevel!
		int y = this.getY();
		//X is in the middle of the fighter!
		int x = this.getX();
		/* First calculate some much used coordinates */
		if(moveAction.equals("jump"))
			y -= 20;
		
		int yHips = y - HEIGHT_LEG;
		
		int yShoulders = yHips - NECKBODYLENGTH;
		
		if(moveAction.equals("crouch"))
			yShoulders = yHips - NECKBODYLENGTH/2;
		
		/* 
		 * Creating an eclipse is done by putting the pointer(x,y) in the top-left corner 
		 * of an invisible rectangle 3th and 4th parameter are to set the diameter! not radius
		 */
		Ellipse2D head = new Ellipse2D.Double(x - WIDTH_BODY/2, 
											  yShoulders - WIDTH_BODY, 
											  WIDTH_BODY, 
											  WIDTH_BODY);
		allShapes.add(head);

		/* Create Torso */
		allShapes.add(new Line2D.Float(x, 
									   yHips, 
									   x, 
									   yShoulders));
		
		/* Create arms and punch or block */
		if(fightAction.equals("punch_high") || fightAction.equals("block_high")){
			allShapes.add(new Line2D.Float(x - LENGTH_ARM,
										   yShoulders + MOVELENGTH_ARMS,
										   x + LENGTH_ARM,
										   yShoulders - MOVELENGTH_ARMS));
			
			if(fightAction.equals("punch_high")){
				allShapes.add(new Ellipse2D.Float(x + LENGTH_ARM,
						   					 	  yShoulders - MOVELENGTH_ARMS,
						   					 	  ECLIPSE_ON_FIGHTATTEMPT_DIAMETER,
						   					 	  ECLIPSE_ON_FIGHTATTEMPT_DIAMETER));
			} else if(fightAction.equals("block_high")){
				allShapes.add(new Rectangle2D.Float(x + LENGTH_ARM,
			   									    yShoulders - MOVELENGTH_ARMS - BLOCKRECT_HEIGHT/2,
											   	    BLOCKRECT_WIDTH,
											   	    BLOCKRECT_HEIGHT));
			}
		} else if(fightAction.equals("punch_low") || fightAction.equals("block_low")){
			allShapes.add(new Line2D.Float(x - LENGTH_ARM,
										   yShoulders - MOVELENGTH_ARMS,
										   x + LENGTH_ARM,
										   yShoulders + MOVELENGTH_ARMS));
			
			if(fightAction.equals("punch_low")){
				allShapes.add(new Ellipse2D.Float(x + LENGTH_ARM,
						   					 	  yShoulders + MOVELENGTH_ARMS,
						   					 	  ECLIPSE_ON_FIGHTATTEMPT_DIAMETER,
						   					 	  ECLIPSE_ON_FIGHTATTEMPT_DIAMETER));
			} else if(fightAction.equals("block_low")){
				allShapes.add(new Rectangle2D.Float(x + LENGTH_ARM,
			   									    yShoulders + MOVELENGTH_ARMS - BLOCKRECT_HEIGHT/2,
											   	    BLOCKRECT_WIDTH,
											   	    BLOCKRECT_HEIGHT));
			}
		} else {
			allShapes.add(new Line2D.Float(x - LENGTH_ARM,
										   yShoulders,
										   x + LENGTH_ARM,
										   yShoulders));
		}
		
		/* Draw front feet, which moves */
		if(fightAction.equals("kick_high")){
			allShapes.add(new Line2D.Float(x,
										   yHips,
										   x + HEIGHT_LEG,
										   yHips - HEIGHT_LEG));
		} else if(fightAction.equals("kick_low")){
			allShapes.add(new Line2D.Float(x,
										   yHips,
										   x + HEIGHT_LEG,
										   yHips));
		} else {
			/* Normal/standing legs */
			allShapes.add(new Line2D.Float(x,
										   yHips,
										   x + HEIGHT_LEG,
										   y));
		}
		
		/* Create normal (back) feet, which is always the same */
		allShapes.add(new Line2D.Float(x,
									   yHips,
									   x - HEIGHT_LEG,
									   y));
	}
}