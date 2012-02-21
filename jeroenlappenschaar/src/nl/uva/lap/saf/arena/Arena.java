package nl.uva.lap.saf.arena;

import nl.uva.lap.saf.ast.fighter.StateFighter;
import nl.uva.lap.saf.ast.fighter.StateFighter.Direction;
import nl.uva.lap.saf.ast.fighter.StateFighter.Stand;

public class Arena
{
	private final String title = "Super Awesome Fighter";
	private final int X_WINDOW = 1280;
	private final int Y_WINDOW = 720;
	
	private final int X_SCALE = 100;
	private final int Y_SCALE = 100;
	
	private final int Y_FIGHTER = 11;
	private final int Y_FIGHTER_JUMP = 14;
	
	private State state;
	
	public Arena(State state)
	{
		this.state = state;
	}
	
	private final int FRAME_RATE = 20;
	
	private void initializeWindow()
	{
		StdDraw.setTitle(title);
		StdDraw.setCanvasSize(X_WINDOW, Y_WINDOW);
		StdDraw.setXscale(0, X_SCALE);
		StdDraw.setYscale(0, Y_SCALE);
	}

	private void reset()
	{
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledSquare(0, 0, 100.0);
	}
	
	private void drawArena()
	{
		StdDraw.picture(50.0, 50.0, "recourses/sprites/dojo.png");
	}
	
	private void drawFighter(StateFighter fighter)
	{
		int xPosition = fighter.getXPosition();
		int yPosition = Y_FIGHTER;
		if(fighter.getStand() == Stand.JUMP)
			yPosition = Y_FIGHTER_JUMP;
		//String color = fighter.getColor();
		if(fighter.getDirection() == Direction.LEFT)
			StdDraw.picture(xPosition, yPosition, "recourses/sprites/blue/stand.gif");
		else
			StdDraw.pictureFlipped(xPosition, yPosition, "recourses/sprites/green/low_kick.png");
	}

	public void run()
	{
		initializeWindow();
		while(true)
		{
			drawArena();
			drawFighter(state.getFighter1());
			drawFighter(state.getFighter2());
			state.next();
			StdDraw.show(FRAME_RATE);
		}
	}
}
