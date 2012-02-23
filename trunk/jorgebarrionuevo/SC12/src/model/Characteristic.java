package model;

public class Characteristic extends ASTNode{
	
	private final String name;
	private final Integer value;

	public Characteristic(NameFighter name, int value) {
		this.name = name.getName();
		this.value = value;
	}

	public String getName() {
		return name;
	}
	
	public Integer getValue() {
		return value;
	}
}
