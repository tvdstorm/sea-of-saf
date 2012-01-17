package AST;

import java.util.ArrayList;
import java.util.List;

public class Arena{
	public List<Bot> bots;

	public Arena(){
		bots = new ArrayList<Bot>();
	}  
	
	@Override
	public String toString(){
		String s = "Area \n";
		for(Bot b: bots)
			s += b.toString();
		return s;
	}
}


//public abstract class LogicalConnective{
//	
//}
//
//public class AndConnective extends LogicalConnective{
//	
//}
//
//public class OrConnective extends LogicalConnective{
//	
//}
//
//public class Choose{
//
//}