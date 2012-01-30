package nodes;

import java.util.ArrayList;

public class Move
{
	private ArrayList<String> moves = new ArrayList<String>();
			
	public Move()
	{
		
	}
	
	public void addMove(String move)
	{
		moves.add(move);
		System.out.println("Added move: " + move);
	}
	
}
