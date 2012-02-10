package saf.structure.intelligence;

import saf.structure.Behavior;
import saf.structure.Condition;
import saf.structure.ConditionAnd;
import saf.structure.ConditionClause;
import saf.structure.ConditionOr;
import saf.structure.ConditionSimple;

public class BehaviorIntelligence {
	
	public static String toString(Behavior behavior)
	{
		String strReturn = getConditionName(behavior.getCondition());
		strReturn += " [" + ActionIntelligence.toString(behavior.getMoveAction()) + " ";
		strReturn += ActionIntelligence.toString(behavior.getFightAction()) + "]";
		return strReturn;
	}
	
	private static String getConditionName(Condition condition) {

		if (condition instanceof ConditionSimple)

			return ((ConditionSimple) condition).getValue();

		else {

			ConditionClause conditionClause = (ConditionClause) condition;
			String returnString = getConditionName(conditionClause.getFirstCondition());

			if (conditionClause instanceof ConditionAnd)
				returnString += " and ";
			else if (conditionClause instanceof ConditionOr)
				returnString += " or ";

			returnString += getConditionName(conditionClause.getSecondCondition());
			return returnString;
		}
	}
}
