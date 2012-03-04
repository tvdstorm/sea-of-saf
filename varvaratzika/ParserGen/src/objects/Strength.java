package objects;

public class Strength {	
	private String StrenghtName = new String() ;
	private int StrenghtValue = 5;
	
	public Strength(String strengthName,int strengValue)
	{
		this.setStrengthName(strengthName.toString());
		this.setStrenghtValue(strengValue);
	}

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
	public int getStrenghtValue(String s)
	{
		if (this.StrenghtName.equals(s))
			return this.StrenghtValue;
		else 
			return 0;
	}
	public boolean isValid()
	{
		try 
		{
			StrengthsNames.valueOf(StrenghtName);
			if((this.getStrenghtValue()<=10)&&(this.getStrenghtValue()>=0))
			{
				return true;
			} 
			else
			{
				System.out.println("Strength value must be between 0-10");
				return false;
			}
		}
		catch(Exception e)
	 	{
	 	    System.out.println("Invalid Attack Name");
			return false;
		}
	}
}
