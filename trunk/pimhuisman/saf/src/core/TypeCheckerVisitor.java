package core;

import java.util.List;
import java.util.LinkedList;
import data.*;

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
		if ( fighter.getPersonality() == null ) {
			errors.add("The personality of a fighter must be specified.");
		}
		if ( fighter.getBehaviour() == null ) {
			errors.add("The behaviour of a fighter must be specified.");
		}
	}

	@Override
	public void visit(Personality personality) {
		
	}

	@Override
	public void visit(Behaviour behaviour) {
		boolean foundAlwaysRule = false;
		List<Rule> rules = behaviour.getRules();
		for ( Rule rule : rules ) {
			Condition condition = rule.getCondition();
			if ( condition instanceof SingleCondition ) {
				if ( ((SingleCondition)condition).getName() == "always" ) {
					foundAlwaysRule = true;
				}
			}
		}
		if ( !foundAlwaysRule ) {
			errors.add("The rule 'always' should always be specified");
		}
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
