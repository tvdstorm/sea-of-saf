package saf.interpreter;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import saf.ast.Fighter;
import saf.util.MethodAnnotation;

public class Bot extends Observable implements Observer
{
	private int position;
	public int getPosition() {
		return position;
	}
	
	private String lastState;
	public String getLastState() {
		if (this.lastState == null)
			return "";
		else
			return this.lastState;
	}
	
	public static ArrayList<String> fetchBotStrengths() {
		ArrayList<String> result = new ArrayList<String>();
		
		try {
			Field fields[] = Bot.class.getFields();
			for ( Field field : fields ) {
				result.add(field.getName());
			}
			
			return result;
		}
		catch (Exception ex) {
			return new ArrayList<String>();
		}
	}

	public void setPosition(int position) {
		this.position = position;
		if (this.botOnTheLeft && getPosition() >= this.opponentBot.getPosition()) {
			this.position = this.opponentBot.getPosition() - 1;
		}
		else if (!this.botOnTheLeft && getPosition() <= this.opponentBot.getPosition()) {
			this.position = this.opponentBot.getPosition() + 1;
		}
	}
	
	public boolean isStandingLeft() {
		return this.botOnTheLeft;
	}
	
	private Fighter fighter;
	public Fighter getFighter() {
		return fighter;
	}
	
	// hmmm, this is too bad...
	public int kickReach = 5;
	public int punchReach = 5;
	public int kickPower = 5;
	public int punchPower = 5;
	
	private Bot opponentBot;
	private boolean botOnTheLeft;
	private int remainingActionSteps;
	private int hitpoints;
	public int getHitpoints() {
		return hitpoints;
	}
	
	public Bot(Fighter fighter, int initialPosition) {
		this.fighter = fighter;
		this.position = initialPosition;
		this.hitpoints = 100;
	}
	
	public Bot getOpponentBot() {
		return this.opponentBot;
	}
	
	public void setOpponentBot(Bot opponentBot) {
		this.opponentBot = opponentBot;
		this.botOnTheLeft = this.position < opponentBot.getPosition();
		this.opponentBot.addObserver(this);
		this.addObserver(opponentBot);
		
		if (opponentBot.getOpponentBot() == null)
			opponentBot.setOpponentBot(this);
	}
	
	public int getWeight() {
		return (punchPower + kickPower) / 2;
	}
	
	public int getHeight() {
		return (punchReach + kickReach) / 2;
	}
	
	public int getSpeed() {
		// added 3 because I don't want to work with negative numbers
		return (int)(0.5 * (getHeight() - getWeight())) + 3;
	}
	
	private void notifySubscribers(String action) {
		this.setChanged();
		this.notifyObservers(action);
		this.lastState = action;
	}
	
	@MethodAnnotation(safName = "stronger", keywordType = "condition")
	public boolean isStronger() {
		return this.getNumberOfWeakerStrengths() < this.getNumberOfStrongerStrengths();
	}
	
	@MethodAnnotation(safName = "weaker", keywordType = "condition")
	public boolean isWeaker() {
		return this.getNumberOfWeakerStrengths() > this.getNumberOfStrongerStrengths();
	}
	
	@MethodAnnotation(safName = "much_stronger", keywordType = "condition")
	public boolean isMuchStronger() {
		return this.getNumberOfStrongerStrengths() == 4;
	}
	
	@MethodAnnotation(safName = "much_weaker", keywordType = "condition")
	public boolean isMuchWeaker() {
		return this.getNumberOfWeakerStrengths() == 4;
	}
	
	@MethodAnnotation(safName = "even", keywordType = "condition")
	public boolean isEven() {
		return this.getNumberOfStrongerStrengths() == this.getNumberOfWeakerStrengths();
	}
	
	@MethodAnnotation(safName = "near", keywordType = "condition")
	public boolean isNear() {
		return this.getOpponentDistance() < 4;
	}
	
	@MethodAnnotation(safName = "far", keywordType = "condition")
	public boolean isFar() {
		return !isNear();
	}
	
	@MethodAnnotation(safName = "always", keywordType = "condition")
	public boolean isAlways() {
		return true;
	}
	
	@MethodAnnotation(safName = "jump", keywordType = "move")
	public void jump() {
		remainingActionSteps = this.getSpeed(); 
	}
	
	@MethodAnnotation(safName = "stand", keywordType = "move")
	public void stand() {
		this.notifySubscribers("stand");
	}
	
	@MethodAnnotation(safName = "run_towards", keywordType = "move")
	public void runTowards() {
		this.setPosition(this.getPosition() + getMoveDirection());
	}
	
	@MethodAnnotation(safName = "run_away", keywordType = "move")
	public void runAway() {
		this.setPosition(this.getPosition() - getMoveDirection());
	}
	
