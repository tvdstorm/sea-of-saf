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
	
	public List<String> validate(List<String> messages) {
		for(Condition c : conditions) {
			messages = c.validate(messages);
		}
		return messages;
	}
	
	public ConditionAtom.Type getType() {
		return conditions.get(0).getType();
	}
}
