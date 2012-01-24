package ast.conditions;

import saf.ISAFElementVisitor;
import ast.IConditionElement;

public class EvenConditionElement implements IConditionElement{
	
	@Override
	public void accept(ISAFElementVisitor visitor){
		visitor.visit(this);
	}
}