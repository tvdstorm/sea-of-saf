package com.blommesteijn.uva.sc.saf.runner.view;

import com.blommesteijn.uva.sc.saf.runner.model.Model;

public class CliMessager
{
	
	public static void exit(ExitCode code, String message)
	{
		CliMessager.err("error: " + message + " (try --help)");
		System.exit(code.getCode());
	}
	
	public static void msg(String[] messages)
	{
		for(String message : messages)
			CliMessager.msg(message);
	}
	
	
	public static void msg(String message)
	{
		if(Model.getInstance().isDebug())
			System.out.println(message);
	}
	
	public static void err(String message)
	{
		System.err.println(message);
	}
}
