package saf;

import java.util.ArrayList;
import java.util.List;

import checker.SafInterface;
import checker.SafVisitor;

public class Behaviour implements SafInterface {
	
	private ArrayList<BehaviourRule> behaviourrules;
	
	public Behaviour(List<BehaviourRule> behaviourrules) {
		this.behaviourrules = (ArrayList<BehaviourRule>) behaviourrules;
	}
	
	public ArrayList<BehaviourRule> getRules() {
		return this.behaviourrules;
	}
	
	public BehaviourRule getCondition(String distanceState, String healthState) {
		for (BehaviourRule behaviourrule : behaviourrules) {
			Condition c = behaviourrule.getCondition();
			if (checkCondition(c, distanceState, healthState) )
				return behaviourrule;
		}
		return getAlwaysRule();	
	}
	
	public boolean checkCondition(Condition condition, String distanceState, String healthState) {
		if (condition instanceof ConditionAnd) {
			ConditionAnd conditionAnd = (ConditionAnd) condition;			
						
			if (checkCondition(conditionAnd.getLhs(), distanceState, healthState) && 
				checkCondition(conditionAnd.getRhs(), distanceState, healthState)) {
				return true;
			}
		}
		
		if (condition instanceof ConditionOr) {
			ConditionOr conditionOr = (ConditionOr) condition;			
						
			if (checkCondition(conditionOr.getLhs(), distanceState, healthState) || 
				checkCondition(conditionOr.getRhs(), distanceState, healthState)) {
				return true;
			}
		}
		
		if (condition instanceof ConditionAction) {
			ConditionAction conditionAction = (ConditionAction) condition; 
			
			if (conditionAction.getCondition().equals(distanceState) || 
				conditionAction.getCondition().equals(healthState) )
				return true;
		}

		return false;
	}
	
	public BehaviourRule getAlwaysRule() {
		for (BehaviourRule behaviourrule : behaviourrules) {
			
			Condition c = behaviourrule.getCondition();
			if (c instanceof ConditionAction) {
				ConditionAction conditionAction = (ConditionAction) c; 
				if ( conditionAction.getCondition().equals("always") )
					return behaviourrule;
			}
		}
		return new BehaviourRule();
	}

	
	@Override
	public void accept(SafVisitor visitor) {
		for(BehaviourRule br : behaviourrules) 
			br.accept(visitor);
		
		visitor.visit(this);
	}
}
