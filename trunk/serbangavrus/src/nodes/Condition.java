package nodes;

import java.util.ArrayList;
import java.util.Iterator;

import saf.Logger;

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
	
	protected ArrayList<String> conditions = new ArrayList<String>();
			
	public Condition()
	{
		
	}
	
	public ArrayList<String> getConditions()
	{
		return conditions;
	}
	
	public boolean isAndCondition()
	{
		return false;
	}
	
	public boolean isOrCondition()
	{
		return false;
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
			
		  String cond = itr.next();
			
		  // Is this condition valid?
	      if(!isConditionValid(cond))
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
			Logger.staticLog("Invalid condition \"" + condition + "\".");
			return false;
		}
	}
	
	// Returns true if this condition contains "always"
	public boolean hasAlways()
	{
		for(String c : conditions)
		{
			if(c.equals("always"))
			{
				return true;
			}
		}
		
		return false;
	}
	
	public String toString()
	{
		return conditions.get(0);
	}
	
}
