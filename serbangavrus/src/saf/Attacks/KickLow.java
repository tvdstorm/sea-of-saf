package saf.Attacks;

import saf.Bot;

public class KickLow extends BotAttack{

	public KickLow(Bot b) {
		super(b);
	}
	
	protected void setAttackProp()
	{
		bot.setKickHigh(true);
	}
	
	protected void calculateDamage()
	{
		// Damage is equal to kickPower
		damage = bot.getKickPower();
	}
	
	protected boolean affectsOpponent()
	{
		return bot.isOpponentWithinKickReach() && !bot.opponentBlockLow();
	}
	
	public String toString()
	{
		return "KickLow";
	}

}
