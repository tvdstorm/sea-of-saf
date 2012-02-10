package saf.simulator;

import java.util.List;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

import saf.ast.*;
import saf.ast.enums.*;

import saf.simulator.enums.*;

public class FightSimulator{
	public static final int WINDOW_HEIGHT = 400;
	public static final int WINDOW_WIDTH = 800;
	
	public static final int FIGHTER_OFFSET_X = 100;
	public static final int FIGHTER_OFFSET_Y = 75;
	
	public static final int FIRST_FIGHTER_INITIAL_X = FIGHTER_OFFSET_X;
	public static final int SECOND_FIGHTER_INITIAL_X = WINDOW_WIDTH - FIGHTER_OFFSET_X;
	
	public static final int FIRST_FIGHTER_MAX_X = (WINDOW_WIDTH / 2) - (FIGHTER_OFFSET_X / 2);
	public static final int SECOND_FIGHTER_MAX_X = (WINDOW_WIDTH / 2) + (FIGHTER_OFFSET_X / 2);
	
	private int firstFighterCurrentX = FIRST_FIGHTER_INITIAL_X;
	private int secondFighterCurrentX = SECOND_FIGHTER_INITIAL_X;
	
	public static final int FIGHTER_INITIAL_Y = FIGHTER_OFFSET_Y;
	
	private int fighterCurrentY = FIGHTER_INITIAL_Y;
	
	private Fight fight;
	
	public FightSimulator(List<Fighter> fighters){
		fight = new Fight(fighters);
	}

	public void Simulate(){
		System.out.println("Simulating...");
		
		try {
			Display.setDisplayMode(new DisplayMode(FightSimulator.WINDOW_WIDTH,FightSimulator.WINDOW_HEIGHT));
			Display.setTitle(fight.getFirstFighter().getName() + " VS " + fight.getSecondFighter().getName());
			Display.create();
		} catch (LWJGLException e) {
			System.out.println("Error: " + e.getMessage());
			System.exit(0);
		}
		
		initOpenGL();
		
		while (!Display.isCloseRequested() && !fight.hasEnded()) {
			GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
			
			fight.assess();
			
			draw();
			
			Display.update();
			Display.sync(50);
		}
		Display.destroy();
		System.out.println("Simulating OK");
	}
	
	public void draw(){
//		Behavior behavior = fight.flushFirstFightersNextMove();
//		
//		AvailableMoves move = AvailableMoves.valueOf(behavior.getMove().getName());
//		AvailableAttacks attack = AvailableAttacks.valueOf(behavior.getAttack().getName());
		
		animate(AvailableMoves.RUN_TOWARDS, AvailableAttacks.PUNCH_HIGH, FighterLocation.LEFT);
		animate(AvailableMoves.WALK_TOWARDS, AvailableAttacks.KICK_HIGH, FighterLocation.RIGHT);
		return;
	}
	
	private void animate(AvailableMoves move, AvailableAttacks attack, FighterLocation location) {
		// drawMove returns false if it reached the desired X or Y
		// so that drawAttack can be drawn
		if(!drawMove(location, move)){
			drawAttack(location, attack);
		}
	}
	
	public boolean drawMove(FighterLocation locaton, AvailableMoves move){
		switch(move) {
		case JUMP			: return animateJump(locaton);
		case CROUCH			: return animateCrouch(locaton); 
		case STAND			: return animateStand(locaton);
		case RUN_TOWARDS	: return animateRunTowards(locaton);
		case RUN_AWAY		: return animateRunAway(locaton);
		case WALK_TOWARDS	: return animateWalkTowards(locaton);
		case WALK_AWAY		: return animateWalkAway(locaton);
		}
		return false;
	}
	
	public void drawAttack(FighterLocation location, AvailableAttacks attack){
		switch(attack) {
		case PUNCH_LOW		: drawPunchLow(location) ; break;
		case PUNCH_HIGH		: drawPunchHigh(location); break; 
		case KICK_LOW		: drawPunchHigh(location); break;
		case KICK_HIGH		: drawKickHigh(location); break;
		case BLOCK_LOW		: drawPunchHigh(location); break;
		case BLOCK_HIGH		: drawPunchHigh(location); break;
		}
	}
	
	private boolean animateJump(FighterLocation loc) {
		return false;
	}

	private boolean animateCrouch(FighterLocation loc) {
		return false;
	}

	private boolean animateStand(FighterLocation loc) {
		return false;
	}

