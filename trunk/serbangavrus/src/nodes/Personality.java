package nodes;

public class Personality extends Specification
{
	private String strength = "";
	private int val;
	public Personality(String strength, int val)
	{
		this.strength = strength;
		this.val = val;				
	}
	
	public String getStrength()
	{
		return this.strength;
	}
}
