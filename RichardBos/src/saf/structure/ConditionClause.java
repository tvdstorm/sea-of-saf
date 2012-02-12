package saf.structure;

public abstract class ConditionClause extends Condition {
	
	protected Condition firstCondition = null;
	protected Condition secondCondition = null;
	
	public Condition getFirstCondition() {
		return firstCondition;
	}
	public Condition getSecondCondition() {
		return secondCondition;
	}
}
