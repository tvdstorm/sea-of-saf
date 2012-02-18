package saf.interpreter;

import static org.junit.Assert.*;
import org.junit.Test;

import saf.AllTests;
import saf.ast.ASTNode;
import saf.ast.Fighter;
import saf.ast.definition.Behaviour;
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
		interpreter.Evaluate(fighter, bot);
		assertEquals(10, bot.kickPower);
	}
	
	@Test
	public void testBooleanExpressions() {
		Fighter bruceLeeAst = AllTests.getFighterAst("BruceLee {" +
													 "	even and always [ stand kickHigh ]" +
													 "	near or near [ stand kickHigh ]" +
													 "}");
		Fighter jackieChanAst = AllTests.getFighterAst("JackieChan {" +
													   "	stronger and weaker [ run_towards punchLow ]" +
													   "	always or near [ run_towards punchLow ]" +
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
		interpreter.Evaluate(bruceLeeAst, bruceLeeBot);
		assertTrue(behaviour.getCondition().getValue());
		
		node = bruceLeeAst.getDefinitions().get(1);
		behaviour = (Behaviour)node;
		behaviour.getCondition().setValue(true);
		interpreter.Evaluate(bruceLeeAst, bruceLeeBot);
		assertFalse(behaviour.getCondition().getValue());
		
		node = jackieChanAst.getDefinitions().get(0);
		behaviour = (Behaviour)node;
		behaviour.getCondition().setValue(true);
		interpreter.Evaluate(jackieChanAst, jackieChanBot);
		assertFalse(behaviour.getCondition().getValue());
		
		node = jackieChanAst.getDefinitions().get(1);
		behaviour = (Behaviour)node;
		behaviour.getCondition().setValue(false);
		interpreter.Evaluate(jackieChanAst, jackieChanBot);
		assertTrue(behaviour.getCondition().getValue());
	}
}
