package nl.tamasja.uva.saf.fighter;

import nl.tamasja.uva.saf.fighter.action.*;
import nl.tamasja.uva.saf.fighter.condition.IBehaviourCondition;

public class BehaviourRule {
	private IBehaviourCondition condition;
	private IBehaviourAction fightAction;
	private IBehaviourAction moveAction;
	
	public BehaviourRule(IBehaviourCondition condition, IBehaviourAction moveAction,IBehaviourAction fightAction) {
		this.condition = condition;
		this.moveAction = moveAction;
		this.fightAction = fightAction;
	}
	
	public boolean evaluateAndExecute(FighterBot self) {
		boolean status = false;
		if(this.evaluate(self)) {
			status = true;
			this.execute(self);
		}
		return status;
		
	}
	
	public boolean evaluate(FighterBot self) {
		return condition.evaluate(self);
	}
	
	public void execute(FighterBot self) {

		moveAction.execute(self);
		fightAction.execute(self);
		
		//self.behaviour.setCurrentFightAction( (FightAction) fightAction);
		
		
		//return (FightAction) fightAction;
	}
	
	public FightAction_old getFightAction() {
		return (FightAction_old) fightAction;
	}
}