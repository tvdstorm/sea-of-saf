package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import util.Visitor;


public class ChooseAction extends Action{
	
	private final SimpleAction action1;
	private final SimpleAction action2;
	private List<Action> listActions = new ArrayList<Action>();
	
	public ChooseAction(SimpleAction action1, SimpleAction action2) {
		this.action1 = action1;
		this.action2 = action2;
		listActions.add(action1);
		listActions.add(action2);		
	}
	
	public List<Action> getActions() {
		return listActions ;
	}
	
	public SimpleAction getAction1() {
		return action1 ;
	}
	
	public String getNameAction1() {
		return action2.getName() ;
	}
	
	public SimpleAction getAction2() {
		return action2 ;
	}
	
	public String getNameAction2() {
		return action2.getName() ;
	}
	@Override
	public String getName() {
		Random random = new Random(); 
		if(random.nextBoolean()){return action1.getName();}
		else{return action2.getName();}
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}