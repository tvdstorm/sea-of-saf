package saf.enginerulecheckers;

import saf.IArenaEngine;
import saf.astnodes.IAction;

public class FightActionExecutor extends ActionExecutor{
	public static void executeActionOn(IAction condition, IArenaEngine arenaEngine){
		ActionExecutor executor = new FightActionExecutor(arenaEngine);
		condition.accept(executor);
	}
	
	public void visit(saf.astnodes.actions.Simple simpleNode){
		this.getArenaEngine().doFightAction(simpleNode.getName());
	}
	
	private FightActionExecutor(IArenaEngine arenaEngine){
		super(arenaEngine);
	}
}