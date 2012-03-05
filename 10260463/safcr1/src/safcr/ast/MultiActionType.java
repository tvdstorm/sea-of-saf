package safcr.ast;;

public class MultiActionType implements Node{
	private final ActionType typeChoice1;
	private final ActionType typeChoice2;
	
	public MultiActionType(String actionType, String actionType2){
		typeChoice1 = new ActionType(actionType);
		typeChoice2 = new ActionType(actionType2);
	}
	
	public ActionType getTypeChoice1(){
		return typeChoice1;
	}
	
	public ActionType getTypeChoice2(){
		return typeChoice2;
	}
	
	@Override
	public void accept(VisitorInterface v) {
		v.visit(this);	
	}
}
