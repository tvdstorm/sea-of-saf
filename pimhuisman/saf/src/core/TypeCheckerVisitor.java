package core;
import java.util.List;
import java.util.LinkedList;

import data.Actions;
import data.AndStatement;
import data.Behaviour;
import data.Characteristic;
import data.Fighter;
import data.OrStatement;
import data.Personality;
import data.Rule;
import data.SingleCondition;

public class TypeCheckerVisitor extends BaseTreeVisitor {

	private List<String> errors;
	
	public TypeCheckerVisitor() {
		errors = new LinkedList<String>();
	}
	
	public List<String>getErrors() {
		return errors;
	}
	
	public void printErrorsInConsole() {
		for ( String error : errors ) {
			System.err.println(error);
		}
	}
	
	@Override
	public void visit(Fighter fighter) {

	}

	@Override
	public void visit(Personality personality) {

	}

	@Override
	public void visit(Behaviour behaviour) {

	}

	@Override
	public void visit(Characteristic characteristic) {
		String name = characteristic.getName();
		int value = characteristic.getValue();
		if ( value < 0 ) {
			errors.add("Characteristic value may not be below zero for: "+name+" (actual value: "+value+")");
		} else if ( value > 9 ) {
			errors.add("Characteristic value may not be above nine for: "+name+" (actual value: "+value+")");
		}
	}

	@Override
	public void visit(Rule rule) {

	}
	
	@Override
	public void visit(AndStatement andStatement) {
		
	}
	
	@Override
	public void visit(OrStatement orStatement) {
		
	}

	@Override
	public void visit(SingleCondition condition) {
				
	}

	@Override
	public void visit(Actions action) {
		
	}

}
