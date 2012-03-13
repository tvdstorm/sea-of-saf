package com.blommesteijn.uva.sc.saf.ast.types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.blommesteijn.uva.sc.saf.ast.types.operators.AndOperator;
import com.blommesteijn.uva.sc.saf.ast.types.operators.Operator;
import com.blommesteijn.uva.sc.saf.ast.types.operators.OrOperator;
import com.blommesteijn.uva.sc.saf.checkers.StaticCheckIssue;
import com.blommesteijn.uva.sc.saf.checkers.StaticChecker;
import com.blommesteijn.uva.sc.saf.checkers.StaticCheckerResult;
import com.blommesteijn.uva.sc.saf.utils.StringUtil;

public class Conditions extends AstNode 
{
	private static final long serialVersionUID = 4372714927501306435L;
	private Operator _operatorRoot = null;
	private Condition _condition = null;
	
	//list of operators
	protected static Map<String, Class<? extends Operator>> __allOperators = getAllOperators();
	protected static List<String> __allConditions = getAllConditions();
	
	/**
	 * Get all operators (re-populate)
	 * @return all types of operators
	 */
	private static Map<String, Class<? extends Operator>> getAllOperators()
	{
		Map<String, Class<? extends Operator>> ret = new HashMap<String, Class<? extends Operator>>();
		ret.put("or", OrOperator.class);
		ret.put("and", AndOperator.class);
		return ret;
	}
	
	private static List<String> getAllConditions()
	{
		List<String> ret = new ArrayList<String>();
		ret.add("stronger");
		ret.add("weaker");
		ret.add("much_stronger");
		ret.add("much_weaker");
		ret.add("even");
		ret.add("near");
		ret.add("far");
		ret.add("always");
		return ret;
	}
	
	/**
	 * Constructor
	 */
	public Conditions() 
	{
		super();
	}

	public Conditions(Condition condition) 
	{
		super();
		this.addCondition(condition);
	}
	
	/**
	 * Get operator from operator list (dynamic invocation)
	 * @param operator generic operator
	 * @return new operator with properties of the generic operator
	 */
	private Operator getSpecificOperator(Operator operator)
	{
		Operator tmp = null;
		String name = operator.getName();
		if(__allOperators.containsKey(name))
		{
			Class<? extends Operator> o = __allOperators.get(name);
			Operator newInstance = null;
			try 
			{
				newInstance = o.newInstance();
			} 
			catch (Exception e) 
			{}
			newInstance.setObjectFields(operator);
			tmp = newInstance;
		}
		else
			tmp = operator;
		return tmp;
	}


	/**
	 * Add operator (and, or)
	 * @param operator
	 */
	public void addOperator(Operator operator) 
	{
		//get operator that complies to it's name
		Operator specificOperator = this.getSpecificOperator(operator);
		
		if(_operatorRoot == null)
			_operatorRoot = specificOperator;
		else
		{	
			Operator last = _operatorRoot.getLastOperator();
			last.setNextOperator(specificOperator);
		}
	}
	
	/**
	 * Add condition at the front of the list (near, far, weak, strong)
	 * @param condition
	 */
	public void addFirstCondition(Condition condition) 
	{
		if(_operatorRoot == null)
			_condition = condition;
		else
			_operatorRoot.addCondition(condition);
	}

	/**
	 * Add condition to the conditions (near, far, weak, strong)
	 * @param condition
	 */
	public void addCondition(Condition condition) 
	{
		Operator last = _operatorRoot.getLastOperator();
		last.addCondition(condition);
	}
	
	
	/**
	 * Validate conditions (SAF has no brackets, so priority is in prefix notation)
	 * @param conditions list of conditions to verify
	 * @return 
	 */
	public boolean isValidCondition(List<Condition> conditions)
	{
		if(_operatorRoot != null)
			return _operatorRoot.isValidCondition(conditions);
		return _condition.isValidCondition(conditions);
	}
	
	protected void checkActions(StaticCheckerResult result)
	{
		//check conditions
		List<Condition> conditions = this.getConditions();
		for(Condition condition : conditions)
		{
			if(!__allConditions.contains(condition.getName()))
				result.append(new StaticCheckIssue(condition, "incorrect keyword"));
		}
		
		//check operators
		List<Operator> operators = this.getOperators();		
		for(Operator operator : operators)
		{
			if(!__allOperators.containsKey(operator.getName()))
				result.append(new StaticCheckIssue(operator, "incorrect keyword"));
		}
		
	}

	@Override
	public void staticCheck(StaticCheckerResult result) 
	{
		//check self
		this.checkActions(result);
		
		//check nested
		if(_operatorRoot != null)
			_operatorRoot.staticCheck(result);
		if(_condition != null)
			_condition.staticCheck(result);
	}
	
	public String getDescription() 
	{
		String ret = "";
		if(_operatorRoot != null)
			ret += _operatorRoot.getDescription();
		if(_condition != null)
			ret += _condition.getDescription();
		return ret;
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
		
		if(_operatorRoot != null)
		{
			sb.append(indent).append("( ").append(StringUtil.NEW_LINE);
			sb.append(_operatorRoot.toString(indent + StringUtil.TAB));
			sb.append(indent).append(")");
		}
		
		if(_condition != null)
		{
			sb.append(indent).append("( ").append(StringUtil.NEW_LINE);
			sb.append(_condition.toString(indent + StringUtil.TAB));
			sb.append(indent).append(")");
		}	
		sb.append(indent).append("]").append(StringUtil.NEW_LINE);
		return sb.toString();
	}

	public List<Condition> getConditions() 
	{
		List<Condition> ret = new LinkedList<Condition>();
		if(_operatorRoot != null)
			ret.addAll(_operatorRoot.getConditions());
		if(_condition != null)
			ret.add(_condition);
		return ret;
	}
	
	public List<Operator> getOperators()
	{
		List<Operator> ret = new LinkedList<Operator>();
		if(_operatorRoot != null)
			ret.addAll(_operatorRoot.getOperators());
		return ret;
	}

	
	

}
