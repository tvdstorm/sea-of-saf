package objects;

import java.util.List;

public class Or extends BinaryCondition{
	public Or(Condition l,Condition r)
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
		return (left.eval(currentConditions) || right.eval(currentConditions));
	}

}
