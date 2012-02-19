package nodes;

public class ConditionAnd extends Condition
{
	public ConditionAnd()
	{
		
	}
	
	public boolean isAndCondition()
	{
		return true;
	}
	
	public String toString()
	{
		String tostr = "And: ";
		for (String cond : conditions) {
			tostr += cond + " ";
		}
		return tostr;
	}
	
}
