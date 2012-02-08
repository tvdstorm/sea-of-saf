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
	
	public Movement(String name)
	{
		_movements = new LinkedList<Movements>();
		_movements.add(Movements.valueOf(name));
	}
	
	public Movement(List<String> list)
	{
		_movements = new LinkedList<Movements>();
		
		for(String name : list)
		{
			_movements.add(Movements.valueOf(name));
		}
	}
	
	public Movements getMovement(Random random)
	{
		return _movements.get(random.nextInt(_movements.size()));
	}
	
}