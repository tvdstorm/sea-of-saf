package nl.uva.lap.saf.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import nl.uva.lap.saf.Settings;
import nl.uva.lap.saf.arena.State;
import nl.uva.lap.saf.ast.action.Action;
import nl.uva.lap.saf.ast.action.SimpleAction;
import nl.uva.lap.saf.ast.fighter.Behaviour;
import nl.uva.lap.saf.ast.fighter.Personality;

public class Fighter implements Settings
{
	private final int DEFAULT_PERSONALITY = 5;
	
	//fixed properties:
	private int kickReach = DEFAULT_PERSONALITY;
	private int kickPower = DEFAULT_PERSONALITY;
	private int punchReach = DEFAULT_PERSONALITY;
	private int punchPower = DEFAULT_PERSONALITY;
	
	//variable properties:
	protected String currentAction;
	protected String currentMovement;
	
	private List<Behaviour> behaviours = new ArrayList<Behaviour>();
	private Behaviour alwaysBehaviour;
	private final nl.uva.lap.saf.ast.fighter.Fighter astFighter;
	
	private Random random = new Random();
	
	public Fighter(nl.uva.lap.saf.ast.fighter.Fighter fighter)
	{
		astFighter = fighter;
		for(Personality personality : fighter.getPersonalities())
		{
			if(personality.equals("kickReach"))
				kickReach = personality.getValue();
			if(personality.equals("kickPower"))
				kickPower = personality.getValue();
			if(personality.equals("punchReach"))
				punchReach = personality.getValue();
			if(personality.equals("punchPower"))
				punchPower = personality.getValue();
		}
		for(Behaviour behaviour : fighter.getBehaviours())
		{
			if(!behaviour.isAlways())
				behaviours.add(behaviour);
			else
				alwaysBehaviour = behaviour;
		}
		defaultActions();
	}
	
	private List<Behaviour> getValidBehaviours(State state)
	{
		List<Behaviour> valid = new ArrayList<Behaviour>();
		for(Behaviour behaviour : behaviours)
			if(ConditionInterpreter.evaluate(behaviour, astFighter, state))
			{
				valid.add(behaviour);
			}
		return valid;
	}
	
	public void defaultActions()
	{
		currentAction = "stand";
		currentMovement = "stand";
	}
	
	public void calculateBehaviour(State state)
	{
		List<Behaviour> valid = getValidBehaviours(state);
		if(valid.isEmpty())
			setBehaviour(alwaysBehaviour);
		else
		{
			int size = valid.size();
			int randomElement = random.nextInt(size);
			setBehaviour(valid.get(randomElement));
		}
	}
	
	private void setBehaviour(Behaviour behaviour)
	{
		for(Action action : behaviour.getActions())
		{
			SimpleAction chosenAction = ActionInterpreter.evaluate(action);
			if(MOVES.contains(chosenAction.getAction()))
				currentMovement = chosenAction.getAction();
			else
				currentAction = chosenAction.getAction();
		}
	}
	
	public String getName()
	{
		return astFighter.getName();
	}
	
	public String getAction()
	{
		return currentAction;
	}
	
	public String getMovement()
	{
		return currentMovement;
	}
	
	public int getWeight()
	{
		return kickReach + kickPower + punchReach + punchPower;
	}
	
	public int getKickReach()
	{
		return kickReach;
	}
	
	public int getKickPower()
	{
		return kickPower;
	}
	
	public int getPunchReach()
	{
		return punchReach;
	}
	
	public int getPunchPower()
	{
		return punchPower;
	}
	
	public boolean isKicking()
	{
		return currentAction.equals("kick_low") || currentAction.equals("kick_high");
	}
	
	public boolean isPunching()
	{
		return currentAction.equals("punch_low") || currentAction.equals("punch_high");
	}
	
	public boolean isHighAttack()
	{
		return currentAction.equals("kick_high") || currentAction.equals("punch_high");
	}
	
	public boolean isLowAttack()
	{
		return currentAction.equals("punch_low") || currentAction.equals("kick_low");
	}
	
	public boolean isBlocking()
	{
		return isLowBlock() || isHighBlock();
	}
	
	public boolean isLowBlock()
	{
		return currentAction.equals("block_low");
	}
	
	public boolean isHighBlock()
	{
		return currentAction.equals("block_high");
	}
	
	public boolean isBlocked(Fighter otherFighter)
	{
		if(otherFighter.isHighAttack() && isHighBlock())
			return true;
		if(otherFighter.isLowAttack() && isLowBlock())
			return true;
		return false;
	}
}
