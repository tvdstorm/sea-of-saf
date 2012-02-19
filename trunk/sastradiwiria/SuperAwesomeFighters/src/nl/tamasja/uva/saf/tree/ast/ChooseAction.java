package nl.tamasja.uva.saf.tree.ast;

import java.util.ArrayList;

import nl.tamasja.uva.saf.tree.IFighterVisitor;

public class ChooseAction implements Action {

	private final ArrayList<Action> actions; 
	
	public ChooseAction(ArrayList<Action> actions) {
		this.actions = actions;
	}

	@Override
	public void accept(IFighterVisitor visitor) {
		
		for(Action a : actions) {
			a.accept(visitor);
		}
		
		visitor.visit(this);
		
	}

	public ArrayList<Action> getActions() {
		return actions;
	}
}
