package saf.attacks;

import saf.Bot;

public class PunchLow extends BotAttack{

	public PunchLow(Bot b) {
		super(b);
	}
	
	protected void setAttackProp()
	{
		bot.setPunchLow(true);
	}
	
	protected void calculateDamage()
	{
		// Damage is equal to punchPower
		damage = bot.getPunchPower();
	}
	
	protected boolean affectsOpponent()
	{
		return bot.isOpponentWithinPunchReach()  && !bot.opponentBlockLow();
	}
	
	public String toString()
	{
		return "PunchLow";
	}

}
