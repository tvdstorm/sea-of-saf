package safFightAnimation;

import safAST.*;
import safFightAnimation.config.SAFFightAnimationConfig;
import safFightAnimation.config.SAFMoveAnimationConfig;
import java.awt.*;

public class SAFStatus{
	private Bot fighter;
	private double fighterSpeed;
	private int punchPower, kickPower, punchReach, kickReach;
	private SAFMoveAnimationConfig safMoveActConfig;
	private SAFFightAnimationConfig safFightActConfig;
	
	public SAFStatus(Bot b, Point p, String fileName)
	{
		fighter = b;
		calculateFighterSpeed();
		safMoveActConfig = new SAFMoveAnimationConfig(p);
		safFightActConfig = new SAFFightAnimationConfig(fileName);
	}
	
	private void calculateFighterSpeed()
	{
		int height = 0, weight = 0;
		
		for(Personality p : fighter.getPersonality())
		{
			if (p.getCharacterName().equalsIgnoreCase("punchPower")) 
				punchPower = p.getCharacterValue();
           	if (p.getCharacterName().equalsIgnoreCase("kickPower")) 
				kickPower = p.getCharacterValue();
            if (p.getCharacterName().equalsIgnoreCase("punchReach")) 
				punchReach = p.getCharacterValue();
            if (p.getCharacterName().equalsIgnoreCase("kickReach")) 
				kickReach = p.getCharacterValue();
        }
		
		weight = (punchPower + kickPower) / 2;
		height = (punchReach + kickReach) / 2;
		fighterSpeed = Math.abs(0.5*(height-weight));
	}
	
	public SAFFightAnimationConfig getSAFFightConfig()
	{
		return safFightActConfig;
	}
	
	public SAFMoveAnimationConfig getSAFMoveConfig()
	{
		return safMoveActConfig;
	}
	
	public double getFighterSpeed()
	{
		return fighterSpeed;
	}
	
	public int getFighterPunchPower()
	{
		return punchPower; 
	}
	
	public int getFighterKickPower()
	{
		return kickPower; 
	}
	
	public int getFighterPunchReach()
	{
		return punchReach; 
	}
	
	public int getFighterKickReach()
	{
		return kickReach;
	}
}