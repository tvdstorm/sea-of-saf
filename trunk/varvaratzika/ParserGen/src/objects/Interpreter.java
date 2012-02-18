package objects;

import java.util.ArrayList;

public class Interpreter{
	private final static String[] conditions = new String[]{"stronger","weaker"," much_stronger","much_weaker","even","near","far","always"};
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
				checkForInputWords(conditions,condition.getConditionName());
				checkForInputWords(moves,condition.getMovesName());
				checkForInputWords(attacks,condition.getAttacksName());
				}
			
			
			for (Strength strength : fighter.getStrength())
			{
				checkForInputWords(strengths,strength.getStrenghtName());
				if((strength.getStrenghtValue()<=10)&&(strength.getStrenghtValue()>=0))
				{
					System.out.println("Strength value between 0-10 : ok");
					break;
					
				}
			}
		}
	}
	public void checkForInputWords (String[] searchingList,String checkThisWord )
	{
		int flag=0;
		for(String oneOfList: searchingList)
		{
			if(checkThisWord.equals(oneOfList))
			{
				System.out.println(checkThisWord+": ok");
				flag=1;
				break;
			}
		
		}
		if (flag==0)
		{
			System.out.println(checkThisWord+" has error");
		}
		
	}
	
}

