package saf.evaluators;

import java.util.List;

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

	@Override
	public String toString() {
		return "Behaviour [behaviourCondition=" + behaviourCondition+ ", moveActionTypes="
				+ moveActionTypes + ", fightActionTypes=" + fightActionTypes
				+ "]\n";
	}
	
}