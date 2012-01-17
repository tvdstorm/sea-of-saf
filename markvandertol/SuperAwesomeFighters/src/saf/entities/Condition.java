package saf.entities;

import java.util.Set;

public abstract class Condition {

	public abstract boolean matched(Set<ConditionType> currentConditions);
}
