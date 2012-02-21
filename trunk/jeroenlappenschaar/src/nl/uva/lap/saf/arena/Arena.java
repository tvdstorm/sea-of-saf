package nl.uva.lap.saf.arena;

import java.awt.Font;

import nl.uva.lap.saf.arena.StateFighter.Color;
import nl.uva.lap.saf.arena.StateFighter.Direction;
import nl.uva.lap.saf.arena.StateFighter.Stand;

public class Arena
{
	private final String title = "Super Awesome Fighter";
	private final int X_WINDOW = 1280;
	private final int Y_WINDOW = 720;
	
	private final int X_SCALE = 100;
	private final int Y_SCALE = 100;
	
	private final int Y_FIGHTER = 11;
	private final int Y_FIGHTER_JUMP = 18;
	
	//Adress data:
	private final String RECOURSES = "recourses/sprites";
	private final String IMAGE_EXTENSION = ".gif";
	private final String ARENA_ADRESS = "recourses/sprites/dojo.png";
	
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
	
	private void drawArena()
	{
		StdDraw.picture(X_SCALE/2, Y_SCALE/2, ARENA_ADRESS);
	}
	
	private void drawScoreFighter(StateFighter fighter)
	{
		int x = fighter.getDirection() == Direction.LEFT ? 3 : X_SCALE -3;
		StdDraw.setPenColor(fighter.getColor() == Color.BLUE ? StdDraw.BLUE : StdDraw.GREEN);
		StdDraw.text(x, Y_SCALE-2, fighter.getName());
		StdDraw.text(x, Y_SCALE-6, "Health: " + fighter.getHealth());
	}
	
	private void drawBigText(String text)
	{
		StdDraw.setFont(new Font("SansSerif", Font.PLAIN, 65));
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.text(X_SCALE/2, Y_SCALE/2, text);
	}
	
	private void drawVictoryScreen()
	{
		if(state.getFighter1().isDead() && state.getFighter2().isDead())
			drawBigText("Both players loose!");
		else if(state.getFighter1().isDead())
			drawBigText(state.getFighter2().getName() + " wins!!!");
		else if(state.getFighter2().isDead())
			drawBigText(state.getFighter1().getName() + " wins!!!");
	}
	
	private void drawScoreBoard()
	{
		StdDraw.setFont(new Font("SansSerif", Font.PLAIN, 30));
		drawScoreFighter(state.getFighter1());
		drawScoreFighter(state.getFighter2());
	}
	
	private String getColorAdress(Color color)
	{
		if(color.equals(Color.GREEN))
			return "green";
		return "blue";
	}
	
	private String getMovementSpriteAdress(StateFighter fighter)
	{
		if(fighter.isDead())
			return "lost";
		if(fighter.isVictorious())
			return "victory";
		String action = fighter.getAction();
		if(fighter.getMovement().equals("crouch"))
		{
			if(action.equals("punch_low") || action.equals("punch_high"))
				return "crouch_punch";
			if(action.equals("kick_low") || action.equals("kick_high"))
				return "crouch_kick";
			return "crouch";
		}
		
		return action;
	}
	
	private String getSpriteAdress(StateFighter fighter)
	{
		return RECOURSES+"/"+getColorAdress(fighter.getColor())+"/"+getMovementSpriteAdress(fighter)+IMAGE_EXTENSION;
	}
	
	private void drawFighter(StateFighter fighter)
	{
		int xPosition = fighter.getXPosition();
		int yPosition = Y_FIGHTER;
		if(fighter.getStand() == Stand.JUMP)
			yPosition = Y_FIGHTER_JUMP;
		String spriteAdress = getSpriteAdress(fighter);
		if(fighter.getDirection() == Direction.LEFT)
			StdDraw.picture(xPosition, yPosition, spriteAdress);
		else
			StdDraw.pictureFlipped(xPosition, yPosition, spriteAdress);
	}

	public void run()
	{
		initializeWindow();
		while(true)
		{
			drawArena();
			drawFighter(state.getFighter1());
			drawFighter(state.getFighter2());
			drawScoreBoard();
			drawVictoryScreen();
			state.next();
			StdDraw.show(FRAME_RATE);
		}
	}
}
