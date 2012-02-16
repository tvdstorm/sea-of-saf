package saf.mvc.views.twodfighters.fighterfigures;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import saf.mvc.views.twodfighters.IFighterFigure;

public class PencilFigure implements IFighterFigure{
	private int x;
	private int y;
	private String moveAction;
	private String fightAction;
	
	private static final int HEIGHT_ARMS = 17;
	//private static final float HEIGHT_LEG = 10;
	private static final int RADIUS_HIT_ROUND = 3;
	
	private static final int HEIGHT_LEG = 10;
	private static final int NECKBODYLENGTH = 25;
	private static final int WIDTH_BODY = 20;
	private static final int LENGTH_ARMS = 10;
	private static final int MOVELENGTH_ARMS = 5;
	
	public PencilFigure(int x, int y, String moveAction, String fightAction){
		this.x = x;
		this.y = y;
		this.moveAction = moveAction;
		this.fightAction = fightAction;
	}
	
	private int getX(){
		return (int) (this.x*(WIDTH_BODY/2) + 100);
	}

	private int getY(){
		return 100 + this.y;
	}
	
	public void draw(Graphics graphics){
		int y = this.getY();
		int x = this.getX();
		int yHips = y - HEIGHT_LEG;
		/* First calculate some much used coordinates */
		if(moveAction.equals("jump"))
			yHips -= 10;
		
		int yShoulders = yHips - NECKBODYLENGTH;
		
		if(moveAction.equals("crouch"))
			yShoulders = yHips - NECKBODYLENGTH/2;
			
		Graphics2D graphics2D = (Graphics2D) graphics;
		
		/* Draw head */
		Ellipse2D head = new Ellipse2D.Double(x - WIDTH_BODY/2, 
											  yShoulders - WIDTH_BODY/2, 
											  WIDTH_BODY, 
											  WIDTH_BODY);
		graphics2D.draw(head);
		
		/* Draw Torso */
		Line2D neckAndTorso = new Line2D.Float(x, 
											   yHips, 
											   x, 
											   yShoulders);        
		graphics2D.draw(neckAndTorso); 
		
		Line2D arms = null;
		if(fightAction.equals("punch_high")){
			arms = new Line2D.Float(x - HEIGHT_ARMS,
								   	yShoulders + MOVELENGTH_ARMS,
								   	x + HEIGHT_ARMS,
								   	yShoulders - MOVELENGTH_ARMS);
		} else if(fightAction.equals("punch_low")){
			arms = new Line2D.Float(x - HEIGHT_ARMS,
								   	yShoulders - MOVELENGTH_ARMS,
								   	x + HEIGHT_ARMS,
								   	yShoulders + MOVELENGTH_ARMS);
		} else {
			arms = new Line2D.Float(x - HEIGHT_ARMS,
								   	yShoulders,
								   	x + HEIGHT_ARMS,
								   	yShoulders);
		}
		graphics2D.draw(arms);
			
		Line2D frontLeg = null;	
		if(fightAction.equals("kick_high")){
			frontLeg = new Line2D.Float(x,
									   	yHips,
									   	x + HEIGHT_LEG,
									   	yHips - HEIGHT_LEG);
		} else if(fightAction.equals("kick_low")){
			frontLeg = new Line2D.Float(x,
									   	yHips,
									   	x + HEIGHT_LEG,
									   	yHips);
		} else {
			frontLeg = new Line2D.Float(x,
									   	yHips,
									   	x + HEIGHT_LEG,
									   	y + HEIGHT_LEG);
		}
		graphics2D.draw(frontLeg);
	}
}