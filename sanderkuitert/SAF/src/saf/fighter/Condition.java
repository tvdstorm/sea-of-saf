package saf.fighter;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

class Condition implements AST {
	
	private String condition;
	private Action action;
	
	
	// For use in the local class CompoundCondition
	private Condition() {
		this.condition = null;
		this.action = null;
	}
	
	/** @require isValidValue(condition)*/
	public Condition(String condition, Action action) {
		assert VALID_CONDITIONS.contains(condition): "Requirement broken";
		
		this.condition = condition;
		this.action = action;
	}
	
	
	public Action getAction(Condition context) {
		if(condition.equals(ALWAYS_CONDITION) || context.entails(this)) {
			return action;
		} else {
			return null;
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
	
	
	//=== Inner class ========================================================
	public static class CompoundCondition extends Condition {
		
		private boolean andOperator;
		private List<Condition> conditions;
		
		/** 
		 * @param andOperator 	signals whether this condition requires ALL child conditions to hold (true),
		 * 							or at least ONE (false)
		 */
		public CompoundCondition(boolean andOperator, List<Condition> conditions) {
			super();
			this.andOperator = andOperator;
			this.conditions = conditions;
		}
		
		public boolean isAndCompound() {
			return andOperator;
		}
		
		public boolean equals(Object object) {
			if(object instanceof CompoundCondition) {
				CompoundCondition other = (CompoundCondition) object;
				return other.isAndCompound() == this.isAndCompound() && 
							other.getChildren().equals(this.getChildren());
			}
			return false;
		}
		
		public boolean entails(Condition condition) {
			for(Condition child: conditions) {
				if(child.entails(condition)) {
					return true;
				}
			}
			return false;
		}
		
		public Action getAction(Condition context) {
			int minimumValidActions; 
			if(andOperator) {
				minimumValidActions = conditions.size();
			} else {
				minimumValidActions = 1;
			}
			
			// Select actions from all possibilities; 
			//		hence don't stop looking when you got the minimum required
			List<Action> actions = new LinkedList<Action>();
			for(Condition child: conditions) {
				Action action = child.getAction(context);
				if(action!=null) {
					actions.add(action);
				}
			}

			if(actions.size() >= minimumValidActions) {
				return selectRandom(actions);
			}
			
			return null;
		}
		
		// @require actions.size() > 0
		private Action selectRandom(List<Action> actions) {
			assert actions.size() > 0: "Requirement broken!";
			return actions.get(new Random().nextInt(actions.size()));
		}
		
		//--- Overriding AST methods ---
		public String getValue() {
			String result = andOperator ? "AND-condition:\n" : "OR-condition:\n";
			for(Condition child: conditions) {
				result += child + "\n";
			}
			return result;
		}
		
		public List<AST> getChildren() {
			return new LinkedList<AST>(conditions);
		}
		
	}
	
}
