package com.blommesteijn.uva.sc.saf.runner.model.utils;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import com.blommesteijn.uva.sc.saf.runner.model.exceptions.FileLoadException;
import com.blommesteijn.uva.sc.saf.runner.view.CliMessager;

public class Files
{
	private File _currentDir = null;
	private List<String> _sources = null;
	private List<File> _files = null;
	
	public Files()
	{
	}

	public Files(String userDir, List<String> sources) throws FileLoadException
	{
		_sources = sources;
		_files = new LinkedList<File>();
		if(!userDir.endsWith(Common.FILE_SEPARATOR))
			userDir += Common.FILE_SEPARATOR;
		_currentDir = new File(userDir);
		CliMessager.msg(new String[]{"currentDir: ", _currentDir.getName()});
		
		this.loadSources();
	}



	public File getCurrentDir()
	{
		return _currentDir;
	}

	
	private void loadSources() throws FileLoadException
	{
		for(String reference : _sources)
		{
			String filename = reference;
			
			CliMessager.msg(new String[]{"filename: ", filename});

			//absolute path
			File file = new File(filename);

			//relative path
			if(!file.isFile())
				file = new File(_currentDir + filename);
			if(file.isFile())
				_files.add(file);
		}
			
		// no source files found
		if (_files.size() != _sources.size())
			throw new FileLoadException("not all sources loaded");
	}
	
	public List<File> getFiles()
	{
		return _files;
	}
	
	
	public String toString()
	{
		return _sources.toString();
	}



}
