package model;

public class Action extends ASTNode{
	private final String name;

	public Action(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}
