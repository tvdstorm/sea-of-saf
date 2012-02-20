package jsaf.astelements;

import java.util.ArrayList;
import java.util.List;

import visitor.SAFElement;
import visitor.SAFElementVisitor;

public class ConditionGroup implements SAFElement
{
	private List<String> conditionTypes;
	
	public ConditionGroup() 
	{
		conditionTypes = new ArrayList<String>();
	}

	public void addConditionType(String type) 
	{
		this.conditionTypes.add(type);
	}
	
	public String toString() 
	{
		String output = "";
		for(String conditionType :  conditionTypes) 
		{
			output += output == "" ? conditionType : " && " + conditionType;
		}
		output = "          conditionTypes: " + output;
		
		return "        Class: " + this.getClass().getName() + "\n" + output + "\n";
	}
	
	public List<String> getConditionTypes() 
	{
		return conditionTypes;
	}

	public void setConditionTypes(List<String> conditionTypes) 
	{
		this.conditionTypes = conditionTypes;
	}

	@Override
	public void accept(SAFElementVisitor visitor) throws Exception {
		visitor.visit(this);
	}
}
