package saf.entities;

import java.util.Set;

import net.sf.oval.constraint.NotEmpty;
import net.sf.oval.constraint.NotNull;
import net.sf.oval.guard.Guarded;

@Guarded
public class ConcreteCondition extends Condition {
	@NotNull
	private ConditionType condition;
	
	public ConcreteCondition( ConditionType condition) {
		this.condition = condition;
	}
	

	@Override
	public boolean matched(@NotNull @NotEmpty Set<ConditionType> currentConditions) {
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
