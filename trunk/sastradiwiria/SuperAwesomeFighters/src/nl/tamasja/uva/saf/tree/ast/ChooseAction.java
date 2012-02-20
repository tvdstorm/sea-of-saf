package nl.tamasja.uva.saf.tree.ast;

import java.util.ArrayList;

import nl.tamasja.uva.saf.tree.IFighterVisitor;

public class ChooseAction implements IAction {

	private final ArrayList<IAction> actions; 
	
	public ChooseAction(ArrayList<IAction> actions) {
		this.actions = actions;
	}

	@Override
	public void accept(IFighterVisitor visitor) {
		for(IAction a : actions) {
			a.accept(visitor);
		}
		
		visitor.visit(this);
		
	}

	public ArrayList<IAction> getActions() {
		return actions;
	}
}
