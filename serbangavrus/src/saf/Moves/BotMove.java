package saf.moves;
import saf.*;

public abstract class BotMove {
	protected boolean completed;
	protected Bot bot;
	
	public BotMove(Bot b)
	{
		this.bot = b;
		this.completed = false;
	}
	
	abstract public void doMove();
	
	public boolean isCompleted()
	{
		return completed;
	}
}
