package com.blommesteijn.uva.sc.saf.ast.types;

import java.util.Arrays;
import java.util.List;

import com.blommesteijn.uva.sc.saf.utils.StringUtil;
import com.blommesteijn.uva.sc.saf.ast.SerialNode;
import com.blommesteijn.uva.sc.saf.ast.types.exceptions.PropertyValueException;
import com.blommesteijn.uva.sc.saf.ast.types.values.EStrength;
import com.blommesteijn.uva.sc.saf.checkers.StaticCheckIssue;
import com.blommesteijn.uva.sc.saf.checkers.StaticCheckerResult;

public class Property extends AstNode
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5179564374566348170L;
	public static final String VALUE_PNAME = "value: ";
	public static final String IDENT_PNAME = "ident: ";
	
	public static final List<EStrength> STRENGTHS = Arrays.asList(EStrength.values());
	public static final int DEFAULT_VALUE = 5;

	
	private double _value = 0; 
	
	/**
	 * Property created from resource
	 * @param line
	 * @param ident
	 * @param value
	 */
	public Property(int line, String ident, int value)
	{
		super();
		_line = line;
		_ident = ident;
		_value = (double)value;
	}
	
	/**
	 * Property created by generator (default values)
	 * @param ident
	 * @param value
	 */
	public Property(String ident, int value)
	{
		super();
		_ident = ident;
		_value = (double)value;	
	}
	
	public Property(String ident, double value)
	{
		super();
		_ident = ident;
		_value = value;
	}

	
	public void register(AstNode astNode)
	{
		Fighter f = (Fighter) astNode;
		f.append(this);
	}
	
	/**
	 * Perform Static Check
	 * @param checker static result checker reference
	 */
	@Override
	public void staticCheck(StaticCheckerResult result)
	{	
		boolean found = false;
		for (EStrength ident : EStrength.values())
		{
			if (ident.getIdent().equals(_ident))
			{
				found = true;
				try
				{
					ident.testValue(getValue());
				}
				catch (PropertyValueException e)
				{
					result.append(new StaticCheckIssue(this, e.getMessage()));
				}
				break;
			}
		}
		//property not found
		if(!found)
			result.append(new StaticCheckIssue(this, "unknown property"));
	}

	/**
	 * @return the value
	 */
	public double getValue()
	{
		return _value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value)
	{
		_value = value;
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
		sb.append(indent).append(Property.VALUE_PNAME).append(_value).append(StringUtil.NEW_LINE);

		
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


