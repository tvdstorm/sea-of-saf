package core;
import data.Fighter;
import data.Personality;
import data.Behaviour;
import data.Characteristic;
import data.Rule;

public abstract class BaseTreeVisitor {

	public abstract void visit(Fighter fighter);
	public abstract void visit(Personality personality);
	public abstract void visit(Behaviour behaviour);
	public abstract void visit(Characteristic characteristic);
	public abstract void visit(Rule rule);
	
}
