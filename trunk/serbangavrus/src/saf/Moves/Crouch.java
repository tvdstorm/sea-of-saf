package saf.moves;

import saf.*;

// This move causes the fighter to jump in the air 
public class Crouch extends BotMove{
	
	public Crouch(Bot b)
	{
		super(b);
	}
	
	public void doMove()
	{
		bot.setCrouch(true);
		completed = true;
	}
	
	public String toString()
	{
		return "Crouch";
	}
	
}
