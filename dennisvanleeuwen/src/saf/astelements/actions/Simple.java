package saf.astelements.actions;

import saf.ISAFElementVisitor;
import saf.astelements.IAction;

public class Simple implements IAction{
	private String name;
	
	public Simple(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void accept(ISAFElementVisitor visitor){
		visitor.visit(this);
	}
}