package nodes;

import java.util.ArrayList;
import java.util.Iterator;

public class Condition implements Node
{
	protected static final ArrayList<String> validconditions = new ArrayList<String>()
	{
		{
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
	
	public boolean consistencyCheck()
	{
		Iterator<String> itr = conditions.iterator();
		boolean valid = true;
		while (itr.hasNext()) {
	      if(!isConditionValid(itr.next()))
	      {
	    	  valid = false;
	      }
	    }
		return valid;
	}
	
	private boolean isConditionValid(String condition)
	{
		if(validconditions.contains(condition))
		{
			return true;
		}
		else
		{
			System.out.println("Invalid condition \"" + condition + "\".");
			return false;
		}
	}
	
}
