package saf.ast;

import java.util.List;
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
		this.condition1 = condition1;
		this.condition2 = condition2;
		this.requireBoth = requireBoth;
	}

	/**
	 * When requiredBoth is set, returns true when both subconditions are true. When requiredBoth isn't set, returns 
	 * true when one or both of the conditions are true.
	 */
	@Override
	public boolean matched(Set<State> currentStates) {
		boolean c1 = condition1.matched(currentStates);
		boolean c2 = condition2.matched(currentStates);
		
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

	@Override
	public void validate(List<String> errorList) {
		if (condition1 == null || condition2 == null)
			errorList.add("Not all conditions set");
		else {
			condition1.validate(errorList);
			condition2.validate(errorList);
		}
	}


}
