package nl.tamasja.uva.saf.tree.ast;

import nl.tamasja.uva.saf.tree.IFighterVisitor;

public class Strength implements IProperty {
	
	private final String name;
	private final int value;
	
	public Strength(String name, int value) {
		this.name = name;
		this.value = value;
	}

	@Override
	public void accept(IFighterVisitor visitor) {
		visitor.visit(this);
	}

	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}
	
}
