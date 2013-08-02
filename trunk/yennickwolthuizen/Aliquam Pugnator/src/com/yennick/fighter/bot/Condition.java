package com.yennick.fighter.bot;

import java.util.List;

public abstract class Condition {
	
	public abstract boolean hasCondition(List<String> cond);
	
	public abstract String toString();

	public abstract void check(List<String> errors);

}