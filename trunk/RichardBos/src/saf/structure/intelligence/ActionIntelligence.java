package saf.structure.intelligence;

import java.util.List;

import saf.structure.Action;

public class ActionIntelligence {

	public static String ToString(List<Action> actions)
	{
		if(actions.size() == 1)
		{
			return actions.get(0).getValue();
		}
		else
		{
			String strReturn = "choose(";
			for (Action action : actions) {
				strReturn += " " + action.getValue();
			}
			return strReturn.trim() + ")";
		}
	}
	
}
