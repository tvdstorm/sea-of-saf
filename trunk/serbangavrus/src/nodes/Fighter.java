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
