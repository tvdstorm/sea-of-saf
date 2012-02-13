package saf;

public class Strength {
	
	private String characteristic;
	private String value;
	
	public Strength(String c, String v) {
		this.characteristic = c;
		this.value = v;
		System.out.println("Strength created");
	}
	
	public String getCharacteristic() {
		return this.characteristic;
	}
	
}
