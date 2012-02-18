package parser;

import java.util.LinkedList;
import java.util.List;

public class Errorlog 
{
	private List<String> _errorList;
	
	public Errorlog()
	{
		_errorList = new LinkedList<String>();
	}
	
	public void addError(String error)
	{
		_errorList.add(error);
	}
	
}
