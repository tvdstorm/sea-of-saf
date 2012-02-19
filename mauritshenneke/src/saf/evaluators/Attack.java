package saf.evaluators;

public class Attack {
	private MoveActionIntelligence moveActionIntelligence;
	private FightActionIntelligence fightActionIntelligence;
	private Integer strength;
	private boolean isAttacking = true;
	private Bot aggressor;
	
	public Attack(){
		this.isAttacking = false;
	}
	
	public Attack(Bot aggressor) {
		this.aggressor = aggressor; 
		BehaviourActionType moveActionType = aggressor.getCurrentMoveActionType();
		moveActionIntelligence = new MoveActionIntelligence(moveActionType);
		
		BehaviourActionType fightActionType = aggressor.getCurrentFightActionType();
		fightActionIntelligence = new FightActionIntelligence(fightActionType);
		
		strength = aggressor.getFightActionStrength(fightActionIntelligence);
	}

	public Integer getStrength(){
		return strength;
	}

	public boolean isDefensive() {
		return fightActionIntelligence.isDefensive();
	}

	public boolean blocked(FightActionIntelligence fightActionIntelligence) {
		return  ((this.fightActionIntelligence.isHigh() || this.moveActionIntelligence.isCrouch()) && fightActionIntelligence.isHigh()) || 
				((this.fightActionIntelligence.isLow() || this.moveActionIntelligence.isJump()) && fightActionIntelligence.isLow());
	}

	public boolean isAttacking() {
		return isAttacking;
	}
	
	public void beOffensive(){
		fightActionIntelligence = FightActionIntelligence.getOffensiveIntelligence();
		strength = aggressor.getFightActionStrength(fightActionIntelligence);
	}
	
}
