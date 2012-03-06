package com.blommesteijn.uva.sc.saf.runner.model.game.saf.actions;

import java.util.LinkedList;
import java.util.List;

import com.blommesteijn.uva.sc.saf.ast.types.values.EAttack;

public class ActiveFighterDraw
{
	public static String[] getAttack(EAttack attack, boolean inverse)
	{
		String[] ret = null;
		
		if(attack == null)
			ret = ActiveFighterDraw.getAttackDefault();
		else
			switch(attack)
			{
				case BLOCK_HIGH:
					ret = ActiveFighterDraw.getAttackBlockHigh();
					break;
				case BLOCK_LOW:
					ret = ActiveFighterDraw.getAttackBlockLow();
					break;
				case PUNCH_HIGH:
					ret = ActiveFighterDraw.getAttackPunchHigh();
					break;
				case PUNCH_LOW:
					ret = ActiveFighterDraw.getAttackPunchLow();
					break;
				case KICK_HIGH:
					ret = ActiveFighterDraw.getAttackKickHigh();
					break;
				case KICK_LOW:
					ret = ActiveFighterDraw.getAttackKickLow();
					break;
				default:
					ret = ActiveFighterDraw.getAttackDefault();
					break;
			}
		
		if(inverse)
			ret = ActiveFighterDraw.inverse(ret);
		
		return ret;
	}
	
	private static String[] inverse(String[] input)
	{
		List<String> ret = new LinkedList<String>();
		for(String i : input)
		{
			String tmp = "";
			for(int j = i.length()-1; j >= 0 ; j--)
				tmp += i.charAt(j);
			
			tmp = tmp.replace('\\', '1');
			tmp = tmp.replace('/', '2');
			tmp = tmp.replace('(', '3');
			tmp = tmp.replace(')', '4');
			tmp = tmp.replace('1', '/');
			tmp = tmp.replace('2', '\\');
			tmp = tmp.replace('3', ')');
			tmp = tmp.replace('4', '(');
			ret.add(tmp);
		}
		return ret.toArray(new String[0]);
	}
	
	
	private static String[] getAttackDefault()
	{
		return new String[] {
				" ()     ",
				"/---/   ",
				" ||     ",
				" /\\    "
		};
	}
	
	private static String[] getAttackBlockHigh()
	{
		return new String[] {
				" () |   ",
				"/---/   ",
				" ||-|   ",
				" /      "
		};
	}
	
	private static String[] getAttackBlockLow()
	{
		return new String[] {
				" ()    ",
				"/---|  ",
				" ||-\\  ",
				" /  |   "
		};	
	}
	
	private static String[] getAttackPunchHigh()
	{
		return new String[] {
				" ()   /-",
				" ---=/  ",
				" ||     ",
				" /\\    "
		};	
	}
	
	private static String[] getAttackPunchLow()
	{
		return new String[] {
				" ()     ",
				" ---=\\  ",
				" ||   \\- ",
				" /\\     "
		};	
	}
	
	private static String[] getAttackKickHigh()
	{
		return new String[] {
				" ()     ",
				"/--/ -/=",
				" ||--/  ",
				" /      "
		};	
	}
	
	private static String[] getAttackKickLow()
	{
		return new String[] {
				" ()     ",
				"/--/    ",
				" ||--\\  ",
				" /   -\\="
		};	
	}
}
