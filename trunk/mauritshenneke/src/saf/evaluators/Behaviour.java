package saf.evaluators;

import java.util.List;
import java.util.Random;

public class Behaviour {
	private BehaviourCondition behaviourCondition;
	private List<BehaviourActionType> moveActionTypes;

	private List<BehaviourActionType> fightActionTypes;
	
	public Behaviour(BehaviourCondition behaviourCondition,
			List<BehaviourActionType> moveActionTypes,
			List<BehaviourActionType> fightActionTypes) {

		this.behaviourCondition= behaviourCondition;
		this.moveActionTypes = moveActionTypes;
		this.fightActionTypes = fightActionTypes;
	}

	public BehaviourCondition getBehaviourCondition() {
		return behaviourCondition;
	}
	
	public List<BehaviourActionType> getMoveActionTypes() {
		return moveActionTypes;
	}
	
	public List<BehaviourActionType> getFightActionTypes() {
		return fightActionTypes;
	}

	public BehaviourActionType getMoveActionType() {
		return randomActionType(moveActionTypes);
	}

	public BehaviourActionType getFigthActionType() {
		return randomActionType(fightActionTypes);
	}

	private static BehaviourActionType randomActionType(List<BehaviourActionType> types) {
		Random randomIndex = new Random();
		int typeIndex = randomIndex.nextInt(types.size());
		return types.get(typeIndex);
	}
	
}