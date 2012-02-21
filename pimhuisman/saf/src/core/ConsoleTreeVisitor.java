package core;

import data.*;

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
	public void visitFighter(Fighter fighter) {
		printWhitespace();
		System.out.println("Fighter Name=" + fighter.getName());

	}

	@Override
	public void visitPersonality(Personality personality) {
		depth = 1;
		printWhitespace();
		System.out.println("Personality");
	}

	@Override
	public void visitBehaviour(Behaviour behaviour) {
		depth = 1;
		printWhitespace();
		System.out.println("Behaviour");
	}
	
	@Override
	public void visitCharacteristic(Characteristic characteristic) {
		depth = 2;
		printWhitespace();
		System.out.println("Characteristic Name=" + characteristic.getName() + " Value=" + characteristic.getValue());
	}
	
	@Override
	public void visitRule(Rule rule) {
		depth = 2;
		printWhitespace();
		System.out.println("Rule");
		depth += 1;
	}
	
	@Override
	public void visitAndStatement(AndStatement andStatement) {
		printWhitespace();
		System.out.println("And statement");
		depth += 1;
	}

	@Override
	public void visitOrStatement(OrStatement orStatement) {
		printWhitespace();
		System.out.println("Or statement");
		depth += 1;
	}

	@Override
	public void visitSingleCondition(SingleCondition condition) {
		printWhitespace();
		System.out.println("Single condition Name=" + condition.getName());
	}
	
	@Override
	public void visitActions(Actions action) {
		depth = 3;
		printWhitespace();
		System.out.println(action.getMoveOptions().toString());
		printWhitespace();
		System.out.println(action.getAttackOptions().toString());
	}

}
