package saf.astelements.actions;

import java.util.ArrayList;
import java.util.List;

import saf.ISAFElementVisitor;
import saf.astelements.IAction;

public class ChooseActionComposite implements IAction{
	private List<IAction> actions;
	
	public ChooseActionComposite(List<IAction> actions){
		this.actions = new ArrayList<IAction>();
		this.actions = actions;
	}
	
	public List<IAction> getActions(){
		return this.actions;
	}

	@Override
	public void accept(ISAFElementVisitor visitor){
		visitor.visit(this);	
	}
}