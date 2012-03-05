package safcr.ast;

public class Action implements Node{
	private Node actionType1;
	private Node actionType2;
	
	public Action(Node actionType){
		actionType1 = actionType;;
	}
	
	public void addActionType2(Node n){
		actionType2 = n;
	}
	
	public Node getAction1(){
		return actionType1;
	}
	
	public Node getAction2(){
		return actionType2;
	}
	
	@Override
	public void accept(VisitorInterface v) {
		v.visit(this);	
	}
}
