package nl.tamasja.uva.saf.tree.ast;

import nl.tamasja.uva.saf.tree.IFighterVisitor;

public class OrCondition implements Condition {
	
	private final Condition left;
	private final Condition right;
	
	public OrCondition(Condition left, Condition right) {
		this.left = left;
		this.right = right;
	}

	public Condition getLeft() {
		return left;
	}

	public Condition getRight() {
		return right;
	}

	@Override
	public void accept(IFighterVisitor visitor) {
		visitor.visit(this);
		
	}
}
