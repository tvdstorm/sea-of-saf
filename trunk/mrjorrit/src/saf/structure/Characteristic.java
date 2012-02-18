package saf.structure;

public class Characteristic extends Check {
	
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

	public Characteristic(String attribute, int power)
	{
		try
		{
			this.attribute = Attribute.valueOf(attribute);
		}
		catch(Exception e)
		{
			//Set to default attribute
			this.attribute = Attribute.kickPower;
			addError("Illegal attribute:" + attribute + ", default attribute set: = kickPower");
		}
		this.power = power;
	}

	@Override
	public void check(){
		if(power < 1 || power > 10) 
		{
			
		}
	}
	
}
