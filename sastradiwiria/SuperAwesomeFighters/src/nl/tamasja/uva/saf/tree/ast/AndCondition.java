package nl.tamasja.uva.saf.tree.ast;

import nl.tamasja.uva.saf.tree.IFighterVisitor;

public class AndCondition implements ICondition {
	
	private final ICondition left;
	private final ICondition right;
	
	public AndCondition(ICondition left, ICondition right) {
		this.left = left;
		this.right = right;
	}

	public ICondition getLeft() {
		return left;
	}

	public ICondition getRight() {
		return right;
	}

	@Override
	public void accept(IFighterVisitor visitor) {
		
		left.accept(visitor);
		right.accept(visitor);
		visitor.visit(this);
		
	}
}
