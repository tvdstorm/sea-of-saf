package safFightAnimation;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;
import safAST.*;
import safAST.action.Action;
import safAST.action.SingleAction;
import safAST.condition.*;
import safAST.enumType.FightActionType;
import safFightAnimation.conditionCheck.SAFAnimationConditionCheck;
import safFightAnimation.config.SAFFightAnimationConfig;
import safFightAnimation.config.SAFMoveAnimationConfig;
import safFightAnimation.config.SAFPreConfig;
import safMessage.SAFWarningMessageDialog;

public class SAFFight implements ISAFFight{
	private SAFStatus safStatus;
	private Bot fighter;
	private SAFPreConfig safConfig;
	private Action safAct;
	private SingleAction safFightAct, safMoveAct;
	private SAFFightAnimationConfig safFightConfig;
	private SAFMoveAnimationConfig safMoveConfig;
	private SAFWarningMessageDialog safWarningDialog;
	private final int differential = 1;
	private final int minDistance = 65;
	
	public SAFFight(Bot bot, Point position, String fileName)
	{
		fighter = bot;
		safConfig = new SAFPreConfig();
		safWarningDialog = new SAFWarningMessageDialog();
		fighter.accept(safConfig);
		safAct = null;
		safStatus = new SAFStatus(bot, position, fileName);
		safFightConfig = safStatus.getSAFFightConfig();
		safMoveConfig = safStatus.getSAFMoveConfig();
		
		if (safConfig.getWarningMessage()!= "")
		{
			safWarningDialog.setWarningMessage(safConfig.getWarningMessage());
			safWarningDialog.setVisible(true);
		}
	}
	
	public void setSAFStatus(SAFAnimationConditionCheck safccv)
	{
		setFighterAction(safccv);
		safFightConfig.setSAFFightAct(safAct);
		safFightAct = safFightConfig.getFightAct();
		safMoveConfig.setSAFMoveAct(safAct);
		safMoveAct = safMoveConfig.getMoveAct();
	}
	
	@Override
	public SAFFight getSAFFight() {
		return this;
	}
	
	@Override
	public SAFStatus getSAFStatus()
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
	
	public int SAFPK(SAFStatus competitor, SingleAction competitorFightAct, SingleAction competitorMoveAct)
	{
		int winPoints = 0;
		String fightAct = safFightAct.getActionName();
		String competitorFAct = competitorFightAct.getActionName();
		
		switch (FightActionType.valueOf(fightAct))
		{
			 case punch_low: 
			 if ((!competitorFAct.equalsIgnoreCase("block_low"))&&(isPKReached(competitor, competitorFightAct, competitorMoveAct)))
				 winPoints = safStatus.getFighterPunchPower();
			 break;
			 
			 case kick_low: 
			 if ((!competitorFAct.equalsIgnoreCase("block_low"))&&(isPKReached(competitor, competitorFightAct, competitorMoveAct)))
				 winPoints = safStatus.getFighterKickPower();
			 break;
			 
			 case punch_high: 
			 if ((!competitorFAct.equalsIgnoreCase("block_high"))&&(isPKReached(competitor, competitorFightAct, competitorMoveAct)))
 				 winPoints = safStatus.getFighterPunchPower();
			 break;
			 
			 case kick_high:
			 if ((!competitorFAct.equalsIgnoreCase("block_high"))&&(isPKReached(competitor, competitorFightAct, competitorMoveAct)))
				 winPoints = safStatus.getFighterKickPower();
			 break;
			 
			 case block_low:
			 if ((!competitorFAct.equalsIgnoreCase("punch_low")||
					 !competitorFAct.equalsIgnoreCase("kick_low"))&&
					 (isPKReached(competitor, competitorFightAct, competitorMoveAct)))
			 {
				 if (competitorFAct.contains("punch"))
					 winPoints = -competitor.getFighterPunchPower();
				 if (competitorFAct.contains("kick"))
					 winPoints = -competitor.getFighterKickPower();
			 }
			 break;
			 
			 case block_high:
			 if ((!competitorFAct.equalsIgnoreCase("punch_high")||
					 !competitorFAct.equalsIgnoreCase("kick_high"))&&
					 (isPKReached(competitor, competitorFightAct, competitorMoveAct)))
			 {
				 if (competitorFAct.contains("punch"))
					 winPoints = -competitor.getFighterPunchPower();
				 if (competitorFAct.contains("kick"))
					 winPoints = -competitor.getFighterKickPower();
			 }
			 break;
			 
			 default: 
			 winPoints = 0;
			 break;
		}
		
		return winPoints;
	}
	
	private boolean isPKReached(SAFStatus competitor, SingleAction competitorFightAct, SingleAction competitorMoveAct)
	{
		boolean isReached = false;
		int distance = Math.abs(safMoveConfig.getPosition().x - competitor.getSAFMoveConfig().getPosition().x);
		String actName = safFightAct.getActionName();
		SAFStatus attacker;
		SingleAction defenderMoveAct, attackerFightAct;
		
		if (actName.contains("block"))
		{
			attacker = competitor;
			attackerFightAct = competitorFightAct;
			actName = attackerFightAct.getActionName();
			defenderMoveAct = safMoveAct;
		}else
		{
			attacker = safStatus;
			attackerFightAct = safFightAct;
			defenderMoveAct = competitorMoveAct;
		}
		
		if (actName.contains("punch"))
			if (((attacker.getFighterPunchReach() + differential + minDistance) >= distance)&&(!isPKMissed(attackerFightAct, defenderMoveAct)))
				isReached = true;
		if (actName.contains("kick"))
			if (((attacker.getFighterKickReach() + differential + minDistance) >= distance)&&(!isPKMissed(attackerFightAct, defenderMoveAct)))
				isReached = true;
		
		return isReached;
	}
	
	private boolean isPKMissed(SingleAction attackerFightAct, SingleAction defenderMoveAct)
	{
		boolean isMissed = false;
		String actName = attackerFightAct.getActionName();
		
		if ((defenderMoveAct.getActionName()).equalsIgnoreCase("jump") && actName.contains("low"))
			isMissed = true;
		if ((defenderMoveAct.getActionName()).equalsIgnoreCase("crouch") && actName.contains("high"))
			isMissed = true;
		
		return isMissed;
	}
		
	private void setFighterAction(SAFAnimationConditionCheck safccv)
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
		ArrayList<Behaviour> bs = fighter.getBehaviour();
		return bs.get(r.nextInt(bs.size()));
	}
	
	private Action findAlwaysAction()
	{
		for (Behaviour b : fighter.getBehaviour())
			if ((b.getCondition() instanceof SingleCondition) && (((SingleCondition)b.getCondition()).getConditionName().equalsIgnoreCase("always")))
				return b.getAction();
			
		return null;
	}

	
}