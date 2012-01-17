package saf.entities;

import java.util.Set;

public class CombinedCondition extends Condition {
	
	private Condition condition1;
	private Condition condition2;
	
	private boolean requireBoth;
	
	
	/**
	 * @param condition1
	 * @param condition2
	 * @param requireBoth
	 */
	public CombinedCondition(Condition condition1, Condition condition2,
			boolean requireBoth) {
		super();
		this.condition1 = condition1;
		this.condition2 = condition2;
		this.requireBoth = requireBoth;
	}

	@Override
	public boolean matched(Set<ConditionType> currentConditions) {
		boolean c1 = condition1.matched(currentConditions);
		boolean c2 = condition2.matched(currentConditions);
		
		if (requireBoth)
			return c1 && c2;
		else
			return c1 || c2;
	}

	/**
	 * @return the condition1
	 */
	public Condition getCondition1() {
		return condition1;
	}


	/**
	 * @return the condition2
	 */
	public Condition getCondition2() {
		return condition2;
	}



	/**
	 * @return the requireBoth
	 */
	public boolean isRequireBoth() {
		return requireBoth;
	}


}
