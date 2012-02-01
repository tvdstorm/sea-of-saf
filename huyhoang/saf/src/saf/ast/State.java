package saf.ast;

public class State implements Statement {
	private String stateName;

	public String getStateName() {
		return this.stateName;
	}
	
	public State(String stateName) {
		this.stateName = stateName;
	}

	@Override
	public void accept(FighterVisitor visitor) {
		visitor.visitExpr(this);
	}

}
