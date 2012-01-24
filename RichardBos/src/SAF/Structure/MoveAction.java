package SAF.Structure;

public class MoveAction extends ActionType {
	public MoveAction()	{}
	public MoveAction(String value)
	{
		this.setMoveAction(value);
	}
	
	private String moveAction;
	public String getMoveAction() {
		return moveAction;
	}
	public void setMoveAction(String moveAction) {
		this.moveAction = moveAction;
	}
	
	public Behavior.MoveType getMoveActionType() {
		Behavior.MoveType moveActionType = Behavior.MoveType.valueOf(this.getMoveAction());

		return moveActionType;
	}
}
