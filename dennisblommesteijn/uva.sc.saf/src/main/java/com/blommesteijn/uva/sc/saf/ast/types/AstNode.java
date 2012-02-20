package com.blommesteijn.uva.sc.saf.ast.types;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import com.blommesteijn.uva.sc.saf.utils.StringUtil;
import com.blommesteijn.uva.sc.saf.ast.SerialNode;
import com.blommesteijn.uva.sc.saf.checkers.ICheckerResult;
import com.blommesteijn.uva.sc.saf.checkers.StaticCheckIssue;
import com.blommesteijn.uva.sc.saf.checkers.StaticCheckerResult;

/**
 * 
 * @author D.Blommesteijn
 * @since 29, Jan 2012
 */
public abstract class AstNode implements IAstNode
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4813055669589514172L;
	protected List<AstNode> _nodes = new LinkedList<AstNode>();
	protected String _ident = null;
	protected int _line = Integer.MAX_VALUE;
	
	
	private List<Fighter> _fighters = new LinkedList<Fighter>();

	
	public AstNode()
	{
	}
	
	
	public void append(Fighter fighter)
	{
		_fighters.add(fighter);
	}
	
	@Override
	public void append(AstNode astNode)
	{
		_nodes.add(astNode);
	}
	
	@Override
	public void append(List<AstNode> astNodes)
	{
		_nodes.addAll(astNodes);
	}

	@Override
	public List<AstNode> getNodes()
	{
		return _nodes;
	}
	
	public boolean hasNodes()
	{
		return (!_nodes.isEmpty());
	}
	
	public List<Fighter> getFighters()
	{
		return _fighters;
	}

	
	@Override
	public void setIdent(String ident)
	{
		_ident = ident;
	}

	@Override
	public String getIdent()
	{
		return _ident;
	}

	@Override
	public int getLine()
	{
		return _line;
	}

	@Override
	public void setLine(int line)
	{
		_line = line;
	}
	
	/**
	 * Perform a static check of properties within the AST structure
	 */
	public abstract void staticCheck(StaticCheckerResult result);
	
	
	public void register(AstNode astNode)
	{
		Fighter f = (Fighter) astNode;
		_fighters.add(f);
	}
	


	/**
	 * String representation of object
	 * @return string representation
	 */
	public String toString()
	{
		return this.toString("");
	}

	/**
	 * @return string representation
	 */
	public String toString(String indent)
	{
		StringBuilder sb = new StringBuilder();
		//node type
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
	
	