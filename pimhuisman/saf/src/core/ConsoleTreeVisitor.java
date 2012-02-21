package core;

import data.Actions;
import data.AndStatement;
import data.Behaviour;
import data.Characteristic;
import data.Fighter;
import data.OrStatement;
import data.Personality;
import data.Rule;
import data.SingleCondition;

public class ConsoleTreeVisitor extends BaseTreeVisitor {

	private int depth;
	
	public ConsoleTreeVisitor() {
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

	}

	@Override
	public void visit(Personality personality) {
		depth = 1;
		printWhitespace();
		System.out.println("Personality");
	}

	@Override
	public void visit(Behaviour behaviour) {
		depth = 1;
		printWhitespace();
		System.out.println("Behaviour");
	}
	
	@Override
	public void visit(Characteristic characteristic) {
		depth = 2;
		printWhitespace();
		System.out.println("Characteristic Name=" + characteristic.getName() + " Value=" + characteristic.getValue());
	}
	
	@Override
	public void visit(Rule rule) {
		depth = 2;
		printWhitespace();
		System.out.println("Rule");
		depth += 1;
	}
	
	@Override
	public void visit(AndStatement andStatement) {
		printWhitespace();
		System.out.println("And statement");
		depth += 1;
	}

	@Override
	public void visit(OrStatement orStatement) {
		printWhitespace();
		System.out.println("Or statement");
		depth += 1;
	}

	@Override
	public void visit(SingleCondition condition) {
		printWhitespace();
		System.out.println("Single condition Name=" + condition.getName());
	}
	
	@Override
	public void visit(Actions action) {
		depth = 3;
		printWhitespace();
		System.out.println(action.getMoveOptions().toString());
		printWhitespace();
		System.out.println(action.getAttackOptions().toString());
	}

}
