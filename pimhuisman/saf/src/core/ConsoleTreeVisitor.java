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

	//@Override
	//public void visit(Condition condition) {
	//	printWhitespace();
	//	System.out.println("Condition");
	//}
	
	@Override
	public void visit(AndStatement andStatement) {
		printWhitespace();
		System.out.println("And statement");
	}

	@Override
	public void visit(OrStatement orStatement) {
		printWhitespace();
		System.out.println("Or statement");
	}

	@Override
	public void visit(SingleCondition condition) {
		printWhitespace();
		System.out.println("Single condition Name=" + condition.getName());
	}
	
	@Override
	public void visit(Actions action) {
		printWhitespace();
		//System.out.println(action.getMoveOptions().toString());
		//System.out.println(action.getAttackOptions().toString());
	}

}
