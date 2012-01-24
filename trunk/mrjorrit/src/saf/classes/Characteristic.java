package saf.classes;

public class Characteristic implements Strict {
	
	//Attribute
	private Attribute attribute;

	public Attribute getAttribute() {
		return attribute;
	}

	//Power
	private int power;
		
	public int getPower() {
		return power;
	}

	public Characteristic(Attribute attribute, int power)
	{
		this.attribute = attribute;
		this.power = power;
	}

	@Override
	public void check() throws Exception {
		if(power < 1 || power > 10) throw new Exception("Power can't be lower then 1 of higher then 10");
	}
	
}
