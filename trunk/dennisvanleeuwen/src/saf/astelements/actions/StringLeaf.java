package saf.astelements.actions;

import saf.ISAFNodeVisitor;
import saf.astelements.IAction;

public class StringLeaf implements IAction{
	private String nodeName;
	
	public StringLeaf(String nodeName){
		this.nodeName = nodeName;
	}
	
	public String getNodeName(){
		return this.nodeName;
	}
	
	public void accept(ISAFNodeVisitor visitor){
		visitor.visit(this);
	}
}