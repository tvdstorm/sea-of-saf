package objects;

public class Strength {
	private String StrenghtName = new String() ;
	private int StrenghtValue = 5;

	public void setStrengthName(String StrenghtName)
	   {
	       this.StrenghtName = StrenghtName;
	   }
	public String getStrenghtName()
	{
		return StrenghtName;
	}
	public void setStrenghtValue(int StrenghtValue)
	   {
	       this.StrenghtValue = StrenghtValue;
	   }
	public int getStrenghtValue()
	{
		return StrenghtValue;
	}
}
