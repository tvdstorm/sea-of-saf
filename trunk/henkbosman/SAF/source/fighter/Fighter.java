package fighter;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import fighter.Property.EnumProperties;

import arena.Engine.EnumFighters;
import behaviours.Action.EnumActions;
import behaviours.Activity;
import behaviours.Behaviour;
import behaviours.Condition.EnumConditions;
import behaviours.Movement.EnumMovements;

public class Fighter 
{
	private String _name; 
	public String getName()
	{
		return _name;
	}
	public void setName(String name)
	{
		_name=name;
	}
	
	public int getPosition()
	{
		return _status.getPosition();
	}
	
	public void movePosition(int pos)
	{
		_status.movePosition(pos);
	}
	
	private double _speed = 0.0;
	private double speed()
	{
		double height = ((double)(getPropertyValue(EnumProperties.punchReach) + getPropertyValue(EnumProperties.kickReach))) / 2;
		double weight = ((double)(getPropertyValue(EnumProperties.punchPower) + getPropertyValue(EnumProperties.kickPower))) / 2;
		_speed = 0.1+(Math.abs(height-weight)*0.5);
		return _speed;
	}
	public int getPropertyValue(EnumProperties property)
	{
		for (Property p : _properties)
		{
			if (p.getType().equals(property))
				return p.getValue();
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
		return (int)(((float)_status.getHealth()/(float)_rules.getStartingHealth())*100);
	}
	public void setRules(Rules rules)
	{
		_rules = rules;
		_status = new Status(_rules.getStartingHealth());
	}

	private Random _randomGenerator;
	
	public Fighter()
	{
		_properties = new LinkedList<Property>();
		_randomGenerator = new Random();
		_behaviour = new Behaviour();
		_name="";
	}
	
	public void doMove(Combatmove combatmove, EnumFighters fighterType)
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
		List<EnumConditions> actualConditions = new LinkedList<EnumConditions>();
		actualConditions.add(evaluateEnemy(enemyHealth));
		actualConditions.add(evaluateDistance(enemyDistance));
		Combatmove combatmove = _behaviour.pickCombatmove(actualConditions, _randomGenerator);
		
		if (_status.recover(speed()))
		{
			_status.doAction(_rules.calculateSpeed(speed(), combatmove));
			return combatmove;
		}
		
		return new Combatmove(EnumMovements.stand, EnumActions.nothing);
	}
	
	private EnumConditions evaluateEnemy(int enemyHealth)
	{
		double range = enemyHealth - getHealth();
		
		if (range<-40)
			return EnumConditions.much_weaker;
		if (range<-25)
			return EnumConditions.weaker;
		
		if (range>40)
			return EnumConditions.much_stronger;
		if (range>25)
			return EnumConditions.stronger;
		
		return EnumConditions.even;
	}
	
	private EnumConditions evaluateDistance(int enemyDistance)
	{
		if (enemyDistance>getPropertyValue(EnumProperties.punchReach) && enemyDistance>getPropertyValue(EnumProperties.kickReach))
			return EnumConditions.far;
		
		return EnumConditions.near;
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