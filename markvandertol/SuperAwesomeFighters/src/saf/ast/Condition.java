package saf.ast;

import java.util.List;
import java.util.Set;

/**
 * Condition for an action. Determines when the condition holds for the given state.
 */
public abstract class Condition {

	/**
	 * 
	 * @param currentStates states to match to
	 * @return whether the condition matches with the given current states.
	 */
	public abstract boolean matched(Set<State> currentStates);
	
	public abstract void validate(List<String> errorList);
}
