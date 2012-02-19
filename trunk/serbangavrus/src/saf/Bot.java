package saf;

import saf.Moves.*;
import saf.Attacks.*;
import saf.Moves.RunTowards;
import nodes.*;

public class Bot {
	
	private Bot opponent;
	private String botName = "";
	
	// The Fighter object contains the personality and tactics of the fighter collected from the SAF specifications 
	private Fighter fighter;
	
	// Current move and attack the Bot is engaged in
	private BotMove currentmove = null;
	private BotAttack currentattack = null;
	
	// BotTactic helps with fetching the move and attack(that appear in the SAF specifications) to be performed by the Bot
	private BotTactic tactic = null;
	
	// Values that describe the state of the bot
	private boolean jump = false, crouch = false, stand = false;
	// Attack related states
	private boolean punchLow = false, punchHigh = false, kickLow = false, kickHigh = false, blockLow = false, blockHigh = false;

	// The health of the Bot, 100 is maximum. If health is below 0 the Bot is defeated
	private int health;

	// The bot's position in the arena
	private int position;
	
	// This value indicates what distance from the opponent is considered safe
	private int awayPositions;
	
	// This value indicates what distance from the opponent is considered near
	private int nearPositions;

	// Bot's strengths
	private int punchReach, kickReach, kickPower, punchPower, speed;
	
	private Logger logger;

	public Bot(Fighter f, int position)
	{
		this.position = position;
		fighter = f;
		
		// Full health is 100
		health = 100;
		
		// Set the strengths
		BotPersonality bp = new BotPersonality(fighter.getPersonality());
		punchReach = bp.getPunchReach();
		kickReach = bp.getKickReach();
		kickPower = bp.getKickPower();
		punchPower = bp.getPunchPower();
		
		speed = this.calculateSpeed();
		botName	= f.getName();
		logger = new Logger(botName);
	}

	// Set's the currentmove and currentattack based on the opponent's properties
	public void establishTactic()
	{
		if(currentmove == null || currentmove.isCompleted())
		{
			currentmove = getBotMove();
		}
		
		currentattack = getBotAttack();
	}
	
	public void doTactic()
	{
		logger.log("Move is " + currentmove);
		resetMoves();
		currentmove.doMove();
		
		logger.log("Attacking with " + currentattack);
		resetAttacks();
		currentattack.doAttack();
		
		logger.log("Health is: " + health);
	}
	
	public void damageOpponent(int damage)
	{
		opponent.damage(damage);
	}
	
	// Returns the move from the current tactic
	private BotMove getBotMove()
	{
		if(tactic == null)
		{
			tactic = getTactic();
		}
		// This is where is analyze the nodes and get the move
		return tactic.getBotMove();
	}
	
	// Returns the attack from the current tactic
	private BotAttack getBotAttack()
	{
		if(tactic == null)
		{
			tactic = getTactic();
		}
		// This is where is analyze the nodes and get the move
		return tactic.getBotAttack();
	}
	
	// Instantiates the tactic property
	private BotTactic getTactic()
	{
		return new BotTactic(fighter, this, opponent);
	}
	
	// Calculates the Bot's speed based on it's strengths
	private int calculateSpeed()
	{
		int weight = (punchPower + kickPower) / 2;
		int height = (punchReach + kickReach) / 2;
		return (int)Math.round(Math.abs(0.5*(height-weight)));
	}
	
	// Sets the opponent and calculates the values dependant on it
	public void addOpponent(Bot opponent)
	{
		this.opponent = opponent;
		
		// Calculate what distance is considered safe from the opponent, respectively near the opponent
		awayPositions = Math.max(opponent.getPunchReach(), opponent.getKickReach());
		nearPositions = Math.min(getPunchReach(), getKickReach());
	}
	
	public int getPosition()
	{
		return position;
	}
	
	public int getHealth()
	{
		return health;
	}
	
	public void setPosition(int newPosition)
	{
		position = newPosition;
	}
	

