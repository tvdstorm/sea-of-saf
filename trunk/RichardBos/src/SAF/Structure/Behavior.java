package SAF.Structure;

public class Behavior implements SAFElement {
	public Behavior(){}
	
    public void accept(SAFElementVisitor visitor) throws Exception {
        visitor.visit(this);
    }
	
	private Condition condition;
	private Action moveAction;
	private Action fightAction;
	
	public Condition getCondition() {
		return condition;
	}
	public void setCondition(Condition condition) {
		this.condition = condition;
	}
	public Action getMoveAction() {
		return moveAction;
	}
	public void setMoveAction(Action moveAction) {
		this.moveAction = moveAction;
	}
	public Action getFightAction() {
		return fightAction;
	}
	public void setFightAction(Action fightAction) {
		this.fightAction = fightAction;
	}
	
	public enum MoveType
	{
		walk_towards,
		walk_away,
		run_towards,
		run_away,
		jump,
		crouch,
		stand
	}
	public enum FightType
	{
		block_low,
		block_high,
		punch_low,
		punch_high,
		kick_low,
		kick_high
	}
	public enum ConditionType
	{
		always,
		near,
		far,
		much_stronger,
		stronger,
		even,
		weaker,
		much_weaker
	}
	public enum CharacteristicType
	{
		punchReach,
		punchPower,
		kickReach,
		kickPower
	}
}
