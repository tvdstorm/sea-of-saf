package ast.actions;

import ast.actions.moveActions.IMoveAction;

public class ActionImpl implements IMoveAction{
	private String action;
	
	public ActionImpl(String action){
		this.action = action;
	}
	
	@Override
	public String getAction(){
		return this.action;
	}
	
	@Override
	public String toString(){
		return this.action + "\n";
	}
}