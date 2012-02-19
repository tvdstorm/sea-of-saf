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

	public abstract void visit(Fighter fighter);
	public abstract void visit(Personality personality);
	public abstract void visit(Behaviour behaviour);
	public abstract void visit(Characteristic characteristic);
	public abstract void visit(Rule rule);
	public abstract void visit(AndStatement andStatement);
	public abstract void visit(OrStatement orStatement);
	public abstract void visit(SingleCondition condition);
	public abstract void visit(Actions action);
	
}
