package fighter.action.fight;

public class ChooseFightAction implements IFightAction {

	private IFightAction firstAction;
	private IFightAction secondAction;

	@Override
	public FightActionType getAction() {
		// randomly pick first or second
		return firstAction.getAction();
	}
}
