package com.blommesteijn.uva.sc.saf.runner.model.ast;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.List;

import com.blommesteijn.uva.sc.saf.ast.types.AstNode;
import com.blommesteijn.uva.sc.saf.runner.model.FileLoadException;
import com.blommesteijn.uva.sc.saf.runner.model.Model;
import com.blommesteijn.uva.sc.saf.runner.model.utils.Common;
import com.blommesteijn.uva.sc.saf.runner.model.utils.Files;
import com.blommesteijn.uva.sc.saf.runner.model.utils.Options;

public class AstLoader
{
	private Files _files = null;
	private List<AstNode> _astNodes = null;
	private Options _options = null;
	
	public AstLoader(Files files) throws FileLoadException
	{
		_files = files;
		_astNodes = new LinkedList<AstNode>();
		_options = Model.getInstance().getOption();
		
		this.loadAst();
	}
	
	private void loadAst() throws FileLoadException
	{
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		
		for(File file : _files.getFiles())
		{
			try
			{
				fileInputStream = new FileInputStream(file);
				objectInputStream = new ObjectInputStream(fileInputStream);
				_astNodes.add((AstNode) objectInputStream.readObject());
			}
			catch (ClassNotFoundException e)
			{
				if(_options.hasOption(Options.DEBUG))
				{
					System.out.println("error: sacc invalid.");
					System.out.println(file.getName());
				}
			}
			catch (IOException e)
			{
				if(_options.hasOption(Options.DEBUG))
				{
					System.out.println("error: file read.");
					System.out.println(file.getName());
				}
			}
		}
		
		if(_files.getFiles().size() != _astNodes.size())
		{
			throw new FileLoadException("could not load all files");
		}
	}
	
	public List<AstNode> getAstNodes()
	{
		return _astNodes;
	}
	
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		for(AstNode astNode : _astNodes)
		{
			sb.append(astNode).append(Common.NEW_LINE);
		}
		return sb.toString();
	}
	

}
