package saf.enginerulecheckers;

import java.util.Stack;

import saf.IArenaEngine;
import saf.astnodes.ICondition;
import saf.astnodes.conditions.AndConnective;
import saf.astnodes.conditions.OrConnective;
import saf.astnodes.conditions.Simple;
import saf.astvisitors.TraversalOnlyVisitor;

public class ConditionChecker extends TraversalOnlyVisitor{
	private IArenaEngine arenaEngine;
	private Stack<Boolean> booleanStack;
	
	public static Boolean isConditionTrueFor(ICondition condition, IArenaEngine arenaEngine){
		ConditionChecker checker = new ConditionChecker(arenaEngine);
		condition.accept(checker);
		return checker.getCheckResult();
	}
	
	public Boolean getCheckResult(){
		return booleanStack.pop();
	}
	
	public void visit(OrConnective orNode) {
		this.booleanStack.push(this.booleanStack.pop() || this.booleanStack.pop());
	}

	public void visit(AndConnective andNode) {
		this.booleanStack.push(this.booleanStack.pop() && this.booleanStack.pop());
	}

	public void visit(Simple simpleNode) {
		this.booleanStack.push(this.arenaEngine.isTheCase(simpleNode.getName()));
	}
	
	private ConditionChecker(IArenaEngine state){
		this.arenaEngine = state;
		this.booleanStack = new Stack<Boolean>();
	}
}
