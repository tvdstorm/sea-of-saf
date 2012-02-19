package saf.Attacks;

import saf.Bot;

public class PunchLow extends BotAttack{

	public PunchLow(Bot b) {
		super(b);
	}
	
	protected void setAttackProp()
	{
		bot.setPunchLow();
	}
	
	protected void calculateDamage()
	{
		// Damage is punchPower% of the default damage
		damage = damage * (bot.getPunchPower() / 100);
	}
	
	public String toString()
	{
		return "PunchLow";
	}

}
