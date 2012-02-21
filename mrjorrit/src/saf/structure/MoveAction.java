package saf.structure;

import saf.Checker.Check;

public class MoveAction extends Action 
{
	public MoveAction(String moveActionTypeString)
	{
		super(moveActionTypeString);
	}

	public MoveActionType getMoveActionType() 
	{
		return MoveActionType.valueOf(actionTypeString);
	}

	@Override
	public void check(Check checker) 
	{
		boolean moveActionExists = false;
		for(MoveActionType moveActionType : MoveActionType.values())
		{
			if(actionTypeString.equals(moveActionType.name()))
				moveActionExists = true;
		}
		
		if(!moveActionExists)
			checker.addError("'" + actionTypeString + "' isn't a valid move action");
	}
}
