package saf.ast.condition;

public abstract class Binary extends Condition {

	private final Condition lhs;
	private final Condition rhs;
	
	public Binary(Condition lhs, Condition rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}
	
	public Condition getLhs() {
		return lhs;
	}
	
	public Condition getRhs() {
		return rhs;
	}

}
