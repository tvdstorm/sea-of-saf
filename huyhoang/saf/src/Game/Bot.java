package Game;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import saf.ast.Fighter;
import saf.ast.Function;

/**
 * The fighter bot.
 * 
 * @author huyhoang
 */
public class Bot
{
	private int position;
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	
	private Fighter fighter;
	public Fighter getFighter() {
		return fighter;
	}
	
	public int kickReach = 5;
	public int punchReach = 5;
	public int kickPower = 5;
	public int punchPower = 5;
	
	private Bot opponentBot;
	
	public Bot(Fighter fighter) {
		this.fighter = fighter;
	}
	
	public void setOpponentBot(Bot opponentBot)
	{
		this.opponentBot = opponentBot;
	}
	
	public int weight()
	{
		return (punchPower + kickPower) / 2;
	}
	
	public int height()
	{
		return (punchReach + kickReach) / 2;
	}
	
	public float speed()
	{
		return (float) (0.5 * (height() - weight()));
	}
	
	@MethodAnnotation(safName = "stronger", keywordType = "condition")
	public boolean isStronger()
	{
		return	this.getNumberOfWeakerStrengths() < this.getNumberOfStrongerStrengths();
	}
	
	@MethodAnnotation(safName = "weaker", keywordType = "condition")
	public boolean isWeaker()
	{
		return	this.getNumberOfWeakerStrengths() > this.getNumberOfStrongerStrengths();
	}
	
	@MethodAnnotation(safName = "much_stronger", keywordType = "condition")
	public boolean isMuchStronger()
	{
		return this.getNumberOfStrongerStrengths() == 4;
	}
	
	@MethodAnnotation(safName = "much_weaker", keywordType = "condition")
	public boolean isMuchWeaker()
	{
		return this.getNumberOfWeakerStrengths() == 4;
	}
	
	@MethodAnnotation(safName = "even", keywordType = "condition")
	public boolean isEven()
	{
		return this.getNumberOfStrongerStrengths() == this.getNumberOfWeakerStrengths();
	}
	
	@MethodAnnotation(safName = "near", keywordType = "condition")
	public boolean isNear()
	{
		return Math.round(this.position - this.opponentBot.position) < 4;
	}
	
	@MethodAnnotation(safName = "far", keywordType = "condition")
	public boolean isFar()
	{
		return !isNear();
	}
	
	@MethodAnnotation(safName = "always", keywordType = "condition")
	public boolean isAlways()
	{
		return true;
	}
	
	@MethodAnnotation(safName = "jump", keywordType = "move")
	public void jump() {
	}
	
	@MethodAnnotation(safName = "stand", keywordType = "move")
	public void stand() {
	}
	
	@MethodAnnotation(safName = "run_towards", keywordType = "move")
	public void runTowards() {
		moveAway(-2);
		
		System.out.println(this.toString() + " is running towards (" + this.position + ")");
	}
	
	@MethodAnnotation(safName = "run_away", keywordType = "move")
	public void runAway() {
		moveAway(2);

		System.out.println(this.toString() + " is running away (" + this.position + ")");
	}
	
	@MethodAnnotation(safName = "walk_towards", keywordType = "move")
	public void walkTowards() {
		moveAway(-1);
		
		System.out.println(this.toString() + " is walking towards...");
	}
	
	@MethodAnnotation(safName = "walk_away", keywordType = "move")
	public void walkAway() {
		moveAway(1);
	}

	@MethodAnnotation(safName = "punch_low", keywordType = "attack")
	public void punchLow()
	{
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
			System.out.println("invokeMethod exception: " + exception.getMessage());
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
	
	// -------------
	
	protected void moveAway(int speed)
	{
		if (this.position < this.opponentBot.position) {
			this.position -= speed;
		}
		else {
			this.position += speed;
		}
	}
}
