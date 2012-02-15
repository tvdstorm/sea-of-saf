package saf.astelements.actions;

import saf.ISAFNodeVisitor;
import saf.astelements.IAction;

public class Simple implements IAction{
	private String nodeName;
	
	public Simple(String nodeName){
		this.nodeName = nodeName;
	}
	
	public String getNodeName(){
		return this.nodeName;
	}
	
	public void accept(ISAFNodeVisitor visitor){
		visitor.visit(this);
	}
}