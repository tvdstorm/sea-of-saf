package com.blommesteijn.uva.sc.saf.ast.types;

import java.util.LinkedList;
import java.util.List;

import com.blommesteijn.uva.sc.saf.utils.StringUtil;
import com.blommesteijn.uva.sc.saf.ast.SerialNode;
import com.blommesteijn.uva.sc.saf.ast.types.values.EStrength;
import com.blommesteijn.uva.sc.saf.checkers.StaticCheckIssue;
import com.blommesteijn.uva.sc.saf.checkers.StaticCheckerResult;

public class Fighter extends AstNode
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -918648162127106598L;

	public static final String IDENT_PNAME = "ident: ";

	private List<Property> _properties = new LinkedList<Property>();
	private List<Behaviour> _behaviours = new LinkedList<Behaviour>();


	/**
	 * 
	 * @param line
	 * @param ident
	 */
	public Fighter(int line, String ident)
	{
		super();
		_line = line;
		_ident = ident;
	}
	
	/**
	 * 
	 * @param property
	 */
	public void append(Property property)
	{
		_properties.add(property);
	}
	
	public void append(Behaviour behaviour)
	{
		_behaviours.add(behaviour);
	}
	

	public List<Property> getProperties()
	{
		return _properties;
	}
	
	public List<Behaviour> getBehaviour()
	{
		return _behaviours;
	}

	
	/**
	 * Perform Static Check
	 * @param checker static result checker reference
	 */
	@Override
	public void staticCheck(StaticCheckerResult result)
	{	
		//register itself (entry point)
		super.register(this);
		
		//visit all nested nodes
		for (AstNode node : this.getNodes())
		{
			node.staticCheck(result);
			node.register(this);
		}
		
		//check for properties, of none found create new one
		boolean found = false;
		for(EStrength strength : Property.STRENGTHS)
		{
			found = false;
			for(Property p : _properties)
			{
				if(strength.equals(p.getIdent()))
				{
					found = true;
					break;
				}
			}
			//not found, create new property
			if (!found)
			{
				_properties.add(new Property(
						strength.getIdent(),
						Property.DEFAULT_VALUE));
			}
		}
		//Instantiate properties
		this.loadProperties();
		
		//test behaviour
		if(_behaviours.size() <= 0)
			result.append(new StaticCheckIssue(this, "no behaviour(s) found"));
	}
	
	/**
	 * Load fighter specific properties
	 */
	private void loadProperties()
	{
		//get properties
		double punchPower = this.getProperty(EStrength.PUNCH_POWER).getValue();
		double kickPower = this.getProperty(EStrength.KICK_POWER).getValue();
		double punchReach = this.getProperty(EStrength.PUNCH_REACH).getValue();
		double kickReach = this.getProperty(EStrength.KICK_REACH).getValue();
		//calculate new values
		double weight = (punchPower + kickPower) / 2;
		double height = (punchReach + kickReach) / 2;
		double speed = 0.5 * (height - weight);
		//create new properties
		this.append(new Property("weight", weight));
		this.append(new Property("height", height));
		this.append(new Property("speed", speed));
	}
	
	/**
	 * 
	 * @param ident
	 * @return
	 */
	private Property getProperty(EStrength ident)
	{
		Property ret = null;
		for(Property p : _properties)
		{
			if(p.getIdent().equals(ident.getIdent()))
			{
				ret = p;
				break;
			}
		}
		return ret;
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
		sb.append(indent).append(Fighter.IDENT_PNAME).append(_ident);
		sb.append(StringUtil.NEW_LINE);			
		
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
