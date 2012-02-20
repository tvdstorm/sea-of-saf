package com.blommesteijn.uva.sc.saf.runner.view;

public enum ExitCode
{
	EC_OK(0),
	EC_FILES(1),
	EC_SOURCES(2),
	EC_AST(3),
	EC_ERROR(4);
	
	private int _code = 0;
	
	ExitCode(int code)
	{
		_code = code;
	}
	
	public int getCode()
	{
		return _code;
	}
}
