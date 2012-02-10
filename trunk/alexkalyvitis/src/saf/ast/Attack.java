package saf.ast;

import saf.ast.base.BehaviorItem;

public class Attack  extends BehaviorItem{
	private String name;
	
	public Attack(){
		this.name = "";
	}
	
	public Attack(String n){
		this.name = n;
	}
	
	public String getName(){ return this.name; }
	
	@Override
	public boolean keywordIsValid() {
		try {
			saf.ast.enums.AvailableAttacks.valueOf(name.toUpperCase());
		} catch(Exception e) {
			return false;
		}
		return true;
	}
}