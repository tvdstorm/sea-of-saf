package nl.uva.saf.fdl.ast;

public class Rule extends TreeNode {
	private ITreeNode moveChoice;
	private ITreeNode fightChoice;
	
	public Rule(ITreeNode moveChoice, ITreeNode fightChoice) {
		this.setMoveChoice(moveChoice);
		this.setFightChoice(fightChoice);
	}

	public ITreeNode getFightChoice() {
		return fightChoice;
	}

	public void setFightChoice(ITreeNode fightChoice) {
		this.fightChoice = fightChoice;
	}

	public ITreeNode getMoveChoice() {
		return moveChoice;
	}

	public void setMoveChoice(ITreeNode moveChoice) {
		this.moveChoice = moveChoice;
	}
}
