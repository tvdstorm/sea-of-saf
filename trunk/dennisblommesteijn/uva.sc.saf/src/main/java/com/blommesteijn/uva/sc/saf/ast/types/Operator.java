package com.blommesteijn.uva.sc.saf.ast.types;

import com.blommesteijn.uva.sc.saf.utils.StringUtil;
import com.blommesteijn.uva.sc.saf.ast.types.values.EOperator;
import com.blommesteijn.uva.sc.saf.checkers.StaticCheckIssue;
import com.blommesteijn.uva.sc.saf.checkers.StaticCheckerResult;

/**
 * 
 * @author dblommesteijn
 * @since 31, jan 2012
 */
public class Operator extends AstNode
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6335726765327041223L;


	public Operator(int line, String ident)
	{
		super();
		_line = line;
		_ident = ident;
	}
	
	/**
	 * Perform Static Check
	 * @param checker static result checker reference
	 */
	@Override
	public void staticCheck(StaticCheckerResult result)
	{		
		//has a valid ident value
		if(!this.isValidIdent())
		{
			StaticCheckIssue e = new StaticCheckIssue(this, "invalid ident");
			result.append(e);
		}	
	}
	
	/**
	 * Is the Ident valid
	 * @return invalid/valid ident
	 * @throws StaticCheckIssue
	 */
	private boolean isValidIdent()
	{
		boolean found = false;
		// map ident to property
		for (EOperator ident : EOperator.values())
		{
			if (ident.getIdent().equals(_ident))
			{
				found = true;
				break;
			}
		}
		return found;
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
		
		//append name and value
		sb.append(indent).append(Property.IDENT_PNAME).append(_ident).append(StringUtil.NEW_LINE);
		
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