	private boolean animateRunTowards(FighterLocation loc) {
		switch(loc){
		case LEFT	:
			if (firstFighterCurrentX >= FIRST_FIGHTER_MAX_X) 
				return false;
			drawStand(loc);
			firstFighterCurrentX += 2 * (fight.getFirstFighter().getSpeed() + 1);
			break;
			
		case RIGHT	:
			if (secondFighterCurrentX <= SECOND_FIGHTER_MAX_X) return false;
			drawStand(loc);
			secondFighterCurrentX -= 2 * (fight.getSecondFighter().getSpeed() + 1);
			break;
		}
		return true;
	}

	private boolean animateRunAway(FighterLocation loc) {
		return false;
	}

	private boolean animateWalkAway(FighterLocation loc) {
		return false;
	}

	public boolean animateWalkTowards(FighterLocation loc) {
		switch(loc){
		case LEFT	:
			if (firstFighterCurrentX >= FIRST_FIGHTER_MAX_X) 
				return false;
			drawStand(loc);
			firstFighterCurrentX += fight.getFirstFighter().getSpeed() + 1;
			break;
			
		case RIGHT	:
			if (secondFighterCurrentX <= SECOND_FIGHTER_MAX_X) return false;
			drawStand(loc);
			secondFighterCurrentX -= fight.getSecondFighter().getSpeed() + 1;
			break;
		}
		return true;
	}
	
	public void drawPunchHigh(FighterLocation loc) {
		switch(loc){
		case LEFT	:
			circle(firstFighterCurrentX + 0, fighterCurrentY + 100, 50); // Head
			line(firstFighterCurrentX +   0, fighterCurrentY + 150, firstFighterCurrentX +   0, fighterCurrentY + 250); // Body
			
			line(firstFighterCurrentX -  25, fighterCurrentY + 175, firstFighterCurrentX +  75, fighterCurrentY + 150); // Left arm
			line(firstFighterCurrentX -  25, fighterCurrentY + 175, firstFighterCurrentX -  25, fighterCurrentY + 200); // Left arm
			line(firstFighterCurrentX -  25, fighterCurrentY + 200, firstFighterCurrentX +   0, fighterCurrentY + 200); // Right arm
			
			line(firstFighterCurrentX -  50, fighterCurrentY + 300, firstFighterCurrentX +   0, fighterCurrentY + 250); // Left leg
			line(firstFighterCurrentX +  50, fighterCurrentY + 300, firstFighterCurrentX +   0, fighterCurrentY + 250); // Left leg
			break;
		case RIGHT	:
			circle(secondFighterCurrentX + 0, fighterCurrentY + 100 , 50); // Head
			line(secondFighterCurrentX +   0, fighterCurrentY + 150, secondFighterCurrentX +   0, fighterCurrentY + 250); // Body
			
			line(secondFighterCurrentX +  25, fighterCurrentY + 175, secondFighterCurrentX -  75, fighterCurrentY + 150); // Right arm
			line(secondFighterCurrentX +  25, fighterCurrentY + 175, secondFighterCurrentX +  25, fighterCurrentY + 200); // Right arm
			line(secondFighterCurrentX +  25, fighterCurrentY + 200, secondFighterCurrentX -   0, fighterCurrentY + 200); // Left arm
			
			line(secondFighterCurrentX -  50, fighterCurrentY + 300, secondFighterCurrentX +   0, fighterCurrentY + 250); // Left leg
			line(secondFighterCurrentX +  50, fighterCurrentY + 300, secondFighterCurrentX +   0, fighterCurrentY + 250); // Left leg
			break;
		}
	}

	public void drawPunchLow(FighterLocation loc) {
		
	}

