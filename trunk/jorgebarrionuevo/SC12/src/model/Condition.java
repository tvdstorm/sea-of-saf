package model;


public class Condition extends ASTNode{

	//private static final String ALWAYS = "always";
	private final String nameCondition;

	public Condition(String name) {
		this.nameCondition = name;
	}
	
	public String getName() {
		return nameCondition;
	}
	
}