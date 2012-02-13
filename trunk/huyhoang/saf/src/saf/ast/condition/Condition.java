package saf.ast.condition;

import saf.ast.ASTNode;
import saf.ast.FighterVisitor;

public class Condition implements ASTNode {
	private boolean value;
	private String name;

	public String getName() {
		return this.name;
	}
	
	public Condition(String name) {
		this.name = name;
	}

	@Override
	public void accept(FighterVisitor visitor) {
		visitor.visit(this);
	}

	public void setValue(boolean value) {
		this.value = value;
	}
	
	public boolean getValue() {
		return this.value;
	}
}
