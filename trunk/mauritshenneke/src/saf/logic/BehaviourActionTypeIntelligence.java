package saf.logic;

import saf.evaluators.BehaviourActionType;

abstract public class BehaviourActionTypeIntelligence {
	protected String actionTypeName;
	protected BehaviourActionType actionType;
	
	public BehaviourActionTypeIntelligence(BehaviourActionType actionType) {
		this.actionType = actionType;
		this.actionTypeName = actionType.getName();
	}
	
}
