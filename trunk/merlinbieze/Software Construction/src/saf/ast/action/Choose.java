package saf.ast.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Choose extends Action {
	private final List<Action> actions = new ArrayList<Action>(2);;
	
	public Choose(Action action1, Action action2) {
		actions.add(action1);
		actions.add(action2);
	}

	@Override
	public String getType() {
		if(actions.size() > 0){
			return pick().getType();
		}
		return "";
	}
	
	public Action pick(){
		return actions.get(new Random().nextInt(actions.size()));
	}
}
