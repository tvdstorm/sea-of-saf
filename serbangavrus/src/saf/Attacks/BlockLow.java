package saf.attacks;

import saf.Bot;

public class BlockLow extends BotAttack{

	public BlockLow(Bot b) {
		super(b);
	}
	
	protected void setAttackProp()
	{
		bot.setBlockLow(true);
	}
	
	protected void calculateDamage()
	{
		// This attack does no damage
		damage = 0;
	}
	
	protected boolean affectsOpponent()
	{
		return false;
	}
	
	public String toString()
	{
		return "BlockLow";
	}

}
