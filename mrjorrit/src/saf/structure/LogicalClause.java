package saf.structure;

import java.util.ArrayList;

public abstract class LogicalClause extends Logical {
	private final Logical leftHandSide;
	private final Logical rightHandSide;
	
	protected LogicalClause(Logical leftHandSide, Logical rightHandSide)
	{
		this.leftHandSide = leftHandSide;
		this.rightHandSide = rightHandSide;
	}
	
	public Logical getLeftHandSide() {
		return leftHandSide;
	}
	public Logical getRightHandSide() {
		return rightHandSide;
	}
	
	public abstract boolean computeClause(boolean left, boolean right);
	
	@Override
	public ArrayList<String> check(){
		
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