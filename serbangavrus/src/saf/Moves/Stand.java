package saf.Moves;

import saf.*;

// This move causes the fighter to jump in the air 
public class Stand extends BotMove{
	
	public Stand(Bot b)
	{
		super(b);
	}
	
	public void doMove()
	{
		bot.setStand(true);
		completed = true;
	}
	
	public String toString()
	{
		return "Stand";
	}
	
}
