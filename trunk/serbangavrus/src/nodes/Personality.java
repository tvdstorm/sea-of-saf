package nodes;

import java.util.ArrayList;

public class Personality extends Specification
{
	private String strength = "";
	private int val;
	private final ArrayList<String> validstrengths = new ArrayList<String>()
	{
		{
			add("punchPower");
			add("kickPower");
			add("kickReach");
			add("punchReach");
		}
	};
	
	public Personality(String strength, int val)
	{
		this.strength = strength;
		this.val = val;				
	}
	
	public String getStrength()
	{
		return this.strength;
	}
	
	@Override
	public boolean consistencyCheck()
	{
		if(!isValidStrength() || !isValidVal())
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	private boolean isValidStrength()
	{
		if(!this.validstrengths.contains(strength))
		{
			System.out.println("Invalid strength:" + strength);
			return false;
		}
		else
		{
			return true;
		}
	}
	
	private boolean isValidVal()
	{
		if(val < 0 || val > 10)
		{
			System.out.println("Invalid strength value for \"" + strength + "\", must be a number between 1-10.");
			return false;
		}
		else
		{
			return true;
		}
	}
}
