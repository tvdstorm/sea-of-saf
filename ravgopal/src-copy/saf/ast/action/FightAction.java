package saf.ast.action;

import java.util.List;

import saf.ast.util.Visitor;

public class FightAction extends Action {

	public FightAction(String fight) {
		super(fight);
	}
	
	public FightAction(List<String> fights) {
		super(fights);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
