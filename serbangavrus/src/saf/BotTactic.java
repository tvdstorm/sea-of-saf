package saf;

import java.util.ArrayList;
import java.util.Random;
import saf.Moves.*;
import saf.Attacks.*;

import nodes.*;

public class BotTactic {

	private Fighter fighter;
	private Bot bot, opponent;
	private BotMove botmove = null;
	private BotAttack botattack = null;
	
	public BotTactic(Fighter f, Bot b, Bot o)
	{
		fighter = f;
		bot = b;
		opponent = o;
	}
	
	// Returns the Move the Fighter should do against the opponent 
	public BotMove getBotMove()
	{
		if(botmove == null)
		{
			calculateMoveAndAttack();
		}
		return botmove;
	}
	
	// Returns the Attack the Fighter should do against the opponent 
	public BotAttack getBotAttack()
	{
		if(botattack == null)
		{
			calculateMoveAndAttack();
		}
		return botattack;
	}
	
	// Sets the botmove and botattack based on the Behaviours
	public void calculateMoveAndAttack()
	{
		ArrayList<Behaviour> relevantBehaviours = getRelevantBehaviours();
		// Select a behaviour at random
		Behaviour selectedBehaviour = getRandomElement(relevantBehaviours);
		Move move = selectedBehaviour.getMove();
		Attack attack = selectedBehaviour.getAttack();
		
		botmove = moveToBotMove(move);
		botattack = attackToBotAttack(attack);
	}
	
	// Transforms a Node.Move to a BotMove
	public BotMove moveToBotMove(Move move)
	{
		// TODO
		return new RunTowards(bot);
	}
	
	// Transforms a Node.Attack to a BotAttack
	public BotAttack attackToBotAttack(Attack attack)
	{
		// TODO
		return new PunchLow(bot);
	}

	// Returns a random element from the ArrayList
	public Behaviour getRandomElement(ArrayList<Behaviour> al)
	{
		Random randomGenerator = new Random();
		int index = randomGenerator.nextInt(al.size());
        Behaviour beh = al.get(index);
        return beh;
	}
	
	// Returns the behaviours who's condition is true
	public ArrayList<Behaviour> getRelevantBehaviours()
	{
		ArrayList<Behaviour> behaviours = fighter.getBehaviour();
		ArrayList<Behaviour> relevantBehaviours = new ArrayList<Behaviour>();
		
		for (Behaviour beh : behaviours) {
			Condition behCondition = beh.getCondition();
			if(isTrueConditions(behCondition))
			{
				// This condition is true, store the behaviour
				relevantBehaviours.add(beh);
			}
		}
		
		return relevantBehaviours;
	}
	
	// Returns weather or not a Condition is true for opponent
	public boolean isTrueConditions(Condition cond)
	{
		boolean isTrue = false;
		// What type of condition is it
		if(cond.isAndCondition())
		{
			// We have an AND condition, return true if all the conditions are true
			isTrue = true;
			ArrayList<String> conds = cond.getConditions();
			for (String condStr : conds) {
				if(!isTrue(condStr))
				{
					isTrue = false;
				}
			}
		}
		else if(cond.isOrCondition())
		{
			// We have an OR condition, return true if any of the conditions is true
			ArrayList<String> conds = cond.getConditions();
			for (String condStr : conds) {
				if(isTrue(condStr))
				{
					isTrue = true;
				}
			}
		}
		else
		{
			// We have a simple condition, with just one string
			String condStr = cond.getConditions().get(0);
			isTrue = isTrue(condStr);
		}
		
		return isTrue;
	}
	
	
	// Returns weather or not a Condition represented as String is true for opponent
	private boolean isTrue(String cond)
	{
		if(cond.equals("far"))
		{
			return bot.isOpponentFar();
		}
		else if(cond.equals("weaker"))
		{
			return bot.isOpponentWeaker();
		}
		else if(cond.equals("stronger"))
		{
			return bot.isOpponentStronger();
		}
		else if(cond.equals("much_stronger"))
		{
			return bot.isOpponentMuchStronger();
		}
		else if(cond.equals("much_weaker"))
		{
			return bot.isOpponentMuchWeaker();
		}
		else if(cond.equals("even"))
		{
			return bot.isOpponentEven();
		}
		else if(cond.equals("near"))
		{
			return !bot.isOpponentFar();
		}
		else if(cond.equals("always"))
		{
			return true;
		}
		else
		{
			// TODO remove
			System.out.println("Should never get here: " + cond);
			return false;
		}
		
	}

}
