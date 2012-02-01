package Game;

import java.util.List;
import saf.ast.Function;

/**
 * The fighter bot.
 * 
 * @author huyhoang
 */
public class FighterBot
{
	public int kickReach = 5;
	public int punchReach = 5;
	public int kickPower = 5;
	public int punchPower = 5;
	
	private FighterBot opponentBot;
	
	public void setOpponentBot(FighterBot opponentBot)
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
	
	public void choose(String firstParameter, String secondParameter)
	{
		// needs to implement random call and then invoke method using reflection
	}

	@MethodAnnotation(safName = "stronger", keywordType = "condition")
	public boolean isStronger()
	{
		// please implement real game logic
		return true;
	}
	
	@MethodAnnotation(safName = "weaker", keywordType = "condition")
	public boolean isWeaker()
	{
		// please implement real game logic
		return true;
	}
	
	@MethodAnnotation(safName = "much_stronger", keywordType = "condition")
	public boolean isMuchStronger()
	{
		// please implement real game logic
		return true;
	}
	
	@MethodAnnotation(safName = "much_weaker", keywordType = "condition")
	public boolean isMuchWeaker()
	{
		// please implement real game logic
		return true;		
	}
	
	@MethodAnnotation(safName = "even", keywordType = "condition")
	public boolean isEven()
	{
		// please implement real game logic
		return true;
	}
	
	@MethodAnnotation(safName = "near", keywordType = "condition")
	public boolean isNear()
	{
		// please implement real game logic
		return true;
	}
	
	@MethodAnnotation(safName = "far", keywordType = "condition")
	public boolean isFar()
	{
		// please implement real game logic
		return true;
	}
	
	@MethodAnnotation(safName = "always", keywordType = "condition")
	public boolean isAlways()
	{
		return true;
	}
	
	@MethodAnnotation(safName = "jump", keywordType = "move")
	public void jump()
	{
	}

	@MethodAnnotation(safName = "run_towards", keywordType = "move")
	public void runTowards()
	{
	}
	
	@MethodAnnotation(safName = "choose", keywordType = "saf")
	public void choose( List<Function> functions )
	{
	}
	
	// -------------
	
	public void processGameTick()
	{
		
	}
}
