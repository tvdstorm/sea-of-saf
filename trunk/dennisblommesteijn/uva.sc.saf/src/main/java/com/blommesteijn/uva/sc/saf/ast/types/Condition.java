package com.blommesteijn.uva.sc.saf.ast.types;

import java.util.List;

import com.blommesteijn.uva.sc.saf.utils.StringUtil;
import com.blommesteijn.uva.sc.saf.checkers.StaticCheckIssue;
import com.blommesteijn.uva.sc.saf.checkers.StaticCheckerResult;


public class Condition extends AstNode
{
	private static final long serialVersionUID = -7368203201969178978L;
	private final String _name;

	public Condition(String name) 
	{
		super();
		_name = name;
	}
	
	public Condition(int line, String name)
	{
		super(line);
		_name = name;
	}
	
	public boolean equals(Object o)
	{
		boolean ret = false;
		if(o instanceof Condition)
		{
			Condition condition = (Condition) o;
			ret = (_name.equals(condition._name));
		}
		return ret;
	}
	
	
	public boolean isValidCondition(List<Condition> conditions) 
	{
		return conditions.contains(this);
	}
	


	@Override
	public void staticCheck(StaticCheckerResult _result) 
	{		
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
		return sb.toString();
	}

	public String getName() 
	{
		return _name;
	}


}
