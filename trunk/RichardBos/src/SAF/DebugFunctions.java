package SAF;

import java.util.ArrayList;

import SAF.Structure.ActionType;
import SAF.Structure.Behavior;
import SAF.Structure.Bot;
import SAF.Structure.Bots;
import SAF.Structure.Characteristic;
import SAF.Structure.ChoiceCondition;
import SAF.Structure.Condition;
import SAF.Structure.FightAction;
import SAF.Structure.MoveAction;
import SAF.Structure.StringCondition;

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
    			
    			ArrayList<ActionType> moveActionValues = behavior.getMoveAction().getValues();
    			if(moveActionValues.size() > 1)
    				System.out.print("choose(");
    			
    			System.out.print(((MoveAction)moveActionValues.get(0)).getMoveAction());
    			
    			for(int i = 1; i < moveActionValues.size(); i++)
    			{
    				System.out.print(" " + ((MoveAction)moveActionValues.get(i)).getMoveAction());
    			}
    			if(moveActionValues.size() > 1)
    				System.out.print(")");
    			

    			System.out.print(" ");
    			
    			ArrayList<ActionType> fightActionValues = behavior.getFightAction().getValues();
    			if(fightActionValues.size() > 1)
    				System.out.print("choose(");
    			
    			System.out.print(((FightAction)fightActionValues.get(0)).getFightAction());
    			
    			for(int i = 1; i < fightActionValues.size(); i++)
    			{
    				System.out.print(" " + ((FightAction)fightActionValues.get(i)).getFightAction());
    			}
    			
    			if(fightActionValues.size() > 1)
    				System.out.print(")");
    			
    			System.out.println("]");
        	}
    		System.out.println("}");
    	}
	}
	
	private static String VisitCondition(Condition condition)
	{
		String strReturn = "";
				
		if(condition instanceof StringCondition)
		{
			strReturn += " " + ((StringCondition)condition).getValue();
		}
		else
		{
			ChoiceCondition choiceCondition = (ChoiceCondition)condition;
			strReturn += VisitCondition(choiceCondition.getCondition());
			strReturn += " " + choiceCondition.getType().toString();
			strReturn += VisitCondition(choiceCondition.getSecondCondition());
		}
		
		return strReturn;
	}
	
}
