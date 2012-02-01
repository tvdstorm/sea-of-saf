package saf.ast;

import saf.checker.*;
import Game.Interpreter;

/**
 * The StrengthAssignment object holds the "variable name" and the "variable value" of an assignment.
 * The object allows an EvaluationManager and Interpreter object to visit.
 * 
 * @author huyhoang
 */
public class StrengthAssignment implements Statement
{
	private String name;
	public String getName()
	{
		return this.name;
	}
	
	private int value;
	public int getValue()
	{
		return this.value;
	}
	
	public StrengthAssignment(String strengthName, int strengthValue)
	{
		this.name = strengthName;
		this.value = strengthValue;
	}

	@Override
	public void accept(FighterVisitor visitor) {
		visitor.visit(this);
	}
}
