import java.util.LinkedList;
import java.util.List;

public class Movement
{
	public enum Movements 	{	
		jump,crouch,stand,run_towards,run_away,walk_towards,walk_away
	}
	private List<Movements> _movements;
	public Movement()
	{
		_movements = new LinkedList<Movements>();
		
	}
	
	public void AddMovement(String name)
	{
		_movements.add(Movements.valueOf(name));
	
	}
	
	public void AddMovement(List<String> list)
	{
		for(String name : list)
		{
			_movements.add(Movements.valueOf(name));
		}
	}
	
	public void outputData()
	{
		if (_movements.size()>1)
		{
			System.out.print(" choose(");
		}
		
		for (Movements m : _movements)
		{
			System.out.print(" "+m);
		}
		
		if (_movements.size()>1)
		{
			System.out.print(")");
		}
	
	}
}