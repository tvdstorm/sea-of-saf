package objects;

import java.util.List;

public class And extends BinaryCondition{
	public And(Condition l,Condition r)
	{
		this.left=l;
		this.right=r;
	}
	public boolean isValid()
	{
		if(left.isValid())
			if (right.isValid()) return true;
			else return false;
		else return false;	
	}
	public boolean eval(List<String> currentConditions)
	{
		return (left.eval(currentConditions) && right.eval(currentConditions));
	}

}
