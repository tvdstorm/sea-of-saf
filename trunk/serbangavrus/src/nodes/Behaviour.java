package nodes;

import java.util.ArrayList;

public class Behaviour extends Specification
{
	private ArrayList<Condition> conditions = new ArrayList<Condition>();
	
	public Behaviour()
	{
		
	}
	
	public void addCondition(Condition c)
	{
		conditions.add(c);
	}
}
