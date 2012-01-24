package SAF.Structure;

import SAF.Checker.SAFElement;
import SAF.Checker.SAFElementVisitor;
import SAF.Checker.SAFValidationException;

public class Characteristic implements SAFElement {
	public Characteristic(String _name)
	{
		name = _name;
	}
	
    public void accept(SAFElementVisitor visitor) throws SAFValidationException {
        visitor.visit(this);
    }
	
	private String name;
	private int value = 5;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public enum CharacteristicType
	{
		punchReach,
		punchPower,
		kickReach,
		kickPower
	}
}
