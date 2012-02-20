package safcr.ast;

public class Condition implements Node{
	private final String type;
	
	public Condition(String conditionType){
		type = conditionType;
	}
	
	public String getType(){
		return type;
	}
	
	@Override
	public void addNode(Node actionType) {}

	@Override
	public void accept(VisitorInterface v) {
		v.visit(this);
	}
	
}
