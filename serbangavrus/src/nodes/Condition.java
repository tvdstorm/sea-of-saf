package nodes;

import java.util.ArrayList;

public class Condition
{
	protected static final ArrayList<String> validconditions = new ArrayList<String>()
	{
		{
			add("always");
			add("far");
			add("stronger");
			add("weaker");
			add("much_stronger");
			add("much_weaker");
			add("even");
			add("near");
			add("far");
			add("always");
		}
	};
	
	private ArrayList<String> conditions = new ArrayList<String>();
			
	public Condition()
	{
		
	}
	
	public void addCondition(String cond)
	{
		conditions.add(cond);
	}
	
}
