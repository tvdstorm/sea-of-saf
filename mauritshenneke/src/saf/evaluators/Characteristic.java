package saf.evaluators;

public class Characteristic {
	private String name;
	private Integer value;
	
	public Characteristic(String name, Integer value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}
	
	public Integer getValue(){
		return value;
	}
	
}