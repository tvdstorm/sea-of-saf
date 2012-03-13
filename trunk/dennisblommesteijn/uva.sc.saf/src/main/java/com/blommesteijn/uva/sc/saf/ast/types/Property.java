package com.blommesteijn.uva.sc.saf.ast.types;


import com.blommesteijn.uva.sc.saf.utils.StringUtil;

import com.blommesteijn.uva.sc.saf.checkers.StaticCheckIssue;
import com.blommesteijn.uva.sc.saf.checkers.StaticCheckerResult;

public class Property extends AstNode
{
	private static final long serialVersionUID = -837829044101579142L;

	protected double _minValue = 1.0;
	protected double _maxValue = 10.0;
	
	private final String _name;
	private final double _value;
	
	public Property(String name, double value)
	{
		super();
		_name = name;
		_value = value;
	}

	public Property(int line, String name, double value)
	{
		super(line);
		_name = name;
		_value = value;
	}

	public String getName()
	{
		return _name;
	}
	
	public double getValue()
	{
		return _value;
	}
	
	public boolean isPower()
	{
		return _name.contains("Power");
	}
	
	public boolean isReach()
	{
		return _name.contains("Reach");
	}
	
	
	public boolean equals(Object object)
	{
		if(object instanceof Property)
		{
			Property p = (Property) object;
			return (p._name.equals(_name));
		}
		return false;
	}
	
	@Override
	public void staticCheck(StaticCheckerResult result)
	{		
		//limit property size
		if(_value > _maxValue || _value < _minValue)
			result.append(new StaticCheckIssue(this, "value out of bounds"));
	}
	
	public String getDescription() 
	{
		return _name;
	}
	
	public String toString()
	{
		return this.toString("");
	}
	
	public String toString(String indent) 
	{
		StringBuilder sb = new StringBuilder();
		//append typename
		sb.append(indent).append("[ ").append(this.getClass().getSimpleName());
		sb.append(": ").append(StringUtil.NEW_LINE);
		//append name and value
		sb.append(indent).append("name: ").append(_name).append(",").append(StringUtil.NEW_LINE);
		sb.append(indent).append("value: ").append(_value);
		sb.append(StringUtil.NEW_LINE);
		
		sb.append(indent).append("]").append(StringUtil.NEW_LINE);
		return sb.toString();
	}

}


