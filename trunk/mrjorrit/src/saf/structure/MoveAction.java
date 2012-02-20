package saf.structure;

import java.util.ArrayList;

import saf.Checker.Check;

public class MoveAction extends Check {

	//Constructor
	public MoveAction(String moveAction)
	{
		MoveActionType moveActionType2;
		try
		{
			moveActionType2 = MoveActionType.valueOf(moveAction);
		}
		catch(Exception e)
		{
			//set to default value
			moveActionType2  = null;
			addError("Illegal MoveAction: '" + moveAction + "'");
		}
		this.moveActionType = moveActionType2;
	}
	
	//Attribute
	private final MoveActionType moveActionType;

	public MoveActionType getMoveActionType() {
		return moveActionType;
	}
	
	@Override
	public ArrayList<String> check() {
		// TODO Auto-generated method stub
		return getErrors();
	}
}
