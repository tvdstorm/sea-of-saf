package nodes;

import java.util.ArrayList;
import java.util.Iterator;

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
	
}
