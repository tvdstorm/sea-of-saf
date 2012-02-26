package model;

public class Characteristic extends ASTNode{
	
	private final String nameCharacteristic;
	private final Integer value;

	public Characteristic(String nameCharacteristic, int value) {
		this.nameCharacteristic = nameCharacteristic;
		this.value = value;
	}

	public String getNameCharacteristic() {
		return nameCharacteristic;
	}
	
	public Integer getValue() {
		return value;
	}
}
