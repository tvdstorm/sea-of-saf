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
	private final int DEFAULT_HEALTH = 10;
	
	//fixed properties:
	private int kickReach = DEFAULT_PERSONALITY;
	private int kickPower = DEFAULT_PERSONALITY;
	private int punchReach = DEFAULT_PERSONALITY;
	private int punchPower = DEFAULT_PERSONALITY;
	
	//variable properties:
	private int health = DEFAULT_HEALTH;
	
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
	}
	
	private List<Behaviour> getValidBehaviours(State state)
	{
		List<Behaviour> valid = new ArrayList<Behaviour>();
		for(Behaviour behaviour : behaviours)
			if(ConditionInterpreter.evaluate(behaviour, astFighter, state))
			{
				valid.add(behaviour);
				System.out.println("chosen behaviour: " + behaviour.getCondition().toString() + " " + behaviour.getActions().get(0).toString());
			}
		return valid;
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
	
	public void hit()
	{
		health--;
	}
}
