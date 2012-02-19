package fighter.action;

import java.util.ArrayList;

import fighter.ASTNode;
import fighter.checker.Visitor;

@SuppressWarnings({ "serial", "hiding" })
public class Actions<ActionType> extends ArrayList<ActionType> implements
		ASTNode {

	public ActionType pickAction() {
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void accept(Visitor visitor) {
		visitor.visit((Actions<fighter.action.ActionType>) this);

	}

}