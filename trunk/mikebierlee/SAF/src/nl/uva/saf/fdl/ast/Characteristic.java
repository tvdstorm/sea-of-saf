package nl.uva.saf.fdl.ast;

public class Characteristic extends FighterAttribute {
	private String type;
	private int value;	
	
	public Characteristic(String type, String value) {
		setType(type);
		setValue(Integer.parseInt(value));
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
