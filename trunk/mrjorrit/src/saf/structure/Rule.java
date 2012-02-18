package saf.structure;

import java.util.List;
import java.util.Vector;


public class Rule extends Check  {
	
	//Constructor
	public Rule(Logical logical, Vector<MoveAction> moveActions, Vector<FightAction> fightActions)
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
	private final Vector<MoveAction> moveActions;
	
	public Vector<MoveAction> getMoveActions() {
		return moveActions;
	}

	
	//FightActionTypes
	private final List<FightAction> fightActions;
	
	public List<FightAction> getFightActionTypes() {
		return fightActions;
	}

	@Override
	public void check() {
		// TODO specifieke checks
	}
}
