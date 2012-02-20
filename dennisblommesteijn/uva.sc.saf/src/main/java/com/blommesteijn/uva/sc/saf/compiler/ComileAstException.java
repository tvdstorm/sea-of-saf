package com.blommesteijn.uva.sc.saf.compiler;

public class ComileAstException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7623523774021044822L;
	private String _message = null;
	
	public ComileAstException(String message)
	{
		_message = message;
	}
	
	public String getMessage()
	{
		return _message;
	}
	
}
