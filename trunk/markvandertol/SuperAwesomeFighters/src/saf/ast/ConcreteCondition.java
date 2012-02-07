package saf.ast;

import java.util.List;
import java.util.Set;

/**
 * A conditions that looks for one specific State.
 */

public class ConcreteCondition extends Condition {

	private final String state;
	
	public ConcreteCondition(String state) {
		this.state = state;
	}

	/**
	 * @return whether currentStates contains the state of this instance.
	 */
	@Override
	public boolean matched(Set<State> currentStates) {
		return currentStates.contains(getState());
	}

	public State getState() {
		try {
			return State.valueOf(state);
		} catch(IllegalArgumentException ex) {
			return null;
		}
	}


	@Override
	public void validate(List<String> errorList) {
		if (getState() == null)
			errorList.add("Unknown condition: " + state);
	}
}