	public int getOpponentPosition()
	{
		return opponent.getPosition();
	}
		
	
	// Returns true if Bot is defeated, false otherwise
	public boolean isDefeated()
	{
		if(health > 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public int getSpeed()
	{
		return speed;
	}
	
	// Decreases the health of the Bot
	public void damage(int damage)
	{
		health = health - damage;
	}
	
	public void setPunchLow(Boolean val)
	{
		punchLow = val;
	}
	
	public void setPunchHigh(Boolean val)
	{
		punchHigh = val;
	}
	
	public void setKickHigh(Boolean val)
	{
		kickHigh = val;
	}
	
	public void setKickLow(Boolean val)
	{
		kickLow = val;
	}
	
	public void setBlockLow(Boolean val)
	{
		blockLow = val;
	}
	
	public void setBlockHigh(Boolean val)
	{
		blockHigh = val;
	}
	
	// Returns the distance between the bot and it's opponent
	public int opponentDistance()
	{
		return Math.abs(getPosition() - getOpponentPosition()); 
	}
	
	// Returns weather or not the opponent is Far
	// Far means distance greater that the opponent's reach
	public boolean isOpponentFar()
	{
		if(opponentDistance() > awayPositions)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// Returns weather or not the opponent is Near
	// Near means distance within the Bot's reach
	public boolean isOpponentNear()
	{
		if(opponentDistance() <= nearPositions)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// Returns weather or not the opponent is weaker
	public boolean isOpponentWeaker()
	{
		if(getStrengthDifference() > 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// Returns weather or not the opponent is much weaker
	public boolean isOpponentMuchWeaker()
	{
		if(getStrengthDifference() > 4)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// Returns weather or not the opponent is stronger
	public boolean isOpponentStronger()
	{
		if(getStrengthDifference() < 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// Returns weather or not the opponent is much weaker
	public boolean isOpponentMuchStronger()
	{
		if(getStrengthDifference() < -4)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// Returns weather or not the opponent has the same strength
	public boolean isOpponentEven()
	{
		if(getStrengthDifference() == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// Returns the difference between this Bot's strenght and it's opponent's
	public int getStrengthDifference()
	{
		int strengthDif = getTotalStrength() - opponent.getTotalStrength();
		return strengthDif;
	}
	
	// Returns the total strength of the Bot
	public int getTotalStrength()
	{
		int totalStrength;
		totalStrength = punchReach + kickReach + kickPower + punchPower;
		return totalStrength;
	}
	
	// Sets the position of the bot a few positions to the east 
	public void moveEast(int positionsToMove)
	{
		int newPosition = position + positionsToMove;
		// Make sure the Bot does not get out of the arena
		if(!Arena.isPositionInArena(newPosition))
		{
			position = Arena.getEastmostPosition();
		}
		else
		{
			position = newPosition;
		}
	}
	
	// Sets the position of the bot a few positions to the west
	public void moveWest(int positionsToMove)
	{
		int newPosition = position - positionsToMove;
		// Make sure the Bot does not get out of the arena
		if(!Arena.isPositionInArena(newPosition))
		{
			position = Arena.getWestmostPosition();
		}
		else
		{
			position = newPosition;
		}
	}
	
	public boolean isAtArenaMargin()
	{
		if(position == Arena.getWestmostPosition() || position == Arena.getEastmostPosition())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// Sets all attack related booleans to false
	public void resetAttacks()
	{
		punchLow = false;
		punchHigh = false;
		kickLow = false;
		kickHigh = false;
		blockLow = false;
		blockHigh = false;
	}
	
	// Sets all move related booleans to false
	public void resetMoves()
	{
		jump = false;
		crouch = false;
		stand = false;
	}
	
	public void setJump(boolean j)
	{
		jump = j;
	}
	
	public void setCrouch(boolean c)
	{
		crouch = c;
	}
	
	public void setStand(boolean s)
	{
		stand = s;
	}
	
	public int getPunchPower()
	{
		return punchPower;
	}
	
	public int getPunchReach()
	{
		return punchReach;
	}
	
	public int getKickPower()
	{
		return kickPower;
	}
	
	public int getKickReach()
	{
		return kickReach;
	}
	
	public boolean getBlockLow()
	{
		return blockLow;
	}
	
	public boolean getBlockHigh()
	{
		return blockHigh;
	}
	
	public boolean opponentBlockHigh()
	{
		return opponent.getBlockHigh();
	}
	
	public boolean opponentBlockLow()
	{
		return opponent.getBlockLow();
	}
	
	public void log(String msg)
	{
		logger.log(msg);
	}
	
	public int getNearPositions()
	{
		return nearPositions;
	}
	
	public int getAwayPositions()
	{
		return awayPositions;
	}
	
	public boolean isOpponentWithinKickReach()
	{
		return opponentDistance() <= kickReach;
	}
	
	public boolean isOpponentWithinPunchReach()
	{
		return opponentDistance() <= punchReach;
	}
	
	public String getBotName()
	{
		return botName;
	}
	
}
