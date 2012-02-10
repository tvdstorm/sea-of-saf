package saf.ast;

import saf.ast.base.BehaviorItem;

public class Condition extends BehaviorItem{
	private String name;
	
	public void setName(String n){ this.name = n; }
	
	public String getName(){ return this.name; }
	public String toString() {
		return "\n\t\tCondition: " + name; 
	}
	
	@Override
	public boolean keywordIsValid() {
		try {
			saf.ast.enums.AvailableConditions.valueOf(name.toUpperCase());
		} catch(Exception e) {
			return false;
		}
		return true;
	}
}
