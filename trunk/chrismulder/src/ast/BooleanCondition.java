package ast;

import java.util.ArrayList;

public abstract class BooleanCondition implements Condition {
	protected ArrayList<Condition> conditions;
	
	public BooleanCondition() {
		conditions = new ArrayList<Condition>();
	}
	
	public void addCondition(Condition c) {
		conditions.add(c);
	}
	
	public boolean validate() {
		for(Condition c : conditions) {
			if (!c.validate()) {
				return false;
			}
		}
		return true;
	}
	
	public ConditionAtom.Type getType() {
		return conditions.get(0).getType();
	}
}
