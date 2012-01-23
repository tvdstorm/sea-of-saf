import java.util.LinkedList;
import java.util.List;

public class Fighter 
{
	private String _name; 
	public String Name()
	{
		return _name;
	}
	public void Name(String name)
	{
		_name=name;
	}
	
	private List<Property> _properties;
	public void AddProperty(Property p)
	{
		_properties.add(p);
	}
	
	private List<Activity> _activities;
	public void AddActivity(Activity c)
	{
		_activities.add(c);
	}
	
	public Fighter()
	{
		_properties = new LinkedList<Property>();
		_activities = new LinkedList<Activity>();
		_name="";
	}
	
	public void outputData()
	{
		System.out.println(_name);
		System.out.println("{");
		for (Property p : _properties)
		{
			p.outputData();
		}
		
		for (Activity a : _activities)
		{
			a.outputData();
		}
		System.out.println("}");
	}
	

	
}