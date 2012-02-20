package nl.tamasja.uva.saf.fighter.action;

import nl.tamasja.uva.saf.fighter.FighterBot;

public class BehaviourActionClass implements IBehaviourAction {

	IAction action;
	ExecuteAction execute;
	
	public BehaviourActionClass(IAction action) {
		this.action = action;
		this.execute = new ExecuteAction();
	}

	@Override
	public void execute(FighterBot self) {
		execute.doAction(self,action);
	}
	
}
