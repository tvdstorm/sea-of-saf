package saf.ast.condition;

import java.util.List;

public class Atom extends Condition {
	private final String name;

	public Atom(String name) {
		this.name = name;
	}
	
	public String getName(){
		return name;
	}

	@Override
	public Boolean match(List<String> tokens) {
		return tokens.contains(this.name);
	}

}
