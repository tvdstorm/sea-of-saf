package saf.Checker;

import java.util.ArrayList;

public abstract class Check {
	
	public abstract ArrayList<String> check();
	
	private ArrayList<String> errors = new ArrayList<String>();
	public ArrayList<String> getErrors()
	{
		return errors;
	}
	public void addError(String error)
	{
		errors.add(error);
	}
	
	public void addErrors(ArrayList<String> errors)
	{
		this.errors.addAll(errors);
	}
	
	public boolean hasErrors()
	{
		errors = check();
		if(errors.size() == 0)
			return false;
		
		for(String error : errors)
		{
			System.out.println(error);
		}
		
		return true;
	}
}
