import java.util.LinkedList;
import java.util.List;
import java.util.Random;

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
	
	private double _speed = 0.0;
	private double speed()
	{
		if (_speed>0.0)
			return _speed;
		
		double height = (getPropertyValue(Property.Properties.punchReach) + getPropertyValue(Property.Properties.kickReach)) / 2;
		double weight = (getPropertyValue(Property.Properties.punchPower) + getPropertyValue(Property.Properties.kickPower)) / 2;
		_speed = 0.5*(height-weight);
		return _speed;
	}
	private int getPropertyValue(Property.Properties property)
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
	
	public void performAction(int enemyDistance, int enemyHealth)
	{
		//stronger,weaker,much_stronger,much_weaker,even,near,far,always
		
		List<Condition.Conditions> actualConditions = new LinkedList<Condition.Conditions>();
		actualConditions.add(evaluateEnemy(enemyHealth));
		actualConditions.add(evaluateDistance(enemyDistance));
		
		if (_status.recover())
		{
			_behaviour.pickAction(actualConditions, _randomGenerator);
		}
	}
	
	private Condition.Conditions evaluateEnemy(int enemyHealth)
	{
		double range = ((enemyHealth /_rules._startingHealth) * 100) - ((_status.health() /_rules._startingHealth) * 100);
		
		if (range<-50)
			return Condition.Conditions.much_weaker;
		if (range<-25)
			return Condition.Conditions.weaker;
		
		if (range>50)
			return Condition.Conditions.much_stronger;
		if (range>25)
			return Condition.Conditions.stronger;
		
		return Condition.Conditions.even;
	}
	
	private Condition.Conditions evaluateDistance(int enemyDistance)
	{
		if (enemyDistance>getPropertyValue(Property.Properties.punchReach) && enemyDistance>getPropertyValue(Property.Properties.kickReach))
			return Condition.Conditions.far;
		
		return Condition.Conditions.near;
		
	}
	
	
	
}