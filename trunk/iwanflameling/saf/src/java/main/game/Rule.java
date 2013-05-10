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

	public boolean add(String e) {
		return conditions.add(e);
	}

	public int size() {
		return conditions.size();
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.equals((Rule)obj);
	}
	
	public boolean equals(Rule rule){
		return this.conditions.equals(rule.getConditions());
	}
	
	

}
