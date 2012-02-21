package saf.ast.condition;

import java.util.List;

public class And extends Composit {

	public And(Condition cond1, Condition cond2) {
		super(cond1, cond2);
	}

	@Override
	public Boolean match(List<String> tokens) {
		Boolean firstTokenMatch;
		Boolean secondTokenMatch;
		if (tokens.size() != 3) {
			return false;
		}
		
		firstTokenMatch = this.getFirstCondition().match(tokens);
		secondTokenMatch = this.getSecondCondition().match(tokens);

		return firstTokenMatch && secondTokenMatch;
	}

}