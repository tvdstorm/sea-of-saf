package saf.moves;

import saf.*;

// This move goes away from the opponent by moving a few positions(equal to the Bot's speed) at a time
public class RunAway extends StepAway{
	
	public RunAway(Bot b)
	{
		super(b);
		positionsPerTick = bot.getSpeed();
	}
	
	public String toString()
	{
		return "RunAway";
	}
	
}
