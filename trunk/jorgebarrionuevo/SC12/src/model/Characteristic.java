package model;

import util.Visitor;

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
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	@Override
	public String toString() {
		return (this.nameCharacteristic + " = " + this.value);
	}
}
