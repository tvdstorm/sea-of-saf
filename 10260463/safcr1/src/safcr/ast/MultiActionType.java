package safcr.ast;

public class MultiActionType implements Node{
	private String typeChoice1;
	private String typeChoice2;
	
	public MultiActionType(String actionType, String actionType2){
		typeChoice1 = actionType;
		typeChoice2 = actionType2;
	}
	
	@Override
	public void addNode(Node actionType) {}
	
	@Override
	public String toTreeString(String indent) {
		return '\n' + indent + "choose" +
			   '\n' + indent + "  " + typeChoice1 +
			   '\n' + indent + "  " + typeChoice2;
	}
}
