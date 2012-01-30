package saf.structure;

import saf.checker.Element;
import saf.checker.ElementVisitor;

public class Characteristic implements Element {
	public Characteristic(String name, int value)
	{
		this.name = name;
		this.value = value;
	}
	
    public void accept(ElementVisitor visitor) {
        visitor.visit(this);
    }
	
	private final String name;
	private final int value;
	
	public String getName() {
		return name;
	}
	public int getValue() {
		return value;
	}
	
	/*public enum CharacteristicType
	{
		punchReach,
		punchPower,
		kickReach,
		kickPower
	}*/
}
