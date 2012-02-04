package saf.checker.errors;

public class OutOfRange implements Error 
{
	public OutOfRange()
	{
	}

	public String toString()
	{
		return String.format("%d is out of range. You cannot assign this to %s", 0, "");
	}
}
