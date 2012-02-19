package nodes;

import java.util.ArrayList;
import java.util.Iterator;

import saf.Logger;

public class Attack implements Node
{
	private ArrayList<String> attacks = new ArrayList<String>();
	private static final ArrayList<String> validattacks = new ArrayList<String>()
	{
		{
			add("punch_low");
			add("punch_high");
			add("kick_low");
			add("kick_high");
			add("block_low");
			add("block_high");
		}
	};
			
	public Attack()
	{
		
	}
	
	public void addAttack(String attack)
	{
		attacks.add(attack);
	}
	
	public boolean consistencyCheck()
	{
		Iterator<String> itr = attacks.iterator();
		boolean valid = true;
		while (itr.hasNext()) {
	      if(!isAttackValid(itr.next()))
	      {
	    	  valid = false;
	      }
	    }
		return valid;
	}
	
	private boolean isAttackValid(String attack)
	{
		if(validattacks.contains(attack))
		{
			return true;
		}
		else
		{
			Logger.staticLog("Invalid attack \"" + attack + "\".");
			return false;
		}
	}
	
	public ArrayList<String> getAttacks()
	{
		return attacks;
	}
	
}
