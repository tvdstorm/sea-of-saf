package AST.Actions.MoveActions;

public class MoveActionImpl implements IMoveAction{
	private String action;
	
	public MoveActionImpl(String action){
		this.action = action;
	}
	
	@Override
	public String getAction(){
		return this.action;
	}
	
	@Override
	public String toString(){
		return this.action + "\n";
	}
}