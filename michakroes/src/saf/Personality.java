package saf;

import java.util.List;

public class Personality {
	
	private List<Strength> strenghts;

	public Personality() {
		System.out.println("Personality created");
	}
	
	public Personality(List<Strength> strenghts) {
		this.strenghts = strenghts;
	}
}
