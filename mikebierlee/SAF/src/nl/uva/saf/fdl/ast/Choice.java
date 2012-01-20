package nl.uva.saf.fdl.ast;

import java.util.List;

public abstract class Choice extends TreeNode {
	private List<ITreeNode> actions;
	
	public Choice(List<ITreeNode> actions) {
		this.setAction(actions);
	}

	public List<ITreeNode> getAction() {
		return actions;
	}

	public void setAction(List<ITreeNode> actions) {
		this.actions = actions;
	}
	
	public void addAction(ITreeNode action) {
		if (actions != null) {
			actions.add(action);
		}
	}
}
