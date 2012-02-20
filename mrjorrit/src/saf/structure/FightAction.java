package saf.structure;

import java.util.ArrayList;

import saf.Checker.Check;

public class FightAction extends Check {

	//Constructor
	public FightAction(String fightAction)
	{
		FightActionType fightActionType2;
		try
		{
			fightActionType2 = FightActionType.valueOf(fightAction);
		}
		catch(Exception e)
		{
			//set to default value
			fightActionType2  = null;
			addError("Illegal FightAction: '" + fightAction + "'");
		}
		this.fightActionType = fightActionType2;
	}
	
	//Attribute
	private final FightActionType fightActionType;

	public FightActionType getFightActionType() {
		return fightActionType;
	}
	
	@Override
	public ArrayList<String> check() {
		// TODO Auto-generated method stub
		return getErrors();
	}
}
