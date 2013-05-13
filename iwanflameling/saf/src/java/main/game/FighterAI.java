package game;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import ast.action.Action;
import ast.action.Choose;
import ast.action.SimpleAction;
import ast.checker.DelegateVisitor;
import ast.fighter.Behavior;
import ast.fighter.Fighter;

public class FighterAI {

	Fighter ast;
	private int position;
	private String currentFightAction;
	private String currentMoveAction;
	private int kickPower;
	private int kickReach;
	private int punchPower;
	private int punchReach;
	private int maxPos;
	private int minPos;
	private int timestepBlock;
	private int speed;
	private FighterAI opponent;
	private enum Direction {LEFT, RIGHT};
	
	public FighterAI(Fighter ast, int initialPosition){
		this.ast = ast;
		this.setPosition(initialPosition);
		initStrengths();
	}
	
	public void setOpponent(FighterAI opponent){
		this.opponent = (opponent);
	}
	
	public void takeAction(){
		timestepBlock--;
		if(!isBusy()){
			Rule rule = pickRule("far", "much_stronger");
			executeRule(rule);
		}
	}
	
	public int getPosition(){
		return position;
	}
	
	public boolean isBusy(){
		if(timestepBlock > 0){
			return true;
		} else{
			return false;
		}
	}
	
	private void initStrengths(){
		FighterStrengthInitializer fsi = new FighterStrengthInitializer(this);
		fsi.initStrengths();
	}
	
	private void executeRule(Rule rule){
		timestepBlock = (Arena.STANDARD_TIMESTEP * speed);
		ActionPicker ap = new ActionPicker();
		Behavior behavior = rule.getBehavior();
		if(behavior != null){
			Action moveAction = behavior.getMoveAction();
			executeMoveAction(ap.pick(moveAction));
			Action fightAction = behavior.getFightAction();
			executeFightAction(ap.pick(fightAction));
		}
	}
	
	private void executeMoveAction(SimpleAction moveAction){
		this.currentMoveAction = moveAction.getAction();
	}
	
	private void executeFightAction(SimpleAction fightAction){
		this.currentFightAction = fightAction.getAction();
	}
	
	private void setPosition(int position){
		initPositionRange();
		if(position <= minPos)
			this.position = minPos;
		else if (position >= maxPos)
			this.position = maxPos;
		else
			this.position = position;
	}
	
	private void initPositionRange(){
		this.maxPos = Arena.MAX_FLOOR_POSITION;
		this.minPos = Arena.MIN_FLOOR_POSITION;
		if(opponent != null){
			switch (direction()){
			case RIGHT:
				maxPos = opponent.getPosition();
				break;
			case LEFT:
				minPos = opponent.getPosition();
				break;
			default:
				break;
			}
		}
	}
	
	private Direction direction(){
		Direction result = Direction.RIGHT;
		if (opponent != null) {
			if (getPosition() >= opponent.getPosition())
				result = Direction.LEFT;
		}
		return result;
	}
	
	private Rule pickRule(String... conditions){
		Set<String> conditionsSet = new HashSet<String>();
		for(String condition: conditions) {
			conditionsSet.add(condition);
		}
		RulesFactory rf = new RulesFactory();
		List<Rule> bestResult = rf.getRules(conditionsSet, this);
		Random rand = new Random();
		int index = rand.nextInt(bestResult.size());
		Rule rule = bestResult.get(index);
		return rule;
	}

	/**
	 * @return the kickPower
	 */
	public int getKickPower() {
		return kickPower;
	}

	/**
	 * @param kickPower the kickPower to set
	 */
	void setKickPower(int kickPower) {
		this.kickPower = kickPower;
	}

	/**
	 * @return the kickReach
	 */
	public int getKickReach() {
		return kickReach;
	}

	/**
	 * @param kickReach the kickReach to set
	 */
	void setKickReach(int kickReach) {
		this.kickReach = kickReach;
	}

	/**
	 * @return the punchPower
	 */
	public int getPunchPower() {
		return punchPower;
	}

	/**
	 * @param punchPower the punchPower to set
	 */
	void setPunchPower(int punchPower) {
		this.punchPower = punchPower;
	}

	/**
	 * @return the punchReach
	 */
	public int getPunchReach() {
		return punchReach;
	}

	/**
	 * @param punchReach the punchReach to set
	 */
	void setPunchReach(int punchReach) {
		this.punchReach = punchReach;
	}
	
	
	
}
