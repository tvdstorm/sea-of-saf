package saf.structure;

import java.util.List;
import java.util.ArrayList;

public abstract class Check {
	
	public abstract List<String> check();
	
	private List<String> errors = new ArrayList<String>();
	public List<String> getErrors()
	{
		return errors;
	}
	public void addError(String error)
	{
		errors.add(error);
	}
	
	public void addErrors(List<String> errors)
	{
		this.errors.addAll(errors);
	}
}