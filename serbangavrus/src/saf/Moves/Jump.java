package saf.moves;

import saf.*;

// This move causes the fighter to jump in the air 
public class Jump extends BotMove{
	
	public Jump(Bot b)
	{
		super(b);
	}
	
	public void doMove()
	{
		bot.setJump(true);
		completed = true;
	}
	
	public String toString()
	{
		return "Jump";
	}
	
}
