package saf.fighter;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Condition implements AST, FighterConfig {
	
	private String condition;
	private Action action;
	
	
	// Only the local classes may set condition to null 
	private Condition() {
		this.condition = null;
		this.action = null;
	}
	
	/** @require isValidValue(condition)*/
	public Condition(String condition, Action action) {
		assert VALID_CONDITIONS.contains(condition): "Requirement broken ("+condition+")";
		
		this.condition = condition;
		this.action = action;
	}
	
	public static Condition newAndCondition(List<Condition> children) {
		if(children.size()==1) {
			return children.get(0);
		}else {
			return new AndCondition(children);
		}
	}
	
	public static Condition newOrCondition(List<Condition> children) {
		if(children.size()==1) {
			return children.get(0);
		}else {
			return new OrCondition(children);
		}
	}

	public List<Action> getActions(Condition context) {
		if(condition.equals(ALWAYS_CONDITION) || context.entails(this)) {
			return new LinkedList<Action> (Arrays.asList(action));
		} else {
			return Collections.emptyList();
		}
	}
	
	public boolean entails(Condition condition) {
		return this.getName().equals(condition.getName());
	}
	
	public boolean equals(Object object) {
		if(object instanceof Condition) {
			return ((Condition) object).getName().equals(this.getName());
		}
		return false;
	}
	
	//--- Implementing AST ---
	public String getName() {
		return condition;
	}
	
	public List<AST> getChildren() {
		return Collections.emptyList();
	}
	
	
	//=== Inner classes ========================================================
	private abstract static class CompoundCondition extends Condition {
		
		protected List<Condition> conditions;
		
		public CompoundCondition(List<Condition> conditions) {
			super();
			this.conditions = conditions;
		}
		
		public abstract boolean entails(Condition condition);
		public abstract List<Action> getActions(Condition context);
		public abstract boolean equals(Object object);
		
		//--- Overriding AST methods ---
		public String getName() {
			return this.getClass().getSimpleName();
		}
		
		public List<AST> getChildren() {
			return new LinkedList<AST>(conditions);
		}
	}
	
	// Conditions combined with AND
	protected static class AndCondition extends CompoundCondition {

		public AndCondition(List<Condition> conditions) {
			super(conditions);
		}
		
		public boolean entails(Condition condition) {
			for(Condition child: conditions) {
				if(!child.entails(condition)) {
					return false;
				}
			}
			return true;
		}
		
		public List<Action> getActions(Condition context) {
			List<Action> actions = new LinkedList<Action>();
			for(Condition child: conditions) {
				actions.addAll(child.getActions(context));
			}

			if(actions.size() == conditions.size()) {
				return actions;
			}
			return Collections.emptyList();
		}
		
		public boolean equals(Object object) {
			if(object instanceof AndCondition) {
				return ((AndCondition) object).getChildren().equals(this.getChildren());
			}
			return false;
		}
		
	}
	
	// Conditions combined with OR
	protected static class OrCondition extends CompoundCondition {

		public OrCondition(List<Condition> conditions) {
			super(conditions);
		}
		
		public boolean entails(Condition condition) {
			for(Condition child: conditions) {
				if(child.entails(condition)) {
					return true;
				}
			}
			return false;
		}
		
		public List<Action> getActions(Condition context) {
			List<Action> actions = new LinkedList<Action>();
			for(Condition child: conditions) {
				actions.addAll(child.getActions(context));
			}

			if(actions.size() >= 1) {
				return actions;
			}
			return Collections.emptyList();
		}
		
		public boolean equals(Object object) {
			if(object instanceof OrCondition) {
				return ((OrCondition) object).getChildren().equals(this.getChildren());
			}
			return false;
		}
		
	}
	
}
