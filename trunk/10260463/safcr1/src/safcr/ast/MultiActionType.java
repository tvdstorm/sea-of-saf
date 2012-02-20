package safcr.ast;;

public class MultiActionType implements Node{
	private final String typeChoice1;
	private final String typeChoice2;
	
	public MultiActionType(String actionType, String actionType2){
		typeChoice1 = actionType;
		typeChoice2 = actionType2;
	}
	
	public String getTypeChoice1(){
		return typeChoice1;
	}
	
	public String getTypeChoice2(){
		return typeChoice2;
	}
	
	@Override
	public void addNode(Node actionType) {}
	
	@Override
	public void accept(VisitorInterface v) {
		v.visit(this);
	}
}
