package util;

import model.*;

public interface Visitor {

	public void visit(Fighter fighter);
	
	public void visit(Behaviour behavior);
	public void visit(Characteristic characteristic);
	
	public void visit(ConditionType conditionType);
	
	public void visit(ChooseAction chooseAction);
	public void visit(MoveAction moveAction);
	public void visit(FightAction fightAction);
	
}	