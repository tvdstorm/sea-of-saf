package saf;

public class Cronos {
	private Bot bot1, bot2;
	
	public Cronos(Bot b1, Bot b2)
	{
		bot1 = b1;
		bot2 = b2;

		bot1.addOpponent(b2);
		bot2.addOpponent(b1);
	}
	
	public void startFight()
	{
		this.tick();
	}
	
	public void tick()
	{
		if(!bot1.isDefeated() && !bot2.isDefeated())
		{
			bot1.establishTactic();
			bot2.establishTactic();
			
			Logger.log("Bot 1 position: " + bot1.getPosition());
			Logger.log("Bot 2 position: " + bot2.getPosition());
			
			bot1.doTactic();
			bot2.doTactic();
			
			this.tick();
		}
		else
		{
			Logger.log("We have a winner!");
		}
	}
}
