package nl.tamasja.uva.saf.fighter;

import java.util.ArrayList;
import java.util.List;

import nl.tamasja.uva.saf.fighter.action.IBehaviourAction;
import nl.tamasja.uva.saf.fighter.action.FightAction_old;
import nl.tamasja.uva.saf.fighter.action.FightNone;

public class Behaviour {
	
	private List<BehaviourRule> rules;
	private FightAction_old currentFightAction;
	
	private BehaviourRule currentAction;
	
	public Behaviour() {
		this.rules = new ArrayList<BehaviourRule>();
		this.currentFightAction = new FightNone();
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
	
	public FightAction_old getCurrentFightAction() {
		return currentFightAction;
	}
	
	public void setCurrentFightAction(FightAction_old fightAction) {
		this.currentFightAction = fightAction;
	}
	
	public BehaviourRule getCurrentRule() {
		return currentAction;
	}
	
}
