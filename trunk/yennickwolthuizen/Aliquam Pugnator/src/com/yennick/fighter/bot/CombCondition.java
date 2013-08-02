package com.yennick.fighter.bot;

import java.util.List;

public class CombCondition extends Condition {

	private final Condition condition1;
	private final Condition condition2;
	
	private final boolean and;

	public CombCondition(Condition condition1, Condition condition2,boolean and){
		this.condition1 = condition1;
		this.condition2 = condition2;
		this.and = and;
	}
	
	@Override
	public boolean hasCondition(List<String> cond) {
		
		boolean cond1 = condition1.hasCondition(cond);
		boolean cond2 = condition2.hasCondition(cond);
		
		boolean condition = (and)? cond1 && cond2 : cond1 || cond2;

		return condition;
	}
	
	@Override
	public String toString() {
		String andStr = (and)? "and" : "or";
		return condition1.toString() + andStr + condition2.toString() ;
	}

	@Override
	public void check(List<String> errors) {
		condition1.check(errors);
		condition2.check(errors);
	}
	
}
