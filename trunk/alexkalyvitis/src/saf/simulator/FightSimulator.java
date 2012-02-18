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
	public static final int FPS = 50;
	
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
	public static final int FIGHTER_JUMP_Y = FIGHTER_OFFSET_Y - 100;
	
	private int firstFighterCurrentY = FIGHTER_INITIAL_Y;
	private int secondFighterCurrentY = FIGHTER_INITIAL_Y;
	
	private Fight fight;
	
	public FightSimulator(List<Fighter> fighters){
		fight = new Fight(fighters,FIRST_FIGHTER_INITIAL_X,SECOND_FIGHTER_INITIAL_X);
	}

	public void Simulate(){
		System.out.println("Simulating...");
		try {
			Display.setDisplayMode(new DisplayMode(FightSimulator.WINDOW_WIDTH,FightSimulator.WINDOW_HEIGHT));
			Display.setTitle(fight.getFirstFighter().getName() + " VS " + fight.getSecondFighter().getName());
			Display.create();
		} catch (LWJGLException e) {
			System.out.println("ERROR: " + e.getMessage());
			System.exit(0);
		}
		
		initializeOpenGL();
		
		while (!Display.isCloseRequested() && !fight.hasEnded()) {
			updateTimeInTitle();
			
			clearScreen();
			
			drawHealth();
			
			fight.syncFighterLocations(firstFighterCurrentX,secondFighterCurrentX);
			
			fight.assess();
			draw();
			
			Display.update();
			Display.sync(FPS);
		}
		
		System.out.println("And the winner is: " + fight.getWinner());
		
		Display.destroy();
		System.out.println("Simulation Finished");
	}

	public void draw(){
		//System.out.println("1: " + fight.getFirstFightersMove() + "\n2: " + fight.getSecondFightersMove());
		Behavior firstFightersBehavior = fight.getFirstFightersMove(); 
		try{
			AvailableMoves ffmove = AvailableMoves.valueOf(firstFightersBehavior.getMove().getName().toUpperCase());
			AvailableAttacks ffattack = AvailableAttacks.valueOf(firstFightersBehavior.getAttack().getName().toUpperCase());
			animate(ffmove, ffattack, FighterLocation.LEFT);
		} catch (Exception e) {
			System.out.println("ERROR: " + e.getMessage());
			System.exit(0);
		}
		
		Behavior secondFightersBehavior = fight.getSecondFightersMove(); 
		try{
			AvailableMoves sfmove = AvailableMoves.valueOf(secondFightersBehavior.getMove().getName().toUpperCase());
			AvailableAttacks sfattack = AvailableAttacks.valueOf(secondFightersBehavior.getAttack().getName().toUpperCase());
			animate(sfmove, sfattack, FighterLocation.RIGHT);
		} catch (Exception e) {
			System.out.println("ERROR: " + e.getMessage());
			System.exit(0);
		}
		return;
	}
	
	private void animate(AvailableMoves move, AvailableAttacks attack, FighterLocation location) {
		/*
		 * drawMove() returns true if the fighter moved.
		 * if so the fighter is occupied so he shouldn't calculate a new move
		 * 
		 * drawMove() returns false if the fighter couldn't move any longer because he reached the desired location
		 * if so the fighter should perform his attack and then set his status to ready so that fight can assess() a new move for him
		 */
		if(drawMove(location, move)){
			setFighterStatus(location, FighterStatus.OCCUPIED);
		} else {
			drawAttack(location, attack);
			setFighterHealth(location, attack);
			setFighterStatus(location, FighterStatus.READY);
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
		case KICK_LOW		: drawKickLow(location); break;
		case KICK_HIGH		: drawKickHigh(location);  break;
		case BLOCK_LOW		: drawBlockLow(location); break;
		case BLOCK_HIGH		: drawBlockHigh(location); break;
		}
	}

	private boolean animateJump(FighterLocation loc) {
		switch(loc){
		case LEFT:
			if(firstFighterCurrentY <= FIGHTER_JUMP_Y) return false;
			drawStand(loc);
			firstFighterCurrentY -= (fight.getFirstFighter().getSpeed() + 1);
			break;
		case RIGHT:
			if(secondFighterCurrentY <= FIGHTER_JUMP_Y) return false;
			drawStand(loc);
			secondFighterCurrentY -= (fight.getSecondFighter().getSpeed() + 1);
			break;
		}
		return true;
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
			if (firstFighterCurrentX >= FIRST_FIGHTER_MAX_X) return false;
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
		switch(loc){
		case LEFT	:
			if (firstFighterCurrentX <= FIRST_FIGHTER_INITIAL_X) return false;
			drawStand(loc);
			firstFighterCurrentX -= 2 * (fight.getFirstFighter().getSpeed() + 1);
			break;
		case RIGHT	:
			if (secondFighterCurrentX >= SECOND_FIGHTER_INITIAL_X) return false;
			drawStand(loc);
			secondFighterCurrentX += 2 * (fight.getSecondFighter().getSpeed() + 1);
			break;
		}
		return true;
	}

	private boolean animateWalkAway(FighterLocation loc) {
		switch(loc){
		case LEFT	:
			if (firstFighterCurrentX <= FIRST_FIGHTER_INITIAL_X) return false;
			drawStand(loc);
			firstFighterCurrentX -= fight.getFirstFighter().getSpeed() + 1;
			break;
			
		case RIGHT	:
			if (secondFighterCurrentX >= SECOND_FIGHTER_INITIAL_X) return false;
			drawStand(loc);
			secondFighterCurrentX += fight.getSecondFighter().getSpeed() + 1;
			break;
		}
		return true;
	}

	public boolean animateWalkTowards(FighterLocation loc) {
		switch(loc){
		case LEFT	:
			if (firstFighterCurrentX >= FIRST_FIGHTER_MAX_X) return false;
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
			circle(firstFighterCurrentX + 0, firstFighterCurrentY + 100, 50); // Head
			line(firstFighterCurrentX +   0, firstFighterCurrentY + 150, firstFighterCurrentX +   0, firstFighterCurrentY + 250); // Body
			
			line(firstFighterCurrentX -  25, firstFighterCurrentY + 175, firstFighterCurrentX +  75, firstFighterCurrentY + 150); // Left arm
			line(firstFighterCurrentX -  25, firstFighterCurrentY + 175, firstFighterCurrentX -  25, firstFighterCurrentY + 200); // Left arm
			line(firstFighterCurrentX -  25, firstFighterCurrentY + 200, firstFighterCurrentX +   0, firstFighterCurrentY + 200); // Right arm
			
			line(firstFighterCurrentX -  50, firstFighterCurrentY + 300, firstFighterCurrentX +   0, firstFighterCurrentY + 250); // Left leg
			line(firstFighterCurrentX +  50, firstFighterCurrentY + 300, firstFighterCurrentX +   0, firstFighterCurrentY + 250); // Left leg
			break;
		case RIGHT	:
			circle(secondFighterCurrentX + 0, secondFighterCurrentY + 100 , 50); // Head
			line(secondFighterCurrentX +   0, secondFighterCurrentY + 150, secondFighterCurrentX +   0, secondFighterCurrentY + 250); // Body
			
			line(secondFighterCurrentX +  25, secondFighterCurrentY + 175, secondFighterCurrentX -  75, secondFighterCurrentY + 150); // Right arm
			line(secondFighterCurrentX +  25, secondFighterCurrentY + 175, secondFighterCurrentX +  25, secondFighterCurrentY + 200); // Right arm
			line(secondFighterCurrentX +  25, secondFighterCurrentY + 200, secondFighterCurrentX -   0, secondFighterCurrentY + 200); // Left arm
			
			line(secondFighterCurrentX -  50, secondFighterCurrentY + 300, secondFighterCurrentX +   0, secondFighterCurrentY + 250); // Left leg
			line(secondFighterCurrentX +  50, secondFighterCurrentY + 300, secondFighterCurrentX +   0, secondFighterCurrentY + 250); // Left leg
			break;
		}
	}

	public void drawPunchLow(FighterLocation loc) {
		switch(loc){
		case LEFT	:
			circle(firstFighterCurrentX + 0, firstFighterCurrentY + 100, 50); // Head
			line(firstFighterCurrentX +   0, firstFighterCurrentY + 150, firstFighterCurrentX +   0, firstFighterCurrentY + 250); // Body
			
			line(firstFighterCurrentX -  25, firstFighterCurrentY + 175, firstFighterCurrentX +  75, firstFighterCurrentY + 200); // Both arms
			line(firstFighterCurrentX -  25, firstFighterCurrentY + 175, firstFighterCurrentX -  25, firstFighterCurrentY + 200); // Left arm
			line(firstFighterCurrentX -  25, firstFighterCurrentY + 200, firstFighterCurrentX +   0, firstFighterCurrentY + 200); // Left arm
			
			line(firstFighterCurrentX -  50, firstFighterCurrentY + 300, firstFighterCurrentX +   0, firstFighterCurrentY + 250); // Left leg
			line(firstFighterCurrentX +  50, firstFighterCurrentY + 300, firstFighterCurrentX +   0, firstFighterCurrentY + 250); // Right leg
			break;
		case RIGHT	:
			circle(secondFighterCurrentX + 0, secondFighterCurrentY + 100 , 50); // Head
			line(secondFighterCurrentX +   0, secondFighterCurrentY + 150, secondFighterCurrentX +   0, secondFighterCurrentY + 250); // Body
			
			line(secondFighterCurrentX +  25, secondFighterCurrentY + 175, secondFighterCurrentX -  75, secondFighterCurrentY + 200); // Both arms
			line(secondFighterCurrentX +  25, secondFighterCurrentY + 175, secondFighterCurrentX +  25, secondFighterCurrentY + 200); // Left arm
			line(secondFighterCurrentX +  25, secondFighterCurrentY + 200, secondFighterCurrentX -   0, secondFighterCurrentY + 200); // Left arm
			
			line(secondFighterCurrentX -  50, secondFighterCurrentY + 300, secondFighterCurrentX +   0, secondFighterCurrentY + 250); // Left leg
			line(secondFighterCurrentX +  50, secondFighterCurrentY + 300, secondFighterCurrentX +   0, secondFighterCurrentY + 250); // Left leg
			break;
		}
	}

	public void drawKickHigh(FighterLocation loc) {
		switch(loc){
		case LEFT	:
			circle(firstFighterCurrentX + 0, firstFighterCurrentY + 100, 50); // Head
			line(firstFighterCurrentX +   0, firstFighterCurrentY + 150, firstFighterCurrentX +   0, firstFighterCurrentY + 250); // Body
			
			line(firstFighterCurrentX -  35, firstFighterCurrentY + 175, firstFighterCurrentX +  35, firstFighterCurrentY + 175); // Both arms
			line(firstFighterCurrentX -  35, firstFighterCurrentY + 275, firstFighterCurrentX +  75, firstFighterCurrentY + 200); // Left & Right leg
			line(firstFighterCurrentX -  35, firstFighterCurrentY + 275, firstFighterCurrentX -  35, firstFighterCurrentY + 300); // Left leg
			line(firstFighterCurrentX -  35, firstFighterCurrentY + 300, firstFighterCurrentX +   0, firstFighterCurrentY + 275); // Left leg
			break;
		case RIGHT	:
			circle(secondFighterCurrentX + 0, secondFighterCurrentY + 100 , 50); // Head
			line(secondFighterCurrentX +   0, secondFighterCurrentY + 150, secondFighterCurrentX +   0, secondFighterCurrentY + 250); // Body
			
			line(secondFighterCurrentX +  35, secondFighterCurrentY + 175, secondFighterCurrentX -  35, secondFighterCurrentY + 175); // Both arms
			line(secondFighterCurrentX +  35, secondFighterCurrentY + 275, secondFighterCurrentX -  75, secondFighterCurrentY + 200); // Left & Right leg
			line(secondFighterCurrentX +  35, secondFighterCurrentY + 275, secondFighterCurrentX +  35, secondFighterCurrentY + 300); // Left leg
			line(secondFighterCurrentX +  35, secondFighterCurrentY + 300, secondFighterCurrentX -   0, secondFighterCurrentY + 275); // Left leg
			break;
		}
	}

	public void drawKickLow(FighterLocation loc) {
		switch(loc){
		case LEFT	:
			circle(firstFighterCurrentX + 0, firstFighterCurrentY + 100, 50); // Head
			line(firstFighterCurrentX +   0, firstFighterCurrentY + 150, firstFighterCurrentX +   0, firstFighterCurrentY + 250); // Body
			
			line(firstFighterCurrentX -  35, firstFighterCurrentY + 175, firstFighterCurrentX +  35, firstFighterCurrentY + 175); // Both arms
			line(firstFighterCurrentX -  35, firstFighterCurrentY + 250, firstFighterCurrentX +  75, firstFighterCurrentY + 250); // Left & Right leg
			line(firstFighterCurrentX -  35, firstFighterCurrentY + 250, firstFighterCurrentX -  35, firstFighterCurrentY + 275); // Left leg
			line(firstFighterCurrentX -  35, firstFighterCurrentY + 275, firstFighterCurrentX +   0, firstFighterCurrentY + 275); // Left leg
			break;
		case RIGHT	:
			circle(secondFighterCurrentX + 0, secondFighterCurrentY + 100 , 50); // Head
			line(secondFighterCurrentX +   0, secondFighterCurrentY + 150, secondFighterCurrentX +   0, secondFighterCurrentY + 250); // Body
			
			line(secondFighterCurrentX +  35, secondFighterCurrentY + 175, secondFighterCurrentX -  35, secondFighterCurrentY + 175); // Both arms
			line(secondFighterCurrentX +  35, secondFighterCurrentY + 250, secondFighterCurrentX -  75, secondFighterCurrentY + 250); // Left & Right leg
			line(secondFighterCurrentX +  35, secondFighterCurrentY + 250, secondFighterCurrentX +  35, secondFighterCurrentY + 275); // Left leg
			line(secondFighterCurrentX +  35, secondFighterCurrentY + 275, secondFighterCurrentX -   0, secondFighterCurrentY + 275); // Left leg
			break;
		}
	}
	
	public void drawStand(FighterLocation location){
		switch(location){
		case LEFT	:
			circle(firstFighterCurrentX + 0, firstFighterCurrentY + 100 , 50); // Head
			line(firstFighterCurrentX +   0, firstFighterCurrentY + 150, firstFighterCurrentX +   0, firstFighterCurrentY + 250); // Body
			line(firstFighterCurrentX -  50, firstFighterCurrentY + 175, firstFighterCurrentX +  50, firstFighterCurrentY + 175); // Both arms
			line(firstFighterCurrentX -  50, firstFighterCurrentY + 300, firstFighterCurrentX +   0, firstFighterCurrentY + 250); // Left leg
			line(firstFighterCurrentX +  50, firstFighterCurrentY + 300, firstFighterCurrentX +   0, firstFighterCurrentY + 250); // Left leg
			break;
		case RIGHT	:
			circle(secondFighterCurrentX + 0, secondFighterCurrentY + 100 , 50); // Head
			line(secondFighterCurrentX +   0, secondFighterCurrentY + 150, secondFighterCurrentX +   0, secondFighterCurrentY + 250); // Body
			line(secondFighterCurrentX -  50, secondFighterCurrentY + 175, secondFighterCurrentX +  50, secondFighterCurrentY + 175); // Both arms
			line(secondFighterCurrentX -  50, secondFighterCurrentY + 300, secondFighterCurrentX +   0, secondFighterCurrentY + 250); // Left leg
			line(secondFighterCurrentX +  50, secondFighterCurrentY + 300, secondFighterCurrentX +   0, secondFighterCurrentY + 250); // Left leg
			break;
		}
	}
	
	private void drawBlockHigh(FighterLocation location) {
		switch(location){
		case LEFT	:
			circle(firstFighterCurrentX + 0, firstFighterCurrentY + 100, 50); // Head
			line(firstFighterCurrentX +   0, firstFighterCurrentY + 150, firstFighterCurrentX +   0, firstFighterCurrentY + 250); // Body
			
			line(firstFighterCurrentX +  50, firstFighterCurrentY + 175, firstFighterCurrentX +  50, firstFighterCurrentY + 140); // Left arm
			line(firstFighterCurrentX -  25, firstFighterCurrentY + 175, firstFighterCurrentX +  50, firstFighterCurrentY + 175); // Left arm
			line(firstFighterCurrentX -  25, firstFighterCurrentY + 175, firstFighterCurrentX -  25, firstFighterCurrentY + 200); // Left arm
			line(firstFighterCurrentX -  25, firstFighterCurrentY + 200, firstFighterCurrentX +   0, firstFighterCurrentY + 200); // Right arm
			
			line(firstFighterCurrentX -  50, firstFighterCurrentY + 300, firstFighterCurrentX +   0, firstFighterCurrentY + 250); // Left leg
			line(firstFighterCurrentX +  50, firstFighterCurrentY + 300, firstFighterCurrentX +   0, firstFighterCurrentY + 250); // Left leg
			break;
		case RIGHT	:
			circle(secondFighterCurrentX + 0, secondFighterCurrentY + 100 , 50); // Head
			line(secondFighterCurrentX +   0, secondFighterCurrentY + 150, secondFighterCurrentX +   0, secondFighterCurrentY + 250); // Body
			
			line(secondFighterCurrentX -  50, secondFighterCurrentY + 175, secondFighterCurrentX -  50, secondFighterCurrentY + 140); // Left arm
			line(secondFighterCurrentX +  25, secondFighterCurrentY + 175, secondFighterCurrentX -  50, secondFighterCurrentY + 175); // Left arm
			line(secondFighterCurrentX +  25, secondFighterCurrentY + 175, secondFighterCurrentX +  25, secondFighterCurrentY + 200); // Left arm
			line(secondFighterCurrentX +  25, secondFighterCurrentY + 200, secondFighterCurrentX -   0, secondFighterCurrentY + 200); // Right arm
			
			line(secondFighterCurrentX -  50, secondFighterCurrentY + 300, secondFighterCurrentX +   0, secondFighterCurrentY + 250); // Left leg
			line(secondFighterCurrentX +  50, secondFighterCurrentY + 300, secondFighterCurrentX +   0, secondFighterCurrentY + 250); // Left leg
			break;
		}
	}

	private void drawBlockLow(FighterLocation location) {
		switch(location){
		case LEFT	:
			circle(firstFighterCurrentX + 0, firstFighterCurrentY + 100, 50); // Head
			line(firstFighterCurrentX +   0, firstFighterCurrentY + 150, firstFighterCurrentX +   0, firstFighterCurrentY + 250); // Body
			
			line(firstFighterCurrentX +  50, firstFighterCurrentY + 175, firstFighterCurrentX +  50, firstFighterCurrentY + 210); // Left arm
			line(firstFighterCurrentX -  25, firstFighterCurrentY + 175, firstFighterCurrentX +  50, firstFighterCurrentY + 175); // Left arm
			line(firstFighterCurrentX -  25, firstFighterCurrentY + 175, firstFighterCurrentX -  25, firstFighterCurrentY + 200); // Left arm
			line(firstFighterCurrentX -  25, firstFighterCurrentY + 200, firstFighterCurrentX +   0, firstFighterCurrentY + 200); // Right arm
			
			line(firstFighterCurrentX -  50, firstFighterCurrentY + 300, firstFighterCurrentX +   0, firstFighterCurrentY + 250); // Left leg
			line(firstFighterCurrentX +  50, firstFighterCurrentY + 300, firstFighterCurrentX +   0, firstFighterCurrentY + 250); // Left leg
			break;
		case RIGHT	:
			circle(secondFighterCurrentX + 0, secondFighterCurrentY + 100 , 50); // Head
			line(secondFighterCurrentX +   0, secondFighterCurrentY + 150, secondFighterCurrentX +   0, secondFighterCurrentY + 250); // Body
			
			line(secondFighterCurrentX -  50, secondFighterCurrentY + 175, secondFighterCurrentX -  50, secondFighterCurrentY + 210); // Left arm
			line(secondFighterCurrentX +  25, secondFighterCurrentY + 175, secondFighterCurrentX -  50, secondFighterCurrentY + 175); // Left arm
			line(secondFighterCurrentX +  25, secondFighterCurrentY + 175, secondFighterCurrentX +  25, secondFighterCurrentY + 200); // Left arm
			line(secondFighterCurrentX +  25, secondFighterCurrentY + 200, secondFighterCurrentX -   0, secondFighterCurrentY + 200); // Right arm
			
			line(secondFighterCurrentX -  50, secondFighterCurrentY + 300, secondFighterCurrentX +   0, secondFighterCurrentY + 250); // Left leg
			line(secondFighterCurrentX +  50, secondFighterCurrentY + 300, secondFighterCurrentX +   0, secondFighterCurrentY + 250); // Left leg
			break;
		}
	}
	
	private void updateTimeInTitle() {
		Display.setTitle(fight.getFirstFighter().getName() + " VS " + fight.getSecondFighter().getName() + " " + fight.getCountDown());
	}

	private void drawHealth() {
		
		drawRectangle(20, 20, fight.getFirstFighter().getHealth(), 10);
		drawRectangle(WINDOW_WIDTH - 20, 20, -fight.getSecondFighter().getHealth(), 10);
	}

	public void drawRectangle(float x, float y, float width, float height){
		GL11.glColor3f(1.0f, 0.1f, 0.1f);

		GL11.glBegin(GL11.GL_QUADS);
		GL11.glVertex2f(x,y);
		GL11.glVertex2f(x + width, y);
		GL11.glVertex2f(x + width, y + height);
		GL11.glVertex2f(x, y + height);
		GL11.glEnd();
	}
	
	public void line(float x1, float y1, float x2, float y2){
		GL11.glColor3f(1.0f, 1.0f, 1.0f);
		
		GL11.glLineWidth(2);
		GL11.glBegin(GL11.GL_LINES);
		GL11.glVertex2f(x1,y1);
		GL11.glVertex2f(x2,y2);
		GL11.glEnd();
	}
	
	public void circle(float x, float y, float r) {
	    double inc = Math.PI / 12;
	    double max = 2 * Math.PI;
	    
	    GL11.glColor3f(1.0f, 1.0f, 1.0f);
	    
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
	
	private void initializeOpenGL() {
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		GL11.glOrtho(0, FightSimulator.WINDOW_WIDTH, FightSimulator.WINDOW_HEIGHT, 0, 1, -1);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
		GL11.glHint(GL11.GL_POINT_SMOOTH_HINT | GL11.GL_LINE_SMOOTH_HINT | GL11.GL_POLYGON_SMOOTH_HINT, GL11.GL_DONT_CARE);
	}
	
	private void clearScreen() {
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
	}
	
	private void setFighterHealth(FighterLocation location, AvailableAttacks attack){
		
		
		switch(location){
		case LEFT		: 
			switch(attack){
			case PUNCH_LOW	: ; break;
			case PUNCH_HIGH	: ; break;
			case KICK_LOW	: ; break;
			case KICK_HIGH	: ; break;
			case BLOCK_LOW	: ; break;
			case BLOCK_HIGH	: ; break;
			} 
			break;
		case RIGHT		:
			switch(attack){
			case PUNCH_LOW	: ; break;
			case PUNCH_HIGH	: ; break;
			case KICK_LOW	: ; break;
			case KICK_HIGH	: ; break;
			case BLOCK_LOW	: ; break;
			case BLOCK_HIGH	: ; break;
			}
			break;
		}
	}
	
	private void setFighterStatus(FighterLocation location, FighterStatus status) {
		switch(location){
		case LEFT  : fight.getFirstFighter().setStatus(status); break;
		case RIGHT : fight.getSecondFighter().setStatus(status); break; 
		}
	}
	/*
	private void resetFighterY(){
		firstFighterCurrentY = FIGHTER_INITIAL_Y; 
		secondFighterCurrentY = FIGHTER_INITIAL_Y;
	}
	*/
}
