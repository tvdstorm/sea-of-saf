package saf.structure;

import java.util.ArrayList;
import java.util.List;

import saf.checker.Element;
import saf.checker.ElementVisitor;
import saf.structure.intelligence.ActionIntelligence;


public class Behavior implements Element {
	public Behavior(Condition condition)
	{
		this.condition = condition;
		moveActions = new ArrayList<Action>();
		fightActions = new ArrayList<Action>();
	}
	
    public void accept(ElementVisitor visitor) {
        visitor.visit(this);
        for (Action action : this.getMoveAction()) {
			action.accept(visitor);
		}
        for (Action action : this.getFightAction()) {
			action.accept(visitor);
		}
        this.condition.accept(visitor);
    }
	
	private final Condition condition;
	private final List<Action> moveActions;
	private final List<Action> fightActions;
	
	public Condition getCondition() {
		return condition;
	}
	public List<Action>  getMoveAction() {
		return moveActions;
	}
	public List<Action>  getFightAction() {
		return fightActions;
	}
	public void addMoveAction(Action moveAction) {
		this.moveActions.add(moveAction);
	}
	public void addFightAction(Action fightAction) {
		this.fightActions.add(fightAction);
	}
	
	public String toString() {
		String strReturn = this.getCondition().toString();
		strReturn += " [" + ActionIntelligence.toString(this.getMoveAction()) + " ";
		strReturn += ActionIntelligence.toString(this.getFightAction()) + "]";
		return strReturn;
	}
}
