package saf.structure.intelligence;

import saf.game.GameState;
import saf.structure.Behavior;
import saf.structure.Condition;
import saf.structure.ConditionAnd;
import saf.structure.ConditionClause;
import saf.structure.ConditionOr;
import saf.structure.ConditionSimple;

public class BehaviorIntelligence {
	
	
	public static boolean checkBehaviorInGameState(Behavior behavior, GameState gameState)
	{
		
//		behavior.getCondition().
		
		return true;
	}	
 
	public static String toString(Behavior behavior)
	{
		String strReturn = getConditionName(behavior.getCondition());
		strReturn += " [" + ActionIntelligence.toString(behavior.getMoveAction()) + " ";
		strReturn += ActionIntelligence.toString(behavior.getFightAction()) + "]";
		return strReturn;
	}
	
	private static String getConditionName(Condition condition) {

		// TODO refactor met "double dispatch" ~~
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
