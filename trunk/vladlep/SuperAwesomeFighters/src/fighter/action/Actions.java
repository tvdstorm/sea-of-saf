package fighter.action;

import java.util.ArrayList;

import fighter.ASTNode;
import fighter.checker.Visitor;

@SuppressWarnings({ "serial", "hiding" })
public class Actions<ActionType> extends ArrayList<ActionType> implements
		ASTNode {

	@SuppressWarnings("unchecked")
	@Override
	public void accept(Visitor visitor) {
		visitor.visit((Actions<fighter.action.ActionType>) this);
	}

}
