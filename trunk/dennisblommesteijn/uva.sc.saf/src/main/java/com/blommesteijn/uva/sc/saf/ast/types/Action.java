package com.blommesteijn.uva.sc.saf.ast.types;

import com.blommesteijn.uva.sc.saf.utils.StringUtil;
import com.blommesteijn.uva.sc.saf.ast.types.values.EAttack;
import com.blommesteijn.uva.sc.saf.ast.types.values.EMove;
import com.blommesteijn.uva.sc.saf.checkers.StaticCheckIssue;
import com.blommesteijn.uva.sc.saf.checkers.StaticCheckerResult;


public class Action extends AstNode
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3170318419612463544L;

	public static final String TYPE_PNAME = "type: ";

	private Class<?> _type = null;
	
	/**
	 * 
	 * @param line line number
	 * @param ident identify name
	 */
	public Action(int line, String ident)
	{
		super();
		_line = line;
		_ident = ident;
	}
	
	public void register(AstNode astNode)
	{
		Behaviour b = (Behaviour) astNode;
		b.append(this);
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
			result.append(new StaticCheckIssue(this, "invalid ident"));
		}	
	}
	
	/**
	 * Is the Ident valid
	 * @return invalid/valid ident
	 * @throws StaticCheckIssue
	 */
	private boolean isValidIdent()
	{		
		//movement
		for (EMove ident : EMove.values())
		{
			if (ident.getIdent().equals(_ident))
			{
				_type = EMove.class;
				break;
			}
		}
		
		//attack
		for (EAttack ident : EAttack.values())
		{
			if (ident.getIdent().equals(_ident))
			{
				_type = EAttack.class;
				break;
			}
		}
		
		return (this.isAttack() || this.isMove());
	}
	
	/**
	 * Is action an attack
	 * @return is attack
	 */
	public boolean isAttack()
	{
		if(_type == null)
			return false;
		try
		{
			_type.asSubclass(EAttack.class);
		}
		catch(ClassCastException e)
		{
			return false;
		}
		return true;
	}
	
	/**
	 * Is action a move
	 * @return is move
	 */
	public boolean isMove()
	{
		if(_type == null)
			return false;
		try
		{
			_type.asSubclass(EMove.class);
		}
		catch(ClassCastException e)
		{
			return false;			
		}
		return true;
	}
	
	
	/**
	 * String representation of current object
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
		if(_type != null)
			sb.append(indent).append(Action.TYPE_PNAME).append(_type.getSimpleName()).append(StringUtil.NEW_LINE);
		
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

