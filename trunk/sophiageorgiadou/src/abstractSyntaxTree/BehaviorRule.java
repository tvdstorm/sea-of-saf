package abstractSyntaxTree;

import abstractSyntaxTree.Attack;
import abstractSyntaxTree.Condition;
import abstractSyntaxTree.Move;

/**
 * This class represents the behavior rule
 * @author Sofia
 *
 */
public class BehaviorRule {

	private Condition condition;
	private Move move;
	private Attack attack;
	
	/**
	 * Constructor
	 */
	public BehaviorRule(){
		this.setCondition(new Condition());
		this.setMove(new Move());
		this.setAttack(new Attack());
	}

	public String toString(){
		String temp=this.getCondition()+"-"+this.getAttack()+"-"+this.getMove();
		return temp;
	}

	/**
	 * @return the condition
	 */
	public Condition getCondition() {
		return condition;
	}

	/**
	 * @param condition the condition to set
	 */
	public void setCondition(Condition condition) {
		this.condition = condition;
	}

	/**
	 * @return the move
	 */
	public Move getMove() {
		return move;
	}

	/**
	 * @param move the move to set
	 */
	public void setMove(Move move) {
		this.move = move;
	}

	/**
	 * @return the attack
	 */
	public Attack getAttack() {
		return attack;
	}

	/**
	 * @param attack the attack to set
	 */
	public void setAttack(Attack attack) {
		this.attack = attack;
	}
	
}
