package com.blommesteijn.uva.sc.saf.compiler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

import com.blommesteijn.uva.sc.saf.ast.SerialNode;
import com.blommesteijn.uva.sc.saf.ast.types.AstNode;

public class CompileAst
{
	private static CompileAst _instance = null;
	
	/**
	 * Get instance of BuildAST
	 * @return singleton instance of buildast
	 */
	public static CompileAst getInstance()
	{
		if(_instance == null)
			_instance = new CompileAst();
		return _instance;
	}
	
	private CompileAst()
	{
	}

	public List<File> comileAst(List<AstNode> astNodes)
	{
		List<File> ret = new LinkedList<File>();
		for(AstNode astNode : astNodes)
		{
			//find node duplicate
			int duplicate = 0;
			for(AstNode astNode2 : astNodes)
			{
				if(astNode2.getIdent().equals(astNode.getIdent()))
				{
					duplicate++;
					break;
				}
			}
			if(duplicate > 1)
				System.out.println("error: duplicates found \'" + astNode.getIdent()+ "\'");
			else
				ret.addAll(this.compileAst(astNode));
		}
		return ret;
	}
	
	public List<File> compileAst(AstNode astNode)
	{		
		List<File> ret = new LinkedList<File>();
		File file = null;
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;

		try
		{
			file = new File(astNode.getIdent() + ".sacc");
			fileOutputStream = new FileOutputStream(file);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(astNode);
			ret.add(file);
		}
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ret;
	}

	
	
}
