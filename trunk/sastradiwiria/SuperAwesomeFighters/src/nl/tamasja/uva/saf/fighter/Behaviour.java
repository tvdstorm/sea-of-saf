package nl.tamasja.uva.saf.fighter;

import java.util.ArrayList;
import java.util.List;

import nl.tamasja.uva.saf.fighter.action.IBehaviourAction;

public class Behaviour {
	
	private List<BehaviourRule> rules;
	
	private BehaviourRule currentAction;
	
	public Behaviour() {
		this.rules = new ArrayList<BehaviourRule>();
	}
	
	public void AddRule(BehaviourRule rule) {
		this.rules.add(rule);
	}
	
	public void decideBehaviour(FighterBot self, FighterBot target) {
		
		 for(BehaviourRule rule : rules) {
			 if(rule.evaluate(self)) {
				 rule.execute(self);
				 currentAction = rule;
				 break;
			 }
		 }

	}

	public BehaviourRule getCurrentRule() {
		return currentAction;
	}
	
}
