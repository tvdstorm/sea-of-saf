package com.blommesteijn.uva.sc.saf.ast.types.actions;

import com.blommesteijn.uva.sc.saf.utils.StringUtil;
import com.blommesteijn.uva.sc.saf.ast.types.AstNode;
import com.blommesteijn.uva.sc.saf.checkers.StaticCheckIssue;
import com.blommesteijn.uva.sc.saf.checkers.StaticCheckerResult;


public class Action extends AstNode
{
	private static final long serialVersionUID = 3388192296517431089L;
	protected String _name;
	
	public Action()
	{
		super();
	}
	
	public Action(int line, String name)
	{
		super(line);
		_name = name;
	}
	
	@Override
	public void staticCheck(StaticCheckerResult result) 
	{
	}
	
	public String getName()
	{
		return _name;
	}
	
	public String getDescription() 
	{
		return _name;
	}
	
	public String toString()
	{
		return this.toString("");
	}

	@Override
	public String toString(String indent) 
	{
		StringBuilder sb = new StringBuilder();
		//append typename
		sb.append(indent).append("[ ").append(this.getClass().getSimpleName());
		sb.append(": ").append(StringUtil.NEW_LINE);
		//append name and value
		sb.append(indent).append("name: ").append(_name);
		sb.append(StringUtil.NEW_LINE);	
		sb.append(indent).append("]").append(StringUtil.NEW_LINE);
		return sb.toString();
	}

	public void setObjectFields(Action action) 
	{
		this.setLine(action.getLine());
		_name = action._name;
	}
	
	public double calcNextPosition(double position, double fighterSpeed, int direction) 
	{
		return position;
	}
}

