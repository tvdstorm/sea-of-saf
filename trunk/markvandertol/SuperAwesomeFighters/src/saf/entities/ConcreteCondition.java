package saf.entities;

import java.util.Set;

import net.sf.oval.constraint.NotEmpty;
import net.sf.oval.constraint.NotNull;
import net.sf.oval.guard.Guarded;

/**
 * A conditions that looks for one specific State.
 */
@Guarded
public class ConcreteCondition extends Condition {
	@NotNull
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
	public boolean matched(@NotNull @NotEmpty Set<State> currentStates) {
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

}
