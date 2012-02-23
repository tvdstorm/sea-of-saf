package saf.simulator.helpers;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.GL11;

public class FightSimulatorShapes {
	public static void line(int x1, int y1, int x2, int y2) throws LWJGLException {
		GL11.glColor3f(1.0f, 1.0f, 1.0f);
		GL11.glLineWidth(2);
		GL11.glBegin(GL11.GL_LINES);
		GL11.glVertex2f(x1,y1);
		GL11.glVertex2f(x2,y2);
		GL11.glEnd();
	}
	public static void circle(int x, int y, int r) throws LWJGLException {
	    double inc = Math.PI / 12;
	    double max = 2 * Math.PI;
	    GL11.glColor3f(1.0f, 1.0f, 1.0f);
	    GL11.glBegin(GL11.GL_LINE_LOOP);
	    for(double d = 0; d < max; d += inc) {
	    	GL11.glVertex2f((float)Math.cos(d) * r + x, (float)Math.sin(d) * r + y);
	    }
	    GL11.glEnd();
	}
	public static void rectangle(int x, int y, int width, int height) throws LWJGLException {
		GL11.glColor3f(1.0f, 0.1f, 0.1f);
		GL11.glBegin(GL11.GL_QUADS);
		GL11.glVertex2f(x,y);
		GL11.glVertex2f(x + width, y);
		GL11.glVertex2f(x + width, y + height);
		GL11.glVertex2f(x, y + height);
		GL11.glEnd();
	}
}
