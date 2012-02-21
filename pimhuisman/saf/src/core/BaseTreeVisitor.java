package core;
import data.AndStatement;
import data.Fighter;
import data.OrStatement;
import data.Personality;
import data.Behaviour;
import data.Characteristic;
import data.Rule;
import data.Actions;
import data.SingleCondition;

public abstract class BaseTreeVisitor {

	public abstract void visitFighter(Fighter fighter);
	public abstract void visitPersonality(Personality personality);
	public abstract void visitBehaviour(Behaviour behaviour);
	public abstract void visitCharacteristic(Characteristic characteristic);
	public abstract void visitRule(Rule rule);
	public abstract void visitAndStatement(AndStatement andStatement);
	public abstract void visitOrStatement(OrStatement orStatement);
	public abstract void visitSingleCondition(SingleCondition condition);
	public abstract void visitActions(Actions action);
	
}
