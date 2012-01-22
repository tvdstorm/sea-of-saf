package fighter.action.move;

public class ChooseMoveAction implements IMoveAction {

	private IMoveAction firstAction;
	private IMoveAction secondAction;

	@Override
	public MoveActionType getAction() {
		// randomly pick first or second
		return firstAction.getAction();
	}
}
