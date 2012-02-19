package saf.Moves;

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
		// TODO check if you can remove this first if
		if(bot.isAwayFromOpponent() || bot.isAtArenaMargin())
		{
			// The bot is next to it's opponent, move completed
			completed = true;
		}
		else
		{
			stepAway();
			if(bot.isAwayFromOpponent() || bot.isAtArenaMargin())
			{
				// The bot is next to it's opponent, move completed
				completed = true;
			}
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
