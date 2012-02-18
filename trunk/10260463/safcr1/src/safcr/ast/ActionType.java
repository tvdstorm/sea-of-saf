package safcr.ast;

public class ActionType implements Node{
	private String type;
	
	public ActionType(String actionType){
		type = actionType;
	}
	
	@Override
	public void addNode(Node n) { }

	@Override
	public String toTreeString(String indent) {
		return '\n' + indent + type;
	}
}
