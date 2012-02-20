package com.blommesteijn.uva.sc.saf.checkers;

import com.blommesteijn.uva.sc.saf.utils.StringUtil;

public class ParserCheckerIssue implements ICheckerIssue
{
	private int _linePosition = Integer.MIN_VALUE;
	private int _charPosition = Integer.MIN_VALUE;
	private String _message = null;
	

	public ParserCheckerIssue(int lpos, int cpos, String msg)
	{
		_linePosition = lpos;
		_charPosition = cpos;
		_message = msg;
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("\'").append(_message).append("\'");
		sb.append(", line: ").append(_linePosition).append(":");
		sb.append(_charPosition).append(StringUtil.NEW_LINE);
		return sb.toString();
	}

}
