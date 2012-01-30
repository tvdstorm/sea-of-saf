package nodes;

import java.util.ArrayList;

public class Attack
{
	private ArrayList<String> attacks = new ArrayList<String>();
			
	public Attack()
	{
		
	}
	
	public void addAttack(String attack)
	{
		attacks.add(attack);
		System.out.println("Added attack: " + attack);
	}
	
}
