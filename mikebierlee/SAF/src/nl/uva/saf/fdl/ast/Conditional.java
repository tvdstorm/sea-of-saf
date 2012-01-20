package nl.uva.saf.fdl.ast;

import java.util.ArrayList;
import java.util.List;

public abstract class Conditional<T> extends TreeNode {
	private List<T> operands;
	
	public Conditional(List<T> operands) {
		setOperands(operands);
	}
	
	public Conditional(ArrayList<T> operands) {
		setOperands(operands);
	}

	public List<T> getOperands() {
		return operands;
	}

	public void setOperands(List<T> operands) {
		this.operands = operands;
	}
	
	public void addOperand(T operand) {
		if (operands != null) {
			operands.add(operand);
		}
	}
}
