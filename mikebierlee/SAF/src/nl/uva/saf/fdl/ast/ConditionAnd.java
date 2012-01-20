package nl.uva.saf.fdl.ast;

import java.util.List;

public class ConditionAnd extends BooleanExpression<String> {
	public ConditionAnd(List<String> operands) {
		super(operands);
	}
}
