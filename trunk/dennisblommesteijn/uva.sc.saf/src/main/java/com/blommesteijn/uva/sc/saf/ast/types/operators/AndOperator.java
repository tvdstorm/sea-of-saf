package com.blommesteijn.uva.sc.saf.ast.types.operators;

import java.util.LinkedList;
import java.util.List;

import com.blommesteijn.uva.sc.saf.ast.types.Condition;

public class AndOperator extends Operator 
{
	private static final long serialVersionUID = -6367973660147660320L;

	public AndOperator()
	{
		super();
	}

	public void setObjectFields(Operator operator) 
	{
		this.setLine(operator.getLine());
		_name = operator._name;
		_conditions = operator._conditions;
		_operator = operator._operator;
	}
	
	public boolean isValidCondition(List<Condition> conditions) 
	{
		boolean b = false;
		List<Condition> rest = new LinkedList<Condition>();
		
		//contains one of the items in the list
		for(Condition condition : conditions)
		{
			if(_conditions.contains(condition))
				b = true;
			else
				rest.add(condition);
		}

		//visit nested operator
		if(_operator != null)
		{
			b = _operator.isValidCondition(rest);
		}
		return b;
	}
}
