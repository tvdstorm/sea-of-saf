package safcr.ast;

public class Condition implements Node{
	private String type;
	
	public Condition(String conditionType){
		type = conditionType;
	}
	
	@Override
	public void addNode(Node actionType) {}
	
	@Override
	public String toTreeString(String indent) {
		return '\n' + indent + "condition" + 
			   '\n' + indent + "  " + type;
	}
	
}
