package saf.astelements.actions;

import java.util.ArrayList;
import java.util.List;

import saf.ISAFNodeVisitor;
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
	public void accept(ISAFNodeVisitor visitor){
		visitor.visit(this);	
	}

	@Override
	public String getNodeName() {
		return "choose";
	}
}