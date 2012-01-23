package ast.actions.fightActions;

import saf.ISAFElementVisitor;
import ast.IFightActionElement;

public class PunchLowFightActionElement implements IFightActionElement{

	@Override
	public void accept(ISAFElementVisitor visitor) throws Exception {
		visitor.visit(this);
	}
}