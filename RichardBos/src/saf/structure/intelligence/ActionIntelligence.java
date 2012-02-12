package saf.structure.intelligence;

import java.util.List;

import saf.structure.Action;

public abstract class ActionIntelligence {

	public static String toString(List<Action> actions)
	{
		if(actions.size() == 1)
		{
			return actions.get(0).getValue();
		}
		else
		{
			String strReturn = "choose(";
			for (Action action : actions) {
				strReturn += " " + action.toString();
			}
			return strReturn + ")";
		}
	}
	
}
