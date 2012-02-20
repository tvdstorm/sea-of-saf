package safreader.nodes;

import java.util.ArrayList;

import saf.Logger;

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
	
	public int getVal()
	{
		return this.val;
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
			Logger.staticLog("Invalid strength:" + strength);
			return false;
		}
		else
		{
			return true;		}
	}

	private boolean isValidVal()
	{
		if(val < 0 || val > 9)
		{
			Logger.staticLog("Invalid strength value for \"" + strength + "\", must be a number between 1-9.");
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public String toString()
	{
		return strength + " = " + val;
	}
}
