package saf.ast;

public class Characteristic {

	private final String type;
	private final Integer value;

	public Characteristic(String type, Integer value) {
		this.type = type;
		this.value = value;
	}

	public String getType() {
		return this.type;
	}

	public Integer getValue() {
		return this.value;
	}

}