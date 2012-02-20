package saf.structure;

import java.util.ArrayList;

import saf.Checker.Check;


public class Rule extends Check  {
	
	//Constructor
	public Rule(Logical logical, ArrayList<MoveAction> moveActions, ArrayList<FightAction> fightActions)
	{
		this.logical = logical;
		this.moveActions = moveActions;
		this.fightActions = fightActions;
	}
	
	//conditionTypeOperator
	private final Logical logical;

	public Logical getLogical() {		
		return logical;
	}
	
	
	//MoveActionType
	private final ArrayList<MoveAction> moveActions;
	
	public ArrayList<MoveAction> getMoveActions() {
		return moveActions;
	}
	
	//FightActionTypes
	private final ArrayList<FightAction> fightActions;
	
	public ArrayList<FightAction> getFightAction() {
		return fightActions;
	}

	@Override
	public ArrayList<String> check() {
		
		addErrors(logical.check());
		
		//Needs refactoring
		ArrayList<MoveActionType> foundMoveActions = new ArrayList<MoveActionType>();
		ArrayList<FightActionType> foundFightActions = new ArrayList<FightActionType>();
		
		for(MoveAction moveAction : moveActions)
		{
			addErrors(moveAction.check());
			if(foundMoveActions.contains(moveAction.getMoveActionType()))
				addError("The moveaction '" + moveAction.getMoveActionType().toString() + "' is defined more than once in the choose expression");
			else
				foundMoveActions.add(moveAction.getMoveActionType());
		}
		
		for(FightAction fightAction : fightActions)
		{
			addErrors(fightAction.check());
			if(foundFightActions.contains(fightAction.getFightActionType()))
				addError("The fightaction '" + fightAction.getFightActionType().toString() + "' is defined more than once in the choose expression");
			else
				foundFightActions.add(fightAction.getFightActionType());
		}
		
		return getErrors();
	}
}
