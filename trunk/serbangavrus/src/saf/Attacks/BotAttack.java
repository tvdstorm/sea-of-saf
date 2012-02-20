package saf.attacks;

import saf.*;

public abstract class BotAttack {
	protected Bot bot;
	// The damage the attack does to the health of the Bot, defaults to 10
	protected int damage = 10;

	public BotAttack(Bot b)
	{
		this.bot = b;
		calculateDamage();
	}

	public void doAttack()
	{
		setAttackProp();
		if(affectsOpponent())
		{
			bot.damageOpponent(damage);
		}
	}

	// Updates the state of the Bot doing this attack
	abstract protected void setAttackProp();

	// Calculates the damage this attack does
	abstract protected void calculateDamage();
	
	// Does the attack affect the opponent?
	abstract protected boolean affectsOpponent();
}
