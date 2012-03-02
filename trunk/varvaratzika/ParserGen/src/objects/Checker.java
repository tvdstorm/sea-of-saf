package objects;

import java.util.List;
import java.util.ArrayList;

public class Checker
{
	private List<Fighter> fighters=new ArrayList<Fighter>();
	private int flagCondition;
	private int flagMove;
	private int flagAttack;
	private int flagStrength;

	public Checker(List<Fighter> f)
	{
		this.fighters=f;
		flagCondition=0;
		flagMove=0;
		flagAttack=0;
		flagStrength=0;
		
	}
	
	public void CheckInputs()
	{
		
		for (Fighter fighter : this.fighters)
		{
			for (Behavior behavior : fighter.getBehaviors())
			{	Condition c=behavior.getCondition();
				if (c.isValid()==false)flagCondition=1;
				Move m=behavior.getMove();
				if(m.isValid()==false)flagMove=1;
				Attack a=behavior.getAttack();
				if(a.isValid()==false)flagAttack=1;
			}
			for (Strength strength : fighter.getStrengths())
			{
				if(strength.isValid()==false)flagStrength=1;
			}
		}
		if (flagCondition==0)
			System.out.println("Conditions are fine");
		if (flagMove==0)
			System.out.println("Moves are fine");
		if (flagAttack==0)
		System.out.println("Attacks are fine");
		if (flagStrength==0)
		System.out.println("Strengths are fine");
		System.out.println("Checking is completed!!!!");
	}
}

