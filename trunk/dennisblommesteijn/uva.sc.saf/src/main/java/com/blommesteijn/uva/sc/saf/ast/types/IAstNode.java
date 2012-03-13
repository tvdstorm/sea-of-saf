package com.blommesteijn.uva.sc.saf.ast.types;

import java.io.Serializable;
import java.util.List;

import com.blommesteijn.uva.sc.saf.checkers.StaticCheckerResult;

public interface IAstNode extends Serializable
{
	int getLine();
	
	void staticCheck(StaticCheckerResult _result);
	
	String toString();
	String toString(String indent);
	String getDescription();

	void addFighters(List<Fighter> _fighters);
	List<Fighter> getFighters();
	
}
