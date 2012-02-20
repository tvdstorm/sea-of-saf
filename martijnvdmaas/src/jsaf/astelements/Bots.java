package jsaf.astelements;

import jsaf.visitor.SAFElement;
import jsaf.visitor.SAFElementVisitor;

public class Bots implements SAFElement
{
	private Bot leftBot;
	private Bot rightBot;
	
	public Bot getLeftBot() 
	{
		return leftBot;
	}


	public void setLeftBot(Bot leftBot) 
	{
		this.leftBot = leftBot;
	}


	public Bot getRightBot() 
	{
		return rightBot;
	}


	public void setRightBot(Bot leftBot) 
	{
		this.rightBot = leftBot;
	}

	@Override
	public void accept(SAFElementVisitor visitor) throws Exception {
		leftBot.accept(visitor);
		rightBot.accept(visitor);
		
		visitor.visit(this);
	}
}