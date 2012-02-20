package com.blommesteijn.uva.sc.saf.checkers;

public interface ICheckerResult
{
	void append(ICheckerIssue checkerIssue);
	boolean hasIssues();
}
