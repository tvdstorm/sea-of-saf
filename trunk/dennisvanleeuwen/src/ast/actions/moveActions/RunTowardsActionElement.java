package ast.actions.moveActions;

import ast.IMoveActionElement;
import saf.ISAFElementVisitor;

public class RunTowardsActionElement implements IMoveActionElement{
	@Override
	public void accept(ISAFElementVisitor visitor) throws Exception {
		visitor.visit(this);
	}
}