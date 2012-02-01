package core;
import data.Fighter;
import data.Personality;
import data.Behaviour;
import data.Characteristic;

public abstract class BaseTreePrinter {

	public abstract void visit(Fighter fighter);
	public abstract void visit(Personality personality);
	public abstract void visit(Behaviour behaviour);
	public abstract void visit(Characteristic characteristic);
	
}
