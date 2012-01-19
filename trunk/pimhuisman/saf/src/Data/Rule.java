package Data;

public class Rule {

	private MoveActionType moveAction;
	private FightActionType fightAction;
	private ConditionType condition;
	
	public Rule() {
		
	}
	
	public Rule(MoveActionType moveAction, FightActionType fightAction, ConditionType condition) {
		this.moveAction = moveAction;
		this.fightAction = fightAction;
		this.condition = condition;
	}
	
	public void setMoveAction(MoveActionType moveAction) {
		this.moveAction = moveAction;
	}
	
	public void setFightAction(FightActionType fightAction) {
		this.fightAction = fightAction;
	}
	
	public void setCondition(ConditionType condition) {
		this.condition = condition;
	}
	
	public MoveActionType getMoveAction() {
		return moveAction;
	}
	
	public FightActionType getFightAction() {
		return fightAction;
	}
	
	public ConditionType getCondition() {
		return condition;
	}
	
}
