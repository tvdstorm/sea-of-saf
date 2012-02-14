package saf.astelements;

import saf.ISAFElement;
import saf.ISAFElementVisitor;

public class Characteristic implements ISAFElement{
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
	public void accept(ISAFElementVisitor visitor){
		visitor.visit(this);		
	}
}