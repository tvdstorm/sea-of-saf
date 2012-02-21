package com.blommesteijn.uva.sc.saf.ast.types;


import java.util.LinkedList;
import java.util.List;

import com.blommesteijn.uva.sc.saf.utils.StringUtil;
import com.blommesteijn.uva.sc.saf.ast.types.values.ECondition;
import com.blommesteijn.uva.sc.saf.checkers.StaticCheckIssue;
import com.blommesteijn.uva.sc.saf.checkers.StaticCheckerResult;

public class Behaviour extends AstNode
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4093675952766967070L;

	public static final int OPERATORS_ALLOWED = 1;
	
	private List<Operator> _operators = new LinkedList<Operator>();
	private List<Condition> _locations = new LinkedList<Condition>();
	private List<Action> _moves = new LinkedList<Action>();
	private List<Action> _attacks = new LinkedList<Action>();
	
	/**
	 * 
	 * @param line
	 * @param ident
	 * @param value
	 */
	public Behaviour(int line, String ident)
	{
		super();
		_line = line;
//		_locations
		this.append((AstNode)new Condition(line, ident));
	}
	
	public void append(Operator operator)
	{
		_operators.add(operator);
	}
	
	public void append(Condition location)
	{
		_locations.add(location);
	}
	
	public void append(Action action)
	{
		if(action.isAttack())
			_attacks.add(action);
		else if (action.isMove())
			_moves.add(action);
	}
	
	

	public void register(AstNode astNode)
	{
		Fighter f = (Fighter) astNode;
		f.append(this);
	}
	
	
	public List<Operator> getOperators()
	{
		return _operators;
	}
	
	public List<Condition> getConditions()
	{
		return _locations;
	}
	
	public List<Action> getMoves()
	{
		return _moves;
	}
	
	public List<Action> getAttacks()
	{
		return _attacks;
	}
	
	/**
	 * Perform Static Check
	 * @param checker static result checker reference
	 */
	@Override
	public void staticCheck(StaticCheckerResult result)
	{
		// visit all nested nodes
		for (AstNode node : this.getNodes())
		{
//			System.out.println(node.getIdent());
			node.staticCheck(result);
			node.register(this);
		}
				
		//invalid operators
		if(_operators.size() > OPERATORS_ALLOWED)
		{
			result.append(new StaticCheckIssue(this, 
					"only: " + OPERATORS_ALLOWED + " operator(s) allowed"));
		}

		//invalid moves
		if(_moves.size() <= 0)
		{
			result.append(new StaticCheckIssue(this, 
					"no move(s) found"));
		}
		
		//invalid attacks
		if(_attacks.size() <= 0)
		{
			result.append(new StaticCheckIssue(this, 
					"no attack(s) found"));
		}
	}	
	
	
	/**
	 * @return string representation
	 */
	public String toString(String indent)
	{
		StringBuilder sb = new StringBuilder();
		//append typename
		sb.append(indent).append("[ ").append(this.getClass().getSimpleName());
		sb.append(": ").append(StringUtil.NEW_LINE);
		
		//visit nested nodes
		if(this.hasNodes())
		{
			sb.append(indent).append("( ").append(StringUtil.NEW_LINE);
			for(AstNode node : this.getNodes())
			{
				sb.append(node.toString(indent + StringUtil.TAB));
			}
			sb.append(indent).append(")");
			sb.append("]").append(StringUtil.NEW_LINE);
		}
		else
			sb.append(indent).append("]").append(StringUtil.NEW_LINE);
		return sb.toString();
	}
	
	
}
