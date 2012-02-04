package saf.ast;

import saf.ast.base.BehaviorItem;

public class Move extends BehaviorItem {
	private String name;
	private static final String[] availableMoves = { "jump", "crouch", "stand", "run_towards", "run_away", "walk_towards", "walk_away" };
	
	public Move(){
		this.name = "";
	}
	
	public Move(String n){
		this.name = n;
	}
	
	public String getName(){ return this.name; }
	
	public String[] getKeywords() { return availableMoves; }
}
