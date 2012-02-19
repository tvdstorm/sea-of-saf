package behaviours;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Movement
{
	public enum Movements 	{	
		jump,crouch,stand,run_towards,run_away,walk_towards,walk_away
	}
	private List<Movements> _movements;
	private void addMovement(String name)
	{
		try
		{
			_movements.add(Movements.valueOf(name));
		} catch (IllegalArgumentException e) {
			String msg = "Error parsing \""+name+"\". Possible options:";
			for (Movements m : Movements.values())
			{
				msg+=" "+m+" ";
			}
			_errorList.add(msg);
		}
	}
	private List<String> _errorList;
	
	public Movement(String name)
	{
		_errorList = new LinkedList<String>();
		_movements = new LinkedList<Movements>();
		addMovement(name);
	}
	
	public Movement(List<String> list)
	{
		_errorList = new LinkedList<String>();
		_movements = new LinkedList<Movements>();
		
		for(String name : list)
		{
			addMovement(name);
		}
	}
	
	public Movements getMovement(Random random)
	{
		return _movements.get(random.nextInt(_movements.size()));
	}
	
	public List<String> getErrors()
	{
		return _errorList;
	}
}