package safobjects;

public class Bots 
{
	private Bot firstBot;
	private Bot secondBot;
	
	
	public String toString() 
	{
		String output = getFirstBot().toString() + getSecondBot().toString();
		return "Class: " + this.getClass().getName() +  "\n" + output;
	}

	public Bot getFirstBot() 
	{
		return firstBot;
	}


	public void setFirstBot(Bot firstBot) 
	{
		this.firstBot = firstBot;
	}


	public Bot getSecondBot() 
	{
		return secondBot;
	}


	public void setSecondBot(Bot secondBot) 
	{
		this.secondBot = secondBot;
	}
}