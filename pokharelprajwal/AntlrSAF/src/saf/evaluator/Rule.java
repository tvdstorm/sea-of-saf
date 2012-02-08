package saf.evaluator;

public class Rule implements INodeVisitable {

	enum MoveActionType {
		walk_towards,
		walk_away,
		run_towards,
		run_away,
		jump,
		crouch,
		stand
	}
	
	enum ConditionType {
		always,
		near,
		far,
		much_stronger,
		stronger,
		even,
		weaker,
		much_weaker
	}
	
	enum FightActionType{
		block_low,
		block_high,
		punch_low,
		punch_high,
		kick_low,
		kick_high
	}
	
	@Override
	public void accept(INodeVisitor v) {
		v.visit(this);
	}
	
}
