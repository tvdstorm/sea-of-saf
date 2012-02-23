package model;


public class Condition extends ASTNode{

	//private static final String ALWAYS = "always";
	private final String name;

	public Condition(NameFighter name) {
		this.name = name.getName();
	}
	
	public String getName() {
		return name;
	}
	
}