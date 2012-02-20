package saf.ast;

public class Action {

	private final String type;
	
	public String get_type() {
		return this.type;
	}

	public Action(String type){
		this.type = type;
	}
	

	public String toString(String indent) {
		
		return indent + this.type;
	}

}