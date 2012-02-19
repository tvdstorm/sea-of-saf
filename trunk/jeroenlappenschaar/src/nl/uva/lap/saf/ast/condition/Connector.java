package nl.uva.lap.saf.ast.condition;

public abstract class Connector extends Condition
{
	private Condition lhs;
	private Condition rhs;
	
	public Connector(Condition lhs, Condition rhs)
	{
		this.lhs = lhs;
		this.rhs = rhs;
	}

	public Condition getLhs()
	{
		return lhs;
	}

	public Condition getRhs()
	{
		return rhs;
	}
}
