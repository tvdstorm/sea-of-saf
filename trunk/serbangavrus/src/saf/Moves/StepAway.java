package saf.moves;

import saf.*;

// This move goes away from the opponent by moving a few positions at a time
// The move is completed when the bot is not near it's opponent
abstract public class StepAway extends BotMove{
	
	// How many positions the Bot move at every tick
	protected int positionsPerTick;
	
	public StepAway(Bot b)
	{
		super(b);
	}
	
	public void doMove()
	{
		// Don't execute this move if it's completed
		if(!isComplete())
		{
			stepAway();
			// We moved away, check if the move is now completed
			isComplete();
		}
	}
	
	// Checks if the move is complete, if it is, it set the complete flag to true
	private boolean isComplete()
	{
		if(bot.isOpponentFar() || bot.isAtArenaMargin())
		{
			// The bot is next to it's opponent, move completed
			completed = true;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// Move the Bot's position closer to the opponent
	protected void stepAway()
	{
		int botPosition = bot.getPosition();
		int opponentPosition = bot.getOpponentPosition();
		int difPosition = botPosition - opponentPosition;
				
		// Determine the direction in which we should move
		if(difPosition < 0)
		{
			// The Bot needs to move West
			bot.moveWest(positionsPerTick);
		}
		else
		{
			// The Bot needs to move East
			bot.moveEast(positionsPerTick);
		}
	}
}
