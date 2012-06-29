package util;

import model.And;
import model.Behaviour;
import model.Characteristic;
import model.ChooseAction;
import model.ConditionType;
import model.FightAction;
import model.Fighter;
import model.MoveAction;
import model.Or;

public abstract class Visitor {
	public void visit(Fighter fighter){};
	public void visit(Behaviour behavior){};
	public void visit(Characteristic characteristic){};
	public void visit(ConditionType conditionType){};
	public void visit(Or or){};
	public void visit(And and){};
	public void visit(ChooseAction chooseAction){};
	public void visit(MoveAction moveAction){};
	public void visit(FightAction fightAction){};
}	