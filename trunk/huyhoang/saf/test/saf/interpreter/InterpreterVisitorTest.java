package saf.interpreter;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import saf.AllTests;
import saf.ast.ASTNode;
import saf.ast.Fighter;
import saf.ast.definition.Action;
import saf.ast.definition.Behaviour;
import saf.ast.definition.Choose;
import saf.ast.definition.Strength;

public class InterpreterVisitorTest {
	@Test
	public void testValidStrengthAssignment() {
		Fighter fighter = new Fighter("BruceLee");
		Strength strength = new Strength("kickPower", 10);
		fighter.getDefinitions().add(strength);
		
		Bot bot = new Bot(fighter, 0);
		InterpreterVisitor interpreter = new InterpreterVisitor();
		
		assertEquals(5, bot.kickPower);
		interpreter.setBot(bot);
		interpreter.Evaluate(fighter);
		assertEquals(10, bot.kickPower);
	}
	
	@Test
	public void testBooleanExpressions() {
		Fighter bruceLeeAst = AllTests.getFighterAst("BruceLee {" +
						 							 "	even and always [ choose(stand jump) kickHigh ]" +
						 							 "	near or near [ stand kickHigh ]" +
						 							 "}");
		
		Fighter jackieChanAst = AllTests.getFighterAst(	"JackieChan {" +
														"	stronger and weaker [ run_towards punchLow ]" +
														"	always or near [ choose(run_towards jump) punchLow ]" +
						   								"}");

		Bot bruceLeeBot = new Bot(bruceLeeAst, 0);
		Bot jackieChanBot = new Bot(jackieChanAst, 10);
		bruceLeeBot.setOpponentBot(jackieChanBot);
		jackieChanBot.setOpponentBot(bruceLeeBot);
		InterpreterVisitor interpreter = new InterpreterVisitor();

		ASTNode node;
		Behaviour behaviour;
		
		node = bruceLeeAst.getDefinitions().get(0);
		behaviour = (Behaviour)node;
		behaviour.getCondition().setValue(false);
		interpreter.setBot(bruceLeeBot);
		interpreter.Evaluate(bruceLeeAst);
		assertTrue(behaviour.getCondition().getValue());
		
		node = bruceLeeAst.getDefinitions().get(1);
		behaviour = (Behaviour)node;
		behaviour.getCondition().setValue(true);
		interpreter.Evaluate(bruceLeeAst);
		assertFalse(behaviour.getCondition().getValue());
		
		node = jackieChanAst.getDefinitions().get(0);
		behaviour = (Behaviour)node;
		behaviour.getCondition().setValue(true);
		interpreter.setBot(jackieChanBot);
		interpreter.Evaluate(jackieChanAst);
		assertFalse(behaviour.getCondition().getValue());
		
		node = jackieChanAst.getDefinitions().get(1);
		behaviour = (Behaviour)node;
		behaviour.getCondition().setValue(false);
		interpreter.setBot(jackieChanBot);
		interpreter.Evaluate(jackieChanAst);
		assertTrue(behaviour.getCondition().getValue());
	}
	
	@Test
	public void testFight() {
		List<Fighter> fighters = new ArrayList<Fighter>();
		
		fighters.add(AllTests.getFighterAst("BruceLee {" +
											"	always [ walk_towards kick_high ]" +
											"}"));

		fighters.add(AllTests.getFighterAst("JackieChan {" +
											"	always [ walk_towards punch_low ]" +
											"}"));

		List<Bot> bots = new ArrayList<Bot>();
		bots.add(new Bot(fighters.get(0), 0));
		bots.add(new Bot(fighters.get(1), 1));
		
		bots.get(0).setOpponentBot(bots.get(1));
		
		InterpreterVisitor interpreter = new InterpreterVisitor();
		interpreter.setBot(bots.get(0));
		interpreter.Evaluate(bots.get(0).getFighter());
		assertEquals(90, bots.get(1).getHitpoints());
		interpreter.setBot(bots.get(1));
		interpreter.Evaluate(bots.get(1).getFighter());
	}
}