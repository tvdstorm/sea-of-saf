package saf.ast;

import java.util.List;
import java.util.Set;

/**
 * A conditions that looks for one specific State.
 */

public class ConcreteCondition extends Condition {

	private State state;
	
	/**
	 * 
	 * @param state
	 */
	public ConcreteCondition(State state) {
		this.state = state;
	}
	

	/**
	 * @return whether currentStates contains the state of this instance.
	 */
	@Override
	public boolean matched(Set<State> currentStates) {
		return currentStates.contains(state);
	}

	/**
	 * @return the current state
	 */
	public State getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(State state) {
		this.state = state;
	}


	@Override
	public void validate(List<String> errorList) {
		if (state == null)
			errorList.add("condition not set");
	}

}
