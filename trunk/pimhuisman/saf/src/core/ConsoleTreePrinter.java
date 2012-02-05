package core;

import data.Behaviour;
import data.Characteristic;
import data.Fighter;
import data.Personality;
import data.Rule;

public class ConsoleTreePrinter extends BaseTreePrinter {

	private int depth;
	
	public ConsoleTreePrinter() {
		depth = 0;
	}
	
	private void printWhitespace() {
		for (int i=0; i<depth; i++) {
			System.out.print("   ");
		}
		if ( depth > 0 ) System.out.print("|- ");
	}
	
	@Override
	public void visit(Fighter fighter) {
		printWhitespace();
		System.out.println("Fighter Name=" + fighter.getName());
		depth += 1;
	}

	@Override
	public void visit(Personality personality) {
		printWhitespace();
		System.out.println("Personality");
		depth += 1;
	}

	@Override
	public void visit(Behaviour behaviour) {
		depth -= 1;
		printWhitespace();
		System.out.println("Behaviour");
		depth += 1;
	}
	
	@Override
	public void visit(Characteristic characteristic) {
		printWhitespace();
		System.out.println("Characteristic Name=" + characteristic.getName() + " Value=" + characteristic.getValue());
	}
	
	@Override
	public void visit(Rule rule) {
		printWhitespace();
		System.out.println("Rule");
	}

}
