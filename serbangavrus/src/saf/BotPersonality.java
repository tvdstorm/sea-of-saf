package saf;

import java.util.ArrayList;

import nodes.*;

public class BotPersonality {
	
	private ArrayList<Personality> personalities = new ArrayList<Personality>();
	
	public BotPersonality(ArrayList<Personality> p)
	{
		personalities = p;
	}
	
	// Returns the value of the punchReach strength from the Fighter's personality
	public int getPunchReach()
	{
		return getStrentgValue("punchReach");
	}
	
	// Returns the value of the kickReach strength from the Fighter's personality
	public int getKickReach()
	{
		return getStrentgValue("kickReach");
	}
	
	// Returns the value of the kickPower strength from the Fighter's personality
	public int getKickPower()
	{
		return getStrentgValue("kickPower");
	}
	
	// Returns the value of the punchPower strength from the Fighter's personality
	public int getPunchPower()
	{
		return getStrentgValue("punchPower");
	}
	
	// Returns the value of the strength received as argument
	public int getStrentgValue(String strength)
	{
		for (Personality pers : personalities) {
			if(pers.getStrength().equals(strength))
			{
				return pers.getVal();
			}
		}
		
		// Default to 5
		return 5;
	}
}
