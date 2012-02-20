package saf;


public class Logger {
	
	private String entity;
	public Logger(String en)
	{
		entity = en;
	}
	
	public void log(String message)
	{
		System.out.println(entity + ": " + message);
	}
	
	static public void staticLog(String message)
	{
		System.out.println(message);
	}
	
}