	@MethodAnnotation(safName = "walk_towards", keywordType = "move")
	public void walkTowards() {
		this.setPosition(this.getPosition() + getMoveDirection());
	}
	
	@MethodAnnotation(safName = "walk_away", keywordType = "move")
	public void walkAway() {
		this.setPosition(this.getPosition() - getMoveDirection());
	}
	
	@MethodAnnotation(safName = "punch_low", keywordType = "attack")
	public void punchLow() {
		if (isPunchInReach() && !this.opponentBot.getLastState().equals("block_low"))
			this.notifySubscribers("hitopponent");
		
		this.notifySubscribers("punch_low");
		
		this.remainingActionSteps = this.getSpeed();
	}
	
	@MethodAnnotation(safName = "punch_high", keywordType = "attack")
	public void punchHigh() {
		if (isPunchInReach() && !this.opponentBot.getLastState().equals("block_high"))
			this.notifySubscribers("hitopponent");
		
		this.notifySubscribers("punch_high");

		this.remainingActionSteps = this.getSpeed();
	}
	
	@MethodAnnotation(safName = "kick_low", keywordType = "attack")
	public void kickLow() {
		if (isKickInReach() && !this.opponentBot.getLastState().equals("block_low"))
			this.notifySubscribers("hitopponent");
		
		this.notifySubscribers("kick_low");

		this.remainingActionSteps = this.getSpeed();
	}
	
	@MethodAnnotation(safName = "kick_high", keywordType = "attack")
	public void kickHigh() {
		if (isKickInReach() && !this.opponentBot.getLastState().equals("block_high"))
			this.notifySubscribers("hitopponent");

		this.notifySubscribers("kick_high");

		this.remainingActionSteps = this.getSpeed();
	}
	
	@MethodAnnotation(safName = "block_low", keywordType = "attack")
	public void blockLow() {
		this.notifySubscribers("block_low");
		this.remainingActionSteps = this.getSpeed();
	}
	
	@MethodAnnotation(safName = "block_high", keywordType = "attack")
	public void blockHigh() {
		this.notifySubscribers("block_high");
		this.remainingActionSteps = this.getSpeed();
	}
	
	protected int getOpponentDistance() {
		return Math.abs(this.position - this.opponentBot.position);
	}
	
	protected boolean isPunchInReach() {
		return this.getOpponentDistance() <= this.punchReach;
	}
	
	protected boolean isKickInReach() {
		return this.getOpponentDistance() <= this.kickReach;
	}
	
	private Object invokeMethod(String safName) {
		try {
			for (Method method : this.getClass().getMethods()) {
				MethodAnnotation annotation = method.getAnnotation(MethodAnnotation.class);
				if (annotation != null && annotation.safName().equals(safName)) {
					Object[] parameters = {};
					return method.invoke(this, parameters);
				}
			}
			return false;
		} catch (Exception exception) {
			exception.printStackTrace();
			//System.out.println("invokeMethod exception: " + );
			return false;
		}
	}
	
	protected int getNumberOfStrongerStrengths() {
		int result = 0;
		if (this.kickPower > this.opponentBot.kickPower) result++;
		if (this.kickReach > this.opponentBot.kickReach) result++;
		if (this.punchPower > this.opponentBot.punchPower) result++;
		if (this.punchReach > this.opponentBot.punchReach) result++;
		return result;
	}

	protected int getNumberOfWeakerStrengths() {
		int result = 0;
		if (this.kickPower < this.opponentBot.kickPower) result++;
		if (this.kickReach < this.opponentBot.kickReach) result++;
		if (this.punchPower < this.opponentBot.punchPower) result++;
		if (this.punchReach < this.opponentBot.punchReach) result++;
		return result;
	}
	
	protected boolean isAllowedToPerformAction() {
		return remainingActionSteps == 0 && !this.isKnockedOut() && !this.opponentBot.isKnockedOut();
	}
	
	public void performAction(String safName) {
		if (!isAllowedToPerformAction()) {
			this.remainingActionSteps--;
			if (!this.isKnockedOut() && !this.getLastState().equals("hit"))
				this.stand();
		}
		else {
			this.invokeMethod(safName);
		}
	}
	
	public boolean getCondition(String safName) {
		return (Boolean)this.invokeMethod(safName);
	}
	
	private int getMoveDirection() {
		if (this.opponentBot.getPosition() - this.getPosition() >= 0)
			return 1;
		else
			return -1;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		if (arg0.equals(this.getOpponentBot())) {
			if (arg1.equals("hitopponent")) {
				this.hitpoints -= 5;
				this.remainingActionSteps = 1;
				if (this.isKnockedOut())
					this.notifySubscribers("knockout");
				else
					this.notifySubscribers("hit");
			}
		}
	}
	
	public boolean isKnockedOut() {
		return (this.hitpoints <= 0);
	}
}
