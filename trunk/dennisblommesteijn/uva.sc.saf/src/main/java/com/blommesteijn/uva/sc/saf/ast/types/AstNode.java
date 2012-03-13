package com.blommesteijn.uva.sc.saf.ast.types;

import java.util.LinkedList;
import java.util.List;

import com.blommesteijn.uva.sc.saf.utils.StringUtil;
import com.blommesteijn.uva.sc.saf.checkers.StaticCheckerResult;

/**
 * 
 * @author D.Blommesteijn
 * @since 29, Jan 2012
 */
public class AstNode implements IAstNode
{
	private static final long serialVersionUID = -5549570830258573973L;
	private int _line;
	private List<Fighter> _fighters = new LinkedList<Fighter>();

	public AstNode()
	{
		_line = Integer.MIN_VALUE;
	}
	
	public AstNode(int line) 
	{
		_line = line;
	}
	
	public int getLine()
	{
		return _line;
	}
	
	public void setLine(int line)
	{
		_line = line;
	}

	public List<Fighter> getFighters() 
	{
		return _fighters;
	}

	@Override
	public void staticCheck(StaticCheckerResult result) 
	{
		for(Fighter fighter : _fighters)
			fighter.staticCheck(result);
	}

	@Override
	public void addFighters(List<Fighter> fighters) 
	{
		_fighters.addAll(fighters);
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
//		sb.append(indent).append("name: ").append(_name);
		sb.append(StringUtil.NEW_LINE);		
		
		if(!_fighters.isEmpty())
		{
			sb.append(indent).append("( ").append(StringUtil.NEW_LINE);
			for(Fighter fighter : _fighters)
			{
				sb.append(indent).append(fighter.toString(indent + StringUtil.TAB));
			}
			sb.append(indent).append(")");
			sb.append(StringUtil.NEW_LINE);
		}
		
		sb.append(indent).append("]").append(StringUtil.NEW_LINE);
		return sb.toString();
	}

	public String getDescription() 
	{
		return "";
	}

}
	
	