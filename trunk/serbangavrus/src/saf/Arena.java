package saf;

public class Arena {
	static private final Integer size = 20;
	
	private Arena()
	{
		
	}
	
	static public int getSize()
	{
		return size;
	}
	
	// Returns the start position of the first Bot involved
	// The start position is 30% from the West
	static public int getBot1StartPosition()
	{
		return (30*size)/100;
	}
	
	// Returns the start position of the second Bot involved
	// The start position is 30% from the East
	static public int getBot2StartPosition()
	{
		return size - (30*size)/100;
	}
	
	static public boolean isPositionInArena(int position)
	{
		if(position < 0 || position >= size)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	static public int getWestmostPosition()
	{
		return 0;
	}
	
	static public int getEastmostPosition()
	{
		return size-1;
	}
}
