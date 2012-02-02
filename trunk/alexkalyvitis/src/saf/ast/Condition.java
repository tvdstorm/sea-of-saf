package saf.ast;

import saf.ast.base.BehaviorItem;

public class Condition extends BehaviorItem{
	private String name;
	
	public void setName(String n){ this.name = n; }
	
	public String getName(){ return this.name; }
	public String getCondition() {
		return "\n\t\tCondition: " + name; 
	}
}
