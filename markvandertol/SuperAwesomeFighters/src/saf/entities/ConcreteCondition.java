package saf.entities;

import java.util.Set;

public class ConcreteCondition extends Condition {
	private ConditionType condition;
	
	public ConcreteCondition( ConditionType condition) {
		this.condition = condition;
	}
	

	@Override
	public boolean matched(Set<ConditionType> currentConditions) {
		return currentConditions.contains(condition);
	}

	/**
	 * @return the condition
	 */
	public ConditionType getCondition() {
		return condition;
	}

	/**
	 * @param condition the condition to set
	 */
	public void setCondition(ConditionType condition) {
		this.condition = condition;
	}

}
