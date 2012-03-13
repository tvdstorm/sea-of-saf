package com.blommesteijn.uva.sc.saf.checkers;

import com.blommesteijn.uva.sc.saf.ast.types.AstNode;
import com.blommesteijn.uva.sc.saf.utils.StringUtil;

public class StaticCheckIssue implements ICheckerIssue
{
	public static final String DEFAULT_MESSAGE = "an error occured";
	
	private String _message = null;
	private AstNode _astNode = null;
	
	public StaticCheckIssue(AstNode astNode)
	{
		super();
		_astNode = astNode;
	}
	
	public StaticCheckIssue(String message)
	{
		super();
		_message = message;
	}

	
	public StaticCheckIssue(AstNode astNode, String message)
	{
		super();
		_astNode = astNode;
		_message = message;
	}


	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		if(_astNode != null)
		{
			//mesage
			if(_message != null)
				sb.append("\'").append(_message).append("\'");
			//object name
			sb.append(" ").append(_astNode.getClass().getSimpleName());
			//description
			sb.append(": ").append(_astNode.getDescription());
			//line number
			if(_astNode.getLine() != Integer.MAX_VALUE)
				sb.append(", line: ").append(_astNode.getLine());
		}
		return sb.toString();	
	}
	
}
