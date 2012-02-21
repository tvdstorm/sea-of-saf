package saf.structure;

import saf.Checker.Check;

public class FightAction extends Action 
{	
	public FightAction(String fightActionTypeString)
	{
		super(fightActionTypeString);
	}

	public FightActionType getFightActionType() 
	{
		return FightActionType.valueOf(actionTypeString);
	}

	@Override
	public void check(Check checker) 
	{
		boolean fightActionExists = false;
		for(FightActionType fightActionType : FightActionType.values())
		{
			if(actionTypeString.equals(fightActionType.name()))
				fightActionExists = true;
		}
		
		if(!fightActionExists)
			checker.addError("'" + actionTypeString + "' isn't a valid fight action");
	}

}
