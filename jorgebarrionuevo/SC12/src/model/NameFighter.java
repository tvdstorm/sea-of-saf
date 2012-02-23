package model;

public class NameFighter extends ASTNode {

	private final String name;
	
	public String getName() {
		return name;
	}

	public NameFighter(String name) {
		this.name = name;
	}
}