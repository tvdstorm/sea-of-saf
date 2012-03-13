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
import com.blommesteijn.uva.sc.saf.ast.types.Fighter;
import com.blommesteijn.uva.sc.saf.ast.types.IAstNode;

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

	public List<File> comileAst(List<IAstNode> astNodes)
	{
		List<File> ret = new LinkedList<File>();
		for(IAstNode astNode : astNodes)
		{
			if( !(astNode instanceof AstNode) )
				continue;
			AstNode ast = (AstNode) astNode;
			List<Fighter> fighters = ast.getFighters();
			for(Fighter fighter : fighters)
			{
				ret.addAll(this.compileAst(fighter));
			}
		}
		return ret;
	}
	
	public List<File> compileAst(Fighter fighter)
	{		
		List<File> ret = new LinkedList<File>();
		File file = null;
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;

		try
		{
			file = new File(fighter.getName() + ".sacc");
			fileOutputStream = new FileOutputStream(file);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(fighter);
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
