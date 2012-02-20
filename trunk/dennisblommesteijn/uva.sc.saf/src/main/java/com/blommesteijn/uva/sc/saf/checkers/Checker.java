package com.blommesteijn.uva.sc.saf.checkers;

import com.blommesteijn.uva.sc.saf.utils.StringUtil;

public abstract class Checker implements IChecker
{
	protected ICheckerResult _result = null;
	
	public Checker()
	{
	}

	public void append(ICheckerIssue parserCheckerIssue)
	{
		_result.append(parserCheckerIssue);
	}
	
	public boolean hasIssues()
	{
		return (_result.hasIssues());
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		String r = _result.toString();
		if(r.length() > 0)
		{	
			sb.append(this.getClass().getSimpleName()).append(": ").append(StringUtil.NEW_LINE);
			sb.append(r);
		}
		return sb.toString();
	}
}
