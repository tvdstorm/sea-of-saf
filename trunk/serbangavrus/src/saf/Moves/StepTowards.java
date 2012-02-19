package saf.Moves;

import saf.*;

// This move goes towards the opponent by moving a few positions at a time
// The move is completed when the bot is next to it's opponent
abstract public class StepTowards extends BotMove{
	
	// How many positions the Bot move at every tick
	protected int positionsPerTick;
	
	public StepTowards(Bot b)
	{
		super(b);
	}
	
	public void doMove()
	{
		// TODO check if you can remove this first if
		if(bot.isNextToOpponent())
		{
			// The bot is next to it's opponent, move completed
			completed = true;
		}
		else
		{
			stepTowards();
			if(bot.isNextToOpponent())
			{
				// The bot is next to it's opponent, move completed
				completed = true;
			}
		}
		
	}
	
	// Move the Bot's position closer to the opponent
	protected void stepTowards()
	{
		// Bot is not next to it's opponent, move closer
		int botPosition = bot.getPosition();
		int opponentPosition = bot.getOpponentPosition();
		int difPosition = botPosition - opponentPosition;
		// The number of positions the Bot needs to move to be next to it's opponent
		int neededPositions = Math.abs(difPosition);
		
		// How many positions the Bot should actually move
		int actualPositionsToMove = positionsPerTick;
		
		// If the positions needed to be next to the opponent are fewer than positionsPerTick
		// The Bot should advance only the necessary positions
		if(neededPositions < positionsPerTick)
		{
			actualPositionsToMove = neededPositions;
		}
		// Determine the direction in which we should move
		if(difPosition < 0)
		{
			// The Bot needs to move East
			bot.moveEast(actualPositionsToMove);
		}
		else
		{
			// The Bot needs to move West
			bot.moveWest(actualPositionsToMove);
		}
	}
}
