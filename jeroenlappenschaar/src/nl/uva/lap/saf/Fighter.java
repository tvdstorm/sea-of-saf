package nl.uva.lap.saf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fighter
{
	private String name = "Unknown Fighter";
	
	private final int DEFAULT_PROPERTY = 5;
	//personality
	private int kickReach 	= DEFAULT_PROPERTY;
	private int kickPower	= DEFAULT_PROPERTY;
	private int punchReach 	= DEFAULT_PROPERTY;
	private int punchPower 	= DEFAULT_PROPERTY;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setPersonality(String personality, String value)
	{
		int intValue = Integer.parseInt(value);
		if(personality.equals("kickReach")) //if we had used Java 7 we could have used the switch statement ;)
			kickReach = intValue;
		if(personality.equals("kickPower"))
			kickPower = intValue;
		if(personality.equals("punchReach"))
			punchReach = intValue;
		if(personality.equals("punchPower"))
			punchPower = intValue;
	}
	
	public String toString()
	{
		return "Hello, my name is " + name + " and I do this: \n" + 
			"Kick-reach: " + kickReach + "\n" + 
			"Kick-power: " + kickPower + "\n" + 
			"punch-reach: " + punchReach + "\n" + 
			"punch-power: " + punchPower + "\n\n" +
			"and now it's time to kick some ass!!";
	}
	//behaviour
	//List behaviour = new ArrayList<BehaviourProperty>();
}
