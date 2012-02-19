package saf.simulation;

import java.util.ArrayList;
import java.util.List;

import saf.structure.Fighter;

public class FighterState extends Subject {

	private int fighterX, fighterY, health;
	private Fighter fighter;
	private StartingPosition startingPosition;
	private State state;
	private List<Action> actions;
	
	public FighterState(Fighter fighter, StartingPosition startingPosition)
	{
		switch (startingPosition) 
		{
			case left:
				this.fighterX = 10;
				break;
			case right:
				this.fighterX = 90;
				break;
		}
		this.fighter = fighter;
		this.state = State.standing;
		this.actions = new ArrayList<Action>();
		this.startingPosition = startingPosition;
		this.fighterY = 0;
		this.setHealth(100);
	}
	
	public int getFighterX() 
	{
		return fighterX;
	}

	public void setFighterX(int fighterX) 
	{
		this.fighterX = fighterX;
		this.notifyObservers();
	}

	public int getFighterY() 
	{
		return fighterY;
	}

	public void setFighterY(int fighterY) 
	{
		this.fighterY = fighterY;
		this.notifyObservers();
	}

	public int getHealth() 
	{
		return health;
	}

	public void setHealth(int health) 
	{
		this.health = health;
		this.notifyObservers();
	}
	
	public void doDamage(int damage)
	{
		this.setHealth(this.getHealth() - damage);
	}
	
	public boolean fighterLost()
	{
		return this.health <= 0;
	}
	
	public void addAction(Action action)
	{
		actions.add(action);
	}
	
	public Action currentAction()
	{
		if(actions.size() > 0)
			return actions.get(0);
		return null;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Fighter getFighter() {
		return fighter;
	}

}
