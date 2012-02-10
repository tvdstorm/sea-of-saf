package saf.ast;

import saf.ast.base.BehaviorItem;

public class Move extends BehaviorItem {
	private String name;
	
	public Move(){
		this.name = "";
	}
	
	public Move(String n){
		this.name = n;
	}
	
	public String getName(){ return this.name; }
	
	@Override
	public boolean keywordIsValid() {
		try {
			saf.ast.enums.AvailableMoves.valueOf(name.toUpperCase());
		} catch(Exception e) {
			return false;
		}
		return true;
	}
}
