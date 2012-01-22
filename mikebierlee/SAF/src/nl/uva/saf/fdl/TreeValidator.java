package nl.uva.saf.fdl;

import nl.uva.saf.fdl.ast.Characteristic;
import nl.uva.saf.fdl.ast.ConditionAlways;
import nl.uva.saf.fdl.ast.ITreeNode;

public class TreeValidator extends TreeVisitor {
	private ValidationReport report = null;
	boolean alwaysConditionPresent = false; 
		
	public ValidationReport validate(ITreeNode tree) {
		report = new ValidationReport();
		alwaysConditionPresent = false;
		
		tree.accept(this);
		
		if (!alwaysConditionPresent) {
			addError("Behaviour missing for \"always\" condition.");
		}
		
		return report; 
	}
	
	@Override
	public void visit(Characteristic node) {		
		String type = node.getType();
		
		if (!type.equals("punchReach") &&
			!type.equals("punchPower") &&
			!type.equals("kickReach") &&
			!type.equals("kickPower")) {
			addWarning(type + ": unrecognized characteristic.");
		}
		
		int value = node.getValue();
		if (value < 1 || value > 10) {
			addError(type + ": value " + value + " out of bounds (range: 1-10)");
		}
		
		super.visit(node);
	}
	
	@Override
	public void visit(ConditionAlways node) {
		alwaysConditionPresent = true;		
		super.visit(node);
	}
	
	public void addWarning(String warning) {
		if (report != null) {
			report.addWarning(warning);
		}
	}
	
	public void addError(String error) {
		if (report != null) {
			report.addError(error);
		}
	}
}
