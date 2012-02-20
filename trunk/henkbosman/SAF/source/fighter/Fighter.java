package fighter;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import fighter.Property.Properties;

import arena.Engine.Fighters;
import behaviours.Action;
import behaviours.Activity;
import behaviours.Behaviour;
import behaviours.Condition;
import behaviours.Movement;

public class Fighter 
{
	private String _name; 
	public String name()
	{
		return _name;
	}
	public void name(String name)
	{
		_name=name;
	}
	
	public int getPosition()
	{
		return _status.position();
	}
	
	public void movePosition(int pos)
	{
		_status.movePosition(pos);
	}
	
	private double _speed = 0.0;
	private double speed()
	{
		double height = ((double)(getPropertyValue(Property.Properties.punchReach) + getPropertyValue(Property.Properties.kickReach))) / 2;
		double weight = ((double)(getPropertyValue(Property.Properties.punchPower) + getPropertyValue(Property.Properties.kickPower))) / 2;
		_speed = 0.1+(Math.abs(height-weight)*0.5);
		return _speed;
	}
	public int getPropertyValue(Property.Properties property)
	{
		for (Property p : _properties)
		{
			if (p.type().equals(property))
				return p.value();
		}
		return 5;
	}
		
	private List<Property> _properties;
	public void addProperty(Property p)
	{
		_properties.add(p);
	}
	
	private Behaviour _behaviour;
	public void addActivity(Activity a)
	{
		_behaviour.addActivity(a);
	}
	
	private Rules _rules;
	private Status _status;
	public boolean getDamage(int damage)
	{
		return _status.lowerHealth(damage);
	}
	public int getHealth()
	{
		return (int)(((float)_status.health()/(float)_rules._startingHealth)*100);
	}
	public void setRules(Rules rules)
	{
		_rules = rules;
		_status = new Status(_rules._startingHealth);
	}

	private Random _randomGenerator;
	
	public Fighter()
	{
		_properties = new LinkedList<Property>();
		_randomGenerator = new Random();
		_behaviour = new Behaviour();
		_name="";
	}
	
	public void doMove(Combatmove combatmove, Fighters fighterType)
	{
		switch(fighterType)
		{
		case FighterA:
			_status.movePosition(-(_rules.calculateMovement(combatmove)));
			break;
		case FighterB:
			_status.movePosition((_rules.calculateMovement(combatmove)));
			break;
		}
	}
	
	public Combatmove performAction(int enemyDistance, int enemyHealth)
	{
		List<Condition.Conditions> actualConditions = new LinkedList<Condition.Conditions>();
		actualConditions.add(evaluateEnemy(enemyHealth));
		actualConditions.add(evaluateDistance(enemyDistance));
		Combatmove combatmove = _behaviour.pickCombatmove(actualConditions, _randomGenerator);
		
		if (_status.recover(speed()))
		{
			_status.doAction(_rules.calculateSpeed(speed(), combatmove));
			return combatmove;
		}
		
		return new Combatmove(Movement.Movements.stand, Action.Actions.nothing);
	}
	
	private Condition.Conditions evaluateEnemy(int enemyHealth)
	{
		double range = enemyHealth - getHealth();
		
		if (range<-40)
			return Condition.Conditions.much_weaker;
		if (range<-25)
			return Condition.Conditions.weaker;
		
		if (range>40)
			return Condition.Conditions.much_stronger;
		if (range>25)
			return Condition.Conditions.stronger;
		
		return Condition.Conditions.even;
	}
	
	private Condition.Conditions evaluateDistance(int enemyDistance)
	{
		if (enemyDistance>getPropertyValue(Properties.punchReach) && enemyDistance>getPropertyValue(Properties.kickReach))
			return Condition.Conditions.far;
		
		return Condition.Conditions.near;
	}
	
	public List<String> getErrors()
	{
		List<String> list = new LinkedList<String>();
		
		for (Property p : _properties)
		{
			list.addAll(p.getErrors());
		}
		list.addAll(_behaviour.getErrors());

		if (!list.isEmpty())
			list.add(0, "\nFighter: "+_name);
		
		return list;
	}
}