package saf.structure;

import java.util.ArrayList;
import java.util.List;


public class Rule extends Check  {
	
	//Constructor
	public Rule(Logical logical, List<MoveAction> moveActions, List<FightAction> fightActions)
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
	private final List<MoveAction> moveActions;
	
	public List<MoveAction> getMoveActions() {
		return moveActions;
	}
	
	//FightActionTypes
	private final List<FightAction> fightActions;
	
	public List<FightAction> getFightActionTypes() {
		return fightActions;
	}

	@Override
	public List<String> check() {
		
		addErrors(logical.check());
		
		//Needs refactoring
		List<MoveActionType> foundMoveActions = new ArrayList<MoveActionType>();
		List<FightActionType> foundFightActions = new ArrayList<FightActionType>();
		
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
