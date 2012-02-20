package com.blommesteijn.uva.sc.saf.checkers;

import java.util.LinkedList;
import java.util.List;

public class ParserCheckerResult implements ICheckerResult
{
	private List<ICheckerIssue> _issues = null;
	
	public ParserCheckerResult()
	{
		_issues = new LinkedList<ICheckerIssue>();
	}
	

	@Override
	public void append(ICheckerIssue parserCheckerIssue)
	{
		_issues.add(parserCheckerIssue);
	}


	@Override
	public boolean hasIssues()
	{
		return (_issues.size() > 0);
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		for(ICheckerIssue issue : _issues)
			sb.append(issue);
		return sb.toString();
	}
	
}
