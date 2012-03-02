package objects;

public class Attack {
	private String attackName;
	
	public Attack()
	{
		this.attackName=new String();
	}
	public Attack(String a)
	{
		this.attackName=a;
	}
	public void setAttackName(String a)
	{
		attackName=a;
	}
	public String getAttackName()
	{
		return attackName;
	}
	public boolean isValid()
	{
		try 
		{
			AttacksNames.valueOf(attackName);
			return true;
		}
		catch(Exception e)
	 	{
	 	    System.out.println("Invalid Attack Name");
			return false;
		}
	}

}
