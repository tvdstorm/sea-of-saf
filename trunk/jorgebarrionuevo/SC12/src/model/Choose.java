package model;

import java.util.ArrayList;
import java.util.List;
import util.Visitor;


public class Choose extends Action{

	public Choose() {
		
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
