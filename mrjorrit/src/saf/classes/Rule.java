package saf.classes;

import java.util.Vector;


public class Rule implements Strict  {
	
	//Constructor
	public Rule(ConditionTypeOperator conditionTypeOperator, Vector<MoveActionType> moveActionTypes, Vector<FightActionType> fightActionTypes)
	{
		this.conditionTypeOperator = conditionTypeOperator;
		this.moveActionTypes = moveActionTypes;
		this.fightActionTypes = fightActionTypes;
	}
	
	//conditionTypeOperator
	private ConditionTypeOperator conditionTypeOperator;

	public ConditionTypeOperator getConditionType() {		
		return conditionTypeOperator;
	}
	
	
	//MoveActionType
	private Vector<MoveActionType> moveActionTypes;
	
	public Vector<MoveActionType> getMoveActionTypes() {
		if(moveActionTypes == null)
			moveActionTypes = new Vector<MoveActionType>();
		return moveActionTypes;
	}

	
	//FightActionTypes
	private Vector<FightActionType> fightActionTypes;
	
	public Vector<FightActionType> getFightActionTypes() {
		if(fightActionTypes == null)
			fightActionTypes = new Vector<FightActionType>();
		return fightActionTypes;
	}

	@Override
	public void check() throws Exception {
		// TODO specifieke checks
	}
}
