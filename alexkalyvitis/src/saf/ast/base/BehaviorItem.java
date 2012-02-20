package saf.ast.base;

public abstract class BehaviorItem {
	private String name;
	
	public String getName() { return name; }
	
	public boolean keywordIsValid(){
		return false;
	}
}
