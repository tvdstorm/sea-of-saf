package com.blommesteijn.uva.sc.saf.ast.types;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.blommesteijn.uva.sc.saf.utils.StringUtil;
import com.blommesteijn.uva.sc.saf.ast.SerialNode;
import com.blommesteijn.uva.sc.saf.checkers.StaticCheckIssue;
import com.blommesteijn.uva.sc.saf.checkers.StaticCheckerResult;

import edu.emory.mathcs.backport.java.util.Arrays;

public class Fighter extends AstNode
{
	private static final long serialVersionUID = 5706847103982971950L;
	private final String _name;
	private final List<Property> _properties;
	private final List<Behaviour> _behaviours;
	
	//predefined properties
	protected static Map<String, Property> __allPresetProperties = getAllProperties();
	
	/**
	 * Get all properties (pre-populate)
	 * @return list of properties
	 */
	private static Map<String, Property> getAllProperties()
	{
		Map<String, Property> ret = new HashMap<String, Property>();
		ret.put("punchPower", new Property("punchPower", 5.0));
		ret.put("punchReach", new Property("punchReach", 5.0));
		ret.put("kickReach", new Property("kickReach", 5.0));
		ret.put("kickPower", new Property("kickPower", 5.0));
		return ret;
	}

	/**
	 * 
	 * @param line
	 * @param name
	 */
	public Fighter(int line, String name)
	{
		super(line);
		_name = name;
		_properties = new LinkedList<Property>();
		_behaviours = new LinkedList<Behaviour>();
	}
	
	public String getName()
	{
		return _name;
	}

	public void addProperties(List<Property> properties) 
	{
		_properties.addAll(properties);
		this.addMissingProperties();
	}
	
	public double getReach()
	{
		double val = 0;
		for(Property property : _properties)
		{	
			double newVal = property.getValue();
			if(property.isReach() && val < newVal)
				val = newVal;
		}
		return val;
	}
	
	public double getStrength()
	{
		double val = 0;
		for(Property property : _properties)
		{	
			double newVal = property.getValue();
			if(property.isPower() && val < newVal)
				val = newVal;
		}
		return val;
	}

	private void addMissingProperties()
	{
		for(Entry<String, Property> preset : __allPresetProperties.entrySet())
		{
			Property p = preset.getValue();
			if(_properties.contains(p))
				continue;
			_properties.add(p);
		}
	}

	public void addBehaviours(List<Behaviour> behaviours) 
	{
		_behaviours.addAll(behaviours);
	}

	public List<Behaviour> getBehaviours() 
	{
		return _behaviours;
	}
	
	protected void checkActions(StaticCheckerResult result)
	{
		//check if it has an always behaviour
		boolean hasAlways = false;
		for(Behaviour behaviour : _behaviours)
		{
			if(behaviour.getConditions().isValidCondition(
					Arrays.asList(new Condition[]{new Condition("always")})))
				hasAlways = true;
		}
		if(!hasAlways)
			result.append(new StaticCheckIssue(this, "always behaviour missing"));
		
		//check properties
		for(Property property : _properties)
			if(!__allPresetProperties.containsValue(property))
				result.append(new StaticCheckIssue(property, "incorrect property"));
	}
	
	
	@Override
	public void staticCheck(StaticCheckerResult result)
	{		
		//check self
		this.checkActions(result);
		//loop nested
		for(Property property : _properties)
			property.staticCheck(result);
		for(Behaviour behaviour : _behaviours)
			behaviour.staticCheck(result);
	}
	
	public String getDescription() 
	{
		return _name;
	}
	
	public String toString()
	{
		return this.toString("");
	}
	
	public String toString(String indent)
	{
		StringBuilder sb = new StringBuilder();
		//append typename
		sb.append(indent).append("[ ").append(this.getClass().getSimpleName());
		sb.append(": ").append(StringUtil.NEW_LINE);
		//append name and value
		sb.append(indent).append("name: ").append(_name);
		sb.append(StringUtil.NEW_LINE);		
		
		if(!_behaviours.isEmpty())
		{
			sb.append(indent).append("( ").append(StringUtil.NEW_LINE);
			for(Behaviour behaviour : _behaviours)
			{
				sb.append(behaviour.toString(indent + StringUtil.TAB));
			}
			sb.append(indent).append(")");
			sb.append(StringUtil.NEW_LINE);
		}
		if(!_properties.isEmpty())
		{
			sb.append(indent).append("( ").append(StringUtil.NEW_LINE);
			for(Property property : _properties)
			{
				sb.append(property.toString(indent + StringUtil.TAB));
			}
			sb.append(indent).append(")");
			sb.append("]");//.append(StringUtil.NEW_LINE);
		}
		
		
		sb.append(indent).append("]").append(StringUtil.NEW_LINE);
		return sb.toString();
	}
	
	public double getWeight()
	{
		double val = 0;
		for(Property property : _properties)
			if(property.isPower())
				val += property.getValue();
		return (val / 2);
	}
	
	public double getHeight()
	{
		double val = 0;
		for(Property property : _properties)
			if(property.isReach())
				val += property.getValue();
		return (val / 2);
	}

	public double getSpeed() 
	{
		double val = 0.5 * (this.getHeight() - this.getWeight());
		if(val < 1)
			val = 1;
		return val;
	}

	

}
