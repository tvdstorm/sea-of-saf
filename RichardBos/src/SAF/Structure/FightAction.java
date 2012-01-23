package SAF.Structure;

public class FightAction extends Action {
	public FightAction(String fightAction)
	{
		
	}
	
	private String fightAction;
	public String getFightAction() {
		return fightAction;
	}

	public void setFightAction(String fightAction) {
		this.fightAction = fightAction;
	}

	public Behavior.FightType getFightActionType() throws Exception {
		Behavior.FightType fightActionType = Behavior.FightType.valueOf(this.getFightAction());

		return fightActionType;
	}	
}
