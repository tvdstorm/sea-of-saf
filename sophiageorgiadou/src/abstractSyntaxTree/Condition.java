package abstractSyntaxTree;

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
	
	public String toString(){
		String temp="\nConditions: ";
		
		for(int i=0;i<this.conditions.size();i++){
			temp+=this.conditions.get(i)+",";
		}
		return temp;
	}
}
