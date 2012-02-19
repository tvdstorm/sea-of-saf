package saf.evaluators;

abstract public class BehaviourActionTypeIntelligence {
	protected String actionTypeName;
	protected BehaviourActionType actionType;
	
	public BehaviourActionTypeIntelligence(BehaviourActionType actionType) {
		this.actionType = actionType;
		this.actionTypeName = actionType.getName();
	}
	
}
