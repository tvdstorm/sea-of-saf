package saf.fighter;

import java.util.Collections;
import java.util.List;

class Property implements AST, FighterConfig {
	
	private String aspect;
	private Value value;
	
	
	public Property(String aspect) {
		this.aspect = aspect;
		this.value = new Value();
	}
	
	public Property(String aspect, int value) {
		this(aspect);
		this.value = new Value(value);
	}
	
	public Property(String aspect, int value, int min, int max) {
		this(aspect);
		this.value = new Value(value, min, max);
	}
	
	
	public int getValue() {
		return value.getValue();
	}
	
	public boolean isValidValue(int value) {
		return value >= this.value.getMin() && value <= this.value.getMax();
	}
	
	public boolean equals(Object object) {
		if(object instanceof Property) {
			Property other = (Property) object;
			return other.getName().equals(this.getName()) && 
						other.getValue() == this.getValue();
		}
		return false;
	}
	
	//--- Implementing AST ---
	public String getName() {
		return aspect;
	}
	
	public List<AST> getChildren(){
		return Collections.emptyList();
	}
	
	//=== Inner class ========================================================
	private class Value {
		
		private int value;
		private int min;
		private int max;
		
		
		public Value() {
			this.value = DEFAULT_PROPERTY_VALUE;
			this.min = DEFAULT_PROPERTY_MIN;
			this.max = DEFAULT_PROPERTY_MAX;
		}
		
		public Value(int value) {
			this();
			this.value = value;
		}
		
		public Value(int value, int min, int max) {
			this(value);
			this.min = min;
			this.max = max;
		}
		
		
		public int getValue() {
			return value;
		}

		public int getMin() {
			return min;
		}
		
		public int getMax() {
			return max;
		}
	}

}
