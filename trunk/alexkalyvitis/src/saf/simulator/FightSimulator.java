package saf.simulator;

import java.util.List;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

import saf.ast.*;

public class FightSimulator{
	private Fight fight;
	
	public FightSimulator(List<Fighter> fighters){
		fight = new Fight(fighters);
	}

	public void Simulate(){
		System.out.print("Simulating...");
		
		try {
			Display.setDisplayMode(new DisplayMode(800,400));
			Display.setTitle(fight.getFirstFighter().getName() + " VS " + fight.getSecondFighter().getName());
			Display.create();
		} catch (LWJGLException e) {
			System.out.println("Error: " + e.getMessage());
			System.exit(0);
		}
		
		initOpenGL();
		
		while (!Display.isCloseRequested()) {
			GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
			
			if(fight.hasEnded()){ break; }
			
			fight.assess();
			
			draw(fight.flushFirstFightersNextMove());
			draw(fight.flushSecondFightersNextMove());
			
			Display.update();
			Display.sync(50);
		}
		Display.destroy();
		System.out.println("..OK");
	}
	
	public void draw(Behavior b){
		if(b == null){
			// TODO Continue Animation
		} else {
			fight.getFirstFighter().getKeywords();
			b.getMove();
			b.getAttack();
		}
	}

	public void drawStand(float initX) {
		circle(initX + 100, 250, 50); // Head
		line(initX + 100, 200, initX + 100, 100); // Body
		line(initX + 50, 175, initX + 150, 175); // Both arms
		line(initX + 50, 50, initX + 100, 100); // Left leg
		line(initX + 150, 50, initX + 100, 100); // Right leg
	}
	
	public void drawPunchHigh(float initX) {
		circle(initX + 100, 250, 50); // Head
		line(initX + 100, 200, initX + 100, 100); // Body
		line(initX + 75, 150, initX + 100, 175); // Left arm
		line(initX + 75, 150, initX + 75, 125); // Left arm
		line(initX + 75, 125, initX + 100, 150); // Left arm
		line(initX + 100, 175, initX + 175, 250); // Right arm
		line(initX + 50, 50, initX + 100, 100); // Left leg
		line(initX + 150, 50, initX + 100, 100); // Right leg
	}

	public void drawPunchLow(float initX) {
		circle(initX + 100, 250, 50); // Head
		line(initX + 100, 200, initX + 100, 100); // Body
		line(initX + 75, 175, initX + 100, 175); // Left arm
		line(initX + 75, 175, initX + 75, 150); // Left arm
		line(initX + 75, 150, initX + 100, 150); // Left arm
		line(initX + 100, 175, initX + 175, 175); // Right arm
		line(initX + 50, 50, initX + 100, 100); // Left leg
		line(initX + 150, 50, initX + 100, 100); // Right leg
	}

	public void drawKickHigh(float initX) {
		circle(initX + 100, 250, 50); // Head
		line(initX + 100, 200, initX + 100, 100); // Body
		line(initX + 75, 150, initX + 125, 200); // Both arms
		line(initX + 75, 75, initX + 100, 100); // Left leg
		line(initX + 75, 75, initX + 75, 50); // Left leg
		line(initX + 75, 50, initX + 100, 75); // Left leg
		line(initX + 100, 100, initX + 175, 175); // Right leg
	}

	public void drawKickLow(float initX) {
		circle(initX + 100, 250, 50); // Head
		line(initX + 100, 200, initX + 100, 100); // Body
		line(initX + 75, 175, initX + 125, 175); // Both arms
		line(initX + 75, 100, initX + 100, 100); // Left leg
		line(initX + 75, 100, initX + 75, 75); // Left leg
		line(initX + 75, 75, initX + 100, 75); // Left leg
		line(initX + 100, 100, initX + 175, 100); // Right leg
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
	
	public void drawBackground(){
		GL11.glBegin(GL11.GL_QUADS);
		GL11.glTexCoord2f(0,0);
		GL11.glVertex2f(0,0);
		GL11.glTexCoord2f(1,0);
		GL11.glVertex2f(1,0);
		GL11.glTexCoord2f(1,1);
		GL11.glVertex2f(1,1);
		GL11.glTexCoord2f(0,1);
		GL11.glVertex2f(0,1);
		GL11.glEnd();
	}
	
	private void initOpenGL() {
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		GL11.glOrtho(0, 800, 0, 400, 1, -1);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
		GL11.glHint(GL11.GL_POINT_SMOOTH_HINT | GL11.GL_LINE_SMOOTH_HINT | GL11.GL_POLYGON_SMOOTH_HINT, GL11.GL_DONT_CARE);
	}
}