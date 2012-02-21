package saf.structure;

import java.util.ArrayList;

import saf.Checker.Check;


public class Rule extends Node 
{
	
	private final Logical logical;
	private final ArrayList<MoveAction> moveActions;
	private final ArrayList<FightAction> fightActions;
	
	public Rule(Logical logical, ArrayList<MoveAction> moveActions, ArrayList<FightAction> fightActions)
	{
		this.logical = logical;
		this.moveActions = moveActions;
		this.fightActions = fightActions;
	}
	
	public Logical getLogical() 
	{		
		return logical;
	}
	
	public ArrayList<MoveAction> getMoveActions() 
	{
		return moveActions;
	}	
	
	public ArrayList<FightAction> getFightActions() 
	{
		return fightActions;
	}
	
	public ArrayList<Action> getAllActions()
	{
		ArrayList<Action> actions = new ArrayList<Action>();
		actions.addAll(moveActions);
		actions.addAll(fightActions);
		return actions;		
	}

	@Override
	public void check(Check checker) 
	{
		logical.check(checker);
		
		ArrayList<String> foundActions = new ArrayList<String>();

		for(Action action : getAllActions())
		{
			action.check(checker);
			if(foundActions.contains(action.getActionTypeString()))
				checker.addError("The action '" + (action.getActionTypeString() + "' is defined more than once in the choose expression"));
			else
				foundActions.add(action.getActionTypeString());
		}
		
	}
}
