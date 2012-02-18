package saf;

import java.util.List;

import test.SafInterface;
import test.SafVisitor;

public class Personality implements SafInterface {
	
	private List<Strength> strenghts;

	public Personality() {
		System.out.println("Personality created");
	}
	
	public Personality(List<Strength> strenghts) {
		this.strenghts = strenghts;
	}
	
	public List<Strength> getStrengths() {
		return this.strenghts;
	}
	
	@Override
	public void accept(SafVisitor visitor) {
		for (Strength s : strenghts)
			visitor.visit(s);
		visitor.visit(this);
	}
}
