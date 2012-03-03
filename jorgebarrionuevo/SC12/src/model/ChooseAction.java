package model;

import util.Visitor;


public class ChooseAction extends Action{

	public ChooseAction() {
		
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}