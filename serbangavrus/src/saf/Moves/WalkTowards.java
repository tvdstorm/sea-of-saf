package saf.Moves;

import saf.*;

// This move goes towards the opponent by moving a few positions(equal to the Bot's speed / 2) at a time
public class WalkTowards extends StepTowards{
	
	public WalkTowards(Bot b)
	{
		super(b);
		positionsPerTick = Math.round(bot.getSpeed()/2);
	}
	
	public String toString()
	{
		return "WalkTowards";
	}
}
