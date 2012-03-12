package saf.ast.condition;

import java.util.List;

public class Or extends Composit {

	public Or(Condition lhs, Condition rhs) {
		super(lhs, rhs);
	}

	@Override
	public Boolean match(List<String> tokens) {
		return this.getFirstCondition().match(tokens)
				|| this.getSecondCondition().match(tokens);
	}
}
