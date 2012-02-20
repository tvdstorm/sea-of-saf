package nl.uva.lap.saf.ast.evaluator;

public abstract class Message
{
	private final String message;
	
	public Message(String message)
	{
		this.message = message;
	}
	
	public String getMessage()
	{
		return message;
	}
}
