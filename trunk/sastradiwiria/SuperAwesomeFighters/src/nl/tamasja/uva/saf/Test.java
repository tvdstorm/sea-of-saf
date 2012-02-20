package nl.tamasja.uva.saf;


import nl.tamasja.uva.saf.fighter.*;
import nl.tamasja.uva.saf.fighter.SpecificationMapper.Strength;
import nl.tamasja.uva.saf.fighter.action.*;
import nl.tamasja.uva.saf.fighter.actions.ActionBlockHigh;
import nl.tamasja.uva.saf.fighter.actions.ActionBlockLow;
import nl.tamasja.uva.saf.fighter.actions.ActionCrouch;
import nl.tamasja.uva.saf.fighter.actions.ActionJump;
import nl.tamasja.uva.saf.fighter.actions.ActionKickHigh;
import nl.tamasja.uva.saf.fighter.actions.ActionKickLow;
import nl.tamasja.uva.saf.fighter.actions.ActionPunchHigh;
import nl.tamasja.uva.saf.fighter.actions.ActionPunchLow;
import nl.tamasja.uva.saf.fighter.actions.ActionRunAway;
import nl.tamasja.uva.saf.fighter.actions.ActionRunTowards;
import nl.tamasja.uva.saf.fighter.actions.ActionStand;
import nl.tamasja.uva.saf.fighter.actions.ActionWalkAway;
import nl.tamasja.uva.saf.fighter.actions.ActionWalkTowards;
import nl.tamasja.uva.saf.fighter.condition.*;
import nl.tamasja.uva.saf.fighter.conditions.AlwaysCondition;
import nl.tamasja.uva.saf.graphics.DrawFighter;
import nl.tamasja.uva.saf.graphics.IFighterGraphics;

public class Test {
	
	
	public FighterBot Fighter1() {
		Behaviour b = new Behaviour();
		Personality p = new Personality();
		
		p.AddStat(Strength.KICK_POWER, 9);
		p.AddStat(Strength.PUNCH_POWER, 1);
		
		p.AddStat(Strength.KICK_REACH, 1);
		p.AddStat(Strength.PUNCH_REACH, 9);
		
		Choose c1m = new Choose();
		c1m.AddChoice(new BehaviourActionClass(new ActionJump()));
		c1m.AddChoice(new BehaviourActionClass(new ActionCrouch()));
		
		c1m.AddChoice(new BehaviourActionClass(new ActionWalkTowards()));
		c1m.AddChoice(new BehaviourActionClass(new ActionWalkAway()));
		
		c1m.AddChoice(new BehaviourActionClass(new ActionRunAway()));
		c1m.AddChoice(new BehaviourActionClass(new ActionRunTowards()));
		c1m.AddChoice(new BehaviourActionClass(new ActionStand()));
		
		Choose c1f = new Choose();
		c1f.AddChoice(new BehaviourActionClass(new ActionBlockLow()));
		c1f.AddChoice(new BehaviourActionClass(new ActionBlockHigh()));
		
		c1f.AddChoice(new BehaviourActionClass(new ActionPunchHigh()));
		c1f.AddChoice(new BehaviourActionClass(new ActionPunchLow()));
		
		c1f.AddChoice(new BehaviourActionClass(new ActionKickHigh()));
		c1f.AddChoice(new BehaviourActionClass(new ActionKickLow()));
		
		
		//new BehaviourActionClass(new ActionBlockHigh())
		
		//		new Choose(
		//				new BehaviourActionClass(new ActionBlockLow()),
		//				new BehaviourActionClass(new ActionPunchHigh())
		//		)
		
		//b.AddRule(new BehaviourRule(new FarCondition(),new WalkTowardsAction(), new PunchHighAction()));

		b.AddRule(new BehaviourRule(	new AlwaysCondition(),	c1m,	c1f		));
		
		/*
		Behaviour bx = new Behaviour();
		bx.AddRule(new BehaviourRule(
				new AlwaysCondition(),
				new Choose(new BehaviourActionClass(new ActionWalkTowards()),new BehaviourActionClass(new ActionRunTowards())), 
						new Choose(
								new BehaviourActionClass(new ActionBlockHigh()),
								new BehaviourActionClass(new ActionBlockLow())
						)
		));
		*/
	
		//IFighterGraphics g = (IFighterGraphics) new FighterDisplay();
		IFighterGraphics fg1 = new DrawFighter(200);
		FighterBot bot = new FighterBot("Bot1",b,p,fg1);
		return bot;
	}
	
	public FighterBot Fighter2() {
		Behaviour b2 = new Behaviour();
		Personality p2 = new Personality();
		
		p2.AddStat(Strength.KICK_POWER, 3);
		p2.AddStat(Strength.PUNCH_POWER, 8);
		
		p2.AddStat(Strength.KICK_REACH, 6);
		p2.AddStat(Strength.PUNCH_REACH, 1);

		
		Choose c1m = new Choose();
		c1m.AddChoice(new BehaviourActionClass(new ActionJump()));
		c1m.AddChoice(new BehaviourActionClass(new ActionCrouch()));
		
		c1m.AddChoice(new BehaviourActionClass(new ActionWalkTowards()));
		c1m.AddChoice(new BehaviourActionClass(new ActionWalkAway()));
		
		c1m.AddChoice(new BehaviourActionClass(new ActionRunAway()));
		c1m.AddChoice(new BehaviourActionClass(new ActionRunTowards()));
		c1m.AddChoice(new BehaviourActionClass(new ActionStand()));
		
		Choose c1f = new Choose();
		c1f.AddChoice(new BehaviourActionClass(new ActionBlockLow()));
		c1f.AddChoice(new BehaviourActionClass(new ActionBlockHigh()));
		
		c1f.AddChoice(new BehaviourActionClass(new ActionPunchHigh()));
		c1f.AddChoice(new BehaviourActionClass(new ActionPunchLow()));
		
		c1f.AddChoice(new BehaviourActionClass(new ActionKickHigh()));
		c1f.AddChoice(new BehaviourActionClass(new ActionKickLow()));
		
	//	b2.AddRule(new BehaviourRule(new FarCondition(),new WalkTowardsAction(), new PunchHighAction()));
		
		b2.AddRule(new BehaviourRule(new AlwaysCondition(),c1m,c1f));
		/*
		b2.AddRule(new BehaviourRule(new AlwaysCondition(),new BehaviourActionClass(new ActionJump()),
				new Choose(
						new BehaviourActionClass(new ActionPunchLow()),
						new BehaviourActionClass(new ActionPunchHigh())
				)
				));
		*/
		IFighterGraphics fg1 = new DrawFighter(200);
		FighterBot bot2 = new FighterBot("Bot2",b2,p2,fg1);
		return bot2;
	}
	
}
