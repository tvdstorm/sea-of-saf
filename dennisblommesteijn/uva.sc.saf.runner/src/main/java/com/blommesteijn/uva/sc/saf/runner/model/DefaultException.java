package com.blommesteijn.uva.sc.saf.runner.model;

public class DefaultException extends Exception
{
	protected String _message = null;

	/**
	 * 
	 */
	private static final long serialVersionUID = -3779326728793173147L;
	
	public DefaultException()
	{
	}
	
	public DefaultException(String message)
	{
		_message = message;
	}
	
	@Override
	public String getMessage()
	{
		return _message;
	}

}
