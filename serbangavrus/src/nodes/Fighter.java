package nodes;

import java.util.ArrayList;
import java.util.Iterator;

import saf.Logger;

public class Fighter
{
	ArrayList<Specification> specs = new ArrayList<Specification>();
	String name;
	
	public Fighter(String name)
	{
		this.name = name;
	}
	
	public void addSpec(Specification s)
	{
		specs.add(s);
	}
	
	public ArrayList<Personality> getPersonality()
	{
		ArrayList<Personality> pers = new ArrayList<Personality>();
		
		for(Specification s : specs)
		{
			if(s instanceof Personality)
			{
				pers.add((Personality)s);
			}
		}
		
		return pers;
	}
	
	
	public ArrayList<Behaviour> getBehaviour()
	{
		ArrayList<Behaviour> beh = new ArrayList<Behaviour>();
		
		for(Specification s : specs)
		{
			if(s instanceof Behaviour)
			{
				beh.add((Behaviour)s);
			}
		}
		
		return beh;
	}
	
	
	// Returns true is the Fighter specifications are valid
	public boolean isValid()
	{
		boolean ha = hasAlways();
		boolean consistent = consistencyCheck();
		
		if(!ha || !consistent)
		{
			Logger.staticLog(name + " is not consistent!");
			return false;
		}
		else
		{
			return true;
		}
	}
	
	
	// Checks if this fighter's behaviours have at least one condition with Always
	public boolean hasAlways()
	{
		ArrayList<Behaviour> bh = getBehaviour();
		
		for(Behaviour beh : bh)
		{
			if(beh.hasAlways())
			{
				return true;
			}
		}
		
		Logger.staticLog(name + " does not have \"always\" condition.");
		
		return false;
		
	}
	
	// Checks the fighter's specifications for consistency 
	public boolean consistencyCheck()
	{
		Iterator<Specification> itr = specs.iterator();
		boolean consistent = true;
		while (itr.hasNext()) {
	      Specification element = itr.next();
	      if(!element.consistencyCheck())
	      {
	    	  consistent = false;
	      }
	    }
		return consistent;
	}
	
	
	public String getName()
	{
		return name;
	}
	
}
