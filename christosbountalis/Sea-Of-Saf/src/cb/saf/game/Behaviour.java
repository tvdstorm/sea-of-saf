package cb.saf.game;

import cb.saf.game.BehaviourRules.Attacks;
import cb.saf.game.BehaviourRules.Conditions;
import cb.saf.game.BehaviourRules.Moves;
public class Behaviour {

	/**
	 * Fields
	 */
	private Conditions condition;
	private Attacks attack;
	private Moves move;
	
	/**
	 * @return the condition
	 */
	public Conditions getCondition() {
		return condition;
	}


	/**
	 * @param condition the condition to set
	 */
	public void setCondition(Conditions condition) {
		this.condition = condition;
	}


	/**
	 * @return the attack
	 */
	public Attacks getAttack() {
		return attack;
	}


	/**
	 * @param attack the attack to set
	 */
	public void setAttack(Attacks attack) {
		this.attack = attack;
	}


	/**
	 * @return the move
	 */
	public Moves getMove() {
		return move;
	}


	/**
	 * @param moves the move to set
	 */
	public void setMove(Moves moves) {
		this.move = moves;
	}


	
	
	/**
	 * Constructor
	 * @param condition
	 * @param attack
	 * @param move
	 */
	public Behaviour(Conditions condition,Attacks attack,Moves move){
		this.condition=condition;
		this.attack=attack;
		this.move=move;
	}

	/**
	 * 
	 */
	public Behaviour() {
	}
}
