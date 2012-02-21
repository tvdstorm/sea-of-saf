package saf.ast.action;

public class Single extends Action {

	private final String type;
	
	public Single(String type) {
		this.type = type;
	}

	@Override
	public String getType() {
		return this.type;
	}

}
