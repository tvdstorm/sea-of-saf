package saf.enginerulecheckers;

import saf.IArenaEngine;
import saf.astnodes.IAction;

public class MoveActionExecutor extends ActionExecutor{
	public static void executeActionOn(IAction condition, IArenaEngine arenaEngine){
		ActionExecutor executor = new MoveActionExecutor(arenaEngine);
		condition.accept(executor);
	}
	
	public void visit(saf.astnodes.actions.Simple simpleNode){
		this.getArenaEngine().doMoveAction(simpleNode.getName());
	}
	
	private MoveActionExecutor(IArenaEngine arenaEngine){
		super(arenaEngine);
	}
}