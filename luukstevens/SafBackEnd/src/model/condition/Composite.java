package model.condition;

public abstract class Composite extends Condition {
	private Checkable firstCondition;
	private Checkable secondCondition;

	public Checkable getFirstCondition() {
		return firstCondition;
	}

	public void setFirstCondition(Checkable firstCondition) {
		this.firstCondition = firstCondition;
	}

	public Checkable getSecondCondition() {
		return secondCondition;
	}

	public void setSecondCondition(Checkable secondCondition) {
		this.secondCondition = secondCondition;
	}
}
