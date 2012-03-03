package model;

import util.Visitor;

public class FightAction extends Action{

	private final String fightActionName;

	public FightAction(String fightActionName) {
		this.fightActionName = fightActionName;
	}
	
	public String getName() {
		return fightActionName;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
