package nl.uva.saf.fdl.ast;

import java.util.List;

public class ConditionOr extends BooleanExpression<ITreeNode> {

	public ConditionOr(List<ITreeNode> operands) {
		super(operands);
	}

}
