package saf.ast;

import java.util.List;

public class Behaviour {
	
	private final String condition;
	private final List<Action> moveActions;
	private final List<Action> fightActions;
	
	public String getCondition() {
		return this.condition;
	}

	public List<Action> getMoveActions() {
		return this.moveActions;
	}

	public List<Action> getFightActions() {
		return this.fightActions;
	}
	
	public Behaviour(String condition, List<Action> moveActions, List<Action> fightActions) {
		this.condition = condition;
		this.moveActions = moveActions;
		this.fightActions = fightActions;
	}
	
	public String toString(String indent) {
		
		String text = indent + "Behaviour: " + this.condition + "[";

		text += "moveAction(";
	
		for(Action a : this.moveActions) {
			if(this.moveActions.lastIndexOf(a) == this.moveActions.size() - 1) { 
				text += a.toString("");
			}
			else {
				text += a.toString("") + " or ";
			}
		}
		
		text += ")";
		
		
		text += " fightAction(";
		
		for(Action a : this.fightActions) {
			if(this.fightActions.lastIndexOf(a) == this.fightActions.size() - 1) { 
				text += a.toString("");
			}
			else {
				text += a.toString("") + " or ";
			}
		}
		
		text += ")";
		text += "]";
		return text;
	}
}