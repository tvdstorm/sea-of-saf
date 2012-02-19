package ast;

import java.util.List;

public class Strength implements Validator {
	private String typeName;
	private Type type;
	private int value;
	
	public static int DEFAULT_VALUE = 5;

	public static enum Type {
		PUNCHREACH,
		KICKREACH,
		KICKPOWER,
		PUNCHPOWER
	}
	
	public Strength(String type, int value) {
		this.typeName = type;
		this.value= value;
	}

	@Override
	public List<String> validate(List<String> messages) {
		try {
			type = Type.valueOf(typeName.toUpperCase());
		} catch (IllegalArgumentException e) {
			messages.add(typeName + " is not a valid strength.");
		}
		
		if (value < 1 || value > 10) {
			messages.add(value + " is not a valid strength value. Must be between 1 and 10.");
		}
		return messages;
	}
	
	public String toString() {
		return typeName + ":" + value;
	}
	
	public Type getType() {
		return type;
	}

	public int getValue() {
		return value;
	}
}
