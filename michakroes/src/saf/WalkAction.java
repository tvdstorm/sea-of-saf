package saf;

import java.util.List;
import checker.SafVisitor;

public class WalkAction extends Type {
	
	public WalkAction(String m) {
		super(m);
	}
	
	public WalkAction(List<String> walks) {
		super(walks);
	}
	
	@Override
	public void accept(SafVisitor visitor) {
		visitor.visit(this);
	}
}
