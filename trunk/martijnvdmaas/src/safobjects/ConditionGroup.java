package safobjects;

import java.util.ArrayList;

public class ConditionGroup 
{
	private ArrayList<String> conditionTypes;
	
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
	
	public ArrayList<String> getConditionTypes() 
	{
		return conditionTypes;
	}

	public void setConditionTypes(ArrayList<String> conditionTypes) 
	{
		this.conditionTypes = conditionTypes;
	}
}
