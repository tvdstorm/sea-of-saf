package com.blommesteijn.uva.sc.saf.ast;

public class BuildAstException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7623523774021044822L;
	private String _message = null;
	
	public BuildAstException(String message)
	{
		_message = message;
	}
	
	public String getMessage()
	{
		return _message;
	}
	
}
