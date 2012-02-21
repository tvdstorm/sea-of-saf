package jsaf.game.fighter;

public class FighterCharacteristic
{
	private String name;
	private int value;

	public FighterCharacteristic() 
	{
		this.value = 5; //set default value;
	}
	
	public FighterCharacteristic(String name, int value) 
	{
		this.name 	= name;
		this.value 	= value;
	}
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getValue() 
	{
		return value;
	}

	public void setValue(int value) 
	{
		this.value = value;
	}
}
