package nodes;

import java.util.ArrayList;
import java.util.Iterator;

public class Fighter
{
	ArrayList<Specification> specs = new ArrayList<Specification>();
	
	public Fighter(String name)
	{
		System.out.println(name);
	}
	
	public void addSpec(Specification s)
	{
		specs.add(s);
	}
	
	public void test()
	{
		Iterator<Specification> itr = specs.iterator();
		while (itr.hasNext()) {
	      Specification element = itr.next();
	      if(element instanceof Personality)
	      {
	    	  System.out.println("PERS: " + ((Personality)element).getStrength());
	      }
	      else if(element instanceof Behaviour)
	      {
	    	  System.out.println("BEH");
	      }
	      else
	      {
	    	  System.out.println(element);	    	  
	      }
	    }
	}
	
}
