package objects;

import java.util.List;

public abstract class Condition 
{
	public boolean isValid() {return false;	}
	public boolean eval(List<String> currentConditions) {return false;}
}