package saf.structure;

import java.util.List;
import java.util.Vector;

public abstract class Check {
	
	public abstract void check();
	
	private List<String> errors = new Vector<String>();
	public List<String> getErrors()
	{
		return errors;
	}
	public void addError(String error)
	{
		errors.add(error);
	}
}
