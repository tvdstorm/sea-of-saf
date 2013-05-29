package game;

import java.util.List;
import java.util.Random;

import ast.action.Action;
import ast.action.Choose;
import ast.action.SimpleAction;
import ast.checker.DelegateAstVisitor;

public class ActionPicker extends DelegateAstVisitor{
	SimpleAction returnValue;
	
	public SimpleAction pick(Action action){
		this.returnValue = null;
		action.accept(this);
		return returnValue;
	}

	@Override
	public void visit(SimpleAction simpleAction) {
		returnValue = simpleAction;
		super.visit(simpleAction);
	}

	@Override
	public void visit(Choose choose) {
		Random rand = new Random();
		List<SimpleAction> simpleActions = choose.getChoices();
		int index = rand.nextInt(simpleActions.size());
		SimpleAction simpleAction = simpleActions.get(index);
		this.visit(simpleAction);
	}
	
}
