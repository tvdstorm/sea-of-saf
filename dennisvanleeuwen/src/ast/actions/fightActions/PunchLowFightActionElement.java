package ast.actions.fightActions;

import saf.ISAFElementVisitor;
import ast.actions.IFightActionElement;

public class PunchLowFightActionElement implements IFightActionElement{
	@Override
	public void accept(ISAFElementVisitor visitor){
		visitor.visit(this);
	}
}