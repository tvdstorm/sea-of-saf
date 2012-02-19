package safcr.ast;

import java.util.ArrayList;
import java.util.List;

public class MultiActionType implements Node{
	private final String typeChoice1;
	private final String typeChoice2;
	private List<String> errors;
	
	public MultiActionType(String actionType, String actionType2){
		typeChoice1 = actionType;
		typeChoice2 = actionType2;
		errors = new ArrayList<String>();
	}
	
	@Override
	public void addNode(Node actionType) {}
	
	@Override
	public String toTreeString(String indent) {
		return '\n' + indent + "choose" +
			   '\n' + indent + "  " + typeChoice1 +
			   '\n' + indent + "  " + typeChoice2;
	}
	
	@Override
	public List<String> getErrors() {
		return errors;
	}
}
