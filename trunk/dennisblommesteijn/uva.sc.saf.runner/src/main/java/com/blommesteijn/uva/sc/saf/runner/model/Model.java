/**
 * 
 */
package com.blommesteijn.uva.sc.saf.runner.model;

import java.io.IOException;
import java.util.List;

import com.blommesteijn.uva.sc.saf.runner.model.exceptions.FileLoadException;
import com.blommesteijn.uva.sc.saf.runner.model.utils.Common;
import com.blommesteijn.uva.sc.saf.runner.model.utils.Files;
import com.blommesteijn.uva.sc.saf.runner.model.utils.Options;
import com.blommesteijn.uva.sc.saf.runner.view.CliMessager;
import com.blommesteijn.uva.sc.saf.runner.view.ExitCode;



/**
 * @author pinguin
 * 
 */
public class Model
{
	private static Model _instance = null;

	public static Model getInstance()
	{
		if (_instance == null)
			_instance = new Model();
		return _instance;
	}

	private Options _options = null;
	private Files _files = null;
	private AstLoader _astLoader = null;

	private Model()
	{
	}

	public void load(String appName, String appVersion, String[] args)
	{
		this.loadSources(appName, appVersion, args);
		this.loadFiles();
		this.loadAst();
	}

	private void loadSources(String appName, String appVersion, String[] args)
	{
		try
		{
			_options = new Options(appName, appVersion, args);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		// report options
		CliMessager.msg(new String[] { "arguments:", _options.toString() });

		// no source files found
		if (!_options.hasOption(Options.SOURCE)
				|| _options.getOption(Options.SOURCE).size() <= 0)
			CliMessager.exit(ExitCode.EC_SOURCES, "no source file(s)");

	}

	private void loadFiles()
	{
		// load all files from options
		try
		{
			List<String> option = _options.getOption(Options.SOURCE);
			_files = new Files(Common.USER_DIR, option);
		}
		catch (FileLoadException e)
		{
			CliMessager.exit(ExitCode.EC_FILES, e.getMessage());
		}

		if (_files == null)
			CliMessager.exit(ExitCode.EC_FILES,
					"no source file(s) could be loaded");

		// report files
		CliMessager.msg(new String[] { "current dir:", _files.toString() });
	}

	private void loadAst()
	{
		// Instantiate loaded files
		try
		{
			_astLoader = new AstLoader(_files);
		}
		catch (FileLoadException e)
		{
			CliMessager.exit(ExitCode.EC_AST, e.getMessage());
		}

		CliMessager.msg(new String[] { "astLoader:", _astLoader.toString() });

		// verify asts per files
		if (_astLoader.getAstNodes().size() < _files.getFiles().size())
			CliMessager.exit(ExitCode.EC_AST,
					"not all files contain valid ast(s)");
	}

	public Options getOption()
	{
		return _options;
	}

	public boolean isDebug()
	{
		return _options.hasOption(Options.DEBUG);
	}

}
