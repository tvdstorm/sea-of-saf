package util;

import model.Action;
import model.Arena;
import model.Behaviour;
import model.Characteristic;
import model.Condition;
import model.Fighter;
import model.NameFighter;
import model.Personality;

public class ConcreteVisitor1 extends Visitor implements Configuration{
	public void visit(Arena arena) {
	}
	
	public void visit(Action action) {
	}
	
	public void visit(Characteristic characteristic) {
	}

	public void visit(Condition condition) {
	}
	
	public void visit(Fighter fighter) {
		for (Personality personality: fighter.getPersonality()) {
			personality.accept(this);
		}
		for (Behaviour behaviour: fighter.getBehaviours()) {
			behaviour.accept(this);
		}
//		for (Strength strength: fighter.getStrengths()) {
//			strength.accept(this);
//		}
//		for (Behavior behavior: fighter.getBehaviors()) {
//			behavior.accept(this);
//		}
	}
	
	public void visit(Personality personality) {
	}
	
	public void visit(Behaviour behaviour) {
	}

	public void visit(NameFighter NameFighter) {
	}
}
