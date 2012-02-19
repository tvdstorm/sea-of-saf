package safVisualization;

import java.awt.Color;
import java.util.Random;

/**
 * This class represents the visualization of a fighter
 * @author Sofia
 *
 */
public class FighterVisualization {

	public static final int LOW = 0;//For block
	public static final int HIGH = 1;
	public static final int JUMP = 2;//For move
	public static final int CROUCH = 3;
		

	// For blocks
	boolean sqr = false;
	double sqrX = 0.0;
	double sqrY = 0.0;
	double sqrHalfWidth = 0.1;

	private String name = "";

	private double hand1x, hand1y;
	private double hand2x, hand2y;

	private double body1x, body1y;
	private double body2x, body2y;
	private double bodyHalfy;

	private double leg1x, leg1y;
	private double leg2x, leg2y;

	private double headx, heady;
	private double headRadius;

	private Color c;
	private double height;
	private int num;

	/**
	 * Constructor
	 * @param h is the height
	 * @param n is the player number
	 * @param name is the fighter name
	 * @param pos is the position in the arena
	 */
	public FighterVisualization(double h, int n, String name, int pos) {
		this.setName(new String(name));

		this.height = h;
		this.num = n;
		headRadius = height / 10;

		updateFighterPosition(pos);

		headx = body1x;
		heady = headRadius + body2y;

		Random r = new Random();
		c = new Color(r.nextInt(127) + 128, r.nextInt(127) + 128,
				r.nextInt(127) + 128);
	}

	/**
	 * Initialiazes the body,hands and legs on the screen
	 */
	public void initializeBodyHandsLegs(){
		
		body1y = 0.8;
		body2x = body1x;
		body2y = body1y+ 0.7 + (height / 10);

		bodyHalfy = body2y / 2 + 0.4;
		
		leg1x = body1x - 0.4;
		leg1y = body1y - 0.5;
		leg2x = body1x + 0.4;
		leg2y = body1y - 0.5;

		hand1x = leg1x;
		hand1y = body1y + 0.5;

		hand2x = leg2x;
		hand2y = body1y + 0.5;
		
		headx = body1x;
		heady = headRadius + body2y;
	}
	
	/**
	 * Updates the fighter position on the screen to x
	 * @param x
	 */
	public void updateFighterPosition(int x) {
		body1x = ((double) x/10)+1.0;

		initializeBodyHandsLegs();
		
		headx = body1x;
		heady = headRadius + body2y;
	}

	/**
	 * Presents the fighter on the screen
	 */
	public void drawFighter() {
		// drawbody
		StdDraw.setPenColor(c);
		drawHead();
		StdDraw.line(body1x, body1y, body2x, body2y);
		StdDraw.line(leg1x, leg1y, body1x, body1y);
		StdDraw.line(leg2x, leg2y, body1x, body1y);

		StdDraw.line(hand1x, hand1y, body1x, bodyHalfy);
		StdDraw.line(hand2x, hand2y, body1x, bodyHalfy);

		if (sqr) {
			sqr = false;
			StdDraw.filledSquare(sqrX, sqrY, sqrHalfWidth);
		}
	}

	/**
	 * Draws a circle tha represents the head
	 */
	private void drawHead() {
		StdDraw.setPenColor(c);
		StdDraw.filledCircle(headx, heady, headRadius);
	}

	/**
	 * Represents a high punch
	 */
	public void highPunch() {
		if (num == 1) {
			leg1x = body1x - 0.4;
			leg1y = body1y - 0.5;
			leg2x = body1x + 0.4;
			leg2y = body1y - 0.5;

			hand1x = hand2x;
			hand1y = body1y + 0.8;

			hand2x = leg2x;
			hand2y = body1y + 0.5;
		} else {
			leg1x = body1x - 0.4;
			leg1y = body1y - 0.5;
			leg2x = body1x + 0.4;
			leg2y = body1y - 0.5;

			hand1x = leg1x;
			hand1y = body1y + 0.5;

			hand2x = leg1x;
			hand2y = body1y + 0.8;
		}
	}
	
	/**
	 * Represents a low punch
	 */
	public void lowPunch() {
		if (num == 1) {
			leg1x = body1x - 0.4;
			leg1y = body1y - 0.5;
			leg2x = body1x + 0.4;
			leg2y = body1y - 0.5;

			hand1x = hand2x;
			hand1y = body1y;

			hand2x = leg2x;
			hand2y = body1y + 0.5;
		} else {
			leg1x = body1x - 0.4;
			leg1y = body1y - 0.5;
			leg2x = body1x + 0.4;
			leg2y = body1y - 0.5;

			hand1x = leg1x;
			hand1y = body1y + 0.5;

			hand2x = leg1x;
			hand2y = body1y;
		}
	}

	/**
	 * Represents a high kick
	 */
	public void highKick() {
		if (num == 1) {
			leg1x = leg2x;
			leg1y = bodyHalfy - 0.1;
			leg2x = body1x + 0.4;
			leg2y = body1y - 0.5;

			hand1x = leg1x;
			hand1y = body1y + 0.5;

			hand2x = leg2x;
			hand2y = body1y + 0.5;
		} else {
			leg1x = body1x - 0.4;
			leg1y = body1y - 0.5;
			leg2x = leg1x;
			leg2y = bodyHalfy - 0.1;

			hand1x = leg1x;
			hand1y = body1y + 0.5;

			hand2x = leg2x;
			hand2y = body1y + 0.5;
		}
	}

	/**
	 * Represents a low kick
	 */
	public void lowKick() {
		if (num == 1) {
			leg1x = leg2x;
			leg1y = body1y;
			leg2x = body1x + 0.4;
			leg2y = body1y - 0.5;

			hand1x = leg1x;
			hand1y = body1y + 0.5;

			hand2x = leg2x;
			hand2y = body1y + 0.5;
		} else {
			leg1x = body1x - 0.4;
			leg1y = body1y - 0.5;
			leg2x = leg1x;
			leg2y = body1y;

			hand1x = leg1x;
			hand1y = body1y + 0.5;

			hand2x = leg2x;
			hand2y = body1y + 0.5;
		}
	}

	/**
	 * Represents the block action
	 * @param b
	 */
	public void block(int b) {
		if (b == FighterVisualization.LOW)
			lowPunch();
		else
			highPunch();

		if (this.num == 1) {
			sqrX = hand1x;
			sqrY = hand1y;
		} else {
			sqrX = hand2x;
			sqrY = hand2y;
		}
		sqr = true;
	}
	
	/**
	 * Represents the jump and crounch actions
	 * @param move
	 */
	public void moveUpDown(int move){
		if(move==FighterVisualization.JUMP){
			body1y=1.4;			
		}else if(move==FighterVisualization.CROUCH){
			body1y=0.4;
		}
		body2x = body1x;
		body2y = body1y+ 0.7 + (height / 10);

		bodyHalfy = body2y / 2 + 0.4;
		
		headx = body1x;
		heady = headRadius + body2y;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
