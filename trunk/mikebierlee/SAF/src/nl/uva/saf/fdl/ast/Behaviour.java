package nl.uva.saf.fdl.ast;

public class Behaviour extends FighterAttribute {
	private ITreeNode condition;
	
	public Behaviour(ITreeNode condition) {
		setCondition(condition);
	}

	public ITreeNode getCondition() {
		return condition;
	}

	public void setCondition(ITreeNode condition) {
		this.condition = condition;
	}
}
