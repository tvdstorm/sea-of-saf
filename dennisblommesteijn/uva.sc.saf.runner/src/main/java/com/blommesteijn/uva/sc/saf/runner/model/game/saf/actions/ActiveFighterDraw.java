package com.blommesteijn.uva.sc.saf.runner.model.game.saf.actions;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.blommesteijn.uva.sc.saf.ast.types.actions.Action;

public class ActiveFighterDraw
{
	public static String[] getAttack(Action lastAction, boolean inverse)
	{
		String[] ret = null;
		String actionName = lastAction.getName();
		
		if(lastAction == null)
			ret = ActiveFighterDraw.getAttackDefault();
		else
		{
			if(__allDraw.containsKey(actionName))
				ret = __allDraw.get(actionName);
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
	
	
	private static Map<String, String[]> __allDraw = getAllDraw();
	protected static Map<String, String[]> getAllDraw()
	{
		Map<String, String[]> ret = new HashMap<String, String[]>();
		ret.put("default", getAttackDefault());
		ret.put("block_high", getAttackBlockHigh());
		ret.put("block_low", getAttackBlockLow());
		ret.put("punch_high", getAttackPunchHigh());
		ret.put("punch_low", getAttackPunchLow());
		ret.put("kick_high", getAttackKickHigh());
		ret.put("kick_low", getAttackKickLow());
		return ret;
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
