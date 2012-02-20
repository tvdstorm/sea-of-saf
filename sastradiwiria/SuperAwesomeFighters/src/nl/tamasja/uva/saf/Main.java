package nl.tamasja.uva.saf;


import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import nl.tamasja.uva.saf.fighter.Behaviour;
import nl.tamasja.uva.saf.fighter.BehaviourRule;
import nl.tamasja.uva.saf.fighter.FighterBot;
import nl.tamasja.uva.saf.fighter.Personality;
import nl.tamasja.uva.saf.fighter.SpecificationMapper;
import nl.tamasja.uva.saf.fighter.action.*;
import nl.tamasja.uva.saf.fighter.condition.*;
import nl.tamasja.uva.saf.graphics.DrawFighter;

import nl.tamasja.uva.saf.tree.ErrorMessage;

import nl.tamasja.uva.saf.tree.FighterAstChecker;
import nl.tamasja.uva.saf.tree.ast.*;

public class Main {

	/**
	 * @param args
	 */
	

	

	
	public static void main(String[] args) {
		
		
		//SpecificationMapper sm = new SpecificationMapper();
		
		//SpecificationMapper.Strength s = sm.MapStrength("kickReach");
		
		//System.out.println(s);
		//new Game();
		//new Board();
		
		//FighterTraverser visitor = new FighterTraverser();
		
		
		//BotLoader botLoader = new BotLoader();
		
		//Fighter fighter = botLoader.loadFile("bots/error.saf");
		
		

		/*
		fighter.accept(visitor);
		
		
		ArrayList<ErrorMessage> astErrors = visitor.getErrors();
		
		for(ErrorMessage e: astErrors) {
			System.out.println(e.getMessage());
		}
		
		if(astErrors.size() > 0) {

		} else {
			System.out.println("AST good!");
		}
		
		*/
		
	//	FighterLoader loader = new FighterLoader();
	//	FighterBot fighterBot = loader.load(fighter);
		
	//	System.out.println(fighterBot);
		
		/*
		*/
		//System.out.println(fighter.toString());
		
		//fighter.accept(visitor);
		//traverser.visit(fighter);
		/*
		 * _ _ x _ _ _ x _ _
		 */
		/*
		Behaviour b = new Behaviour();
		Personality p = new Personality();
		
		p.AddStat("kickPower", 9);
		p.AddStat("punchPower", 9);
		
		p.AddStat("kickReach", 9);
		p.AddStat("punchReach", 9);
		
		Choose c1m = new Choose();
		c1m.AddChoice(new BehaviourActionClass(new ActionJump()));
		c1m.AddChoice(new BehaviourActionClass(new ActionCrouch()));
		c1m.AddChoice(new BehaviourActionClass(new ActionWalkAway()));
		c1m.AddChoice(new BehaviourActionClass(new ActionRunAway()));
		
		
		Choose c1f = new Choose();
		c1f.AddChoice(new BehaviourActionClass(new ActionBlockLow()));
		c1f.AddChoice(new BehaviourActionClass(new ActionPunchHigh()));
		c1f.AddChoice(new BehaviourActionClass(new ActionPunchLow()));
		
		
		//new BehaviourActionClass(new ActionBlockHigh())
		
		//		new Choose(
		//				new BehaviourActionClass(new ActionBlockLow()),
		//				new BehaviourActionClass(new ActionPunchHigh())
		//		)

		b.AddRule(new BehaviourRule(	new NearCondition(),	c1m,	c1f		));
		
	//	b.AddRule(new BehaviourRule(new FarCondition(),new WalkTowardsAction(), new PunchHighAction()));
		b.AddRule(new BehaviourRule(
				new AlwaysCondition(),
				new Choose(new BehaviourActionClass(new ActionWalkTowards()),new BehaviourActionClass(new ActionRunTowards())), 
						new Choose(
								new BehaviourActionClass(new ActionBlockLow()),
								new BehaviourActionClass(new ActionBlockHigh())
						)
		));
		
		FighterBot bot = new FighterBot("Bot1",b,p);
		
		Behaviour b2 = new Behaviour();
		Personality p2 = new Personality();
		p2.AddStat("kickPower", 1);
		p2.AddStat("punchPower", 1);
		
		p2.AddStat("kickReach", 1);
		p2.AddStat("punchReach", 1);
		
	//	b2.AddRule(new BehaviourRule(new FarCondition(),new WalkTowardsAction(), new PunchHighAction()));
		b2.AddRule(new BehaviourRule(new AlwaysCondition(),
				new Choose(
						new BehaviourActionClass(new ActionWalkTowards()),
						new BehaviourActionClass(new ActionCrouch())),
				new Choose(
						new BehaviourActionClass(new ActionPunchLow()),
						new BehaviourActionClass(new ActionPunchHigh())
				)
		));
		FighterBot bot2 = new FighterBot("Bot2",b2,p2);
		bot.position = 0;
		bot2.position = 100;
		
		bot.SetEnemyFighter(bot2);
		bot2.SetEnemyFighter(bot);
		
		System.out.println("============ ROUND START ==============");
		for(int i = 0; i < 50000; i++) {
		
		
		//	System.out.println("Pos: "+bot.position+" <-> "+bot2.position);
		//	System.out.println("HP: "+bot.getHealth() +" <-> "+bot2.getHealth());
			
			
			if(bot.isKnockOut() || bot2.isKnockOut()) break;
			
			if(bot.getSpeed() >= bot2.getSpeed()) {
				bot.act();
				bot2.act();
			} else {
				bot2.act();
				bot.act();
			}
			
			 

			System.out.println("- - - - - - - - - - - - -");
			
		}
		System.out.println("============ ROUND FINISHED ==============");
		if(bot.isKnockOut()) {
			FighterBot winner = bot;
		} else {
			
		}
		
		FighterBot winner = bot.isKnockOut() ? bot2 : bot;
		System.out.println("WINNER: "+winner.getName());
		
		
		
		double speed = bot.getSpeed();
		double speed2 = bot2.getSpeed();
		System.out.println("Speed: B1: "+speed+" <-> B2: "+speed2);
		//System.out.println("Power: B1: "+bot.getPower()+" <-> B2: "+bot2.getPower());
		*/
		
		
	}
}