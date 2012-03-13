package com.blommesteijn.uva.sc.saf.checkers;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import com.blommesteijn.uva.sc.saf.ast.types.AstNode;
import com.blommesteijn.uva.sc.saf.utils.StringUtil;

public class StaticCheckerResult implements ICheckerResult
{
	private List<ICheckerIssue> _staticCheckException = new LinkedList<ICheckerIssue>();
	private boolean _isConsistent = true;

	
	public StaticCheckerResult()
	{
	}
	
	
	
	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		if(!_staticCheckException.isEmpty())
		{
			sb.append(StringUtil.NEW_LINE);
			for(ICheckerIssue e : _staticCheckException)
			{
				sb.append(e).append(StringUtil.NEW_LINE);
			}
		}

		return sb.toString();
	}



	@Override
	public void append(ICheckerIssue checkerIssue)
	{		
		_staticCheckException.add(checkerIssue);
		_isConsistent = false;
	}


	@Override
	public boolean hasIssues()
	{
		return !_isConsistent;
	}
	

}
