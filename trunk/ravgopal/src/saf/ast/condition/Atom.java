package saf.ast.condition;

import saf.Config;
import saf.ast.util.Visitor;

public class Atom extends Condition {
	
	private final String name;
	
	public Atom(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	@Override
	public boolean isAlways() {
		return name.equals(Config.ALWAYS);
	}
	
}
