package com.blommesteijn.uva.sc.saf.runner.model.utils;

import edu.emory.mathcs.backport.java.util.Arrays;
import gnu.getopt.Getopt;
import gnu.getopt.LongOpt;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.blommesteijn.uva.sc.saf.runner.view.CliMessenger;
import com.blommesteijn.uva.sc.saf.runner.view.ExitCode;

public class Options
{	
	public static final String DEBUG = "debug";
	public static final String SOURCE = "source";
	public static final String HELP = "help";
	public static final String VERSION = "version";
	public static final String GUI = "gui";
	public static final String COMPILE = "compile";
	public static final String APP_NAME = "appName";
	public static final String APP_VERSION = "appVersion";

	
	private Map<String, List<String>> _arguments = null;

	public Options(String appName, String appVersion, String[] args)
	{
		this.load(appName, appVersion, args);
	}

	@SuppressWarnings("unchecked")
	private void load(String appName, String appVersion, String[] args)
	{
		//parsed argument container
		_arguments = new HashMap<String,List<String>>();
		_arguments.put(APP_NAME, Arrays.asList(new String[] { appName }));
		_arguments.put(APP_VERSION, Arrays.asList(new String[] { appVersion }));
		
		//long arguments
		List<LongOpt> longOpts = new LinkedList<LongOpt>();
		longOpts.add( new LongOpt(HELP, LongOpt.NO_ARGUMENT, null, 'h') );
		longOpts.add( new LongOpt(VERSION, LongOpt.NO_ARGUMENT, null, 'v') );
		longOpts.add( new LongOpt(DEBUG, LongOpt.NO_ARGUMENT, null, 'd') );
		longOpts.add( new LongOpt(GUI, LongOpt.NO_ARGUMENT, null, 'g') );

		//getopt
		Getopt getopt = new Getopt(appName, args, "-:h:v:d:c:g", longOpts.toArray(new LongOpt[0]));
		String msg = "";
		int c = 0;
		while((c = getopt.getopt()) != -1)
		{
			switch(c)
			{
				//help
				case 'h':
					msg = appName + ": <source file(s)> <options> " +
							"[--"+HELP+" (-h) this output, " +
							"--"+VERSION+" (-v) version number" +
							"--"+DEBUG+" (-d) debug output" +
							"-r runtime options]";
					CliMessenger.exit(ExitCode.EC_OK, msg);
					break;
				//version
				case 'v':
					msg = appName + ": " + appVersion;
					CliMessenger.exit(ExitCode.EC_OK, msg);
					break;
				//debug
				case 'd':
					if(!_arguments.containsKey(DEBUG))
						_arguments.put(DEBUG, new LinkedList<String>());
					_arguments.get(DEBUG).add(getopt.getOptarg());
					break;
				//compile options
				case 'c':
					if(!_arguments.containsKey(COMPILE))
						_arguments.put(COMPILE, new LinkedList<String>());
					_arguments.get(COMPILE).add(getopt.getOptarg());
					break;
				//gui component
				case 'g':
					if(!_arguments.containsKey(GUI))
						_arguments.put(GUI, new LinkedList<String>());
					_arguments.get(GUI).add(getopt.getOptarg());
					break;
				//source files
				default:
					if(!_arguments.containsKey(SOURCE))
						_arguments.put(SOURCE, new LinkedList<String>());
					String value = getopt.getOptarg();
					if(value != null)
						_arguments.get(SOURCE).add(value);
					break;
			}
		}
		
		
		
	}

	public boolean hasOption(String key)
	{
		return _arguments.containsKey(key);
	}
	
	public List<String> getOption(String key)
	{
		return _arguments.get(key);
	}
	
	
	public String toString()
	{
		return _arguments.toString();
	}
}
