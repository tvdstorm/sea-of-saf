package com.blommesteijn.uva.sc.saf.ast.types.exceptions;

public class PropertyValueException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4935542609414049733L;
	private String _message = null;

	public PropertyValueException(String message)
	{
		_message = message;
	}
	
	public String getMessage()
	{
		return _message;
	}

}
