package saf.ast;

public class Condition extends Expression implements Statement {
	private boolean currentState;
	private String conditionName;

	public String getConditionName() {
		return this.conditionName;
	}
	
	public Condition(String stateName) {
		this.conditionName = stateName;
	}

	@Override
	public void accept(FighterVisitor visitor) {
		visitor.visit(this);
	}

	public void setCurrentState(boolean currentState) {
		this.currentState = currentState;
	}
	
	public boolean getCurrentState() {
		return this.currentState;
	}
}
