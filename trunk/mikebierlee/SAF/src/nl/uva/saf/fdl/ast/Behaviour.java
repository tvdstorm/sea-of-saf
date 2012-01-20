package nl.uva.saf.fdl.ast;

public class Behaviour extends FighterAttribute {
	private ITreeNode condition;
	private ITreeNode rule;
	
	public Behaviour(ITreeNode condition, ITreeNode rule) {
		setCondition(condition);
		this.setRule(rule);
	}

	public ITreeNode getCondition() {
		return condition;
	}

	public void setCondition(ITreeNode condition) {
		this.condition = condition;
	}

	public ITreeNode getRule() {
		return rule;
	}

	public void setRule(ITreeNode rule) {
		this.rule = rule;
	}
}
