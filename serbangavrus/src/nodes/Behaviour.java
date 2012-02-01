package nodes;

import java.util.ArrayList;
import java.util.Iterator;

public class Behaviour extends Specification
{
	private ArrayList<Condition> conditions = new ArrayList<Condition>();
	private ArrayList<Move> moves = new ArrayList<Move>();
	private ArrayList<Attack> attacks = new ArrayList<Attack>();
	
	public Behaviour()
	{
		
	}
	
	public void addCondition(Condition c)
	{
		conditions.add(c);
	}
	
	public void addAttack(Attack a)
	{
		attacks.add(a);
	}
	
	public void addMove(Move m)
	{
		moves.add(m);
	}

	@Override
	public boolean consistencyCheck()
	{
		boolean consistent = true;
		if(!isValid(conditions))
		{
			consistent = false;
		}

		if(!isValid(attacks))
		{
			consistent = false;
		}

		if(!isValid(moves))
		{
			consistent = false;
		}
		
		return consistent;
	}
	
	public boolean isValid(ArrayList prop)
	{
		Iterator<Node> itr = prop.iterator();
		boolean valid = true;
		while (itr.hasNext()) {
	      if(!itr.next().consistencyCheck())
	      {
	    	  valid = false;
	      }
	    }
		return valid;
	}
}
