package com.blommesteijn.uva.sc.saf;

import gnu.getopt.Getopt;
import gnu.getopt.LongOpt;

import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.blommesteijn.uva.sc.saf.ast.BuildAst;
import com.blommesteijn.uva.sc.saf.ast.BuildAstException;
import com.blommesteijn.uva.sc.saf.ast.types.AstNode;
import com.blommesteijn.uva.sc.saf.checkers.ParserChecker;
import com.blommesteijn.uva.sc.saf.checkers.StaticChecker;
import com.blommesteijn.uva.sc.saf.compiler.CompileAst;

public class Main
{
	public static void main(String[] args)
	{		
		String appName = "safc";
		String appVersion = "0.0.1-SNAPSHOT";
		
		//parsed argument container
		Map<String, List<String>> argv = new HashMap<String,List<String>>();
		
		//long arguments
		List<LongOpt> longOpts = new LinkedList<LongOpt>();
		longOpts.add( new LongOpt("help", LongOpt.NO_ARGUMENT, null, 'h') );
		longOpts.add( new LongOpt("version", LongOpt.NO_ARGUMENT, null, 'v') );
		longOpts.add( new LongOpt("debug", LongOpt.NO_ARGUMENT, null, 'd') );
		
		//getopt
		Getopt getopt = new Getopt(appName, args, "-:h:v:d:c", longOpts.toArray(new LongOpt[0]));

		int c = 0;
		while((c = getopt.getopt()) != -1)
		{
			switch(c)
			{
				//help
				case 'h':
					System.out.println(appName + ": <source file(s)> <options> " +
							"[--help (-h) this output, " +
							"--version (-v) version number" +
							"--debug (-d) debug output" +
							"-c compile options]");
					System.exit(0);
					break;
				//version
				case 'v':
					System.out.println(appName + ": " + appVersion);
					System.exit(0);
					break;
				//debug
				case 'd':
					if(!argv.containsKey("debug"))
						argv.put("debug", new LinkedList<String>());
					argv.get("debug").add(getopt.getOptarg());
					break;
				//compile options
				case 'c':
					if(!argv.containsKey("compile"))
						argv.put("compile", new LinkedList<String>());
					argv.get("compile").add(getopt.getOptarg());
					break;
				//source files
				default:
					if(!argv.containsKey("source"))
						argv.put("source", new LinkedList<String>());
					argv.get("source").add(getopt.getOptarg());
			}
		}
		
		if(argv.containsKey("debug"))
		{
			System.out.println("arguments: ");
			System.out.println(argv);
		}
		
		//no source files found
		if(!argv.containsKey("source"))
		{
			System.out.println("error: no source file(s). (try --help)");
			System.exit(1);
		}
		//no source files found
		if(argv.get("source").size() <= 0)
		{
			System.out.println("error: no source file(s). (try --help)");
			System.exit(1);
		}
		
		
		String curDir = System.getProperty("user.dir");
		if(!curDir.endsWith("/"))
			curDir += "/";
		
		if(argv.containsKey("debug"))
		{
			System.out.println("current dir: ");
			System.out.println(curDir);
		}
		
		List<File> files = new LinkedList<File>();
		for(String reference : argv.get("source"))
		{
			//absolute path
			File file = new File(reference);

			//relative path
			if(!file.isFile())
				file = new File(curDir + reference);
			if(file.isFile())
				files.add(file);
		}
		
		// no source files found
		if (files.size() <= 0)
		{
			System.out.println("error: could not load source file(s). (try --debug)");
			System.exit(1);
		}
		
		if(argv.containsKey("debug"))
		{
			System.out.println("file(s): ");
			System.out.println(files);
		}
		
		
		BuildAst astBuilder = new BuildAst();
		try
		{
			astBuilder.loadSource(files);
		}
		catch (BuildAstException e)
		{
			ParserChecker parserChecker = astBuilder.getParserChecker();
			StaticChecker staticChecker = astBuilder.getStaticChecker();
			if(parserChecker != null)
				System.out.println(parserChecker);
			if(staticChecker != null)
				System.out.println(staticChecker);
			System.exit(2);
		}

		//get astnodes
		List<AstNode> astNodes = astBuilder.getAstNodes();		
		if(astNodes == null)
		{
			System.out.println("error: could not load source file(s). (try --help)");
			System.exit(1);
		}
		
		//compile ast nodes
		CompileAst compileAst = CompileAst.getInstance();
		List<File> compiledFiles = compileAst.comileAst(astNodes);
		
		if(argv.containsKey("debug"))
		{
			System.out.println("compiled file(s): ");
			System.out.println(compiledFiles);
		}
		
		System.exit(0);
	}
}
