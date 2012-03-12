package saf.ast.action;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import junit.framework.Assert;

public class Choose extends Action {
	private final List<Action> actions;
	
	public Choose(Action action1, Action action2) {
		actions = Arrays.asList(action1, action2);
	}

	@Override
	public String getType() {
		Assert.assertEquals(0, actions.size());
		return pick().getType();
		
	}
	
	public Action pick(){
		return actions.get(new Random().nextInt(actions.size()));
	}
}
