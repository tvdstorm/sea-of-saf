package data;

public class Characteristic {

	private final String name;
	private final int value;
	
	public Characteristic(String name, int value) {
		this.name = name;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public int getValue() {
		return value;
	}
	
}
