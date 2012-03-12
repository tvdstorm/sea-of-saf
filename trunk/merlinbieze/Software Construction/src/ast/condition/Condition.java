package saf.ast.condition;

import java.util.List;

public abstract class Condition {
	public abstract Boolean match(List<String> tokens);
}
