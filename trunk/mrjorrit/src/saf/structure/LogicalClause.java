package saf.structure;

import java.util.List;

public abstract class LogicalClause extends Logical {
	protected Logical leftHandSide = null;
	protected Logical rightHandSide = null;
	
	public Logical getLeftHandSide() {
		return leftHandSide;
	}
	public Logical getRightHandSide() {
		return rightHandSide;
	}
	
	@Override
	public List<String> check(){
		
		addErrors(leftHandSide.check());
		addErrors(rightHandSide.check());
		
		//Needs refactoring
		//Check for unneccesary always conditions in LogicalClauses
		if(leftHandSide instanceof LogicalSimple && ((LogicalSimple) leftHandSide).getCondition() == Condition.always)
			addError("Found an 'always' statement in a LogicalClause");
		
		if(rightHandSide instanceof LogicalSimple && ((LogicalSimple) rightHandSide).getCondition() == Condition.always)
			addError("Found an 'always' statement in a LogicalClause");
		
		return getErrors();
	}
}