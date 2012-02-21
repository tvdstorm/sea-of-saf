package saf;

import checker.SafInterface;
import checker.SafVisitor;

public class Strength implements SafInterface {
	
	private String characteristic;
	private int value;
	
	public Strength(String c, int v) {
		this.characteristic = c;
		this.value = v;
	}
	
	public String getCharacteristic() {
		return this.characteristic;
	}
	
	public int getValue() {
		return this.value;
	}
	
	@Override
	public void accept(SafVisitor visitor) {
		visitor.visit(this);
	}
}
