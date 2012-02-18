package saf.interpreter;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Observable;

import saf.ast.Fighter;
import saf.util.MethodAnnotation;

public class Bot extends Observable
{
	private int position;
	public int getPosition() {
		return position;
	}
	
	private String lastAction;
	public String getLastAction() {
		return lastAction;
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
	
	// check, and remove this!
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
	
	private int moveStepsLeft;
	
	public Bot(Fighter fighter, int initialPosition) {
		this.fighter = fighter;
		this.position = initialPosition;
	}
	
	public void setOpponentBot(Bot opponentBot) {
		this.opponentBot = opponentBot;
		this.botOnTheLeft = this.position < opponentBot.getPosition();
		this.opponentBot.opponentBot = this;
	}
	
	public int weight() {
		return (punchPower + kickPower) / 2;
	}
	
	public int height() {
		return (punchReach + kickReach) / 2;
	}
	
	public float speed() {
		return (float) (0.5 * (height() - weight()));
	}
	
	private void notifySubscribers(String action) {
		//this.setChanged();
		//this.notifyObservers(action);
		this.lastAction = action;
	}
	
	@MethodAnnotation(safName = "stronger", keywordType = "condition")
	public boolean isStronger() {
		return	this.getNumberOfWeakerStrengths() < this.getNumberOfStrongerStrengths();
	}
	
	@MethodAnnotation(safName = "weaker", keywordType = "condition")
	public boolean isWeaker() {
		return	this.getNumberOfWeakerStrengths() > this.getNumberOfStrongerStrengths();
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
		System.out.println("isEven called");
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
//		moveStepsLeft = (Int)(this.speed*10);
	}
	
	@MethodAnnotation(safName = "stand", keywordType = "move")
	public void stand() {
	}
	
	@MethodAnnotation(safName = "run_towards", keywordType = "move")
	public void runTowards() {
		this.setPosition(this.getPosition() + getMoveDirection());
		System.out.println(String.format("%s is running towards opponent. %d / %d", 
										 this.getFighter().getName(), 
										 this.getPosition(), 
										 this.opponentBot.getPosition()));
		this.notifySubscribers("run_towards");
	}
	
	@MethodAnnotation(safName = "run_away", keywordType = "move")
	public void runAway() {
		this.setPosition(this.getPosition() - getMoveDirection());
		System.out.println(String.format("%s is running away", this.getFighter().getName()));
		this.notifySubscribers("run_away");
	}
	
	@MethodAnnotation(safName = "walk_towards", keywordType = "move")
	public void walkTowards() {
		this.setPosition(this.getPosition() - getMoveDirection());
		System.out.println(this.toString() + " is walking towards...");
		this.notifySubscribers("walk_towards");
	}
	
	@MethodAnnotation(safName = "walk_away", keywordType = "move")
	public void walkAway() {
		this.setPosition(this.getPosition() - getMoveDirection());
		this.notifySubscribers("walk_away");
	}

	@MethodAnnotation(safName = "punch_low", keywordType = "attack")
	public void punchLow() {
//		System.out.println(String.format("%s is punching low", this.getFighter().getName()));
		this.notifySubscribers("punch_low");
	}
	
	@MethodAnnotation(safName = "punch_high", keywordType = "attack")
	public void punchHigh() {
//		System.out.println(String.format("%s is punching high", this.getFighter().getName()));
		this.notifySubscribers("punch_high");
	}
	
	@MethodAnnotation(safName = "kick_low", keywordType = "attack")
	public void kickLow() {
//		System.out.println(String.format("%s is kicking low", this.getFighter().getName()));
		this.notifySubscribers("kick_low");
	}
	
	@MethodAnnotation(safName = "kick_high", keywordType = "attack")
	public void kickHigh() {
//		System.out.println(String.format("%s is kicking high", this.getFighter().getName()));
		this.notifySubscribers("kick_high");
	}
	
	@MethodAnnotation(safName = "block_low", keywordType = "attack")
	public void blockLow() {
		System.out.println(String.format("%s is blocking low", this.getFighter().getName()));
		this.notifySubscribers("block_low");
	}
	
	@MethodAnnotation(safName = "block_high", keywordType = "attack")
	public void blockHigh() {
//		System.out.println(String.format("%s is blocking high", this.getFighter().getName()));
		this.notifySubscribers("block_high");
	}
	
	protected int getOpponentDistance() {
		return Math.abs(this.position - this.opponentBot.position);
	}
	
	protected boolean isPunchInReach() {
		return this.getOpponentDistance() <= this.punchReach;
	}
	
	public Object invokeMethod(String safName) {
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
	
	public void processGameTick() {
		if (moveStepsLeft > 0) {
			moveStepsLeft--;
		}
	}
	
	public boolean isReadyForNewMove() {
		return moveStepsLeft == 0;
	}
	
	private int getMoveDirection() {
		if (this.opponentBot.getPosition() - this.getPosition() >= 0) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
