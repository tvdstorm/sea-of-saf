package astelements;

import visitor.SAFElement;
import visitor.SAFElementVisitor;

public class Bots implements SAFElement
{
	private Bot firstBot;
	private Bot secondBot;
	
	
	public String toString() 
	{
		return "Class: " + this.getClass().getName();
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

	@Override
	public void accept(SAFElementVisitor visitor) throws Exception {
		firstBot.accept(visitor);
		secondBot.accept(visitor);
		
		visitor.visit(this);
	}
}