	public void drawKickHigh(FighterLocation loc) {
		switch(loc){
		case LEFT	:
			circle(firstFighterCurrentX + 0, fighterCurrentY + 100, 50); // Head
			line(firstFighterCurrentX +   0, fighterCurrentY + 150, firstFighterCurrentX +   0, fighterCurrentY + 250); // Body
			
			line(firstFighterCurrentX -  35, fighterCurrentY + 175, firstFighterCurrentX +  35, fighterCurrentY + 175); // Both arms
			line(firstFighterCurrentX -  35, fighterCurrentY + 275, firstFighterCurrentX +  75, fighterCurrentY + 200); // Left & Right leg
			line(firstFighterCurrentX -  35, fighterCurrentY + 275, firstFighterCurrentX -  35, fighterCurrentY + 300); // Left leg
			line(firstFighterCurrentX -  35, fighterCurrentY + 300, firstFighterCurrentX +   0, fighterCurrentY + 275); // Left leg
			break;
		case RIGHT	:
			circle(secondFighterCurrentX + 0, fighterCurrentY + 100 , 50); // Head
			line(secondFighterCurrentX +   0, fighterCurrentY + 150, secondFighterCurrentX +   0, fighterCurrentY + 250); // Body
			
			line(secondFighterCurrentX +  35, fighterCurrentY + 175, secondFighterCurrentX -  35, fighterCurrentY + 175); // Both arms
			line(secondFighterCurrentX +  35, fighterCurrentY + 275, secondFighterCurrentX -  75, fighterCurrentY + 200); // Left & Right leg
			line(secondFighterCurrentX +  35, fighterCurrentY + 275, secondFighterCurrentX +  35, fighterCurrentY + 300); // Left leg
			line(secondFighterCurrentX +  35, fighterCurrentY + 300, secondFighterCurrentX -   0, fighterCurrentY + 275); // Left leg
			break;
		}
	}

	public void drawKickLow(FighterLocation loc) {
		
	}
	
	public void drawStand(FighterLocation loc){
		switch(loc){
		case LEFT	:
			circle(firstFighterCurrentX + 0, fighterCurrentY + 100 , 50); // Head
			line(firstFighterCurrentX +   0, fighterCurrentY + 150, firstFighterCurrentX +   0, fighterCurrentY + 250); // Body
			line(firstFighterCurrentX -  50, fighterCurrentY + 175, firstFighterCurrentX +  50, fighterCurrentY + 175); // Both arms
			line(firstFighterCurrentX -  50, fighterCurrentY + 300, firstFighterCurrentX +   0, fighterCurrentY + 250); // Left leg
			line(firstFighterCurrentX +  50, fighterCurrentY + 300, firstFighterCurrentX +   0, fighterCurrentY + 250); // Left leg
			firstFighterCurrentX += fight.getFirstFighter().getSpeed() + 1;
			break;
		case RIGHT	:
			circle(secondFighterCurrentX + 0, fighterCurrentY + 100 , 50); // Head
			line(secondFighterCurrentX +   0, fighterCurrentY + 150, secondFighterCurrentX +   0, fighterCurrentY + 250); // Body
			line(secondFighterCurrentX -  50, fighterCurrentY + 175, secondFighterCurrentX +  50, fighterCurrentY + 175); // Both arms
			line(secondFighterCurrentX -  50, fighterCurrentY + 300, secondFighterCurrentX +   0, fighterCurrentY + 250); // Left leg
			line(secondFighterCurrentX +  50, fighterCurrentY + 300, secondFighterCurrentX +   0, fighterCurrentY + 250); // Left leg
			secondFighterCurrentX -= fight.getSecondFighter().getSpeed() + 1;
			break;
		}
	}

	public void line(float x1, float y1, float x2, float y2){
		GL11.glLineWidth(2);
		GL11.glBegin(GL11.GL_LINES);
		GL11.glVertex2f(x1,y1);
		GL11.glVertex2f(x2,y2);
		GL11.glEnd();
	}
	public void circle(float x, float y, float r) {
	    double inc = Math.PI / 12;
	    double max = 2 * Math.PI;
	    GL11.glBegin(GL11.GL_LINE_LOOP);
	    for(double d = 0; d < max; d += inc) {
	    	GL11.glVertex2f((float)Math.cos(d) * r + x, (float)Math.sin(d) * r + y);
	    }
	    GL11.glEnd();
	}
	
	public void circle(float x, float y, float r, int segments){
	    GL11.glBegin(GL11.GL_TRIANGLE_FAN);
	    GL11.glVertex2f(x, y);
        for( int n = 0; n <= segments; ++n ) {
            double t = 2 * Math.PI * (double) n / (float) segments;
            GL11.glVertex2f(x + (float)Math.sin(t)*r, y + (float)Math.cos(t)*r);
        }
        GL11.glEnd();
	}
	
	private void initOpenGL() {
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		GL11.glOrtho(0, FightSimulator.WINDOW_WIDTH, FightSimulator.WINDOW_HEIGHT, 0, 1, -1);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
		GL11.glHint(GL11.GL_POINT_SMOOTH_HINT | GL11.GL_LINE_SMOOTH_HINT | GL11.GL_POLYGON_SMOOTH_HINT, GL11.GL_DONT_CARE);
	}
}
