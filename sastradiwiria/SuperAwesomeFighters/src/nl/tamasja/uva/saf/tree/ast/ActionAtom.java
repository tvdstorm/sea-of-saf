package nl.tamasja.uva.saf.tree.ast;

import nl.tamasja.uva.saf.tree.IFighterVisitor;

public class ActionAtom implements IAction {

	private final String action;
	
	public ActionAtom(String action) {
		this.action = action;
	}
	
	@Override
	public void accept(IFighterVisitor visitor) {
		visitor.visit(this);
		
	}

	public String getAction() {
		return action;
	}

}
