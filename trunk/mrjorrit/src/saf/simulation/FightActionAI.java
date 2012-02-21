package saf.simulation;

import java.util.ArrayList;
import java.util.Random;

import saf.structure.Attribute;
import saf.structure.FightAction;
import saf.structure.FightActionType;
import saf.structure.MoveActionType;


public class FightActionAI 
{
	public static void setFightAction(FighterState fighterState)
	{
		if(fighterState.getCurrentRule() == null)
			return;
		
		ArrayList<FightAction> fightActions = fighterState.getCurrentRule().getFightActions();
		Random randomGenerator = new Random();
		
		fighterState.setCurrentFightActionType(fightActions.get(randomGenerator.nextInt(fightActions.size())).getFightActionType());
	}
	
	
	public static void doFightAction(FighterState fighterState, FighterState otherFighterState)
	{
		if(fighterState.getCurrentFightActionType() == null)
			return;
		
		switch(fighterState.getCurrentFightActionType())
		{		
			case block_low:
				break;
			case block_high:
				break;
			case punch_low:
				if(fighterState.isActionPerform() && (Math.abs(fighterState.getFighterX() - otherFighterState.getFighterX()) <= AttributeAI.getAttributePower(fighterState.getFighter(), Attribute.punchReach)))
					otherFighterState.doDamage(AttributeAI.getAttributePower(fighterState.getFighter(), Attribute.punchPower), FightActionType.punch_low);
				break;
			case punch_high:
				if(fighterState.isActionPerform() && (Math.abs(fighterState.getFighterX() - otherFighterState.getFighterX()) <= AttributeAI.getAttributePower(fighterState.getFighter(), Attribute.punchReach)))
					otherFighterState.doDamage(AttributeAI.getAttributePower(fighterState.getFighter(), Attribute.punchPower), FightActionType.punch_high);
				break;
			case kick_low:
				if(fighterState.isActionPerform() && (Math.abs(fighterState.getFighterX() - otherFighterState.getFighterX()) <= AttributeAI.getAttributePower(fighterState.getFighter(), Attribute.kickReach)))
					otherFighterState.doDamage(AttributeAI.getAttributePower(fighterState.getFighter(), Attribute.kickPower), FightActionType.kick_low);
				break;
			case kick_high:
				if(fighterState.isActionPerform() && (Math.abs(fighterState.getFighterX() - otherFighterState.getFighterX()) <= AttributeAI.getAttributePower(fighterState.getFighter(), Attribute.kickReach)))
					otherFighterState.doDamage(AttributeAI.getAttributePower(fighterState.getFighter(), Attribute.kickPower), FightActionType.kick_high);
				break;
		}
		
		fighterState.setActionPerform(fighterState.getStep() > 50 && fighterState.getStep() < 70);
	}
	
	public static int damageDone(FighterState fighterState, int damage, FightActionType fightActionType)
	{
		switch(fightActionType)
		{
			case block_low:
				break;
			case block_high:
				break;
			case kick_low:
			case punch_low:
				if(fighterState.isActionPerform() && fighterState.getCurrentMoveActionType() == MoveActionType.jump)
					return 0;
				if(fighterState.isActionPerform() && fighterState.getCurrentFightActionType() == FightActionType.block_low)
					return Math.round(damage / 5);
				break;
			case kick_high:
			case punch_high:
				if(fighterState.isActionPerform() && fighterState.getCurrentMoveActionType() == MoveActionType.crouch)
					return 0;
				if(fighterState.isActionPerform() && fighterState.getCurrentFightActionType() == FightActionType.block_high)
					return Math.round(damage / 5);
				break;
		}
		
		return damage;
	}
}
