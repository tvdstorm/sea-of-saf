package saf.ast.definition;

import saf.ast.ASTNode;
import saf.ast.FighterVisitor;

public class Strength implements ASTNode {
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
	
	public Strength(String strengthName, int strengthValue)
	{
		this.name = strengthName;
		this.value = strengthValue;
	}

	@Override
	public void accept(FighterVisitor visitor) {
		visitor.visit(this);
	}
}
