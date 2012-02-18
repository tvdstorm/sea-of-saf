package saf.evaluators;

public class Attack {
	private BehaviourActionType fightActionType;
	private FightActionIntelligence fightActionIntelligence;
	private Integer strength;
	
	public Attack(Bot aggressor) {
		fightActionType = aggressor.getCurrentFightActionType();
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
		return (this.fightActionIntelligence.isHigh() && fightActionIntelligence.isHigh()) || (this.fightActionIntelligence.isLow() && fightActionIntelligence.isLow()) ;
	}
	
}
