package saf.ast;

public class Characteristic {

	private String type = "";
	private Integer value = 0;

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