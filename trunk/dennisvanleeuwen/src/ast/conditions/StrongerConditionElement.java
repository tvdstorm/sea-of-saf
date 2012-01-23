package ast.conditions;

import saf.ISAFElementVisitor;
import ast.IConditionElement;

public class StrongerConditionElement implements IConditionElement{
	
	@Override
	public void accept(ISAFElementVisitor visitor) throws Exception {
		visitor.visit(this);
	}
}