package saf.structure.intelligence;

import java.util.ArrayList;
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
	
	public static List<String> checkForDuplicateActions(List<Action> actions, String actionType) {
		List<String> foundActions = new ArrayList<String>();
		List<String> errors = new ArrayList<String>();
		
		for (Action action : actions) {
			if (foundActions.contains(action.getValue()))
				errors.add("Duplicate " + actionType + "action found in choose clause: '" + action.getValue()
						+ "', please remove the duplicates.");
			else
				foundActions.add(action.getValue());
		}
		return errors;
	}
}
