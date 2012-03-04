package behaviours;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Movement
{
	public enum EnumMovements 	{	
		jump,crouch,stand,run_towards,run_away,walk_towards,walk_away
	}
	private List<String> _movements;
	private List<String> _errorList;
	
	private void addMovement(String name)
	{
		_movements.add(name);
	}
	
	public Movement(String name)
	{
		_errorList = new LinkedList<String>();
		_movements = new LinkedList<String>();
		addMovement(name);
	}
	
	public Movement(List<String> list)
	{
		_errorList = new LinkedList<String>();
		_movements = list;
	}
	
	public EnumMovements getMovement(Random random)
	{
		return parseMovements().get(random.nextInt(parseMovements().size()));
	}
	
	private List<EnumMovements> parseMovements()
	{
		List<EnumMovements> returnList = new LinkedList<EnumMovements>();
		for(String m : _movements)
		{
			try
			{
				returnList.add(EnumMovements.valueOf(m));
			} catch (IllegalArgumentException e) {
				String msg = "Error parsing \""+m+"\". Possible options:";
				for (EnumMovements movement : EnumMovements.values())
				{
					msg+=" "+movement+" ";
				}
				_errorList.add(msg);
			}
		}
		return returnList;
	}
	
	public List<String> getErrors()
	{
		parseMovements();
		return _errorList;
	}
}