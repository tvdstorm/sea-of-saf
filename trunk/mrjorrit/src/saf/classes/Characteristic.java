package saf.classes;

public class Characteristic {
	
	//Attribute
	private Attribute attribute;

	public Attribute getAttribute() {
		return attribute;
	}

	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}
	
	//Power
	private int power;
		
	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public Characteristic(Attribute attribute, int power)
	{
		setAttribute(attribute);
		setPower(power);
	}
	
}
