package saf;

import java.util.List;

import saf.structure.Action;
import saf.structure.Behavior;
import saf.structure.Bot;
import saf.structure.Bots;
import saf.structure.Characteristic;
import saf.structure.Condition;
import saf.structure.ConditionAnd;
import saf.structure.ConditionClause;
import saf.structure.ConditionSimple;


public class DebugFunctions {

	
	public void PrintAST(Bots bots)
	{
		//All objects are accepted, print back to console
    	for(Bot bot : bots.getBots())
    	{
    		System.out.println("Bot name: " + bot.getName() + " {");
    		for(Characteristic charact : bot.getCharacteristics())
        	{
    			System.out.println("   " + charact.getName() + " = " + charact.getValue());
        	}
    		
    		
    		for(Behavior behavior : bot.getBehaviors())
        	{
    			String strBehavior = "";
    			strBehavior = VisitCondition(behavior.getCondition());
    			System.out.print("  " + strBehavior + "[");
    			
    			List<Action> moveActions = behavior.getMoveAction();
    			if(moveActions.size() > 1)
    				System.out.print("choose(");
    			
    			System.out.print(moveActions.get(0).getValue());
    			
    			for(int i = 1; i < moveActions.size(); i++)
    			{
    				System.out.print(" " + moveActions.get(i).getValue());
    			}
    			if(moveActions.size() > 1)
    				System.out.print(")");
    			

    			System.out.print(" ");
    			
    			List<Action> fightActions = behavior.getFightAction();
    			if(fightActions.size() > 1)
    				System.out.print("choose(");
    			
    			System.out.print(fightActions.get(0).getValue());
    			
    			for(int i = 1; i < fightActions.size(); i++)
    			{
    				System.out.print(" " + fightActions.get(i).getValue());
    			}
    			
    			if(fightActions.size() > 1)
    				System.out.print(")");
    			
    			System.out.println("]");
        	}
    		System.out.println("}");
    	}
	}
	
	private static String VisitCondition(Condition condition)
	{
		String strReturn = "";
				
		if(condition instanceof ConditionSimple)
		{
			strReturn += " " + ((ConditionSimple)condition).getValue();
		}
		else if(condition instanceof ConditionClause)
		{
			ConditionClause conditionClause = (ConditionClause)condition;
			strReturn += VisitCondition(conditionClause.getFirstCondition());
			strReturn += " " + (conditionClause instanceof ConditionAnd ? "and" : "or");
			strReturn += VisitCondition(conditionClause.getSecondCondition());
		}		
		return strReturn;
	}
	
}
