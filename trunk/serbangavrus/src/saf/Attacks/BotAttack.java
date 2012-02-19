package saf.Attacks;

import saf.*;

public abstract class BotAttack {
	protected Bot bot;
	// The damage the attack does to the health of the Bot, defaults to 10
	protected int damage = 10;
	
	public BotAttack(Bot b)
	{
		this.bot = b;
	}
	
	public void doAttack()
	{
		setAttackProp();
		if(bot.isNextToOpponent())
		{
			bot.damageOpponent(damage);
		}
	}
	
	abstract protected void setAttackProp();
	
	// Calculates the damage this attack does
	abstract protected void calculateDamage();
}
