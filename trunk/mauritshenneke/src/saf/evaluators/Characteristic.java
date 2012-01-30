package saf.evaluators;

public class Characteristic {
	private String name;
	private Integer value;
	
	public Characteristic(String name, Integer value) {
		this.name = name;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Characteristic [name=" + name + ", value=" + value + "]\n";
	}
	
}