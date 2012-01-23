package ast;

import saf.ISAFElement;
import saf.ISAFElementVisitor;

public class CharacteristicElement implements ISAFElement{
	public String item;
	public int value;
	
	public CharacteristicElement(){
		item = "";
		value = 0;
	}
	
	@Override
	public void accept(ISAFElementVisitor visitor) throws Exception{
		visitor.visit(this);		
	}
}