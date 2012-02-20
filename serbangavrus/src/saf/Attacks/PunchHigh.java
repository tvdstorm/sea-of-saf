package saf.attacks;

import saf.Bot;

public class PunchHigh extends BotAttack{

	public PunchHigh(Bot b) {
		super(b);
	}
	
	protected void setAttackProp()
	{
		bot.setPunchHigh(true);
	}
	
	protected void calculateDamage()
	{
		// Damage is equal to punchPower
		damage = bot.getPunchPower();
	}
	
	protected boolean affectsOpponent()
	{
		return bot.isOpponentWithinPunchReach() && !bot.opponentBlockHigh();
	}
	
	public String toString()
	{
		return "PunchHigh";
	}

}
