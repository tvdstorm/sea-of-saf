package model;

import util.Visitor;

public class Simple extends Action{

	private final String name;

	public Simple(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
}
