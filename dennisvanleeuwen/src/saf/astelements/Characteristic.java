package saf.astelements;

import saf.ISAFNode;
import saf.ISAFNodeVisitor;

public class Characteristic implements ISAFNode{
	public String item;
	public int value;
	
	public Characteristic(String item, int value){
		this.item = item;
		this.value = value;
	}
	
	public String getItem() {
		return this.item;
	}

	public int getValue() {
		return this.value;
	}

	@Override
	public void accept(ISAFNodeVisitor visitor){
		visitor.visit(this);		
	}
}