package saf;

import java.util.List;

import checker.SafVisitor;

public class FightAction extends Type {
	
	public FightAction(String m) { 
		super(m);
	}
	
	public FightAction(List<String> fights) {
		super(fights);
	}
	
	@Override
	public void accept(SafVisitor visitor) {
		visitor.visit(this);
	}
}
