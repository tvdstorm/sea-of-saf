package ast.actions.fightActions;

import saf.ISAFElementVisitor;
import ast.IFightActionElement;

public class KickLowFightActionElement implements IFightActionElement{

	@Override
	public void accept(ISAFElementVisitor visitor)  throws Exception{
		visitor.visit(this);
	}
}