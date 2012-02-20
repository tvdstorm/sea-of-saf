package com.blommesteijn.uva.sc.saf.runner.view;

import com.blommesteijn.uva.sc.saf.runner.model.Model;

/**
 * Standard out/err messenger
 * NOTE: with regulated check for debugging
 * @author dblommesteijn
 * @since Feb 19, 2012
 */
public class CliMessenger
{
	
	public static void exit(ExitCode code, String message)
	{
		CliMessenger.err("error: " + message + " (try --help)");
		System.exit(code.getCode());
	}
	
	public static void msg(String[] messages)
	{
		for(String message : messages)
			CliMessenger.msg(message);
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
