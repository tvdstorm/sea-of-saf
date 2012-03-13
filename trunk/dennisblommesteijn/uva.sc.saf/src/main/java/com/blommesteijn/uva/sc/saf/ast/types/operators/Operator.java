package com.blommesteijn.uva.sc.saf.ast.types.operators;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import com.blommesteijn.uva.sc.saf.utils.StringUtil;
import com.blommesteijn.uva.sc.saf.ast.types.AstNode;
import com.blommesteijn.uva.sc.saf.ast.types.Condition;
import com.blommesteijn.uva.sc.saf.checkers.StaticCheckIssue;
import com.blommesteijn.uva.sc.saf.checkers.StaticCheckerResult;

/**
 * 
 * @author dblommesteijn
 * @since 31, jan 2012
 */
public class Operator extends AstNode
{
	private static final long serialVersionUID = 4948340091801450421L;
	protected String _name;
	protected List<Condition> _conditions = new LinkedList<Condition>();
	protected Operator _operator = null;
	
	public Operator()
	{
		super();
	}
	
	public Operator(int line, String name)
	{
		super(line);
		_name = name;		
	}
	
	public String getName()
	{
		return _name;
	}
	
	public void addCondition(Condition condition) 
	{
		_conditions.add(condition);
	}
	
	public Operator getLastOperator() 
	{
		if(_operator != null)
			return _operator.getLastOperator();
		return this;
	}
	
	public void setNextOperator(Operator operator) 
	{
		_operator = operator;
	}
	

	public void setObjectFields(Operator operator) 
	{
		this.setLine(operator.getLine());
		_name = operator._name;
		_conditions = operator._conditions;
		_operator = operator._operator;
	}


	@Override
	public void staticCheck(StaticCheckerResult result) 
	{
		for(Condition condition : _conditions)
			condition.staticCheck(result);
		if(_operator != null)
			_operator.staticCheck(result);
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
		sb.append(indent).append("name: ").append(_name);
		sb.append(": ").append(StringUtil.NEW_LINE);
		
		if(_operator != null)
		{
			sb.append(indent).append("( ").append(StringUtil.NEW_LINE);
			sb.append(_operator.toString(indent + StringUtil.TAB));
			sb.append(indent).append(")");
		}
		
		if(!_conditions.isEmpty())
		{
			sb.append(indent).append("( ").append(StringUtil.NEW_LINE);
			for(Condition condition : _conditions)
			{
				sb.append(condition.toString(indent + StringUtil.TAB));
			}
			sb.append(indent).append(")");
			sb.append("]").append(StringUtil.NEW_LINE);
		}
		
		
		sb.append(indent).append("]").append(StringUtil.NEW_LINE);
		return sb.toString();
	}

	public boolean isValidCondition(List<Condition> conditions) 
	{
		//NOTE: cannot match, no operator type defined!
		return false;
	}

	public List<Condition> getConditions() 
	{
		List<Condition> ret = new LinkedList<Condition>();
		if(_operator != null)
			ret.addAll(_operator.getConditions());
		if(!_conditions.isEmpty())
			ret.addAll(_conditions);
		return ret;
	}

	public List<Operator> getOperators() 
	{
		List<Operator> ret = new LinkedList<Operator>();
		ret.add(this);
		if(_operator != null)
			ret.addAll(_operator.getOperators());
		return ret;
	}


}


