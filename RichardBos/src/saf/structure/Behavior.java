package saf.structure;

import java.util.ArrayList;
import java.util.List;

import saf.checker.Element;
import saf.checker.ElementVisitor;


public class Behavior implements Element {
	public Behavior(Condition condition)
	{
		this.condition = condition;
		moveActions = new ArrayList<Action>();
		fightActions = new ArrayList<Action>();
	}
	
    public void accept(ElementVisitor visitor) {
        visitor.visit(this);
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
	
	/*
	public enum MoveType
	{
		walk_towards,
		walk_away,
		run_towards,
		run_away,
		jump,
		crouch,
		stand
	}
	public enum FightType
	{
		block_low,
		block_high,
		punch_low,
		punch_high,
		kick_low,
		kick_high
	}
	public enum ConditionType
	{
		always,
		near,
		far,
		much_stronger,
		stronger,
		even,
		weaker,
		much_weaker
	}
	*/
}
