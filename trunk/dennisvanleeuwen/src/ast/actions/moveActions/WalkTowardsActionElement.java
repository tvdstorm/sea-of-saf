package ast.actions.moveActions;

import ast.IMoveActionElement;
import saf.ISAFElementVisitor;

public class WalkTowardsActionElement implements IMoveActionElement{
	@Override
	public void accept(ISAFElementVisitor visitor) throws Exception {
		visitor.visit(this);
	}
}