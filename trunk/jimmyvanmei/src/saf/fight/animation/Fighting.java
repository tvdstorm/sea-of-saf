package saf.fight.animation;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import saf.ast.*;
import saf.ast.action.Action;
import saf.ast.action.SingleAction;
import saf.ast.condition.*;
import saf.ast.enumType.FightActionType;
import saf.fight.action.FightAct;
import saf.fight.action.MoveAct;
import saf.fight.action.SideEnum;
//import saf.fight.action.SAFPreConfig;
import saf.fight.validate.ValidateCondition;
import saf.message.dialog.WarningDialog;

public class Fighting implements IFighting{
	private Status safStatus;
	private Bot fighter;
	private Action safAct;
	private SingleAction safFightAct, safMoveAct;
	private FightAct safFightConfig;
	private MoveAct safMoveConfig;
	
	private final int differential = 0;
	private final int minDistance = 65;
	
	public Fighting(Bot bot, Point position, String fileName, SideEnum s)
	{
		fighter = bot;
		safAct = null;
		safStatus = new Status(bot, position, fileName, s);
		safFightConfig = safStatus.getFightStatus();
		safMoveConfig = safStatus.getMoveStatus();
	}
	
	public void setSAFStatus(ValidateCondition safccv)
	{
		setFighterAction(safccv);
		safFightConfig.setSAFFightAct(safAct);
		safFightAct = safFightConfig.getFightAct();
		safMoveConfig.setSAFMoveAct(safAct);
		safMoveAct = safMoveConfig.getMoveAct();
	}
	
	@Override
	public Fighting getSAFFight() {
		return this;
	}
	
	@Override
	public Status getSAFStatus()
	{
		return safStatus;
	}
	
	@Override
	public Action getSAFAction()
	{
		return safAct;
	}
	
	public SingleAction getSAFFightAction()
	{
		return safFightAct;
	}
	
	public SingleAction getSAFMoveAction()
	{
		return safMoveAct;
	}
	
	public int SAFPK(Status competitor, SingleAction competitorFightAct, SingleAction competitorMoveAct)
	{
		int winPoints = 0;
		String fightAct = safFightAct.getSingleAct();
		String competitorFAct = competitorFightAct.getSingleAct();
		
		switch (FightActionType.valueOf(fightAct))
		{
			 case punch_low: 
			 if ((!competitorFAct.equalsIgnoreCase("block_low"))&&(isPKReached(competitor, competitorFightAct, competitorMoveAct)))
				 winPoints = safStatus.getPunchPower();
			 break;
			 
			 case kick_low: 
			 if ((!competitorFAct.equalsIgnoreCase("block_low"))&&(isPKReached(competitor, competitorFightAct, competitorMoveAct)))
				 winPoints = safStatus.getKickPower();
			 break;
			 
			 case punch_high: 
			 if ((!competitorFAct.equalsIgnoreCase("block_high"))&&(isPKReached(competitor, competitorFightAct, competitorMoveAct)))
 				 winPoints = safStatus.getPunchPower();
			 break;
			 
			 case kick_high:
			 if ((!competitorFAct.equalsIgnoreCase("block_high"))&&(isPKReached(competitor, competitorFightAct, competitorMoveAct)))
				 winPoints = safStatus.getKickPower();
			 break;
			 
			 case block_low:
			 if ((!competitorFAct.equalsIgnoreCase("punch_low")||
					 !competitorFAct.equalsIgnoreCase("kick_low"))&&
					 (isPKReached(competitor, competitorFightAct, competitorMoveAct)))
			 {
				 if (competitorFAct.contains("punch"))
					 winPoints = -competitor.getPunchPower();
				 if (competitorFAct.contains("kick"))
					 winPoints = -competitor.getKickPower();
			 }
			 break;
			 
			 case block_high:
			 if ((!competitorFAct.equalsIgnoreCase("punch_high")||
					 !competitorFAct.equalsIgnoreCase("kick_high"))&&
					 (isPKReached(competitor, competitorFightAct, competitorMoveAct)))
			 {
				 if (competitorFAct.contains("punch"))
					 winPoints = -competitor.getPunchPower();
				 if (competitorFAct.contains("kick"))
					 winPoints = -competitor.getKickPower();
			 }
			 break;
			 
			 default: 
			 winPoints = 0;
			 break;
		}
		
		return winPoints;
	}
	
	private boolean isPKReached(Status competitor, SingleAction competitorFightAct, SingleAction competitorMoveAct)
	{
		boolean isReached = false;
		int distance = Math.abs(safMoveConfig.getPosition().x - competitor.getMoveStatus().getPosition().x);
		String actName = safFightAct.getSingleAct();
		Status attacker;
		SingleAction defenderMoveAct, attackerFightAct;
		
		if (actName.contains("block"))
		{
			attacker = competitor;
			attackerFightAct = competitorFightAct;
			actName = attackerFightAct.getSingleAct();
			defenderMoveAct = safMoveAct;
		}else
		{
			attacker = safStatus;
			attackerFightAct = safFightAct;
			defenderMoveAct = competitorMoveAct;
		}
		
		if (actName.contains("punch"))
			if (((attacker.getPunchReach() + differential + minDistance) >= distance)&&(!isPKMissed(attackerFightAct, defenderMoveAct)))
				isReached = true;
		if (actName.contains("kick"))
			if (((attacker.getKickReach() + differential + minDistance) >= distance)&&(!isPKMissed(attackerFightAct, defenderMoveAct)))
				isReached = true;
		
		return isReached;
	}
	
	private boolean isPKMissed(SingleAction attackerFightAct, SingleAction defenderMoveAct)
	{
		boolean isMissed = false;
		String actName = attackerFightAct.getSingleAct();
		
		if ((defenderMoveAct.getSingleAct()).equalsIgnoreCase("jump") && actName.contains("low"))
			isMissed = true;
		if ((defenderMoveAct.getSingleAct()).equalsIgnoreCase("crouch") && actName.contains("high"))
			isMissed = true;
		
		return isMissed;
	}
		
	private void setFighterAction(ValidateCondition safccv)
	{
		Behaviour tempBehaviour = getRandomBehaviour();
		Condition tempCond = tempBehaviour.getCondition();
		
		if (tempCond.accept(safccv))
			safAct = tempBehaviour.getAction();
		
		if (safAct == null)
			safAct = findAlwaysAction();
	}
	
	private Behaviour getRandomBehaviour()
	{
		Random r = new Random();
		List<Behaviour> bs = fighter.getBehaviour();
		return bs.get(r.nextInt(bs.size()));
	}
	
	private Action findAlwaysAction()
	{
		for (Behaviour b : fighter.getBehaviour())
			try
			{
				if (((SingleCondition)b.getCondition()).getConditionName().equalsIgnoreCase("always"))
					return b.getAction();
			}
			catch (ClassCastException e)
			{
				continue;
			}
		return null;
	}

	
}