package AST.Actions.FightActions;

public class FightActionImpl implements IFightAction{
	private String action;
	
	public FightActionImpl(String action){
		this.action = action;
	}
	
	@Override
	public String getAction(){
		return this.action;
	}	
	
	@Override
	public String toString(){
		return this.action;
	}
}