package ast.actions;

import java.util.ArrayList;
import java.util.List;

import ast.IAction;

public class ChooseAction implements IAction{
	private List<IAction> actions;
	
	public ChooseAction(){
		this.actions = new ArrayList<IAction>();
	}
	
	public void addAction(IAction action){
		this.actions.add(action);
	}
	
	@Override
	public String getAction(){
		return "";//TODO return random action this.action;
	}
	
	@Override
	public String toString(){
		String s = "Choose => {\n";
		for(IAction action: actions)
			s += action.toString() + "\n";
		s += "}\n";
		return s;
	}
}