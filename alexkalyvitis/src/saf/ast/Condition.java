package saf.ast;

import saf.ast.base.BehaviorItem;

public class Condition extends BehaviorItem{
	private String name;
	private static final String[] availableConditions = { "stronger", "weaker", "much_stronger", "much_weaker", "even", "near", "far", "always" };
	
	public void setName(String n){ this.name = n; }
	
	public String getName(){ return this.name; }
	public String getCondition() {
		return "\n\t\tCondition: " + name; 
	}
	
	public String[] getKeywords() { return availableConditions; }
}
