package saf.ast.condition;

import java.util.List;

public class And extends Composit {

	public And(Condition lhs, Condition rhs) {
		super(lhs, rhs);
	}

	@Override
	public Boolean match(List<String> tokens) {
		return this.getFirstCondition().match(tokens)
				&& this.getSecondCondition().match(tokens);
	}

}