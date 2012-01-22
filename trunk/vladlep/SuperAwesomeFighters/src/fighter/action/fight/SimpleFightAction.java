package fighter.action.fight;

public class SimpleFightAction implements IFightAction {

	private FightActionType fightAction;

	@Override
	public FightActionType getAction() {
		return fightAction;
	}
}
