package nl.tamasja.uva.saf.tree.ast;

import nl.tamasja.uva.saf.tree.IFighterVisitor;

public class ConditionAtom implements ICondition {

	private final String name;
	public ConditionAtom(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public void accept(IFighterVisitor visitor) {
		visitor.visit(this);
	}
	
}
