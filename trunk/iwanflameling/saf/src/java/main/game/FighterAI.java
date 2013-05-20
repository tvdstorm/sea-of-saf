package game;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.Vector;

import ast.TypeValues;
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
	private long timestepBlock;
	private long speed;
	private FighterAI opponent;
	private enum Direction {LEFT, RIGHT};
	
	/**
	 * 
	 * @param ast
	 * @param initialPosition
	 * @throws NullPointerException when <code>ast</code> is <code>null</code>.
	 */
	public FighterAI(Fighter ast, int initialPosition){
		if(ast == null)
			throw new NullPointerException("Fighter needs an AST that defines him");
		this.ast = ast;
		this.setPosition(initialPosition);
		initStrengths();
		this.speed = calculateSpeed();
	}
	
	public void setOpponent(FighterAI opponent){
		this.opponent = (opponent);
	}
	
	public void takeAction(){
		if(timestepBlock > 0)
			timestepBlock--;
		if(!isBusy()){
			Rule rule = pickRule(calculateCondition());
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
		setKickPower(TypeValues.DEFAULT_STRENGTH);
		setPunchPower(TypeValues.DEFAULT_STRENGTH);
		setKickReach(TypeValues.DEFAULT_STRENGTH);
		setPunchReach(TypeValues.DEFAULT_STRENGTH);
		FighterStrengthInitializer fsi = new FighterStrengthInitializer(this);
		fsi.initStrengths();
	}
	
	private void executeRule(Rule rule){
		timestepBlock = (Arena.STANDARD_TIMESTEP * (speed+1));
		ActionPicker ap = new ActionPicker();
		Behavior behavior = rule.getBehavior();
		if(behavior != null){
			Action moveAction = behavior.getMoveAction();
			executeMoveAction(ap.pick(moveAction));
			Action fightAction = behavior.getFightAction();
			executeFightAction(ap.pick(fightAction));
		}
		System.out.println(this.ast.getName() + ": " + this.currentMoveAction + " and " + this.currentFightAction);
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
	
	private String[] calculateCondition(){
		Vector<String> condition = new Vector<String>();
		condition.add(calculatePositionCondition());
		condition.add(calculateStrengthCondition());
		System.out.println(condition);
		return condition.toArray(new String[0]);
	}
	
	private String calculatePositionCondition(){
		String calculatedCondition;
		int myPosition = this.getPosition();
		int oppPosition = opponent.getPosition();
		int positionDelta = Math.abs(myPosition-oppPosition);
		int reach = Math.max(this.getKickReach(), this.getPunchReach());
		if(positionDelta <= reach){
			calculatedCondition = "near";
		} else{
			calculatedCondition = "far";
		}
		return calculatedCondition;
	}
	
	/**
	 * Calculates the oppponent's strength condition, compared to this
	 * fighter's own strength. Values can be "stronger", "weaker" or
	 * "even". If the difference is more or equal to 20%, the return value
	 * is prefixed with "much_".
	 * @return indicating whether the opponent is stronger or weaker.
	 */
	private String calculateStrengthCondition(){
		String calculatedCondition;
		int myStrength = Math.max(this.getKickPower(), this.getPunchPower());
		int oppStrength = Math.max(opponent.getKickPower(), opponent.getPunchPower());
		int strengthDelta = Math.abs(myStrength - oppStrength);
		int extremeDelta = TypeValues.MAX_STRENGTH/5;
		String extreme = "";
		if(strengthDelta >= extremeDelta)
			extreme = "much_";
		if(oppStrength > myStrength){
			calculatedCondition = extreme+"stronger";
		} else if(oppStrength == myStrength){
			calculatedCondition = "even";
		} else {
			calculatedCondition = extreme+"weaker";
		}
		return calculatedCondition;
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

	/**
	 * 
	 * @return speed rounded as a positive <code>long</code>.
	 */
	public long calculateSpeed() {
		int weight = (punchPower + kickPower)/2;
		int height = (punchReach + kickReach)/2;
		double exactSpeed = 0.5 * (height-weight);
		double delta = 0.5*(TypeValues.MAX_STRENGTH-TypeValues.MIN_STRENGTH);
		double totalSpeed = exactSpeed + delta;
		long roundedSpeed = Math.round(totalSpeed);
		return roundedSpeed;
	}
	
	
	
}
