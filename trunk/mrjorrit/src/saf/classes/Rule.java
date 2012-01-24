package saf.classes;

import java.util.Vector;


public class Rule {
	
	//Constructor
	public Rule()
	{
	}
	
	//conditionTypeOperator
	private ConditionTypeOperator conditionTypeOperator;

	public ConditionTypeOperator getConditionType() {		
		return conditionTypeOperator;
	}

	public void setConditionTypeOperator(ConditionTypeOperator conditionTypeOperator) {
		this.conditionTypeOperator = conditionTypeOperator;
	}
	
	
	//MoveActionType
	private Vector<MoveActionType> moveActionTypes;
	
	public Vector<MoveActionType> getMoveActionTypes() {
		if(moveActionTypes == null)
			moveActionTypes = new Vector<MoveActionType>();
		return moveActionTypes;
	}

	public void setMoveActionTypes(Vector<MoveActionType> moveActionTypes) {
		this.moveActionTypes = moveActionTypes;
	}

	
	//FightActionTypes
	private Vector<FightActionType> fightActionTypes;
	
	public Vector<FightActionType> getFightActionTypes() {
		if(fightActionTypes == null)
			fightActionTypes = new Vector<FightActionType>();
		return fightActionTypes;
	}

	public void setFightActionTypes(Vector<FightActionType> fightActionTypes) {
		this.fightActionTypes = fightActionTypes;
	}

}
