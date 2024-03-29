package game;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.Vector;

import ast.TypeValues;
import ast.action.Action;
import ast.action.SimpleAction;
import ast.fighter.Behavior;
import ast.fighter.Fighter;

public class FighterAI {

	private Fighter ast;
	private int position;
	private String currentFightAction;
	private String currentMoveAction;
	private int kickPower;
	private int kickReach;
	private int punchPower;
	private int punchReach;
	private int maxPos;
	private int minPos;
	private int health;
	private long recoverySteps;
	private long speed;
	private FighterAI opponent;
	private long numberOfActionsExecuted;
	public enum Direction {LEFT, RIGHT};
	public static final int FULL_HEALTH = 100;
	public static final int MIN_FLOOR_POSITION = 1;
	public static final int MAX_FLOOR_POSITION = 200;
	
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
		this.health = FULL_HEALTH;
	}
	
	public void setOpponent(FighterAI opponent){
		this.opponent = (opponent);
	}
	
	public void takeAction(){
		recover();
		if(!isRecovering()){
			Rule rule = pickRule(calculateCondition());
			executeRule(rule);
		}
	}
	
	public int getPosition(){
		return position;
	}
	
	/**
	 * Does a recovery step.
	 */
	public void recover(){
		if(recoverySteps > 0)
			recoverySteps--;
	}
	
	/**
	 * Starts the recovery of this fighter, if the fighter is not still busy with a previous recovery.
	 */
	public void startRecovery(){
		if(!isRecovering())
			recoverySteps = (Jury.STANDARD_TIMESTEP * ((TypeValues.MAX_STRENGTH-speed)));
	}
	
	public boolean isRecovering(){
		if(recoverySteps > 0){
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
		ActionPicker ap = new ActionPicker();
		Behavior behavior = rule.getBehavior();
		if(behavior != null){
			Action moveAction = behavior.getMoveAction();
			executeMoveAction(ap.pick(moveAction));
			Action fightAction = behavior.getFightAction();
			executeFightAction(ap.pick(fightAction));
		}
		this.numberOfActionsExecuted++;
	}
	
	private void executeMoveAction(SimpleAction moveAction){
		this.currentMoveAction = moveAction.getAction();
		if("run_towards".equals(this.currentMoveAction)){
			executeMove(false, true);
		} else if("walk_towards".equals(this.currentMoveAction)){
			executeMove(false, false);
		} else if("run_away".equals(this.currentMoveAction)){
			executeMove(true, true);
		} else if("walk_away".equals(this.currentMoveAction)){
			executeMove(true, false);
		}
	}
	
	private void executeFightAction(SimpleAction fightAction){
		this.currentFightAction = fightAction.getAction();
	}
	
	private void executeMove(boolean away, boolean run){
		int sign = away ? -1 : 1;
		int steps = run ? 8 : 2;
		switch(direction()){
		case RIGHT:
			setPosition(getPosition()+(steps * sign));
			break;
		case LEFT:
			setPosition(getPosition()-(steps * sign));
			break;
			default:
				break;
		}
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
		this.maxPos = MAX_FLOOR_POSITION;
		this.minPos = MIN_FLOOR_POSITION;
		if(opponent != null){
			switch (direction()){
			case RIGHT:
				maxPos = opponent.getPosition()-1;
				break;
			case LEFT:
				minPos = opponent.getPosition()+1;
				break;
			default:
				break;
			}
		}
	}
	
	public Direction direction(){
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
		return condition.toArray(new String[0]);
	}
	
	private String calculatePositionCondition(){
		String calculatedCondition;
		int myPosition = this.getPosition();
		int oppPosition = opponent.getPosition();
		int positionDelta = Math.abs(myPosition-oppPosition);
		int reach = Math.min(this.getKickReach(), this.getPunchReach());
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

	public int getKickPower() {
		return kickPower;
	}

	void setKickPower(int kickPower) {
		this.kickPower = kickPower;
	}

	public int getKickReach() {
		return kickReach;
	}

	void setKickReach(int kickReach) {
		this.kickReach = kickReach;
	}

	public int getPunchPower() {
		return punchPower;
	}

	void setPunchPower(int punchPower) {
		this.punchPower = punchPower;
	}

	public int getPunchReach() {
		return punchReach;
	}

	void setPunchReach(int punchReach) {
		this.punchReach = punchReach;
	}

	public String getCurrentFightAction() {
		return currentFightAction;
	}

	public String getCurrentMoveAction() {
		return currentMoveAction;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = Math.max(health, 0);
	}
	
	public Fighter getAst() {
		return ast;
	}

	public boolean isDefeated(){
		if(getHealth() <= 0)
			return true;
		else return false;
	}

	public long getNumberOfActionsExecuted() {
		return numberOfActionsExecuted;
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
