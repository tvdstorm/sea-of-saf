package saf.evaluators;

import java.util.ArrayList;

public class Behaviour {
	private String condition;
	private ArrayList<BehaviourActionType> moveActionTypes;
	private ArrayList<BehaviourActionType> fightActionTypes;
	
	public Behaviour(String condition,
			ArrayList<BehaviourActionType> moveActionTypes,
			ArrayList<BehaviourActionType> fightActionTypes) {
		super();
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