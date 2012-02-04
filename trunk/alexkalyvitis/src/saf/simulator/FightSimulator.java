package saf.simulator;

import java.util.List;

import org.lwjgl.LWJGLException;
//import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

import saf.ast.*;

public class FightSimulator{
	private Fight fight;
	
	public FightSimulator(List<Fighter> fighters){
		fight = new Fight(fighters);
	}
	
//	public void paint(Graphics graphic)
//    {
//		Graphics2D g = (Graphics2D) graphic;
//		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
//		g.setStroke(new BasicStroke(2));
		
//		// stand_still
//		g.drawOval(75, 125, 50, 75); // Head
//		g.drawLine(100, 200, 100, 300); // Body
//		g.drawLine(75, 225, 100, 225); // Left Arm
//		g.drawLine(125, 225, 100, 225); // Right Arm
//		g.drawLine(75, 350, 100, 300); // Left Leg
//		g.drawLine(125, 350, 100, 300); // Right Leg
//		
//		// punch_high
//		g.drawOval(75, 125, 50, 75); // Head
//		g.drawLine(100, 200, 100, 300); // Body
//		g.drawLine(75, 250, 100, 225); // Left Arm
//		g.drawLine(75, 250, 75, 275); // Left Arm
//		g.drawLine(75, 275, 100, 250); // Left Arm
//		g.drawLine(100, 225, 150, 175); // Right Arm
//		g.drawLine(75, 350, 100, 300); // Left Leg
//		g.drawLine(125, 350, 100, 300); // Right Leg
//		
//		// punch_low
//		g.drawOval(75, 125, 50, 75); // Head
//		g.drawLine(100, 200, 100, 300); // Body
//		g.drawLine(75, 200, 100, 225); // Left Arm
//		g.drawLine(75, 200, 75, 225); // Left Arm
//		g.drawLine(75, 225, 100, 250); // Left Arm
//		g.drawLine(100, 225, 150, 275); // Right Arm
//		g.drawLine(75, 350, 100, 300); // Left Leg
//		g.drawLine(125, 350, 100, 300); // Right Leg
		
//		// kick_high
//		g.drawOval(75, 125, 50, 75); // Head
//		g.drawLine(100, 200, 100, 300); // Body
//		g.drawLine(75, 225, 100, 225); // Left Arm
//		g.drawLine(125, 225, 100, 225); // Right Arm
//		g.drawLine(75, 325, 100, 300); // Left Leg
//		g.drawLine(75, 325, 75, 350); // Left Leg
//		g.drawLine(75, 350, 100, 325); // Left Leg
//		g.drawLine(150, 250, 100, 300); // Right Leg
		
//		// kick_low
//		g.drawOval(75, 125, 50, 75); // Head
//		g.drawLine(100, 200, 100, 300); // Body
//		g.drawLine(75, 225, 100, 225); // Left Arm
//		g.drawLine(125, 225, 100, 225); // Right Arm
//		g.drawLine(75, 300, 100, 300); // Left Leg
//		g.drawLine(75, 300, 75, 325); // Left Leg
//		g.drawLine(75, 325, 100, 325); // Left Leg
//		g.drawLine(150, 300, 100, 300); // Right Leg
		
//		while(true){
//			fight.nextAction();
//			fight.delay();
//			g.fill(fight.drawState());
//			
//			if(fight.getFirstFighter().getHealth() <= 0 || fight.getSecondFighter().getHealth() <= 0 || new Date().getTime() >= timeIsUp){
//				break;
//			}
//		}
//    }
	
	public void Simulate(){
		System.out.println("Simulating...");
		
		try {
			Display.setDisplayMode(new DisplayMode(800,600));
			Display.setTitle(fight.getFirstFighter().getName() + " V " + fight.getSecondFighter().getName());
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
			System.exit(0);
		}
		// init OpenGL here
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		GL11.glOrtho(0, 800, 0, 600, 1, -1);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
		
		while (!Display.isCloseRequested()) {
			// render OpenGL here
			drawPunchHigh();
			Display.update();
		}
		Display.destroy();
		
		System.out.println("Simulating Finished");
	}

	public void drawPunchHigh() {
		circle(200, 250, 50, 100); // Head
		line(200, 200, 200, 100); // Body
		line(150, 175, 250, 175);
		line(150, 50, 200, 100); // Left leg
		line(250, 50, 200, 100); // Right leg
	}

	public void drawPunchLow() {
		
	}

	public void drawKickHigh() {
		
	}

	public void drawKickLow() {
		
	}

	public void line(float x1, float y1, float x2, float y2){
		GL11.glLineWidth(5);
		GL11.glBegin(GL11.GL_LINES);
		GL11.glVertex2f(x1,y1);
		GL11.glVertex2f(x2,y2);
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
}
