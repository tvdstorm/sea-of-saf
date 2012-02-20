package safcr.ast;

public class ActionType implements Node{
	private final String type;
	
	public ActionType(String actionType){
		type = actionType;
	}
	
	public String getActionType(){
		return type;
	}
	
	@Override
	public void addNode(Node n) { }

	@Override
	public void accept(VisitorInterface v) {
		v.visit(this);
	}
}
