package saf.moves;

import saf.*;

// This move goes towards the opponent by moving a few positions(equal to the Bot's speed) at a time
public class RunTowards extends StepTowards{
	
	public RunTowards(Bot b)
	{
		super(b);
		positionsPerTick = bot.getSpeed();
	}
	
	public String toString()
	{
		return "RunTowards";
	}
}
