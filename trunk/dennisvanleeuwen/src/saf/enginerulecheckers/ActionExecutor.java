package saf.enginerulecheckers;

import mylib.Randomizer;
import saf.IArenaEngine;
import saf.astnodes.actions.ChooseComposite;
import saf.astvisitors.TraversalOnlyVisitor;

public abstract class ActionExecutor extends TraversalOnlyVisitor{
	private IArenaEngine actionEngine;	
	
	public ActionExecutor(IArenaEngine arenaEngine){
		this.actionEngine = arenaEngine;
	}
	
	@Override
	public void visit(ChooseComposite chooseActionNode) {
		int randomIndex = Randomizer.generateRandomNumber(0, chooseActionNode.getActions().size());	
		chooseActionNode.getActions().get(randomIndex).accept(this);	
	}

	@Override
	abstract public void visit(saf.astnodes.actions.Simple simpleNode);
	
	protected IArenaEngine getArenaEngine(){
		return this.actionEngine;
	}
}