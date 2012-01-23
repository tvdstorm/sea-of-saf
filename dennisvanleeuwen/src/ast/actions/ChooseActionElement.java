package ast.actions;

import java.util.ArrayList;
import java.util.List;

import saf.ISAFElementVisitor;

import ast.BotElement;
import ast.IActionElement;

public class ChooseActionElement implements IActionElement{
	private List<IActionElement> actions;
	
	public ChooseActionElement(){
		this.actions = new ArrayList<IActionElement>();
	}
	
	public void addAction(IActionElement action){
		this.actions.add(action);
	}

	@Override
	public void accept(ISAFElementVisitor visitor)  throws Exception{
		for(IActionElement action: this.actions)
			action.accept(visitor);
		visitor.visit(this);		
	}
}