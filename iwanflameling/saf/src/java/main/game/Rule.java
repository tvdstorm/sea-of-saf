package game;

import java.util.Set;

import ast.fighter.Behavior;

public class Rule {
	
	public Object[] toArray() {
		return conditions.toArray();
	}

	private Set<String> conditions;
	private Behavior behavior;
	
	public Rule(Set<String> conditions, Behavior behavior){
		this.conditions = conditions;
		this.behavior = behavior;
	}

	public Set<String> getConditions() {
		return conditions;
	}

	public Behavior getBehavior() {
		return behavior;
	}

	public boolean addCondition(String e) {
		return conditions.add(e);
	}

	public int size() {
		return conditions.size();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Rule){
			return this.equals((Rule)obj);
		}
		else return false;
	}
	
	public boolean equals(Rule rule){
		return this.conditions.equals(rule.getConditions());
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Rule{");
		if(this.conditions != null){
			sb.append("\nConditions: [");
			sb.append(conditions.toString());
			sb.append("]");
		}
		if(this.behavior != null){
			sb.append("\nBehavior: [moveAction: ");
			sb.append(behavior.getMoveAction());
			sb.append("], [fightAction: ");
			sb.append(behavior.getFightAction());
			sb.append("]");
		}
		sb.append("}\n");
		return sb.toString();
	}
	
}
