package nodes;

public class ConditionOr extends Condition
{
	public ConditionOr()
	{
		
	}
	
	public boolean isOrCondition()
	{
		return true;
	}
	
	public String toString()
	{
		String tostr = "Or: ";
		for (String cond : conditions) {
			tostr += cond + " ";
		}
		return tostr;
	}
}
