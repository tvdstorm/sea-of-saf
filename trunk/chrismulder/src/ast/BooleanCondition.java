package ast;

import java.util.ArrayList;
import java.util.List;

public abstract class BooleanCondition implements Condition {
	protected ArrayList<Condition> conditions;
	
	public BooleanCondition() {
		conditions = new ArrayList<Condition>();
	}
	
	public void addCondition(Condition c) {
		conditions.add(c);
	}
	
	@Override
	public ConditionAtom.Type getType() {
		return conditions.get(0).getType();
	}
	
	@Override
	public void validate(List<String> messages) {
		for(Condition c : conditions) {
			c.validate(messages);
		}
	}
}
