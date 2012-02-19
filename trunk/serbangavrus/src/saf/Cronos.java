package saf;

public class Cronos {
	private Bot bot1, bot2;
	private Logger logger = new Logger("Cronos");
	
	public Cronos(Bot b1, Bot b2)
	{
		bot1 = b1;
		bot2 = b2;

		bot1.addOpponent(b2);
		bot2.addOpponent(b1);
	}
	
	public void fight()
	{
		// Keep executing as long as no fighter is defeated  
		while(!bot1.isDefeated() && !bot2.isDefeated())
		{
			// Each time this loop is executed, it represents a moment when the fighters can choose a new move and attack
			
			// Bots decide on a tactic based on the proximity to the opponent and their personalities
			bot1.establishTactic();
			bot2.establishTactic();
			
			logger.log("Bot 1 position: " + bot1.getPosition());
			logger.log("Bot 2 position: " + bot2.getPosition());
			
			// Execute the previously decided tactic
			bot1.doTactic();
			bot2.doTactic();
		}
		
		showWinner();
	}
	
	// Shows who's the winner of the match, if there is one
	public void showWinner()
	{
		if(bot2.isDefeated())
		{
			logger.log(bot1.getBotName() + " is the winner!");
		}
		else if(bot1.isDefeated())
		{
			logger.log(bot2.getBotName() + " is the winner!");
		}
		else
		{
			logger.log("Match has no winner yet.");
		}
		
		
	}
}
