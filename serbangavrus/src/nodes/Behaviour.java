package nodes;

import java.util.ArrayList;
import java.util.Iterator;

public class Behaviour extends Specification
{
	private Condition condition;
	private Move move;
	private Attack attack;
	
	public Behaviour()
	{
		
	}
	
	public Condition getCondition()
	{
		return condition;
	}
	
	public void setCondition(Condition c)
	{
		condition = c;
	}
	
	public void setAttack(Attack a)
	{
		attack = a;
	}
	
	public void setMove(Move m)
	{
		move = m;
	}
	
	public Attack getAttack()
	{
		return attack;
	}
	
	public Move getMove()
	{
		return move;
	}

	@Override
	public boolean consistencyCheck()
	{
		boolean consistent = true;
		if(!isValid(condition) || !isValid(attack) || !isValid(move))
		{
			consistent = false;
		}
		
		return consistent;
	}
	
	public boolean isValid(Node prop)
	{
		return prop.consistencyCheck();
	}
	
	public boolean hasAlways()
	{
		return condition.hasAlways();
	}
}
