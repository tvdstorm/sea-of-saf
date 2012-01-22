package objects;

import java.util.ArrayList;

public class Interpreter 
{
	private String[] conditions = new String[]{"stronger","weaker"," much_stronger","much_weaker","even","near","far","always"};
	private String[] moves = new String[]{"jump", "crouch","stand","run_towards","run_away","walk_towards","walk_away"};
	private String[] attacks = new String[]{"punch_low","punch_high","kick_low","kick_high","block_low","block_high"};
	private String[] strengths = new String[]{"punchReach","kickReach","kickPower","punchPower"};
	private ArrayList<Fighter> fighters=new ArrayList<Fighter>();

	public Interpreter(ArrayList<Fighter> f)
	{
		this.fighters=f;
	}
	
	public void Interpret()
	{
		
		for (Fighter fighter : this.fighters)
		{
			for (Condition condition : fighter.getCondition())
			{
				for(String oneOfConditions : this.conditions)
				{
					if(condition.getConditionName().equals(oneOfConditions))
					{
						System.out.println("one Of Conditions: ok");
						break;
					}
				
				}
				for(String oneOfMoves : this.moves)
				{
					if(condition.getMovesName().equals(oneOfMoves))
					{
						System.out.println("one Of Moves: ok" );
						break;
					}
				
				}
				for(String oneOfAttacks : this.moves)
				{
					if(condition.getAttacksName().equals(oneOfAttacks))
					{
						System.out.println("one Of Attacks: ok");
						break;
					}
				
				}
			}
			for (Strength strength : fighter.getStrength())
			{
				for(String oneOfStrength : this.strengths)
				{
					if(strength.getStrenghtName().equals(oneOfStrength))
					{
						System.out.println("one Of Strength: ok");
						break;
					}
				
				}
					
			}
			
			for (Strength strength : fighter.getStrength())
			{
				for(String oneOfStrength : this.strengths)
				{
					if(strength.getStrenghtName().equals(oneOfStrength))
					{
						System.out.println("one Of Strength: ok");
						break;
					}
				}
				for(String oneOfAttacks : this.attacks)
				{
					if((strength.getStrenghtValue()<=10)&&(strength.getStrenghtValue()>=0))
					{
						System.out.println("Strength value between 0-10 : ok");
						break;
					}
				}	
			}
		}
	}
}

