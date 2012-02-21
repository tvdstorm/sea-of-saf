package saf;

import test.SafInterface;
import test.SafVisitor;

public class BehaviourRule implements SafInterface {
	private Condition condition;
	private WalkAction walkaction;
	private FightAction fightaction;
	
	public BehaviourRule() {
		
	}
	
	public BehaviourRule(Condition c, WalkAction ma, FightAction fa) {
		this.condition = c;
		this.walkaction = ma;
		this.fightaction = fa;	
	}
	
	public Condition getCondition() {
		return this.condition;
	}
	
	public WalkAction getWalkAction() {
		return this.walkaction;
	}
	
	public FightAction getFightAction() {
		return this.fightaction;
	}
	
	@Override
	public void accept(SafVisitor visitor) {
		this.condition.accept(visitor);
		this.walkaction.accept(visitor);
		this.fightaction.accept(visitor);
		visitor.visit(this);
	}
}
