package saf;

import java.util.List;
import java.util.Random;

import checker.SafInterface;

public abstract class Type implements SafInterface {
	private String type;
	private List<String> types;
	private Random randomGenerator;

	public Type(String t) {
		this.type = t;
	}
	
	public Type(List<String> t) {
		this.types = t;
		randomGenerator = new Random();
	}
	
	public String getType() {
		if (this.type != null)
			return this.type;
		else {
			return types.get(randomGenerator.nextInt(this.types.size()));   
		}
	}
}
