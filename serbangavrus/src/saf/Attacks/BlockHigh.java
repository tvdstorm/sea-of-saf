package saf.Attacks;

import saf.Bot;

public class BlockHigh extends BotAttack{

	public BlockHigh(Bot b) {
		super(b);
	}
	
	protected void setAttackProp()
	{
		bot.setBlockHigh(true);
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
		return "BlockHigh";
	}

}
