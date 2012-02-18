package saf;

import java.util.List;

import test.SafVisitor;

public class FightAction extends Type {
	
	public FightAction(String m) { 
		super(m);
		System.out.println("Fight: "  + m.toString());
	}
	
	public FightAction(List<String> fights) {
		super(fights);
	}
	
	@Override
	public void accept(SafVisitor visitor) {
		visitor.visit(this);
	}
}
