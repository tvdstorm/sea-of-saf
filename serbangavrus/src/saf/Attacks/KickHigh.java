package saf.attacks;

import saf.Bot;

public class KickHigh extends BotAttack{

	public KickHigh(Bot b) {
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
	
	// This attack affects the opponent only if it's in our kick range and is not blocking
	protected boolean affectsOpponent()
	{
		return bot.isOpponentWithinKickReach() && !bot.opponentBlockHigh();
	}
	
	public String toString()
	{
		return "KickHigh";
	}

}
