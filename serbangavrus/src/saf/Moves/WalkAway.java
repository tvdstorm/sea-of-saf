package saf.moves;

import saf.*;

// This move goes away from the opponent by moving a few positions(equal to the Bot's speed / 2) at a time
public class WalkAway extends StepAway{
	
	public WalkAway(Bot b)
	{
		super(b);
		positionsPerTick = Math.round(bot.getSpeed()/2);
	}
	
	public String toString()
	{
		return "WalkAway";
	}
}
