package saf.evaluators;

import java.util.List;

public class Behaviour {
	private String condition;
	private List<BehaviourActionType> moveActionTypes;
	private List<BehaviourActionType> fightActionTypes;
	
	public Behaviour(String condition,
			List<BehaviourActionType> moveActionTypes,
			List<BehaviourActionType> fightActionTypes) {

		this.condition= condition;
		this.moveActionTypes = moveActionTypes;
		this.fightActionTypes = fightActionTypes;
	}

	@Override
	public String toString() {
		return "Behaviour [condition=" + condition + ", moveActionTypes="
				+ moveActionTypes + ", fightActionTypes=" + fightActionTypes
				+ "]";
	}
	
}