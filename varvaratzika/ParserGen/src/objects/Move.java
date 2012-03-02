package objects;

public class Move {
	private String moveName;
	
	public Move()
	{
		moveName= new String();
	}
	public Move(String m)
	{
		this.moveName=m;
	}
	public void setMoveName(String m)
	{
		moveName=m;
	}
	public String getMoveName()
	{
		return moveName;
	}
	public boolean isValid()
	{
		try 
		{
			MovesNames.valueOf(moveName);
			return true;
		}
		catch(Exception e)
	 	{
	 	    System.out.println("Invalid Move Name");
			return false;
		}
	}
}
