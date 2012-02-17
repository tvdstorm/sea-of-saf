package AbstractSyntaxTree;

import java.util.ArrayList;

public class Condition {
	
	private ArrayList<String> conditions;
	
	public Condition(){
		this.setConditions(new ArrayList<String>());
	}

	public ArrayList<String> getConditions() {
		return conditions;
	}

	public void setConditions(ArrayList<String> conditions) {
		this.conditions = conditions;
	}

}
