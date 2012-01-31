package ast;

public class Strength implements Validator {
	private String typeName;
	private Type type;
	private int value;

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
	public boolean validate() {
		try {
			type = Type.valueOf(typeName.toUpperCase());
		} catch (IllegalArgumentException e) {
			System.out.println(typeName + " is not a valid strength.");
			return false;
		}
		
		if (value < 1 || value > 10) {
			System.out.println(value + " is not a valid strength value. Must be between 1 and 10.");
			return false;
		}
		return true;
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
