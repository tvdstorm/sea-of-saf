package model;

import java.util.ArrayList;
import java.util.List;
import util.Visitor;


public class ChooseAction extends Action{
	
	private final Action action1;
	private final Action action2;
	private List<Action> listActions = new ArrayList<Action>();
	
	public ChooseAction(MoveAction action1, MoveAction action2) {
		this.action1 = action1;
		this.action2 = action2;
		listActions.add(action1);
		listActions.add(action2);
		
	}
	
	public List<Action> getActions() {
		return listActions ;
	}
	
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}